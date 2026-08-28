import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cvh extends cui {
   protected static final Map<dhm, Pair<Predicate<czp>, Consumer<czp>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dho.i,
         Pair.of(cvh::b, a(dho.cC.n())),
         dho.kE,
         Pair.of(cvh::b, a(dho.cC.n())),
         dho.j,
         Pair.of(cvh::b, a(dho.cC.n())),
         dho.k,
         Pair.of(cvh::b, a(dho.j.n())),
         dho.sH,
         Pair.of((Predicate<czp>)$$0 -> true, a(dho.j.n(), cvw.dO))
      )
   );

   public cvh(cxj $$0, float $$1, float $$2, cvn.a $$3) {
      super($$0, awv.bC, $$1, $$2, $$3);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      Pair<Predicate<czp>, Consumer<czp>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return brs.e;
      } else {
         Predicate<czp> $$4 = (Predicate<czp>)$$3.getFirst();
         Consumer<czp> $$5 = (Consumer<czp>)$$3.getSecond();
         if ($$4.test($$0)) {
            cnx $$6 = $$0.o();
            $$1.a($$6, $$2, awg.mo, awh.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bun.d($$0.p()));
               }
            }

            return brs.a;
         } else {
            return brs.e;
         }
      }
   }

   public static Consumer<czp> a(dus $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dzp.c, $$1.a(), dzp.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<czp> a(dus $$0, dei $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dzp.c, $$2.a(), dzp.a.a($$2.o(), $$0));
         dhm.a($$2.q(), $$2.a(), $$2.k(), new cvs($$1));
      };
   }

   public static boolean b(czp $$0) {
      return $$0.k() != jk.a && $$0.q().a_($$0.a().d()).l();
   }
}
