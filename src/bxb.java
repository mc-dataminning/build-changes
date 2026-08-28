import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class bxb {
   public static bwg<buv> a(float $$0) {
      return bzs.a(
         (Function<bzs.b<buv>, ? extends App<bzs.c<buv>, bzv<buv>>>)($$1 -> $$1.group($$1.c(cdq.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.ds())) {
                           return false;
                        } else {
                           jf $$5 = $$3.ds();
                           List<jf> $$6 = jf.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(jf::j).collect(ad.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cdt($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
