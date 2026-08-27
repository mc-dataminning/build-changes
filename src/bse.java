import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bse {
   public static bqb<boq> a(bxl<hz> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, enz::c);
   }

   public static brl<boq> b(bxl<? extends bnq> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bnq::dk);
   }

   private static <T> brl<boq> a(bxl<T> $$0, float $$1, int $$2, boolean $$3, Function<T, enz> $$4) {
      return btn.a(
         (Function<btn.b<boq>, ? extends App<btn.c<boq>, btq<boq>>>)($$5 -> $$5.group($$5.a(bxl.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bxo> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     enz $$11 = $$8.dk();
                     enz $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((it)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           enz $$13 = $$10.get().a().a().d($$11);
                           enz $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           enz $$16 = bzf.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bxo($$16, $$1, 0));
                              break;
                           }
                        }

                        return true;
                     }
                  }
               }))
      );
   }
}
