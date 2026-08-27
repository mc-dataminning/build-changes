import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class buv {
   public static bsx<bre> a(brh $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static buh<bre> a(bqr<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static buh<bre> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static buh<bre> a(Predicate<bre> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$2x -> $$2x.group($$2x.c(cah.n), $$2x.b(cah.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bre> $$8 = $$2x.<caj>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bql)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bth($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
