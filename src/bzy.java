import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzy {
   public static bxv<bwj> a(cff<jh> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fbs::c);
   }

   public static bzf<bwj> b(cff<? extends bvf> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bvf::dt);
   }

   private static <T> bzf<bwj> a(cff<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fbs> $$4) {
      return cbh.a(
         (Function<cbh.b<bwj>, ? extends App<cbh.c<bwj>, cbk<bwj>>>)($$5 -> $$5.group($$5.a(cff.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cfi> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fbs $$11 = $$8.dt();
                     fbs $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ka)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fbs $$13 = $$10.get().a().a().d($$11);
                           fbs $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fbs $$16 = cgz.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cfi($$16, $$1, 0));
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
