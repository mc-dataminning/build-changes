import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class buk {
   public static bsh<bqw> a(bzr<ib> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, esa::c);
   }

   public static btr<bqw> b(bzr<? extends bpv> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bpv::dk);
   }

   private static <T> btr<bqw> a(bzr<T> $$0, float $$1, int $$2, boolean $$3, Function<T, esa> $$4) {
      return bvt.a(
         (Function<bvt.b<bqw>, ? extends App<bvt.c<bqw>, bvw<bqw>>>)($$5 -> $$5.group($$5.a(bzr.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bzu> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     esa $$11 = $$8.dk();
                     esa $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((iv)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           esa $$13 = $$10.get().a().a().d($$11);
                           esa $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           esa $$16 = cbl.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bzu($$16, $$1, 0));
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
