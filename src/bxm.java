import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxm {
   public static bvj<bty> a(cct<iz> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, evr::c);
   }

   public static bwt<bty> b(cct<? extends bsu> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bsu::dn);
   }

   private static <T> bwt<bty> a(cct<T> $$0, float $$1, int $$2, boolean $$3, Function<T, evr> $$4) {
      return byv.a(
         (Function<byv.b<bty>, ? extends App<byv.c<bty>, byy<bty>>>)($$5 -> $$5.group($$5.a(cct.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<ccw> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     evr $$11 = $$8.dn();
                     evr $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((js)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           evr $$13 = $$10.get().a().a().d($$11);
                           evr $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           evr $$16 = cen.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new ccw($$16, $$1, 0));
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
