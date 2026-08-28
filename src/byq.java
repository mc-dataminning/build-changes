import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class byq {
   public static bxv<bwj> a(float $$0) {
      return cbh.a(
         (Function<cbh.b<bwj>, ? extends App<cbh.c<bwj>, cbk<bwj>>>)($$1 -> $$1.group($$1.c(cff.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dv())) {
                           return false;
                        } else {
                           jh $$5 = $$3.dv();
                           List<jh> $$6 = jh.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(jh::j).collect(ae.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cfi($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
