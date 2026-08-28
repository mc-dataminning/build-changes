import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class bze {
   public static byj<bwz> a(float $$0) {
      return cbv.a(
         (Function<cbv.b<bwz>, ? extends App<cbv.c<bwz>, cby<bwz>>>)($$1 -> $$1.group($$1.c(cft.n))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dv())) {
                           return false;
                        } else {
                           jj $$5 = $$3.dv();
                           List<jj> $$6 = jj.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(jj::j).collect(af.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cfw($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
