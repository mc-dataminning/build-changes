import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccn {
   public static <E extends cpv> byr<E> a(Function<E, Optional<? extends bwz>> $$0) {
      return ccd.a(
         (Function<ccd.b<E>, ? extends App<ccd.c<E>, ccg<E>>>)($$1 -> $$1.group($$1.c(cgb.az), $$1.c(cgb.p), $$1.a(cgb.F))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bwz> $$6 = $$0.apply((E)$$4);
                     if ($$6.filter($$4::b).isEmpty()) {
                        return false;
                     } else {
                        $$1x.a($$6.get());
                        $$3.b();
                        return true;
                     }
                  }))
      );
   }
}
