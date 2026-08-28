import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cuc extends ctc {
   protected static final Map<dfw, Pair<Predicate<cyd>, Consumer<cyd>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dfy.i,
         Pair.of(cuc::b, a(dfy.cC.o())),
         dfy.kE,
         Pair.of(cuc::b, a(dfy.cC.o())),
         dfy.j,
         Pair.of(cuc::b, a(dfy.cC.o())),
         dfy.k,
         Pair.of(cuc::b, a(dfy.j.o())),
         dfy.sH,
         Pair.of((Predicate<cyd>)$$0 -> true, a(dfy.j.o(), cur.dO))
      )
   );

   public cuc(cwg $$0, cuj.a $$1) {
      super($$0, awd.bB, $$1);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      Pair<Predicate<cyd>, Consumer<cyd>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqq.e;
      } else {
         Predicate<cyd> $$4 = (Predicate<cyd>)$$3.getFirst();
         Consumer<cyd> $$5 = (Consumer<cyd>)$$3.getSecond();
         if ($$4.test($$0)) {
            cmv $$6 = $$0.o();
            $$1.a($$6, $$2, avo.mn, avp.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, btl.d($$0.p()));
               }
            }

            return bqq.a($$1.B);
         } else {
            return bqq.e;
         }
      }
   }

   public static Consumer<cyd> a(dta $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dxw.c, $$1.a(), dxw.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cyd> a(dta $$0, dct $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dxw.c, $$2.a(), dxw.a.a($$2.o(), $$0));
         dfw.a($$2.q(), $$2.a(), $$2.k(), new cuo($$1));
      };
   }

   public static boolean b(cyd $$0) {
      return $$0.k() != ji.a && $$0.q().a_($$0.a().c()).i();
   }
}
