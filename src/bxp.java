import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxp {
   public static <E extends ckl> btt<E> a(Function<E, Optional<? extends bsa>> $$0) {
      return bxf.a(
         (Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$1 -> $$1.group($$1.c(cbd.ay), $$1.c(cbd.o), $$1.a(cbd.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bsa> $$6 = $$0.apply((E)$$4);
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
