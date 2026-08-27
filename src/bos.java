import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bos {
   public static bmq<blh> a(btz<ht> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eji::c);
   }

   public static bnz<blh> b(btz<? extends bki> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bki::dj);
   }

   private static <T> bnz<blh> a(btz<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eji> $$4) {
      return bqb.a(
         (Function<bqb.b<blh>, ? extends App<bqb.c<blh>, bqe<blh>>>)($$5 -> $$5.group($$5.a(btz.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<buc> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eji $$11 = $$8.dj();
                     eji $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((im)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eji $$13 = $$10.get().a().a().d($$11);
                           eji $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eji $$16 = bvr.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new buc($$16, $$1, 0));
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
