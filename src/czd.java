import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class czd extends czj {
   protected static final Map<dmr, Pair<Predicate<ddi>, Consumer<ddi>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dmt.i,
         Pair.of(czd::b, a(dmt.cN.m())),
         dmt.lk,
         Pair.of(czd::b, a(dmt.cN.m())),
         dmt.j,
         Pair.of(czd::b, a(dmt.cN.m())),
         dmt.k,
         Pair.of(czd::b, a(dmt.j.m())),
         dmt.tr,
         Pair.of((Predicate<ddi>)$$0 -> true, a(dmt.j.m(), czr.eg))
      )
   );

   public czd(dbb $$0, float $$1, float $$2, czj.a $$3) {
      super($$3.c($$0, $$1, $$2));
   }

   @Override
   public bug a(ddi $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      Pair<Predicate<ddi>, Consumer<ddi>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bug.e;
      } else {
         Predicate<ddi> $$4 = (Predicate<ddi>)$$3.getFirst();
         Consumer<ddi> $$5 = (Consumer<ddi>)$$3.getSecond();
         if ($$4.test($$0)) {
            crm $$6 = $$0.o();
            $$1.a($$6, $$2, awn.mP, awo.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bxj.d($$0.p()));
               }
            }

            return bug.a;
         } else {
            return bug.e;
         }
      }
   }

   public static Consumer<ddi> a(eat $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(eft.c, $$1.a(), eft.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<ddi> a(eat $$0, djl $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(eft.c, $$2.a(), eft.a.a($$2.o(), $$0));
         dmr.a($$2.q(), $$2.a(), $$2.k(), new czn($$1));
      };
   }

   public static boolean b(ddi $$0) {
      return $$0.k() != jb.a && $$0.q().a_($$0.a().d()).l();
   }
}
