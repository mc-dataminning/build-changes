import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpw {
   public static <E extends ccb> bmb<E> a(Function<E, Optional<? extends bkj>> $$0) {
      return bpm.a(
         (Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$1 -> $$1.group($$1.c(btk.ax), $$1.c(btk.o), $$1.a(btk.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bkj> $$6 = $$0.apply((E)$$4);
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
