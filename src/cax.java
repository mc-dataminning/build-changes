import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cax {
   public static byu<bxk> a(cge<iu> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fei::c);
   }

   public static cae<bxk> b(cge<? extends bwd> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bwd::dt);
   }

   private static <T> cae<bxk> a(cge<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fei> $$4) {
      return ccg.a(
         (Function<ccg.b<bxk>, ? extends App<ccg.c<bxk>, ccj<bxk>>>)($$5 -> $$5.group($$5.a(cge.n), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cgh> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fei $$11 = $$8.dt();
                     fei $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jo)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fei $$13 = $$10.get().a().a().d($$11);
                           fei $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fei $$16 = chy.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cgh($$16, $$1, 0));
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
