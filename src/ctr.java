import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ctr extends css {
   protected static final Map<dfi, Pair<Predicate<cxp>, Consumer<cxp>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dfk.i,
         Pair.of(ctr::b, a(dfk.cC.o())),
         dfk.kE,
         Pair.of(ctr::b, a(dfk.cC.o())),
         dfk.j,
         Pair.of(ctr::b, a(dfk.cC.o())),
         dfk.k,
         Pair.of(ctr::b, a(dfk.j.o())),
         dfk.sH,
         Pair.of((Predicate<cxp>)$$0 -> true, a(dfk.j.o(), cug.dO))
      )
   );

   public ctr(cvs $$0, cty.a $$1) {
      super($$0, avw.bB, $$1);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      Pair<Predicate<cxp>, Consumer<cxp>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqh.e;
      } else {
         Predicate<cxp> $$4 = (Predicate<cxp>)$$3.getFirst();
         Consumer<cxp> $$5 = (Consumer<cxp>)$$3.getSecond();
         if ($$4.test($$0)) {
            cml $$6 = $$0.o();
            $$1.a($$6, $$2, avh.mn, avi.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, btc.d($$0.p()));
               }
            }

            return bqh.a($$1.B);
         } else {
            return bqh.e;
         }
      }
   }

   public static Consumer<cxp> a(dsl $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dxh.c, $$1.a(), dxh.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cxp> a(dsl $$0, dcf $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dxh.c, $$2.a(), dxh.a.a($$2.o(), $$0));
         dfi.a($$2.q(), $$2.a(), $$2.k(), new cud($$1));
      };
   }

   public static boolean b(cxp $$0) {
      return $$0.k() != jf.a && $$0.q().a_($$0.a().c()).i();
   }
}
