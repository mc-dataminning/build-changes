import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class bxv {
   public static bxa<bvo> a(float $$0) {
      return cam.a(
         (Function<cam.b<bvo>, ? extends App<cam.c<bvo>, cap<bvo>>>)($$1 -> $$1.group($$1.c(cek.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dw())) {
                           return false;
                        } else {
                           ji $$5 = $$3.dw();
                           List<ji> $$6 = ji.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(ji::j).collect(af.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cen($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
