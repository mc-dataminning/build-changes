import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class alc extends alf<alc> {
   static final Logger aa = LogUtils.getLogger();
   private static final Pattern ab = Pattern.compile("^[a-fA-F0-9]{40}$");
   private static final Splitter ac = Splitter.on(',').trimResults();
   public final boolean a = this.a("online-mode", true);
   public final boolean b = this.a("prevent-proxy-connections", false);
   public final String c = this.a("server-ip", "");
   public final boolean d = this.a("spawn-animals", true);
   public final boolean e = this.a("spawn-npcs", true);
   public final boolean f = this.a("pvp", true);
   public final boolean g = this.a("allow-flight", false);
   public final String h = this.a("motd", "A Minecraft Server");
   public final boolean i = this.a("force-gamemode", false);
   public final boolean j = this.a("enforce-whitelist", false);
   public final biu k = this.a("difficulty", a(biu::a, biu::a), biu::e, biu.b);
   public final crx l = this.a("gamemode", a(crx::a, crx::a), crx::b, crx.a);
   public final String m = this.a("level-name", "world");
   public final int n = this.a("server-port", 25565);
   @Nullable
   public final Boolean o = this.b("announce-player-achievements");
   public final boolean p = this.a("enable-query", false);
   public final int q = this.a("query.port", 25565);
   public final boolean r = this.a("enable-rcon", false);
   public final int s = this.a("rcon.port", 25575);
   public final String t = this.a("rcon.password", "");
   public final boolean u = this.a("hardcore", false);
   public final boolean v = this.a("allow-nether", true);
   public final boolean w = this.a("spawn-monsters", true);
   public final boolean x = this.a("use-native-transport", true);
   public final boolean y = this.a("enable-command-block", false);
   public final int z = this.a("spawn-protection", 16);
   public final int A = this.a("op-permission-level", 4);
   public final int B = this.a("function-permission-level", 2);
   public final long C = this.a("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
   public final int D = this.a("max-chained-neighbor-updates", 1000000);
   public final int E = this.a("rate-limit", 0);
   public final int F = this.a("view-distance", 10);
   public final int G = this.a("simulation-distance", 10);
   public final int H = this.a("max-players", 20);
   public final int I = this.a("network-compression-threshold", 256);
   public final boolean J = this.a("broadcast-rcon-to-ops", true);
   public final boolean K = this.a("broadcast-console-to-ops", true);
   public final int L = this.a("max-world-size", $$0x -> atm.a($$0x, 1, 29999984), 29999984);
   public final boolean M = this.a("sync-chunk-writes", true);
   public final boolean N = this.a("enable-jmx-monitoring", false);
   public final boolean O = this.a("enable-status", true);
   public final boolean P = this.a("hide-online-players", false);
   public final int Q = this.a("entity-broadcast-range-percentage", $$0x -> atm.a($$0x, 10, 1000), 100);
   public final String R = this.a("text-filtering-config", "");
   public final Optional<MinecraftServer.b> S;
   public final cro T;
   public final alf<alc>.a<Integer> U = this.b("player-idle-timeout", 0);
   public final alf<alc>.a<Boolean> V = this.b("white-list", false);
   public final boolean W = this.a("enforce-secure-profile", true);
   public final boolean X = this.a("log-ips", true);
   private final alc.a ad;
   public final dnp Y;

   public alc(Properties $$0) {
      super($$0);
      String $$1 = this.a("level-seed", "");
      boolean $$2 = this.a("generate-structures", true);
      long $$3 = dnp.a($$1).orElse(dnp.f());
      this.Y = new dnp($$3, $$2, false);
      this.ad = new alc.a(
         this.a("generator-settings", $$0x -> atc.a(!$$0x.isEmpty() ? $$0x : "{}"), new JsonObject()),
         this.a("level-type", $$0x -> $$0x.toLowerCase(Locale.ROOT), dwx.a.a().toString())
      );
      this.S = a(
         this.a("resource-pack", ""),
         this.a("resource-pack-sha1", ""),
         this.a("resource-pack-hash"),
         this.a("require-resource-pack", false),
         this.a("resource-pack-prompt", "")
      );
      this.T = b(this.a("initial-enabled-packs", String.join(",", cst.c.a().a())), this.a("initial-disabled-packs", String.join(",", cst.c.a().b())));
   }

   public static alc a(Path $$0) {
      return new alc(b($$0));
   }

   protected alc a(ip $$0, Properties $$1) {
      return new alc($$1);
   }

   @Nullable
   private static ur c(String $$0) {
      if (!Strings.isNullOrEmpty($$0)) {
         try {
            return ur.a.a($$0);
         } catch (Exception var2) {
            aa.warn("Failed to parse resource pack prompt '{}'", $$0, var2);
         }
      }

      return null;
   }

   private static Optional<MinecraftServer.b> a(String $$0, String $$1, @Nullable String $$2, boolean $$3, String $$4) {
      if ($$0.isEmpty()) {
         return Optional.empty();
      } else {
         String $$5;
         if (!$$1.isEmpty()) {
            $$5 = $$1;
            if (!Strings.isNullOrEmpty($$2)) {
               aa.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
         } else if (!Strings.isNullOrEmpty($$2)) {
            aa.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            $$5 = $$2;
         } else {
            $$5 = "";
         }

         if ($$5.isEmpty()) {
            aa.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
         } else if (!ab.matcher($$5).matches()) {
            aa.warn("Invalid sha1 for resource-pack-sha1");
         }

         ur $$8 = c($$4);
         return Optional.of(new MinecraftServer.b($$0, $$5, $$3, $$8));
      }
   }

   private static cro b(String $$0, String $$1) {
      List<String> $$2 = ac.splitToList($$0);
      List<String> $$3 = ac.splitToList($$1);
      return new cro($$2, $$3);
   }

   private static cgd d(String $$0) {
      return cgf.e.a(ac.splitToStream($$0).<agi>mapMulti(($$0x, $$1) -> {
         agi $$2 = agi.a($$0x);
         if ($$2 == null) {
            aa.warn("Invalid resource location {}, ignoring", $$0x);
         } else {
            $$1.accept($$2);
         }
      }).collect(Collectors.toList()));
   }

   public dnm a(ip $$0) {
      return this.ad.a($$0);
   }

   static record a(JsonObject a, String b) {
      private static final Map<String, agh<dww>> c = Map.of("default", dwx.a, "largebiomes", dwx.c);

      public dnm a(ip $$0) {
         io<dww> $$1 = $$0.d(jz.aH);
         ib.c<dww> $$2 = $$1.b(dwx.a)
            .or(() -> $$1.h().findAny())
            .orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
         ib<dww> $$3 = Optional.ofNullable(agi.a(this.b))
            .map($$0x -> agh.a(jz.aH, $$0x))
            .or(() -> Optional.ofNullable(c.get(this.b)))
            .flatMap($$1::b)
            .orElseGet(() -> {
               alc.aa.warn("Failed to parse level-type {}, defaulting to {}", this.b, $$2.g().a());
               return $$2;
            });
         dnm $$4 = $$3.a().a();
         if ($$3.a(dwx.b)) {
            agg<JsonElement> $$5 = agg.a(JsonOps.INSTANCE, $$0);
            Optional<dvk> $$6 = dvk.a.parse(new Dynamic($$5, this.a())).resultOrPartial(alc.aa::error);
            if ($$6.isPresent()) {
               return $$4.a($$0, new dmm($$6.get()));
            }
         }

         return $$4;
      }
   }
}
