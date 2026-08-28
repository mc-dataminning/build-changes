import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbr {
   public static bzo<bye> a(cgy<iw> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ffs::c);
   }

   public static cay<bye> b(cgy<? extends bwv> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bwv::dt);
   }

   private static <T> cay<bye> a(cgy<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ffs> $$4) {
      return cda.a(
         (Function<cda.b<bye>, ? extends App<cda.c<bye>, cdd<bye>>>)($$5 -> $$5.group($$5.a(cgy.n), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<chb> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ffs $$11 = $$8.dt();
                     ffs $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jq)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ffs $$13 = $$10.get().a().a().d($$11);
                           ffs $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ffs $$16 = cis.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new chb($$16, $$1, 0));
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
