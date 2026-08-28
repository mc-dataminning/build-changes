import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzc {
   public static <E extends clz> bvg<E> a(Function<E, Optional<? extends btl>> $$0) {
      return bys.a(
         (Function<bys.b<E>, ? extends App<bys.c<E>, byv<E>>>)($$1 -> $$1.group($$1.c(ccq.ay), $$1.c(ccq.o), $$1.a(ccq.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends btl> $$6 = $$0.apply((E)$$4);
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
