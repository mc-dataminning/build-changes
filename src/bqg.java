import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqg {
   public static bod<bmu> a(bvn<hx> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, elt::c);
   }

   public static bpn<bmu> b(bvn<? extends blv> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, blv::dk);
   }

   private static <T> bpn<bmu> a(bvn<T> $$0, float $$1, int $$2, boolean $$3, Function<T, elt> $$4) {
      return brp.a(
         (Function<brp.b<bmu>, ? extends App<brp.c<bmu>, brs<bmu>>>)($$5 -> $$5.group($$5.a(bvn.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bvq> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     elt $$11 = $$8.dk();
                     elt $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ir)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           elt $$13 = $$10.get().a().a().d($$11);
                           elt $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           elt $$16 = bxg.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bvq($$16, $$1, 0));
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
