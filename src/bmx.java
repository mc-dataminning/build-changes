import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmx {
   public static bla<bji> a(bjl $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag().f()), $$1);
   }

   public static bmj<bji> a(biw<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag()), $$1);
   }

   public static bmj<bji> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bmj<bji> a(Predicate<bji> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bol.a(
         (Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$2x -> $$2x.group($$2x.c(bsj.n), $$2x.b(bsj.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bji> $$8 = $$2x.<bsl>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bis)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new blk($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
