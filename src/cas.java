import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cas {
   public static byu<bxc> a(bxf $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static cae<bxc> a(bwm<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static cae<bxc> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static cae<bxc> a(Predicate<bxc> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$2x -> $$2x.group($$2x.c(cge.o), $$2x.b(cge.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bxc> $$8 = $$2x.<cgg>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g($$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bze($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
