import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsc {
   public static brh<cgu> a(bxh<ii> $$0, float $$1, int $$2, int $$3, int $$4) {
      return btj.a(
         (Function<btj.b<cgu>, ? extends App<btj.c<cgu>, btm<cgu>>>)($$5 -> $$5.group($$5.a(bxh.E), $$5.c(bxh.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     ii $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.ae() && (!$$13.isPresent() || $$9.X() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.dm()) > $$3) {
                           ens $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || hz.a($$14).k($$10.dm()) > $$3) {
                              $$14 = byy.a($$10, 15, 7, ens.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new bxk($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.dm()) > $$2) {
                           $$7.a(new bxk($$12.b(), $$1, $$2));
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
