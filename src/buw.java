import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class buw {
   public static bsh<bqo> a() {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$0 -> $$0.group($$0.b(bzr.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bqo $$1xx ? $$1xx : null)
                           .filter(bqo::ey)
                           .filter($$1xx -> $$1xx.ai() != bqb.bx || $$2.aa().b(cyt.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
