import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byf {
   public static bzt<bvi> a(btb $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bzt<bvi> a(btb $$0, Function<bwr, Float> $$1) {
      return cbv.a(
         (Function<cbv.b<bvi>, ? extends App<cbv.c<bvi>, cby<bvi>>>)($$2 -> $$2.group($$2.b(cft.L), $$2.a(cft.o), $$2.c(cft.n))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bvi $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cfw $$10 = new cfw(new byt($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new byt($$9, true));
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
