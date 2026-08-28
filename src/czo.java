import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class czo extends czu {
   protected static final Map<dnc, Pair<Predicate<ddt>, Consumer<ddt>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dne.i,
         Pair.of(czo::b, a(dne.cN.m())),
         dne.lk,
         Pair.of(czo::b, a(dne.cN.m())),
         dne.j,
         Pair.of(czo::b, a(dne.cN.m())),
         dne.k,
         Pair.of(czo::b, a(dne.j.m())),
         dne.tr,
         Pair.of((Predicate<ddt>)$$0 -> true, a(dne.j.m(), dac.eg))
      )
   );

   public czo(dbm $$0, float $$1, float $$2, czu.a $$3) {
      super($$3.c($$0, $$1, $$2));
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      Pair<Predicate<ddt>, Consumer<ddt>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bur.e;
      } else {
         Predicate<ddt> $$4 = (Predicate<ddt>)$$3.getFirst();
         Consumer<ddt> $$5 = (Consumer<ddt>)$$3.getSecond();
         if ($$4.test($$0)) {
            crx $$6 = $$0.o();
            $$1.a($$6, $$2, awp.mP, awq.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bxu.d($$0.p()));
               }
            }

            return bur.a;
         } else {
            return bur.e;
         }
      }
   }

   public static Consumer<ddt> a(ebe $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ege.c, $$1.a(), ege.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<ddt> a(ebe $$0, djw $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ege.c, $$2.a(), ege.a.a($$2.o(), $$0));
         dnc.a($$2.q(), $$2.a(), $$2.k(), new czy($$1));
      };
   }

   public static boolean b(ddt $$0) {
      return $$0.k() != jb.a && $$0.q().a_($$0.a().d()).l();
   }
}
