import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.mutable.MutableInt;
import org.slf4j.Logger;

public class dnm {
   private static final Logger a = LogUtils.getLogger();
   private static final LoadingCache<aki, dnm.b> b = CacheBuilder.newBuilder()
      .weakKeys()
      .expireAfterAccess(5L, TimeUnit.MINUTES)
      .build(new CacheLoader<aki, dnm.b>() {
         public dnm.b a(aki $$0) {
            return new dnm.b(Object2IntMaps.synchronize(new Object2IntOpenHashMap()), new MutableInt(0));
         }
      });

   public static void a(aki $$0) {
      try {
         ((dnm.b)b.get($$0)).b().increment();
      } catch (Exception var2) {
         a.error("Failed to increment chunk count", var2);
      }
   }

   public static void a(aki $$0, dmy<?, ?> $$1, Optional<dub> $$2) {
      try {
         ((dnm.b)b.get($$0)).a().computeInt(new dnm.a($$1, $$2), ($$0x, $$1x) -> $$1x == null ? 1 : $$1x + 1);
      } catch (Exception var4) {
         a.error("Failed to increment feature count", var4);
      }
   }

   public static void a() {
      b.invalidateAll();
      a.debug("Cleared feature counts");
   }

   public static void b() {
      a.debug("Logging feature counts:");
      b.asMap()
         .forEach(
            ($$0, $$1) -> {
               String $$2 = $$0.ac().a().toString();
               boolean $$3 = $$0.n().v();
               hs<dub> $$4 = $$0.B_().d(jd.ay);
               String $$5 = ($$3 ? "running" : "dead") + " " + $$2;
               Integer $$6 = $$1.b().getValue();
               a.debug($$5 + " total_chunks: " + $$6);
               $$1.a()
                  .forEach(
                     ($$3x, $$4x) -> a.debug(
                           $$5
                              + " "
                              + String.format(Locale.ROOT, "%10d ", $$4x)
                              + String.format(Locale.ROOT, "%10f ", (double)$$4x.intValue() / (double)$$6.intValue())
                              + $$3x.b().flatMap($$4::c).<aep>map(aeo::a)
                              + " "
                              + $$3x.a().b()
                              + " "
                              + $$3x.a()
                        )
                  );
            }
         );
   }

   static record a(dmy<?, ?> a, Optional<dub> b) {
   }

   static record b(Object2IntMap<dnm.a> a, MutableInt b) {
   }
}
