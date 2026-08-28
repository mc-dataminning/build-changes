import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class bvz {
   public static bve<btt> a(float $$0) {
      return byq.a(
         (Function<byq.b<btt>, ? extends App<byq.c<btt>, byt<btt>>>)($$1 -> $$1.group($$1.c(cco.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dp())) {
                           return false;
                        } else {
                           iz $$5 = $$3.dp();
                           List<iz> $$6 = iz.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(iz::i).collect(ac.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new ccr($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
