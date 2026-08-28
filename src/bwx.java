import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwx {
   public static bwc<clu> a(ccc<ji> $$0, float $$1, int $$2, int $$3, int $$4) {
      return bye.a(
         (Function<bye.b<clu>, ? extends App<bye.c<clu>, byh<clu>>>)($$5 -> $$5.group($$5.a(ccc.E), $$5.c(ccc.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     ji $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.af() && (!$$13.isPresent() || $$9.Z() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.dp()) > $$3) {
                           evz $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || ja.a($$14).k($$10.dp()) > $$3) {
                              $$14 = cdt.a($$10, 15, 7, evz.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new ccf($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.dp()) > $$2) {
                           $$7.a(new ccf($$12.b(), $$1, $$2));
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
