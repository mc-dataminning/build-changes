import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cmu extends clr {
   protected static final Map<cwy, Pair<Predicate<cpr>, Consumer<cpr>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cxa.i,
         Pair.of(cmu::b, b(cxa.cC.o())),
         cxa.kE,
         Pair.of(cmu::b, b(cxa.cC.o())),
         cxa.j,
         Pair.of(cmu::b, b(cxa.cC.o())),
         cxa.k,
         Pair.of(cmu::b, b(cxa.j.o())),
         cxa.sH,
         Pair.of((Predicate<cpr>)$$0 -> true, a(cxa.j.o(), cnj.dN))
      )
   );

   protected cmu(cou $$0, int $$1, float $$2, cnb.a $$3) {
      super((float)$$1, $$2, $$0, asi.bA, $$3);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      Pair<Predicate<cpr>, Consumer<cpr>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bkc.d;
      } else {
         Predicate<cpr> $$4 = (Predicate<cpr>)$$3.getFirst();
         Consumer<cpr> $$5 = (Consumer<cpr>)$$3.getSecond();
         if ($$4.test($$0)) {
            cfq $$6 = $$0.o();
            $$1.a($$6, $$2, art.lO, aru.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bkc.a($$1.B);
         } else {
            return bkc.d;
         }
      }
   }

   public static Consumer<cpr> b(djp $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dnz.c, $$1.a(), dnz.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cpr> a(djp $$0, ctw $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dnz.c, $$2.a(), dnz.a.a($$2.o(), $$0));
         cwy.a($$2.q(), $$2.a(), $$2.k(), new cng($$1));
      };
   }

   public static boolean b(cpr $$0) {
      return $$0.k() != ic.a && $$0.q().a_($$0.a().c()).i();
   }
}
