import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class caz {
   public static byw<bxm> a(cgg<iu> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, feq::c);
   }

   public static cag<bxm> b(cgg<? extends bwf> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bwf::dt);
   }

   private static <T> cag<bxm> a(cgg<T> $$0, float $$1, int $$2, boolean $$3, Function<T, feq> $$4) {
      return cci.a(
         (Function<cci.b<bxm>, ? extends App<cci.c<bxm>, ccl<bxm>>>)($$5 -> $$5.group($$5.a(cgg.n), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cgj> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     feq $$11 = $$8.dt();
                     feq $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jo)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           feq $$13 = $$10.get().a().a().d($$11);
                           feq $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           feq $$16 = cia.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cgj($$16, $$1, 0));
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
