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

public class ebm {
   private static final Logger a = LogUtils.getLogger();
   private static final LoadingCache<aqm, ebm.b> b = CacheBuilder.newBuilder()
      .weakKeys()
      .expireAfterAccess(5L, TimeUnit.MINUTES)
      .build(new CacheLoader<aqm, ebm.b>() {
         public ebm.b a(aqm $$0) {
            return new ebm.b(Object2IntMaps.synchronize(new Object2IntOpenHashMap()), new MutableInt(0));
         }
      });

   public static void a(aqm $$0) {
      try {
         ((ebm.b)b.get($$0)).b().increment();
      } catch (Exception var2) {
         a.error("Failed to increment chunk count", var2);
      }
   }

   public static void a(aqm $$0, eay<?, ?> $$1, Optional<eib> $$2) {
      try {
         ((ebm.b)b.get($$0)).a().computeInt(new ebm.a($$1, $$2), ($$0x, $$1x) -> $$1x == null ? 1 : $$1x + 1);
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
               String $$2 = $$0.af().a().toString();
               boolean $$3 = $$0.o().x();
               jw<eib> $$4 = $$0.H_().d(lr.aP);
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
                              + $$3x.b().flatMap($$4::d).<akk>map(akj::a)
                              + " "
                              + $$3x.a().b()
                              + " "
                              + $$3x.a()
                        )
                  );
            }
         );
   }

   static record a(eay<?, ?> a, Optional<eib> b) {
   }

   static record b(Object2IntMap<ebm.a> a, MutableInt b) {
   }
}
