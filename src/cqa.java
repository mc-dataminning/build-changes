import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cqa extends coz {
   protected static final Map<dac, Pair<Predicate<csw>, Consumer<csw>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dae.i,
         Pair.of(cqa::b, b(dae.cC.o())),
         dae.kE,
         Pair.of(cqa::b, b(dae.cC.o())),
         dae.j,
         Pair.of(cqa::b, b(dae.cC.o())),
         dae.k,
         Pair.of(cqa::b, b(dae.j.o())),
         dae.sH,
         Pair.of((Predicate<csw>)$$0 -> true, a(dae.j.o(), cqp.dN))
      )
   );

   protected cqa(crz $$0, int $$1, float $$2, cqh.a $$3) {
      super((float)$$1, $$2, $$0, aun.bB, $$3);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      Pair<Predicate<csw>, Consumer<csw>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bnd.d;
      } else {
         Predicate<csw> $$4 = (Predicate<csw>)$$3.getFirst();
         Consumer<csw> $$5 = (Consumer<csw>)$$3.getSecond();
         if ($$4.test($$0)) {
            ciu $$6 = $$0.o();
            $$1.a($$6, $$2, aty.lW, atz.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bpp.d($$0.p()));
               }
            }

            return bnd.a($$1.B);
         } else {
            return bnd.d;
         }
      }
   }

   public static Consumer<csw> b(dnb $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(drp.c, $$1.a(), drp.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<csw> a(dnb $$0, cxa $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(drp.c, $$2.a(), drp.a.a($$2.o(), $$0));
         dac.a($$2.q(), $$2.a(), $$2.k(), new cqm($$1));
      };
   }

   public static boolean b(csw $$0) {
      return $$0.k() != ih.a && $$0.q().a_($$0.a().c()).i();
   }
}
