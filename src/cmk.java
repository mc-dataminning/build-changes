import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cmk extends clh {
   protected static final Map<cwp, Pair<Predicate<cpi>, Consumer<cpi>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cwr.i,
         Pair.of(cmk::b, b(cwr.cC.o())),
         cwr.kE,
         Pair.of(cmk::b, b(cwr.cC.o())),
         cwr.j,
         Pair.of(cmk::b, b(cwr.cC.o())),
         cwr.k,
         Pair.of(cmk::b, b(cwr.j.o())),
         cwr.sH,
         Pair.of((Predicate<cpi>)$$0 -> true, a(cwr.j.o(), cna.dN))
      )
   );

   protected cmk(cok $$0, int $$1, float $$2, cms.a $$3) {
      super((float)$$1, $$2, $$0, asg.bA, $$3);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      Pair<Predicate<cpi>, Consumer<cpi>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bka.d;
      } else {
         Predicate<cpi> $$4 = (Predicate<cpi>)$$3.getFirst();
         Consumer<cpi> $$5 = (Consumer<cpi>)$$3.getSecond();
         if ($$4.test($$0)) {
            cfh $$6 = $$0.o();
            $$1.a($$6, $$2, arr.lz, ars.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bka.a($$1.B);
         } else {
            return bka.d;
         }
      }
   }

   public static Consumer<cpi> b(djg $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dnq.c, $$1.a(), dnq.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cpi> a(djg $$0, ctn $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dnq.c, $$2.a(), dnq.a.a($$2.o(), $$0));
         cwp.a($$2.q(), $$2.a(), $$2.k(), new cmx($$1));
      };
   }

   public static boolean b(cpi $$0) {
      return $$0.k() != ic.a && $$0.q().a_($$0.a().c()).i();
   }
}
