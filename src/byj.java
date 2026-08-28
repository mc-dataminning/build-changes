import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byj {
   public static bwg<buv> a(cdq<jf> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eyw::c);
   }

   public static bxq<buv> b(cdq<? extends btr> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, btr::dq);
   }

   private static <T> bxq<buv> a(cdq<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eyw> $$4) {
      return bzs.a(
         (Function<bzs.b<buv>, ? extends App<bzs.c<buv>, bzv<buv>>>)($$5 -> $$5.group($$5.a(cdq.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cdt> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eyw $$11 = $$8.dq();
                     eyw $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jy)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eyw $$13 = $$10.get().a().a().d($$11);
                           eyw $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eyw $$16 = cfk.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cdt($$16, $$1, 0));
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
