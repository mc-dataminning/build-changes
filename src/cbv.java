import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbv {
   public static <E extends coz> bxz<E> a(Function<E, Optional<? extends bwf>> $$0) {
      return cbl.a(
         (Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$1 -> $$1.group($$1.c(cfj.ay), $$1.c(cfj.o), $$1.a(cfj.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bwf> $$6 = $$0.apply((E)$$4);
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
