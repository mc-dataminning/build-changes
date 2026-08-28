import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cdt {
   public static <E extends crl> bzx<E> a(Function<E, Optional<? extends byf>> $$0) {
      return cdj.a(
         (Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$1 -> $$1.group($$1.c(chh.az), $$1.c(chh.p), $$1.a(chh.F))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends byf> $$6 = $$0.apply((E)$$4);
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
