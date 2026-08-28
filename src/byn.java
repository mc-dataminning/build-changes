import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class byn {
   public static bxs<bwg> a(float $$0) {
      return cbe.a(
         (Function<cbe.b<bwg>, ? extends App<cbe.c<bwg>, cbh<bwg>>>)($$1 -> $$1.group($$1.c(cfc.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.du())) {
                           return false;
                        } else {
                           ji $$5 = $$3.du();
                           List<ji> $$6 = ji.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(ji::j).collect(af.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cff($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
