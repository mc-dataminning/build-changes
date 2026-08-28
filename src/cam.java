import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cam {
   public static byj<bwz> a(cft<jj> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fcu::c);
   }

   public static bzt<bwz> b(cft<? extends bvs> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bvs::dt);
   }

   private static <T> bzt<bwz> a(cft<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fcu> $$4) {
      return cbv.a(
         (Function<cbv.b<bwz>, ? extends App<cbv.c<bwz>, cby<bwz>>>)($$5 -> $$5.group($$5.a(cft.n), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cfw> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fcu $$11 = $$8.dt();
                     fcu $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((kc)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fcu $$13 = $$10.get().a().a().d($$11);
                           fcu $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fcu $$16 = chn.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cfw($$16, $$1, 0));
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
