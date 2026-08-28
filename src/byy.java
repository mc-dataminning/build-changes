import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byy {
   public static bxa<bvg> a(bvj $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static byk<bvg> a(bur<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static byk<bvg> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static byk<bvg> a(Predicate<bvg> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$2x -> $$2x.group($$2x.c(cek.n), $$2x.b(cek.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bvg> $$8 = $$2x.<cem>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((buk)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bxk($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
