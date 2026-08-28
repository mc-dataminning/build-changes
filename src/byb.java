import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byb {
   public static bvy<bun> a(cdi<je> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eye::c);
   }

   public static bxi<bun> b(cdi<? extends btj> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, btj::dq);
   }

   private static <T> bxi<bun> a(cdi<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eye> $$4) {
      return bzk.a(
         (Function<bzk.b<bun>, ? extends App<bzk.c<bun>, bzn<bun>>>)($$5 -> $$5.group($$5.a(cdi.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cdl> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eye $$11 = $$8.dq();
                     eye $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jx)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eye $$13 = $$10.get().a().a().d($$11);
                           eye $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eye $$16 = cfc.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cdl($$16, $$1, 0));
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
