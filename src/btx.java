import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class btx {
   public static <E extends cgp> bqb<E> a(Function<E, Optional<? extends boi>> $$0) {
      return btn.a(
         (Function<btn.b<E>, ? extends App<btn.c<E>, btq<E>>>)($$1 -> $$1.group($$1.c(bxl.ay), $$1.c(bxl.o), $$1.a(bxl.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends boi> $$6 = $$0.apply((E)$$4);
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
