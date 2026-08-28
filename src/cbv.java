import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbv {
   public static bzx<byf> a(byi $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.an().f()), $$1);
   }

   public static cbh<byf> a(bxn<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.an()), $$1);
   }

   public static cbh<byf> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static cbh<byf> a(Predicate<byf> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$2x -> $$2x.group($$2x.c(chh.o), $$2x.b(chh.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<byf> $$8 = $$2x.<chj>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g($$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new cah($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
