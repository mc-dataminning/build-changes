import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvz {
   public static bxn<bth> a(bra $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bxn<bth> a(bra $$0, Function<buk, Float> $$1) {
      return bzp.a(
         (Function<bzp.b<bth>, ? extends App<bzp.c<bth>, bzs<bth>>>)($$2 -> $$2.group($$2.b(cdn.K), $$2.a(cdn.n), $$2.c(cdn.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bth $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cdq $$10 = new cdq(new bwn($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bwn($$9, true));
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
