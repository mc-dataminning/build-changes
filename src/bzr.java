import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class bzr {
   public static byw<bxm> a(float $$0) {
      return cci.a(
         (Function<cci.b<bxm>, ? extends App<cci.c<bxm>, ccl<bxm>>>)($$1 -> $$1.group($$1.c(cgg.n))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dv())) {
                           return false;
                        } else {
                           iu $$5 = $$3.dv();
                           List<iu> $$6 = iu.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(iu::j).collect(af.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cgj($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
