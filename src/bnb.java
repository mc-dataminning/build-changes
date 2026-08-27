import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnb {
   public static ble<bjm> a(bjp $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag().f()), $$1);
   }

   public static bmn<bjm> a(bja<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag()), $$1);
   }

   public static bmn<bjm> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bmn<bjm> a(Predicate<bjm> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$2x -> $$2x.group($$2x.c(bsn.n), $$2x.b(bsn.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bjm> $$8 = $$2x.<bsp>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((biw)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new blo($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
