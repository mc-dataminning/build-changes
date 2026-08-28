import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwz {
   public static buw<btl> a(ccg<ja> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ewh::c);
   }

   public static bwg<btl> b(ccg<? extends bsh> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bsh::dp);
   }

   private static <T> bwg<btl> a(ccg<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ewh> $$4) {
      return byi.a(
         (Function<byi.b<btl>, ? extends App<byi.c<btl>, byl<btl>>>)($$5 -> $$5.group($$5.a(ccg.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<ccj> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ewh $$11 = $$8.dp();
                     ewh $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jt)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ewh $$13 = $$10.get().a().a().d($$11);
                           ewh $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ewh $$16 = cea.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new ccj($$16, $$1, 0));
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
