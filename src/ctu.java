import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ctu extends csu {
   protected static final Map<dfc, Pair<Predicate<cyf>, Consumer<cyf>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dfe.l,
         Pair.of(ctu::b, a(dfe.do.n())),
         dfe.k,
         Pair.of(ctu::b, a(dfe.do.n())),
         dfe.n,
         Pair.of(ctu::b, a(dfe.do.n())),
         dfe.lC,
         Pair.of(ctu::b, a(dfe.do.n())),
         dfe.j,
         Pair.of(ctu::b, a(dfe.dn.n())),
         dfe.lB,
         Pair.of(ctu::b, a(dfe.dn.n())),
         dfe.m,
         Pair.of(ctu::b, a(dfe.dn.n())),
         dfe.o,
         Pair.of(ctu::b, a(dfe.m.n())),
         dfe.ue,
         Pair.of((Predicate<cyf>)$$0 -> true, a(dfe.m.n(), cuk.eW))
      )
   );

   public ctu(cwe $$0, cuc.a $$1) {
      super($$0, awe.bD, $$1);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      Pair<Predicate<cyf>, Consumer<cyf>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqa.d;
      } else {
         Predicate<cyf> $$4 = (Predicate<cyf>)$$3.getFirst();
         Consumer<cyf> $$5 = (Consumer<cyf>)$$3.getSecond();
         if ($$4.test($$0)) {
            cly $$6 = $$0.o();
            $$1.a($$6, $$2, avo.mD, avq.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bso.d($$0.p()));
               }
            }

            return bqa.a($$1.C);
         } else {
            return bqa.d;
         }
      }
   }

   public static Consumer<cyf> a(dtc $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dxv.c, $$1.a(), dxv.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cyf> a(dtc $$0, dbz $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dxv.c, $$2.a(), dxv.a.a($$2.o(), $$0));
         dfc.a($$2.q(), $$2.a(), $$2.k(), new cuh($$1));
      };
   }

   public static boolean b(cyf $$0) {
      return $$0.k() != iw.a && $$0.q().a_($$0.a().c()).i();
   }
}
