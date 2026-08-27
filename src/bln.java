import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bln {
   public static <E extends bxs> bhs<E> a(Function<E, Optional<? extends bfz>> $$0) {
      return bld.a(
         (Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$1 -> $$1.group($$1.c(bpb.ax), $$1.c(bpb.o), $$1.a(bpb.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bfz> $$6 = $$0.apply((E)$$4);
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
