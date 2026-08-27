import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwf {
   public static buh<bso> a(bsr $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak().f()), $$1);
   }

   public static bvr<bso> a(bsb<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ak()), $$1);
   }

   public static bvr<bso> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bvr<bso> a(Predicate<bso> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$2x -> $$2x.group($$2x.c(cbr.n), $$2x.b(cbr.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bso> $$8 = $$2x.<cbt>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((brv)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bur($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
