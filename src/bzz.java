import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzz {
   public static <E extends cmy> bwd<E> a(Function<E, Optional<? extends buk>> $$0) {
      return bzp.a(
         (Function<bzp.b<E>, ? extends App<bzp.c<E>, bzs<E>>>)($$1 -> $$1.group($$1.c(cdn.ay), $$1.c(cdn.o), $$1.a(cdn.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends buk> $$6 = $$0.apply((E)$$4);
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
