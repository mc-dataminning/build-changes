import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class bwd {
   public static bvi<btw> a(float $$0) {
      return byu.a(
         (Function<byu.b<btw>, ? extends App<byu.c<btw>, byx<btw>>>)($$1 -> $$1.group($$1.c(ccs.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.do())) {
                           return false;
                        } else {
                           jd $$5 = $$3.do();
                           List<jd> $$6 = jd.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(jd::j).collect(ad.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new ccv($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
