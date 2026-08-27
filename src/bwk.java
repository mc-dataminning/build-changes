import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwk {
   public static buh<bsw> a(cbr<ir> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ewu::c);
   }

   public static bvr<bsw> b(cbr<? extends brv> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, brv::ds);
   }

   private static <T> bvr<bsw> a(cbr<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ewu> $$4) {
      return bxt.a(
         (Function<bxt.b<bsw>, ? extends App<bxt.c<bsw>, bxw<bsw>>>)($$5 -> $$5.group($$5.a(cbr.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cbu> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ewu $$11 = $$8.ds();
                     ewu $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jk)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ewu $$13 = $$10.get().a().a().d($$11);
                           ewu $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ewu $$16 = cdl.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cbu($$16, $$1, 0));
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
