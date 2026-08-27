import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsc {
   public static <E extends ceu> bog<E> a(Function<E, Optional<? extends bmo>> $$0) {
      return brs.a(
         (Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$1 -> $$1.group($$1.c(bvq.ay), $$1.c(bvq.o), $$1.a(bvq.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bmo> $$6 = $$0.apply((E)$$4);
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
