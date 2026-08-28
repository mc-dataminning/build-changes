import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwv {
   public static bus<bth> a(ccc<ja> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, evz::c);
   }

   public static bwc<bth> b(ccc<? extends bsd> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bsd::dn);
   }

   private static <T> bwc<bth> a(ccc<T> $$0, float $$1, int $$2, boolean $$3, Function<T, evz> $$4) {
      return bye.a(
         (Function<bye.b<bth>, ? extends App<bye.c<bth>, byh<bth>>>)($$5 -> $$5.group($$5.a(ccc.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<ccf> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     evz $$11 = $$8.dn();
                     evz $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jt)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           evz $$13 = $$10.get().a().a().d($$11);
                           evz $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           evz $$16 = cdw.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new ccf($$16, $$1, 0));
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
