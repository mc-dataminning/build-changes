import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxl {
   public static bvi<btx> a(ccs<iz> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, evq::c);
   }

   public static bws<btx> b(ccs<? extends bst> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bst::dn);
   }

   private static <T> bws<btx> a(ccs<T> $$0, float $$1, int $$2, boolean $$3, Function<T, evq> $$4) {
      return byu.a(
         (Function<byu.b<btx>, ? extends App<byu.c<btx>, byx<btx>>>)($$5 -> $$5.group($$5.a(ccs.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<ccv> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     evq $$11 = $$8.dn();
                     evq $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((js)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           evq $$13 = $$10.get().a().a().d($$11);
                           evq $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           evq $$16 = cem.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new ccv($$16, $$1, 0));
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
