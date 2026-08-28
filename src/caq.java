import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class caq {
   public static <E extends cnp> bwu<E> a(Function<E, Optional<? extends bva>> $$0) {
      return cag.a(
         (Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$1 -> $$1.group($$1.c(cee.ay), $$1.c(cee.o), $$1.a(cee.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bva> $$6 = $$0.apply((E)$$4);
                     if ($$6.filter($$4::c).isEmpty()) {
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
