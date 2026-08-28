import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cvv extends cuy {
   protected static final Map<dij, Pair<Predicate<czy>, Consumer<czy>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dil.i,
         Pair.of(cvv::b, a(dil.cC.m())),
         dil.kE,
         Pair.of(cvv::b, a(dil.cC.m())),
         dil.j,
         Pair.of(cvv::b, a(dil.cC.m())),
         dil.k,
         Pair.of(cvv::b, a(dil.j.m())),
         dil.sH,
         Pair.of((Predicate<czy>)$$0 -> true, a(dil.j.m(), cwj.dO))
      )
   );

   public cvv(cxw $$0, float $$1, float $$2, cwb.a $$3) {
      super($$0, axd.bC, $$1, $$2, $$3);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      Pair<Predicate<czy>, Consumer<czy>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bsh.e;
      } else {
         Predicate<czy> $$4 = (Predicate<czy>)$$3.getFirst();
         Consumer<czy> $$5 = (Consumer<czy>)$$3.getSecond();
         if ($$4.test($$0)) {
            cor $$6 = $$0.o();
            $$1.a($$6, $$2, awo.mm, awp.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bve.d($$0.p()));
               }
            }

            return bsh.a;
         } else {
            return bsh.e;
         }
      }
   }

   public static Consumer<czy> a(dvo $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(eak.c, $$1.a(), eak.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<czy> a(dvo $$0, dfe $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(eak.c, $$2.a(), eak.a.a($$2.o(), $$0));
         dij.a($$2.q(), $$2.a(), $$2.k(), new cwf($$1));
      };
   }

   public static boolean b(czy $$0) {
      return $$0.k() != jm.a && $$0.q().a_($$0.a().d()).l();
   }
}
