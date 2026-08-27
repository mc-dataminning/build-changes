import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cme extends clb {
   protected static final Map<cwj, Pair<Predicate<cpc>, Consumer<cpc>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cwl.i,
         Pair.of(cme::b, b(cwl.cC.o())),
         cwl.kE,
         Pair.of(cme::b, b(cwl.cC.o())),
         cwl.j,
         Pair.of(cme::b, b(cwl.cC.o())),
         cwl.k,
         Pair.of(cme::b, b(cwl.j.o())),
         cwl.sH,
         Pair.of((Predicate<cpc>)$$0 -> true, a(cwl.j.o(), cmu.dN))
      )
   );

   protected cme(coe $$0, int $$1, float $$2, cmm.a $$3) {
      super((float)$$1, $$2, $$0, asb.bA, $$3);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      Pair<Predicate<cpc>, Consumer<cpc>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bjv.d;
      } else {
         Predicate<cpc> $$4 = (Predicate<cpc>)$$3.getFirst();
         Consumer<cpc> $$5 = (Consumer<cpc>)$$3.getSecond();
         if ($$4.test($$0)) {
            cfb $$6 = $$0.o();
            $$1.a($$6, $$2, arm.lz, arn.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bjv.a($$1.B);
         } else {
            return bjv.d;
         }
      }
   }

   public static Consumer<cpc> b(dja $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dnk.c, $$1.a(), dnk.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cpc> a(dja $$0, cth $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dnk.c, $$2.a(), dnk.a.a($$2.o(), $$0));
         cwj.a($$2.q(), $$2.a(), $$2.k(), new cmr($$1));
      };
   }

   public static boolean b(cpc $$0) {
      return $$0.k() != ic.a && $$0.q().a_($$0.a().c()).i();
   }
}
