import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class caw {
   public static <E extends cnz> bxa<E> a(Function<E, Optional<? extends bvg>> $$0) {
      return cam.a(
         (Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$1 -> $$1.group($$1.c(cek.ay), $$1.c(cek.o), $$1.a(cek.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bvg> $$6 = $$0.apply((E)$$4);
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
