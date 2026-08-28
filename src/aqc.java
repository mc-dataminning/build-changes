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

public class aqc extends aqf<aqc> {
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
   public final bqr k = this.a("difficulty", a(bqr::a, bqr::a), bqr::e, bqr.b);
   public final dbv l = this.a("gamemode", a(dbv::a, dbv::a), dbv::b, dbv.a);
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
   public final int L = this.a("max-world-size", $$0x -> ayz.a($$0x, 1, 29999984), 29999984);
   public final boolean M = this.a("sync-chunk-writes", true);
   public final String N = this.a("region-file-compression", "deflate");
   public final boolean O = this.a("enable-jmx-monitoring", false);
   public final boolean P = this.a("enable-status", true);
   public final boolean Q = this.a("hide-online-players", false);
   public final int R = this.a("entity-broadcast-range-percentage", $$0x -> ayz.a($$0x, 10, 1000), 100);
   public final String S = this.a("text-filtering-config", "");
   public final Optional<MinecraftServer.b> T;
   public final dbm U;
   public final aqf<aqc>.a<Integer> V = this.b("player-idle-timeout", 0);
   public final aqf<aqc>.a<Boolean> W = this.b("white-list", false);
   public final boolean X = this.a("enforce-secure-profile", true);
   public final boolean Y = this.a("log-ips", true);
   private final aqc.a af;
   public final dys Z;
   public boolean aa = this.a("accepts-transfers", false);

   public aqc(Properties $$0) {
      super($$0);
      String $$1 = this.a("level-seed", "");
      boolean $$2 = this.a("generate-structures", true);
      long $$3 = dys.a($$1).orElse(dys.f());
      this.Z = new dys($$3, $$2, false);
      this.af = new aqc.a(
         this.a("generator-settings", $$0x -> ayp.a(!$$0x.isEmpty() ? $$0x : "{}"), new JsonObject()),
         this.a("level-type", $$0x -> $$0x.toLowerCase(Locale.ROOT), eia.a.a().toString())
      );
      this.T = a(
         this.a("resource-pack-id", ""),
         this.a("resource-pack", ""),
         this.a("resource-pack-sha1", ""),
         this.a("resource-pack-hash"),
         this.a("require-resource-pack", false),
         this.a("resource-pack-prompt", "")
      );
      this.U = b(this.a("initial-enabled-packs", String.join(",", dcs.c.a().a())), this.a("initial-disabled-packs", String.join(",", dcs.c.a().b())));
   }

   public static aqc a(Path $$0) {
      return new aqc(b($$0));
   }

   protected aqc a(jw $$0, Properties $$1) {
      return new aqc($$1);
   }

   @Nullable
   private static xp c(String $$0) {
      if (!Strings.isNullOrEmpty($$0)) {
         try {
            return xp.a.a($$0, jw.b);
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

         xp $$9 = c($$5);
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

   private static dbm b(String $$0, String $$1) {
      List<String> $$2 = ae.splitToList($$0);
      List<String> $$3 = ae.splitToList($$1);
      return new dbm($$2, $$3);
   }

   public dyp a(jw $$0) {
      return this.af.a($$0);
   }

   static record a(JsonObject a, String b) {
      private static final Map<String, ale<ehz>> c = Map.of("default", eia.a, "largebiomes", eia.c);

      public dyp a(jw $$0) {
         jv<ehz> $$1 = $$0.d(lq.aQ);
         ji.c<ehz> $$2 = $$1.b(eia.a)
            .or(() -> $$1.h().findAny())
            .orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
         ji<ehz> $$3 = Optional.ofNullable(alf.a(this.b))
            .map($$0x -> ale.a(lq.aQ, $$0x))
            .or(() -> Optional.ofNullable(c.get(this.b)))
            .flatMap($$1::b)
            .orElseGet(() -> {
               aqc.ac.warn("Failed to parse level-type {}, defaulting to {}", this.b, $$2.h().a());
               return $$2;
            });
         dyp $$4 = $$3.a().a();
         if ($$3.a(eia.b)) {
            ald<JsonElement> $$5 = $$0.a(JsonOps.INSTANCE);
            Optional<egn> $$6 = egn.a.parse(new Dynamic($$5, this.a())).resultOrPartial(aqc.ac::error);
            if ($$6.isPresent()) {
               return $$4.a($$0, new dxp($$6.get()));
            }
         }

         return $$4;
      }
   }
}
