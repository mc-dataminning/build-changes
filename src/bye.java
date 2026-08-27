import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bye {
   public static <E extends cla> bui<E> a(Function<E, Optional<? extends bso>> $$0) {
      return bxu.a(
         (Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$1 -> $$1.group($$1.c(cbs.ay), $$1.c(cbs.o), $$1.a(cbs.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bso> $$6 = $$0.apply((E)$$4);
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
