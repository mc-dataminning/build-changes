import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bov {
   public static <E extends cba> bla<E> a(Function<E, Optional<? extends bji>> $$0) {
      return bol.a(
         (Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$1 -> $$1.group($$1.c(bsj.ax), $$1.c(bsj.o), $$1.a(bsj.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bji> $$6 = $$0.apply((E)$$4);
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
