import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bva {
   public static bsx<brm> a(cah<im> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, etf::c);
   }

   public static buh<brm> b(cah<? extends bql> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bql::dl);
   }

   private static <T> buh<brm> a(cah<T> $$0, float $$1, int $$2, boolean $$3, Function<T, etf> $$4) {
      return bwj.a(
         (Function<bwj.b<brm>, ? extends App<bwj.c<brm>, bwm<brm>>>)($$5 -> $$5.group($$5.a(cah.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cak> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     etf $$11 = $$8.dl();
                     etf $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jf)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           etf $$13 = $$10.get().a().a().d($$11);
                           etf $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           etf $$16 = ccb.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cak($$16, $$1, 0));
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
