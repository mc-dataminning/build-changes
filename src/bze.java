import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bze {
   public static <E extends cmb> bvi<E> a(Function<E, Optional<? extends btn>> $$0) {
      return byu.a(
         (Function<byu.b<E>, ? extends App<byu.c<E>, byx<E>>>)($$1 -> $$1.group($$1.c(ccs.ay), $$1.c(ccs.o), $$1.a(ccs.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends btn> $$6 = $$0.apply((E)$$4);
                     if ($$6.filter($$4::c).isEmpty()) {
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
