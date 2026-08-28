import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ctq extends csr {
   protected static final Map<dfh, Pair<Predicate<cxo>, Consumer<cxo>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dfj.i,
         Pair.of(ctq::b, a(dfj.cC.o())),
         dfj.kE,
         Pair.of(ctq::b, a(dfj.cC.o())),
         dfj.j,
         Pair.of(ctq::b, a(dfj.cC.o())),
         dfj.k,
         Pair.of(ctq::b, a(dfj.j.o())),
         dfj.sH,
         Pair.of((Predicate<cxo>)$$0 -> true, a(dfj.j.o(), cuf.dO))
      )
   );

   public ctq(cvr $$0, ctx.a $$1) {
      super($$0, avw.bB, $$1);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      Pair<Predicate<cxo>, Consumer<cxo>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqg.e;
      } else {
         Predicate<cxo> $$4 = (Predicate<cxo>)$$3.getFirst();
         Consumer<cxo> $$5 = (Consumer<cxo>)$$3.getSecond();
         if ($$4.test($$0)) {
            cmk $$6 = $$0.o();
            $$1.a($$6, $$2, avh.mn, avi.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, btb.d($$0.p()));
               }
            }

            return bqg.a($$1.B);
         } else {
            return bqg.e;
         }
      }
   }

   public static Consumer<cxo> a(dsk $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dxg.c, $$1.a(), dxg.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cxo> a(dsk $$0, dce $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dxg.c, $$2.a(), dxg.a.a($$2.o(), $$0));
         dfh.a($$2.q(), $$2.a(), $$2.k(), new cuc($$1));
      };
   }

   public static boolean b(cxo $$0) {
      return $$0.k() != jf.a && $$0.q().a_($$0.a().c()).i();
   }
}
