import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cay {
   public static <E extends coa> bxc<E> a(Function<E, Optional<? extends bvi>> $$0) {
      return cao.a(
         (Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>>)($$1 -> $$1.group($$1.c(cem.ay), $$1.c(cem.o), $$1.a(cem.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bvi> $$6 = $$0.apply((E)$$4);
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
