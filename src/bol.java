import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bol {
   public static <E extends caq> bkq<E> a(Function<E, Optional<? extends biy>> $$0) {
      return bob.a(
         (Function<bob.b<E>, ? extends App<bob.c<E>, boe<E>>>)($$1 -> $$1.group($$1.c(brz.ax), $$1.c(brz.o), $$1.a(brz.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends biy> $$6 = $$0.apply((E)$$4);
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
