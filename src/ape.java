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

public class ape extends aph<ape> {
   static final Logger ac = LogUtils.getLogger();
   private static final Pattern ad = Pattern.compile("^[a-fA-F0-9]{40}$");
   private static final Splitter ae = Splitter.on(',').trimResults();
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
   public final bpj k = this.a("difficulty", a(bpj::a, bpj::a), bpj::e, bpj.b);
   public final daa l = this.a("gamemode", a(daa::a, daa::a), daa::b, daa.a);
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
   public final int L = this.a("max-world-size", $$0x -> axz.a($$0x, 1, 29999984), 29999984);
   public final boolean M = this.a("sync-chunk-writes", true);
   public final String N = this.a("region-file-compression", "deflate");
   public final boolean O = this.a("enable-jmx-monitoring", false);
   public final boolean P = this.a("enable-status", true);
   public final boolean Q = this.a("hide-online-players", false);
   public final int R = this.a("entity-broadcast-range-percentage", $$0x -> axz.a($$0x, 10, 1000), 100);
   public final String S = this.a("text-filtering-config", "");
   public final Optional<MinecraftServer.b> T;
   public final czr U;
   public final aph<ape>.a<Integer> V = this.b("player-idle-timeout", 0);
   public final aph<ape>.a<Boolean> W = this.b("white-list", false);
   public final boolean X = this.a("enforce-secure-profile", true);
   public final boolean Y = this.a("log-ips", true);
   private final ape.a af;
   public final dwx Z;
   public boolean aa = this.a("accepts-transfers", false);

   public ape(Properties $$0) {
      super($$0);
      String $$1 = this.a("level-seed", "");
      boolean $$2 = this.a("generate-structures", true);
      long $$3 = dwx.a($$1).orElse(dwx.f());
      this.Z = new dwx($$3, $$2, false);
      this.af = new ape.a(
         this.a("generator-settings", $$0x -> axp.a(!$$0x.isEmpty() ? $$0x : "{}"), new JsonObject()),
         this.a("level-type", $$0x -> $$0x.toLowerCase(Locale.ROOT), egf.a.a().toString())
      );
      this.T = a(
         this.a("resource-pack-id", ""),
         this.a("resource-pack", ""),
         this.a("resource-pack-sha1", ""),
         this.a("resource-pack-hash"),
         this.a("require-resource-pack", false),
         this.a("resource-pack-prompt", "")
      );
      this.U = b(this.a("initial-enabled-packs", String.join(",", dax.c.a().a())), this.a("initial-disabled-packs", String.join(",", dax.c.a().b())));
   }

   public static ape a(Path $$0) {
      return new ape(b($$0));
   }

   protected ape a(jk $$0, Properties $$1) {
      return new ape($$1);
   }

   @Nullable
   private static wu c(String $$0) {
      if (!Strings.isNullOrEmpty($$0)) {
         try {
            return wu.a.a($$0, jk.b);
         } catch (Exception var2) {
            ac.warn("Failed to parse resource pack prompt '{}'", $$0, var2);
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
               ac.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
         } else if (!Strings.isNullOrEmpty($$3)) {
            ac.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            $$6 = $$3;
         } else {
            $$6 = "";
         }

         if ($$6.isEmpty()) {
            ac.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
         } else if (!ad.matcher($$6).matches()) {
            ac.warn("Invalid sha1 for resource-pack-sha1");
         }

         wu $$9 = c($$5);
         UUID $$10;
         if ($$0.isEmpty()) {
            $$10 = UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8));
            ac.warn("resource-pack-id missing, using default of {}", $$10);
         } else {
            try {
               $$10 = UUID.fromString($$0);
            } catch (IllegalArgumentException var10) {
               ac.warn("Failed to parse '{}' into UUID", $$0);
               return Optional.empty();
            }
         }

         return Optional.of(new MinecraftServer.b($$10, $$1, $$6, $$4, $$9));
      }
   }

   private static czr b(String $$0, String $$1) {
      List<String> $$2 = ae.splitToList($$0);
      List<String> $$3 = ae.splitToList($$1);
      return new czr($$2, $$3);
   }

   public dwu a(jk $$0) {
      return this.af.a($$0);
   }

   static record a(JsonObject a, String b) {
      private static final Map<String, akg<ege>> c = Map.of("default", egf.a, "largebiomes", egf.c);

      public dwu a(jk $$0) {
         jj<ege> $$1 = $$0.d(le.aQ);
         iw.c<ege> $$2 = $$1.b(egf.a)
            .or(() -> $$1.h().findAny())
            .orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
         iw<ege> $$3 = Optional.ofNullable(akh.a(this.b))
            .map($$0x -> akg.a(le.aQ, $$0x))
            .or(() -> Optional.ofNullable(c.get(this.b)))
            .flatMap($$1::b)
            .orElseGet(() -> {
               ape.ac.warn("Failed to parse level-type {}, defaulting to {}", this.b, $$2.h().a());
               return $$2;
            });
         dwu $$4 = $$3.a().a();
         if ($$3.a(egf.b)) {
            akf<JsonElement> $$5 = $$0.a(JsonOps.INSTANCE);
            Optional<ees> $$6 = ees.a.parse(new Dynamic($$5, this.a())).resultOrPartial(ape.ac::error);
            if ($$6.isPresent()) {
               return $$4.a($$0, new dvu($$6.get()));
            }
         }

         return $$4;
      }
   }
}
