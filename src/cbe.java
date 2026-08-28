import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbe {
   public static bzb<bxr> a(cgl<iv> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fex::c);
   }

   public static cal<bxr> b(cgl<? extends bwi> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bwi::ds);
   }

   private static <T> cal<bxr> a(cgl<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fex> $$4) {
      return ccn.a(
         (Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$5 -> $$5.group($$5.a(cgl.n), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cgo> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fex $$11 = $$8.ds();
                     fex $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jp)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fex $$13 = $$10.get().a().a().d($$11);
                           fex $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fex $$16 = cif.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cgo($$16, $$1, 0));
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
