import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cko extends cjl {
   protected static final Map<cut, Pair<Predicate<cnl>, Consumer<cnl>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cuv.i,
         Pair.of(cko::b, b(cuv.cC.o())),
         cuv.kE,
         Pair.of(cko::b, b(cuv.cC.o())),
         cuv.j,
         Pair.of(cko::b, b(cuv.cC.o())),
         cuv.k,
         Pair.of(cko::b, b(cuv.j.o())),
         cuv.rG,
         Pair.of((Predicate<cnl>)$$0 -> true, a(cuv.j.o(), cle.ds))
      )
   );

   protected cko(cmo $$0, int $$1, float $$2, ckw.a $$3) {
      super((float)$$1, $$2, $$0, arc.bA, $$3);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      Pair<Predicate<cnl>, Consumer<cnl>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return biq.d;
      } else {
         Predicate<cnl> $$4 = (Predicate<cnl>)$$3.getFirst();
         Consumer<cnl> $$5 = (Consumer<cnl>)$$3.getSecond();
         if ($$4.test($$0)) {
            cdm $$6 = $$0.o();
            $$1.a($$6, $$2, aqn.kP, aqo.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return biq.a($$1.B);
         } else {
            return biq.d;
         }
      }
   }

   public static Consumer<cnl> b(dgw $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dlg.c, $$1.a(), dlg.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cnl> a(dgw $$0, crr $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dlg.c, $$2.a(), dlg.a.a($$2.o(), $$0));
         cut.a($$2.q(), $$2.a(), $$2.k(), new clb($$1));
      };
   }

   public static boolean b(cnl $$0) {
      return $$0.k() != hx.a && $$0.q().a_($$0.a().c()).i();
   }
}
