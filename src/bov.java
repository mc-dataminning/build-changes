import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bov {
   public static bmy<blg> a(blj $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static boh<blg> a(bku<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static boh<blg> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static boh<blg> a(Predicate<blg> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$2x -> $$2x.group($$2x.c(buh.n), $$2x.b(buh.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<blg> $$8 = $$2x.<buj>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bkq)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bni($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
