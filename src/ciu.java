import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ciu extends chr {
   protected static final Map<csx, Pair<Predicate<clr>, Consumer<clr>>> a = Maps.newHashMap(
      ImmutableMap.of(
         csy.i,
         Pair.of(ciu::b, b(csy.cC.n())),
         csy.kE,
         Pair.of(ciu::b, b(csy.cC.n())),
         csy.j,
         Pair.of(ciu::b, b(csy.cC.n())),
         csy.k,
         Pair.of(ciu::b, b(csy.j.n())),
         csy.rG,
         Pair.of((Predicate<clr>)$$0 -> true, a(csy.j.n(), cjk.ds))
      )
   );

   protected ciu(cku $$0, int $$1, float $$2, cjc.a $$3) {
      super((float)$$1, $$2, $$0, apu.bA, $$3);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      Pair<Predicate<clr>, Consumer<clr>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bha.d;
      } else {
         Predicate<clr> $$4 = (Predicate<clr>)$$3.getFirst();
         Consumer<clr> $$5 = (Consumer<clr>)$$3.getSecond();
         if ($$4.test($$0)) {
            cbw $$6 = $$0.o();
            $$1.a($$6, $$2, apf.kL, apg.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bha.a($$1.B);
         } else {
            return bha.d;
         }
      }
   }

   public static Consumer<clr> b(dfl $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(djv.c, $$1.a(), djv.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<clr> a(dfl $$0, cpw $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(djv.c, $$2.a(), djv.a.a($$2.o(), $$0));
         csx.a($$2.q(), $$2.a(), $$2.k(), new cjh($$1));
      };
   }

   public static boolean b(clr $$0) {
      return $$0.k() != hc.a && $$0.q().a_($$0.a().c()).i();
   }
}
