import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bye {
   public static bwg<bun> a(buq $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ao().f()), $$1);
   }

   public static bxq<bun> a(bty<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ao()), $$1);
   }

   public static bxq<bun> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bxq<bun> a(Predicate<bun> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$2x -> $$2x.group($$2x.c(cdq.n), $$2x.b(cdq.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bun> $$8 = $$2x.<cds>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((btr)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bwq($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
