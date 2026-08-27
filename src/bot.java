import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bot {
   public static <E extends cay> bky<E> a(Function<E, Optional<? extends bjg>> $$0) {
      return boj.a(
         (Function<boj.b<E>, ? extends App<boj.c<E>, bom<E>>>)($$1 -> $$1.group($$1.c(bsh.ax), $$1.c(bsh.o), $$1.a(bsh.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bjg> $$6 = $$0.apply((E)$$4);
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
