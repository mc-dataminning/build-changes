import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cor extends cnn {
   protected static final Map<cys, Pair<Predicate<crm>, Consumer<crm>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cyu.i,
         Pair.of(cor::b, b(cyu.cC.o())),
         cyu.kE,
         Pair.of(cor::b, b(cyu.cC.o())),
         cyu.j,
         Pair.of(cor::b, b(cyu.cC.o())),
         cyu.k,
         Pair.of(cor::b, b(cyu.j.o())),
         cyu.sH,
         Pair.of((Predicate<crm>)$$0 -> true, a(cyu.j.o(), cpg.dN))
      )
   );

   protected cor(cqq $$0, int $$1, float $$2, coy.a $$3) {
      super((float)$$1, $$2, $$0, aua.bA, $$3);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      Pair<Predicate<crm>, Consumer<crm>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return blw.d;
      } else {
         Predicate<crm> $$4 = (Predicate<crm>)$$3.getFirst();
         Consumer<crm> $$5 = (Consumer<crm>)$$3.getSecond();
         if ($$4.test($$0)) {
            chl $$6 = $$0.o();
            $$1.a($$6, $$2, atl.lP, atm.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, boi.d($$0.p()));
               }
            }

            return blw.a($$1.B);
         } else {
            return blw.d;
         }
      }
   }

   public static Consumer<crm> b(dlj $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dpw.c, $$1.a(), dpw.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<crm> a(dlj $$0, cvq $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dpw.c, $$2.a(), dpw.a.a($$2.o(), $$0));
         cys.a($$2.q(), $$2.a(), $$2.k(), new cpd($$1));
      };
   }

   public static boolean b(crm $$0) {
      return $$0.k() != ie.a && $$0.q().a_($$0.a().c()).i();
   }
}
