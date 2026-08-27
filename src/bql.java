import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bql {
   public static <E extends ccq> bmq<E> a(Function<E, Optional<? extends bky>> $$0) {
      return bqb.a(
         (Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$1 -> $$1.group($$1.c(btz.ax), $$1.c(btz.o), $$1.a(btz.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bky> $$6 = $$0.apply((E)$$4);
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
