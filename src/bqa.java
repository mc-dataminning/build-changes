import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqa {
   public static bnx<bmo> a(bvh<hx> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, elm::c);
   }

   public static bph<bmo> b(bvh<? extends blp> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, blp::dk);
   }

   private static <T> bph<bmo> a(bvh<T> $$0, float $$1, int $$2, boolean $$3, Function<T, elm> $$4) {
      return brj.a(
         (Function<brj.b<bmo>, ? extends App<brj.c<bmo>, brm<bmo>>>)($$5 -> $$5.group($$5.a(bvh.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bvk> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     elm $$11 = $$8.dk();
                     elm $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ir)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           elm $$13 = $$10.get().a().a().d($$11);
                           elm $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           elm $$16 = bxa.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bvk($$16, $$1, 0));
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
