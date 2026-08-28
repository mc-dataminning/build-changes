import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzu {
   public static bxr<bwf> a(cfb<jh> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fbr::c);
   }

   public static bzb<bwf> b(cfb<? extends bvb> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bvb::du);
   }

   private static <T> bzb<bwf> a(cfb<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fbr> $$4) {
      return cbd.a(
         (Function<cbd.b<bwf>, ? extends App<cbd.c<bwf>, cbg<bwf>>>)($$5 -> $$5.group($$5.a(cfb.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cfe> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fbr $$11 = $$8.du();
                     fbr $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ka)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fbr $$13 = $$10.get().a().a().d($$11);
                           fbr $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fbr $$16 = cgv.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cfe($$16, $$1, 0));
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
