import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class daa extends dag {
   protected static final Map<dno, Pair<Predicate<def>, Consumer<def>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dnq.i,
         Pair.of(daa::b, a(dnq.cN.m())),
         dnq.lk,
         Pair.of(daa::b, a(dnq.cN.m())),
         dnq.j,
         Pair.of(daa::b, a(dnq.cN.m())),
         dnq.k,
         Pair.of(daa::b, a(dnq.j.m())),
         dnq.tr,
         Pair.of((Predicate<def>)$$0 -> true, a(dnq.j.m(), dao.eg))
      )
   );

   public daa(dby $$0, float $$1, float $$2, dag.a $$3) {
      super($$3.c($$0, $$1, $$2));
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      Pair<Predicate<def>, Consumer<def>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bvc.e;
      } else {
         Predicate<def> $$4 = (Predicate<def>)$$3.getFirst();
         Consumer<def> $$5 = (Consumer<def>)$$3.getSecond();
         if ($$4.test($$0)) {
            csi $$6 = $$0.o();
            $$1.a($$6, $$2, awy.mP, awz.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, byf.d($$0.p()));
               }
            }

            return bvc.a;
         } else {
            return bvc.e;
         }
      }
   }

   public static Consumer<def> a(ebq $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(egq.c, $$1.a(), egq.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<def> a(ebq $$0, dki $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(egq.c, $$2.a(), egq.a.a($$2.o(), $$0));
         dno.a($$2.q(), $$2.a(), $$2.k(), new dak($$1));
      };
   }

   public static boolean b(def $$0) {
      return $$0.k() != jc.a && $$0.q().a_($$0.a().d()).l();
   }
}
