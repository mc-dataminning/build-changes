import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cap {
   public static byr<bwz> a(bxc $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static cab<bwz> a(bwj<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static cab<bwz> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static cab<bwz> a(Predicate<bwz> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return ccd.a(
         (Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$2x -> $$2x.group($$2x.c(cgb.o), $$2x.b(cgb.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bwz> $$8 = $$2x.<cgd>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g($$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bzb($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
