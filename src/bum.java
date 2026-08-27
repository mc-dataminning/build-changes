import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bum {
   public static <E extends che> bqq<E> a(Function<E, Optional<? extends box>> $$0) {
      return buc.a(
         (Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$1 -> $$1.group($$1.c(bya.ay), $$1.c(bya.o), $$1.a(bya.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends box> $$6 = $$0.apply((E)$$4);
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
