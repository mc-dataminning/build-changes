import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class bxk {
   public static bwp<bvd> a(float $$0) {
      return cab.a(
         (Function<cab.b<bvd>, ? extends App<cab.c<bvd>, cae<bvd>>>)($$1 -> $$1.group($$1.c(cdz.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dx())) {
                           return false;
                        } else {
                           jg $$5 = $$3.dx();
                           List<jg> $$6 = jg.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(jg::j).collect(ad.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cec($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
