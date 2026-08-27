import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bvb {
   public static bsm<bqt> a() {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$0 -> $$0.group($$0.b(bzw.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bqt $$1xx ? $$1xx : null)
                           .filter(bqt::ey)
                           .filter($$1xx -> $$1xx.ai() != bqg.bx || $$2.aa().b(czc.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
