import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzm {
   private static final float a = 0.3F;

   public static bym<bvi> a() {
      return cao.a(
         (Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$0 -> $$0.group($$0.a(cem.m), $$0.a(cem.n), $$0.b(cem.e), $$0.b(cem.h), $$0.c(cem.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jq $$9 = $$0.b($$3);
                     ceo $$10 = $$0.b($$4);
                     if ($$6.H_().a(100) == 0 && $$6.ai() == $$9.a() && $$9.b().a($$7.dt(), 4.0) && $$10.d($$0xxx -> but.bC.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> but.bC.equals($$1xx.aq()) && $$1xx.g((bum)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bxm($$3xx, true));
                           $$1.a(new cep(new bxm($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
