import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cpe extends coc {
   protected static final Map<czf, Pair<Predicate<crz>, Consumer<crz>>> a = Maps.newHashMap(
      ImmutableMap.of(
         czh.i,
         Pair.of(cpe::b, b(czh.cC.o())),
         czh.kE,
         Pair.of(cpe::b, b(czh.cC.o())),
         czh.j,
         Pair.of(cpe::b, b(czh.cC.o())),
         czh.k,
         Pair.of(cpe::b, b(czh.j.o())),
         czh.sH,
         Pair.of((Predicate<crz>)$$0 -> true, a(czh.j.o(), cpt.dN))
      )
   );

   protected cpe(crd $$0, int $$1, float $$2, cpl.a $$3) {
      super((float)$$1, $$2, $$0, aue.bA, $$3);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      Pair<Predicate<crz>, Consumer<crz>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bml.d;
      } else {
         Predicate<crz> $$4 = (Predicate<crz>)$$3.getFirst();
         Consumer<crz> $$5 = (Consumer<crz>)$$3.getSecond();
         if ($$4.test($$0)) {
            cia $$6 = $$0.o();
            $$1.a($$6, $$2, atp.lP, atq.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, box.d($$0.p()));
               }
            }

            return bml.a($$1.B);
         } else {
            return bml.d;
         }
      }
   }

   public static Consumer<crz> b(dme $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dqr.c, $$1.a(), dqr.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<crz> a(dme $$0, cwd $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dqr.c, $$2.a(), dqr.a.a($$2.o(), $$0));
         czf.a($$2.q(), $$2.a(), $$2.k(), new cpq($$1));
      };
   }

   public static boolean b(crz $$0) {
      return $$0.k() != ih.a && $$0.q().a_($$0.a().c()).i();
   }
}
