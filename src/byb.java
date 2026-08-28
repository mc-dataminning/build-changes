import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byb {
   public static bwd<buk> a(bun $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ao().f()), $$1);
   }

   public static bxn<buk> a(btv<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ao()), $$1);
   }

   public static bxn<buk> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bxn<buk> a(Predicate<buk> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$2x -> $$2x.group($$2x.c(cdn.n), $$2x.b(cdn.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<buk> $$8 = $$2x.<cdp>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bto)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bwn($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
