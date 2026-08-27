import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cpy extends cox {
   protected static final Map<daa, Pair<Predicate<csu>, Consumer<csu>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dac.i,
         Pair.of(cpy::b, b(dac.cC.o())),
         dac.kE,
         Pair.of(cpy::b, b(dac.cC.o())),
         dac.j,
         Pair.of(cpy::b, b(dac.cC.o())),
         dac.k,
         Pair.of(cpy::b, b(dac.j.o())),
         dac.sH,
         Pair.of((Predicate<csu>)$$0 -> true, a(dac.j.o(), cqn.dN))
      )
   );

   protected cpy(crx $$0, int $$1, float $$2, cqf.a $$3) {
      super((float)$$1, $$2, $$0, aun.bB, $$3);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      Pair<Predicate<csu>, Consumer<csu>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bnc.d;
      } else {
         Predicate<csu> $$4 = (Predicate<csu>)$$3.getFirst();
         Consumer<csu> $$5 = (Consumer<csu>)$$3.getSecond();
         if ($$4.test($$0)) {
            cis $$6 = $$0.o();
            $$1.a($$6, $$2, aty.lS, atz.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bpo.d($$0.p()));
               }
            }

            return bnc.a($$1.B);
         } else {
            return bnc.d;
         }
      }
   }

   public static Consumer<csu> b(dmz $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(drn.c, $$1.a(), drn.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<csu> a(dmz $$0, cwy $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(drn.c, $$2.a(), drn.a.a($$2.o(), $$0));
         daa.a($$2.q(), $$2.a(), $$2.k(), new cqk($$1));
      };
   }

   public static boolean b(csu $$0) {
      return $$0.k() != ih.a && $$0.q().a_($$0.a().c()).i();
   }
}
