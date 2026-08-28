import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cxo extends cxu {
   protected static final Map<dku, Pair<Predicate<dbp>, Consumer<dbp>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dkw.i,
         Pair.of(cxo::b, a(dkw.cK.m())),
         dkw.lg,
         Pair.of(cxo::b, a(dkw.cK.m())),
         dkw.j,
         Pair.of(cxo::b, a(dkw.cK.m())),
         dkw.k,
         Pair.of(cxo::b, a(dkw.j.m())),
         dkw.tn,
         Pair.of((Predicate<dbp>)$$0 -> true, a(dkw.j.m(), cyc.ec))
      )
   );

   public cxo(czm $$0, float $$1, float $$2, cxu.a $$3) {
      super($$3.a($$0, awz.bD, $$1, $$2, false));
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      Pair<Predicate<dbp>, Consumer<dbp>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return btq.e;
      } else {
         Predicate<dbp> $$4 = (Predicate<dbp>)$$3.getFirst();
         Consumer<dbp> $$5 = (Consumer<dbp>)$$3.getSecond();
         if ($$4.test($$0)) {
            cqi $$6 = $$0.o();
            $$1.a($$6, $$2, awk.mL, awl.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bwr.d($$0.p()));
               }
            }

            return btq.a;
         } else {
            return btq.e;
         }
      }
   }

   public static Consumer<dbp> a(dym $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(edm.c, $$1.a(), edm.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dbp> a(dym $$0, dho $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(edm.c, $$2.a(), edm.a.a($$2.o(), $$0));
         dku.a($$2.q(), $$2.a(), $$2.k(), new cxy($$1));
      };
   }

   public static boolean b(dbp $$0) {
      return $$0.k() != jo.a && $$0.q().a_($$0.a().d()).l();
   }
}
