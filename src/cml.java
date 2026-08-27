import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cml extends cli {
   protected static final Map<cwq, Pair<Predicate<cpj>, Consumer<cpj>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cws.i,
         Pair.of(cml::b, b(cws.cC.o())),
         cws.kE,
         Pair.of(cml::b, b(cws.cC.o())),
         cws.j,
         Pair.of(cml::b, b(cws.cC.o())),
         cws.k,
         Pair.of(cml::b, b(cws.j.o())),
         cws.sH,
         Pair.of((Predicate<cpj>)$$0 -> true, a(cws.j.o(), cnb.dN))
      )
   );

   protected cml(col $$0, int $$1, float $$2, cmt.a $$3) {
      super((float)$$1, $$2, $$0, ash.bA, $$3);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      Pair<Predicate<cpj>, Consumer<cpj>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bkb.d;
      } else {
         Predicate<cpj> $$4 = (Predicate<cpj>)$$3.getFirst();
         Consumer<cpj> $$5 = (Consumer<cpj>)$$3.getSecond();
         if ($$4.test($$0)) {
            cfi $$6 = $$0.o();
            $$1.a($$6, $$2, ars.lz, art.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bkb.a($$1.B);
         } else {
            return bkb.d;
         }
      }
   }

   public static Consumer<cpj> b(djh $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dnr.c, $$1.a(), dnr.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cpj> a(djh $$0, cto $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dnr.c, $$2.a(), dnr.a.a($$2.o(), $$0));
         cwq.a($$2.q(), $$2.a(), $$2.k(), new cmy($$1));
      };
   }

   public static boolean b(cpj $$0) {
      return $$0.k() != ic.a && $$0.q().a_($$0.a().c()).i();
   }
}
