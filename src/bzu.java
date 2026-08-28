import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzu {
   public static <E extends cmt> bvy<E> a(Function<E, Optional<? extends buf>> $$0) {
      return bzk.a(
         (Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$1 -> $$1.group($$1.c(cdi.ay), $$1.c(cdi.o), $$1.a(cdi.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends buf> $$6 = $$0.apply((E)$$4);
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
