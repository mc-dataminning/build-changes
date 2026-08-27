import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bry {
   public static <E extends cel> boc<E> a(Function<E, Optional<? extends bmk>> $$0) {
      return bro.a(
         (Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>>)($$1 -> $$1.group($$1.c(bvm.ax), $$1.c(bvm.o), $$1.a(bvm.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bmk> $$6 = $$0.apply((E)$$4);
                     if ($$6.filter($$4::a).isEmpty()) {
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
