import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cik extends chh {
   protected static final Map<csl, Pair<Predicate<clh>, Consumer<clh>>> a = Maps.newHashMap(
      ImmutableMap.of(
         csm.i,
         Pair.of(cik::b, b(csm.cC.n())),
         csm.kE,
         Pair.of(cik::b, b(csm.cC.n())),
         csm.j,
         Pair.of(cik::b, b(csm.cC.n())),
         csm.k,
         Pair.of(cik::b, b(csm.j.n())),
         csm.rG,
         Pair.of((Predicate<clh>)$$0 -> true, a(csm.j.n(), cja.ds))
      )
   );

   protected cik(ckk $$0, int $$1, float $$2, cis.a $$3) {
      super((float)$$1, $$2, $$0, apl.bA, $$3);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      Pair<Predicate<clh>, Consumer<clh>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bgq.d;
      } else {
         Predicate<clh> $$4 = (Predicate<clh>)$$3.getFirst();
         Consumer<clh> $$5 = (Consumer<clh>)$$3.getSecond();
         if ($$4.test($$0)) {
            cbm $$6 = $$0.o();
            $$1.a($$6, $$2, aow.kL, aox.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgq.a($$1.B);
         } else {
            return bgq.d;
         }
      }
   }

   public static Consumer<clh> b(dez $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(djj.c, $$1.a(), djj.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<clh> a(dez $$0, cpk $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(djj.c, $$2.a(), djj.a.a($$2.o(), $$0));
         csl.a($$2.q(), $$2.a(), $$2.k(), new cix($$1));
      };
   }

   public static boolean b(clh $$0) {
      return $$0.k() != ha.a && $$0.q().a_($$0.a().c()).i();
   }
}
