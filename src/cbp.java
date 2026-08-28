import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbp {
   public static bzm<byc> a(cgw<iv> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ffq::c);
   }

   public static caw<byc> b(cgw<? extends bwt> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bwt::dt);
   }

   private static <T> caw<byc> a(cgw<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ffq> $$4) {
      return ccy.a(
         (Function<ccy.b<byc>, ? extends App<ccy.c<byc>, cdb<byc>>>)($$5 -> $$5.group($$5.a(cgw.n), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cgz> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ffq $$11 = $$8.dt();
                     ffq $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jp)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ffq $$13 = $$10.get().a().a().d($$11);
                           ffq $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ffq $$16 = ciq.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cgz($$16, $$1, 0));
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
