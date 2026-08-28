import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byg {
   public static bwd<bus> a(cdn<je> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eys::c);
   }

   public static bxn<bus> b(cdn<? extends bto> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bto::dq);
   }

   private static <T> bxn<bus> a(cdn<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eys> $$4) {
      return bzp.a(
         (Function<bzp.b<bus>, ? extends App<bzp.c<bus>, bzs<bus>>>)($$5 -> $$5.group($$5.a(cdn.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cdq> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eys $$11 = $$8.dq();
                     eys $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jx)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eys $$13 = $$10.get().a().a().d($$11);
                           eys $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eys $$16 = cfh.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cdq($$16, $$1, 0));
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
