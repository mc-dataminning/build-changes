import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.util.UUIDTypeAdapter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class emf {
   static final MinecraftSessionService a = enn.N().aj();
   private static final sw b = sw.c("mco.util.time.now");
   private static final LoadingCache<String, GameProfile> c = CacheBuilder.newBuilder()
      .expireAfterWrite(60L, TimeUnit.MINUTES)
      .build(new CacheLoader<String, GameProfile>() {
         public GameProfile a(String $$0) {
            return emf.a.fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString($$0), null), false);
         }
      });
   private static final int d = 60;
   private static final int e = 3600;
   private static final int f = 86400;

   public static String a(String $$0) {
      return ((GameProfile)c.getUnchecked($$0)).getName();
   }

   public static GameProfile b(String $$0) {
      return (GameProfile)c.getUnchecked($$0);
   }

   public static sw a(long $$0) {
      if ($$0 < 0L) {
         return b;
      } else {
         long $$1 = $$0 / 1000L;
         if ($$1 < 60L) {
            return sw.a("mco.time.secondsAgo", $$1);
         } else if ($$1 < 3600L) {
            long $$2 = $$1 / 60L;
            return sw.a("mco.time.minutesAgo", $$2);
         } else if ($$1 < 86400L) {
            long $$3 = $$1 / 3600L;
            return sw.a("mco.time.hoursAgo", $$3);
         } else {
            long $$4 = $$1 / 86400L;
            return sw.a("mco.time.daysAgo", $$4);
         }
      }
   }

   public static sw a(Date $$0) {
      return a(System.currentTimeMillis() - $$0.getTime());
   }

   public static void a(eox $$0, int $$1, int $$2, int $$3, String $$4) {
      GameProfile $$5 = b($$4);
      acq $$6 = enn.N().ak().b($$5);
      eqf.a($$0, $$6, $$1, $$2, $$3);
   }
}
