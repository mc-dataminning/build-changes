import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzf {
   public static <E extends cmb> bvj<E> a(Function<E, Optional<? extends btp>> $$0) {
      return byv.a(
         (Function<byv.b<E>, ? extends App<byv.c<E>, byy<E>>>)($$1 -> $$1.group($$1.c(cct.ay), $$1.c(cct.o), $$1.a(cct.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends btp> $$6 = $$0.apply((E)$$4);
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
