import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ckw extends cjt {
   protected static final Map<cva, Pair<Predicate<cnt>, Consumer<cnt>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cvc.i,
         Pair.of(ckw::b, b(cvc.cC.o())),
         cvc.kE,
         Pair.of(ckw::b, b(cvc.cC.o())),
         cvc.j,
         Pair.of(ckw::b, b(cvc.cC.o())),
         cvc.k,
         Pair.of(ckw::b, b(cvc.j.o())),
         cvc.sH,
         Pair.of((Predicate<cnt>)$$0 -> true, a(cvc.j.o(), clm.dN))
      )
   );

   protected ckw(cmw $$0, int $$1, float $$2, cle.a $$3) {
      super((float)$$1, $$2, $$0, arg.bA, $$3);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      Pair<Predicate<cnt>, Consumer<cnt>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bix.d;
      } else {
         Predicate<cnt> $$4 = (Predicate<cnt>)$$3.getFirst();
         Consumer<cnt> $$5 = (Consumer<cnt>)$$3.getSecond();
         if ($$4.test($$0)) {
            cdu $$6 = $$0.o();
            $$1.a($$6, $$2, aqr.lf, aqs.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bix.a($$1.B);
         } else {
            return bix.d;
         }
      }
   }

   public static Consumer<cnt> b(dhi $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dls.c, $$1.a(), dls.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cnt> a(dhi $$0, crz $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dls.c, $$2.a(), dls.a.a($$2.o(), $$0));
         cva.a($$2.q(), $$2.a(), $$2.k(), new clj($$1));
      };
   }

   public static boolean b(cnt $$0) {
      return $$0.k() != hx.a && $$0.q().a_($$0.a().c()).i();
   }
}
