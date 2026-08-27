import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bna {
   public static bky<bjp> a(bsh<gw> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ehn::c);
   }

   public static bmh<bjp> b(bsh<? extends biq> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, biq::dj);
   }

   private static <T> bmh<bjp> a(bsh<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ehn> $$4) {
      return boj.a(
         (Function<boj.b<bjp>, ? extends App<boj.c<bjp>, bom<bjp>>>)($$5 -> $$5.group($$5.a(bsh.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bsk> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ehn $$11 = $$8.dj();
                     ehn $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ho)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ehn $$13 = $$10.get().a().a().d($$11);
                           ehn $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ehn $$16 = btz.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bsk($$16, $$1, 0));
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
