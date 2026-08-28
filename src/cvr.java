import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cvr extends cuu {
   protected static final Map<die, Pair<Predicate<czu>, Consumer<czu>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dig.i,
         Pair.of(cvr::b, a(dig.cC.m())),
         dig.kE,
         Pair.of(cvr::b, a(dig.cC.m())),
         dig.j,
         Pair.of(cvr::b, a(dig.cC.m())),
         dig.k,
         Pair.of(cvr::b, a(dig.j.m())),
         dig.sH,
         Pair.of((Predicate<czu>)$$0 -> true, a(dig.j.m(), cwf.dO))
      )
   );

   public cvr(cxs $$0, float $$1, float $$2, cvx.a $$3) {
      super($$0, axa.bC, $$1, $$2, $$3);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      Pair<Predicate<czu>, Consumer<czu>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bsd.e;
      } else {
         Predicate<czu> $$4 = (Predicate<czu>)$$3.getFirst();
         Consumer<czu> $$5 = (Consumer<czu>)$$3.getSecond();
         if ($$4.test($$0)) {
            com $$6 = $$0.o();
            $$1.a($$6, $$2, awl.mm, awm.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bva.d($$0.p()));
               }
            }

            return bsd.a;
         } else {
            return bsd.e;
         }
      }
   }

   public static Consumer<czu> a(dvj $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(eag.c, $$1.a(), eag.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<czu> a(dvj $$0, dfa $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(eag.c, $$2.a(), eag.a.a($$2.o(), $$0));
         die.a($$2.q(), $$2.a(), $$2.k(), new cwb($$1));
      };
   }

   public static boolean b(czu $$0) {
      return $$0.k() != jm.a && $$0.q().a_($$0.a().d()).l();
   }
}
