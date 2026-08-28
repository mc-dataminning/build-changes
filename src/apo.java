import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class apo extends apr<apo> {
   static final Logger ad = LogUtils.getLogger();
   private static final Pattern ae = Pattern.compile("^[a-fA-F0-9]{40}$");
   private static final Splitter af = Splitter.on(',').trimResults();
   public final boolean a = this.a("online-mode", true);
   public final boolean b = this.a("prevent-proxy-connections", false);
   public final String c = this.a("server-ip", "");
   public final boolean d = this.a("spawn-animals", true);
   public final boolean e = this.a("spawn-npcs", true);
   public final boolean f = this.a("pvp", true);
   public final boolean g = this.a("allow-flight", false);
   public final String h = this.a("motd", "A Minecraft Server");
   public final String i = this.a("bug-report-link", "");
   public final boolean j = this.a("force-gamemode", false);
   public final boolean k = this.a("enforce-whitelist", false);
   public final bqo l = this.a("difficulty", a(bqo::a, bqo::a), bqo::e, bqo.b);
   public final dct m = this.a("gamemode", a(dct::a, dct::a), dct::b, dct.a);
   public final String n = this.a("level-name", "world");
   public final int o = this.a("server-port", 25565);
   @Nullable
   public final Boolean p = this.b("announce-player-achievements");
   public final boolean q = this.a("enable-query", false);
   public final int r = this.a("query.port", 25565);
   public final boolean s = this.a("enable-rcon", false);
   public final int t = this.a("rcon.port", 25575);
   public final String u = this.a("rcon.password", "");
   public final boolean v = this.a("hardcore", false);
   public final boolean w = this.a("allow-nether", true);
   public final boolean x = this.a("spawn-monsters", true);
   public final boolean y = this.a("use-native-transport", true);
   public final boolean z = this.a("enable-command-block", false);
   public final int A = this.a("spawn-protection", 16);
   public final int B = this.a("op-permission-level", 4);
   public final int C = this.a("function-permission-level", 2);
   public final long D = this.a("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
   public final int E = this.a("max-chained-neighbor-updates", 1000000);
   public final int F = this.a("rate-limit", 0);
   public final int G = this.a("view-distance", 10);
   public final int H = this.a("simulation-distance", 10);
   public final int I = this.a("max-players", 20);
   public final int J = this.a("network-compression-threshold", 256);
   public final boolean K = this.a("broadcast-rcon-to-ops", true);
   public final boolean L = this.a("broadcast-console-to-ops", true);
   public final int M = this.a("max-world-size", $$0x -> ayo.a($$0x, 1, 29999984), 29999984);
   public final boolean N = this.a("sync-chunk-writes", true);
   public final String O = this.a("region-file-compression", "deflate");
   public final boolean P = this.a("enable-jmx-monitoring", false);
   public final boolean Q = this.a("enable-status", true);
   public final boolean R = this.a("hide-online-players", false);
   public final int S = this.a("entity-broadcast-range-percentage", $$0x -> ayo.a($$0x, 10, 1000), 100);
   public final String T = this.a("text-filtering-config", "");
   public final Optional<MinecraftServer.b> U;
   public final dck V;
   public final apr<apo>.a<Integer> W = this.b("player-idle-timeout", 0);
   public final apr<apo>.a<Boolean> X = this.b("white-list", false);
   public final boolean Y = this.a("enforce-secure-profile", true);
   public final boolean Z = this.a("log-ips", true);
   private final apo.a ag;
   public final dzw aa;
   public boolean ab = this.a("accepts-transfers", false);

   public apo(Properties $$0) {
      super($$0);
      String $$1 = this.a("level-seed", "");
      boolean $$2 = this.a("generate-structures", true);
      long $$3 = dzw.a($$1).orElse(dzw.f());
      this.aa = new dzw($$3, $$2, false);
      this.ag = new apo.a(
         this.a("generator-settings", $$0x -> aye.a(!$$0x.isEmpty() ? $$0x : "{}"), new JsonObject()),
         this.a("level-type", $$0x -> $$0x.toLowerCase(Locale.ROOT), ejh.a.a().toString())
      );
      this.U = a(
         this.a("resource-pack-id", ""),
         this.a("resource-pack", ""),
         this.a("resource-pack-sha1", ""),
         this.a("resource-pack-hash"),
         this.a("require-resource-pack", false),
         this.a("resource-pack-prompt", "")
      );
      this.V = b(this.a("initial-enabled-packs", String.join(",", ddr.c.a().a())), this.a("initial-disabled-packs", String.join(",", ddr.c.a().b())));
   }

   public static apo a(Path $$0) {
      return new apo(b($$0));
   }

   protected apo a(ka $$0, Properties $$1) {
      return new apo($$1);
   }

   @Nullable
   private static wz c(String $$0) {
      if (!Strings.isNullOrEmpty($$0)) {
         try {
            return wz.a.a($$0, ka.b);
         } catch (Exception var2) {
            ad.warn("Failed to parse resource pack prompt '{}'", $$0, var2);
         }
      }

      return null;
   }

   private static Optional<MinecraftServer.b> a(String $$0, String $$1, String $$2, @Nullable String $$3, boolean $$4, String $$5) {
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else {
         String $$6;
         if (!$$2.isEmpty()) {
            $$6 = $$2;
            if (!Strings.isNullOrEmpty($$3)) {
               ad.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
         } else if (!Strings.isNullOrEmpty($$3)) {
            ad.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            $$6 = $$3;
         } else {
            $$6 = "";
         }

         if ($$6.isEmpty()) {
            ad.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
         } else if (!ae.matcher($$6).matches()) {
            ad.warn("Invalid sha1 for resource-pack-sha1");
         }

         wz $$9 = c($$5);
         UUID $$10;
         if ($$0.isEmpty()) {
            $$10 = UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8));
            ad.warn("resource-pack-id missing, using default of {}", $$10);
         } else {
            try {
               $$10 = UUID.fromString($$0);
            } catch (IllegalArgumentException var10) {
               ad.warn("Failed to parse '{}' into UUID", $$0);
               return Optional.empty();
            }
         }

         return Optional.of(new MinecraftServer.b($$10, $$1, $$6, $$4, $$9));
      }
   }

   private static dck b(String $$0, String $$1) {
      List<String> $$2 = af.splitToList($$0);
      List<String> $$3 = af.splitToList($$1);
      return new dck($$2, $$3);
   }

   public dzt a(ka $$0) {
      return this.ag.a($$0);
   }

   static record a(JsonObject a, String b) {
      private static final Map<String, akq<ejg>> c = Map.of("default", ejh.a, "largebiomes", ejh.c);

      public dzt a(ka $$0) {
         jz<ejg> $$1 = $$0.d(lu.aY);
         jm.c<ejg> $$2 = $$1.b(ejh.a)
            .or(() -> $$1.i().findAny())
            .orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
         jm<ejg> $$3 = Optional.ofNullable(akr.c(this.b))
            .map($$0x -> akq.a(lu.aY, $$0x))
            .or(() -> Optional.ofNullable(c.get(this.b)))
            .flatMap($$1::b)
            .orElseGet(() -> {
               apo.ad.warn("Failed to parse level-type {}, defaulting to {}", this.b, $$2.h().a());
               return $$2;
            });
         dzt $$4 = $$3.a().a();
         if ($$3.a(ejh.b)) {
            akp<JsonElement> $$5 = $$0.a(JsonOps.INSTANCE);
            Optional<eht> $$6 = eht.a.parse(new Dynamic($$5, this.a())).resultOrPartial(apo.ad::error);
            if ($$6.isPresent()) {
               return $$4.a($$0, new dyt($$6.get()));
            }
         }

         return $$4;
      }
   }
}
