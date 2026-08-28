import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bza {
   public static <E extends clw> bve<E> a(Function<E, Optional<? extends btk>> $$0) {
      return byq.a(
         (Function<byq.b<E>, ? extends App<byq.c<E>, byt<E>>>)($$1 -> $$1.group($$1.c(cco.ay), $$1.c(cco.o), $$1.a(cco.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends btk> $$6 = $$0.apply((E)$$4);
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
