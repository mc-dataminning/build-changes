import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwy {
   public static bym<bud> a(brw $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bym<bud> a(brw $$0, Function<bvi, Float> $$1) {
      return cao.a(
         (Function<cao.b<bud>, ? extends App<cao.c<bud>, car<bud>>>)($$2 -> $$2.group($$2.b(cem.K), $$2.a(cem.n), $$2.c(cem.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.e_()) {
                        return false;
                     } else {
                        bud $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cep $$10 = new cep(new bxm($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bxm($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
