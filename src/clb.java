import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class clb extends cjy {
   protected static final Map<cvf, Pair<Predicate<cny>, Consumer<cny>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cvh.i,
         Pair.of(clb::b, b(cvh.cC.o())),
         cvh.kE,
         Pair.of(clb::b, b(cvh.cC.o())),
         cvh.j,
         Pair.of(clb::b, b(cvh.cC.o())),
         cvh.k,
         Pair.of(clb::b, b(cvh.j.o())),
         cvh.sH,
         Pair.of((Predicate<cny>)$$0 -> true, a(cvh.j.o(), clr.dN))
      )
   );

   protected clb(cnb $$0, int $$1, float $$2, clj.a $$3) {
      super((float)$$1, $$2, $$0, ark.bA, $$3);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      Pair<Predicate<cny>, Consumer<cny>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bjb.d;
      } else {
         Predicate<cny> $$4 = (Predicate<cny>)$$3.getFirst();
         Consumer<cny> $$5 = (Consumer<cny>)$$3.getSecond();
         if ($$4.test($$0)) {
            cdz $$6 = $$0.o();
            $$1.a($$6, $$2, aqv.lf, aqw.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bjb.a($$1.B);
         } else {
            return bjb.d;
         }
      }
   }

   public static Consumer<cny> b(dhn $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dlx.c, $$1.a(), dlx.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cny> a(dhn $$0, cse $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dlx.c, $$2.a(), dlx.a.a($$2.o(), $$0));
         cvf.a($$2.q(), $$2.a(), $$2.k(), new clo($$1));
      };
   }

   public static boolean b(cny $$0) {
      return $$0.k() != ib.a && $$0.q().a_($$0.a().c()).i();
   }
}
