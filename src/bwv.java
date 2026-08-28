import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwv {
   public static byj<bua> a(brt $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static byj<bua> a(brt $$0, Function<bvf, Float> $$1) {
      return cal.a(
         (Function<cal.b<bua>, ? extends App<cal.c<bua>, cao<bua>>>)($$2 -> $$2.group($$2.b(cej.K), $$2.a(cej.n), $$2.c(cej.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.e_()) {
                        return false;
                     } else {
                        bua $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cem $$10 = new cem(new bxj($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bxj($$9, true));
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
