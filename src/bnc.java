import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnc {
   public static bla<bjr> a(bsj<gw> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ehp::c);
   }

   public static bmj<bjr> b(bsj<? extends bis> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bis::dj);
   }

   private static <T> bmj<bjr> a(bsj<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ehp> $$4) {
      return bol.a(
         (Function<bol.b<bjr>, ? extends App<bol.c<bjr>, boo<bjr>>>)($$5 -> $$5.group($$5.a(bsj.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bsm> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ehp $$11 = $$8.dj();
                     ehp $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((hq)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ehp $$13 = $$10.get().a().a().d($$11);
                           ehp $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ehp $$16 = bub.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bsm($$16, $$1, 0));
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
