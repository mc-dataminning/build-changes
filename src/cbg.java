import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbg {
   public static cal<cqv> a(cgl<je> $$0, float $$1, int $$2, int $$3, int $$4) {
      return ccn.a(
         (Function<ccn.b<cqv>, ? extends App<ccn.c<cqv>, ccq<cqv>>>)($$5 -> $$5.group($$5.a(cgl.F), $$5.c(cgl.n), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     je $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.aj() && (!$$13.isPresent() || $$9.ae() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.du()) > $$3) {
                           fex $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || iv.a((jp)$$14).k($$10.du()) > $$3) {
                              $$14 = cic.a($$10, 15, 7, fex.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new cgo($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.du()) > $$2) {
                           $$7.a(new cgo($$12.b(), $$1, $$2));
                        }
                     } else {
                        $$10.a($$0);
                        $$8.b();
                        $$6.a($$11);
                     }

                     return true;
                  }))
      );
   }
}
