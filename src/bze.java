import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bze {
   public static byj<cog> a(cej<jq> $$0, float $$1, int $$2, int $$3, int $$4) {
      return cal.a(
         (Function<cal.b<cog>, ? extends App<cal.c<cog>, cao<cog>>>)($$5 -> $$5.group($$5.a(cej.E), $$5.c(cej.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     jq $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.ai() && (!$$13.isPresent() || $$9.ad() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.dw()) > $$3) {
                           fay $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || ji.a((kb)$$14).k($$10.dw()) > $$3) {
                              $$14 = cga.a($$10, 15, 7, fay.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new cem($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.dw()) > $$2) {
                           $$7.a(new cem($$12.b(), $$1, $$2));
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
