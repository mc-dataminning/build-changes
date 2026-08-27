import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqr {
   public static boc<bmk> a() {
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$0 -> $$0.group($$0.b(bvm.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bmk $$1xx ? $$1xx : null)
                           .filter(bmk::ew)
                           .filter($$1xx -> $$1xx.ai() != bly.bv || $$2.Z().b(ctk.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
