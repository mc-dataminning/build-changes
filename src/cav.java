import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cav {
   public static <E extends cnx> bwz<E> a(Function<E, Optional<? extends bvf>> $$0) {
      return cal.a(
         (Function<cal.b<E>, ? extends App<cal.c<E>, cao<E>>>)($$1 -> $$1.group($$1.c(cej.ay), $$1.c(cej.o), $$1.a(cej.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bvf> $$6 = $$0.apply((E)$$4);
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
