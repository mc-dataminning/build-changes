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

public class aqg extends aqj<aqg> {
   static final Logger ad = LogUtils.getLogger();
   private static final Pattern ae = Pattern.compile("^[a-fA-F0-9]{40}$");
   private static final Splitter af = Splitter.on(',').trimResults();
   public final boolean a = this.a("online-mode", true);
   public final boolean b = this.a("prevent-proxy-connections", false);
   public final String c = this.a("server-ip", "");
   public final boolean d = this.a("pvp", true);
   public final boolean e = this.a("allow-flight", false);
   public final String f = this.a("motd", "A Minecraft Server");
   public final String g = this.a("bug-report-link", "");
   public final boolean h = this.a("force-gamemode", false);
   public final boolean i = this.a("enforce-whitelist", false);
   public final bsa j = this.a("difficulty", a(bsa::a, bsa::a), bsa::e, bsa.b);
   public final dey k = this.a("gamemode", a(dey::a, dey::a), dey::b, dey.a);
   public final String l = this.a("level-name", "world");
   public final int m = this.a("server-port", 25565);
   @Nullable
   public final Boolean n = this.b("announce-player-achievements");
   public final boolean o = this.a("enable-query", false);
   public final int p = this.a("query.port", 25565);
   public final boolean q = this.a("enable-rcon", false);
   public final int r = this.a("rcon.port", 25575);
   public final String s = this.a("rcon.password", "");
   public final boolean t = this.a("hardcore", false);
   public final boolean u = this.a("allow-nether", true);
   public final boolean v = this.a("spawn-monsters", true);
   public final boolean w = this.a("use-native-transport", true);
   public final boolean x = this.a("enable-command-block", false);
   public final int y = this.a("spawn-protection", 16);
   public final int z = this.a("op-permission-level", 4);
   public final int A = this.a("function-permission-level", 2);
   public final long B = this.a("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
   public final int C = this.a("max-chained-neighbor-updates", 1000000);
   public final int D = this.a("rate-limit", 0);
   public final int E = this.a("view-distance", 10);
   public final int F = this.a("simulation-distance", 10);
   public final int G = this.a("max-players", 20);
   public final int H = this.a("network-compression-threshold", 256);
   public final boolean I = this.a("broadcast-rcon-to-ops", true);
   public final boolean J = this.a("broadcast-console-to-ops", true);
   public final int K = this.a("max-world-size", $$0x -> azk.a($$0x, 1, 29999984), 29999984);
   public final boolean L = this.a("sync-chunk-writes", true);
   public final String M = this.a("region-file-compression", "deflate");
   public final boolean N = this.a("enable-jmx-monitoring", false);
   public final boolean O = this.a("enable-status", true);
   public final boolean P = this.a("hide-online-players", false);
   public final int Q = this.a("entity-broadcast-range-percentage", $$0x -> azk.a($$0x, 10, 1000), 100);
   public final String R = this.a("text-filtering-config", "");
   public final int S = this.a("text-filtering-version", 0);
   public final Optional<MinecraftServer.b> T;
   public final deo U;
   public final aqj<aqg>.a<Integer> V = this.b("player-idle-timeout", 0);
   public final aqj<aqg>.a<Boolean> W = this.b("white-list", false);
   public final boolean X = this.a("enforce-secure-profile", true);
   public final boolean Y = this.a("log-ips", true);
   public final int Z = this.a("pause-when-empty-seconds", 60);
   private final aqg.a ag;
   public final ecd aa;
   public boolean ab = this.a("accepts-transfers", false);

   public aqg(Properties $$0) {
      super($$0);
      String $$1 = this.a("level-seed", "");
      boolean $$2 = this.a("generate-structures", true);
      long $$3 = ecd.a($$1).orElse(ecd.g());
      this.aa = new ecd($$3, $$2, false);
      this.ag = new aqg.a(
         this.a("generator-settings", $$0x -> aza.a(!$$0x.isEmpty() ? $$0x : "{}"), new JsonObject()),
         this.a("level-type", $$0x -> $$0x.toLowerCase(Locale.ROOT), eln.a.a().toString())
      );
      this.T = a(
         this.a("resource-pack-id", ""),
         this.a("resource-pack", ""),
         this.a("resource-pack-sha1", ""),
         this.a("resource-pack-hash"),
         this.a("require-resource-pack", false),
         this.a("resource-pack-prompt", "")
      );
      this.U = b(this.a("initial-enabled-packs", String.join(",", dfx.c.a().a())), this.a("initial-disabled-packs", String.join(",", dfx.c.a().b())));
   }

   public static aqg a(Path $$0) {
      return new aqg(b($$0));
   }

   protected aqg a(ke $$0, Properties $$1) {
      return new aqg($$1);
   }

   @Nullable
   private static xi c(String $$0) {
      if (!Strings.isNullOrEmpty($$0)) {
         try {
            return xi.a.a($$0, ke.b);
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

         xi $$9 = c($$5);
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

   private static deo b(String $$0, String $$1) {
      List<String> $$2 = af.splitToList($$0);
      List<String> $$3 = af.splitToList($$1);
      return new deo($$2, $$3);
   }

   public eca a(js.a $$0) {
      return this.ag.a($$0);
   }

   static record a(JsonObject a, String b) {
      private static final Map<String, alh<elm>> c = Map.of("default", eln.a, "largebiomes", eln.c);

      public eca a(js.a $$0) {
         js<elm> $$1 = $$0.d(lz.aZ);
         jq.c<elm> $$2 = $$1.a(eln.a)
            .or(() -> $$1.c().findAny())
            .orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
         jq<elm> $$3 = Optional.ofNullable(ali.c(this.b))
            .map($$0x -> alh.a(lz.aZ, $$0x))
            .or(() -> Optional.ofNullable(c.get(this.b)))
            .flatMap($$1::a)
            .orElseGet(() -> {
               aqg.ad.warn("Failed to parse level-type {}, defaulting to {}", this.b, $$2.h().a());
               return $$2;
            });
         eca $$4 = $$3.a().a();
         if ($$3.a(eln.b)) {
            alg<JsonElement> $$5 = $$0.a(JsonOps.INSTANCE);
            Optional<eka> $$6 = eka.a.parse(new Dynamic($$5, this.a())).resultOrPartial(aqg.ad::error);
            if ($$6.isPresent()) {
               return $$4.a($$0, new eba($$6.get()));
            }
         }

         return $$4;
      }
   }
}
