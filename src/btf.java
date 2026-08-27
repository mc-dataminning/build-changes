import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class btf {
   public static brh<bpo> a(bpr $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static bsr<bpo> a(bpc<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static bsr<bpo> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bsr<bpo> a(Predicate<bpo> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return but.a(
         (Function<but.b<bpo>, ? extends App<but.c<bpo>, buw<bpo>>>)($$2x -> $$2x.group($$2x.c(byr.n), $$2x.b(byr.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bpo> $$8 = $$2x.<byt>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bow)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new brr($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
