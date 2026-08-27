import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ctc extends csd {
   protected static final Map<ddy, Pair<Predicate<cxb>, Consumer<cxb>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dea.i,
         Pair.of(ctc::b, a(dea.cC.n())),
         dea.kE,
         Pair.of(ctc::b, a(dea.cC.n())),
         dea.j,
         Pair.of(ctc::b, a(dea.cC.n())),
         dea.k,
         Pair.of(ctc::b, a(dea.j.n())),
         dea.sH,
         Pair.of((Predicate<cxb>)$$0 -> true, a(dea.j.n(), ctr.dO))
      )
   );

   public ctc(cvd $$0, ctj.a $$1) {
      super($$0, avw.bB, $$1);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      Pair<Predicate<cxb>, Consumer<cxb>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bpu.d;
      } else {
         Predicate<cxb> $$4 = (Predicate<cxb>)$$3.getFirst();
         Consumer<cxb> $$5 = (Consumer<cxb>)$$3.getSecond();
         if ($$4.test($$0)) {
            clw $$6 = $$0.o();
            $$1.a($$6, $$2, avh.mn, avi.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bso.d($$0.p()));
               }
            }

            return bpu.a($$1.B);
         } else {
            return bpu.d;
         }
      }
   }

   public static Consumer<cxb> a(drb $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dvu.c, $$1.a(), dvu.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cxb> a(drb $$0, daw $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dvu.c, $$2.a(), dvu.a.a($$2.o(), $$0));
         ddy.a($$2.q(), $$2.a(), $$2.k(), new cto($$1));
      };
   }

   public static boolean b(cxb $$0) {
      return $$0.k() != it.a && $$0.q().a_($$0.a().c()).i();
   }
}
