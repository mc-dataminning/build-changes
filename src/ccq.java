import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccq {
   public static <E extends cqb> byu<E> a(Function<E, Optional<? extends bxc>> $$0) {
      return ccg.a(
         (Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$1 -> $$1.group($$1.c(cge.az), $$1.c(cge.p), $$1.a(cge.F))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bxc> $$6 = $$0.apply((E)$$4);
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
