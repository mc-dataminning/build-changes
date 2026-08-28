import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class bvq {
   public static buv<btk> a(float $$0) {
      return byh.a(
         (Function<byh.b<btk>, ? extends App<byh.c<btk>, byk<btk>>>)($$1 -> $$1.group($$1.c(ccf.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dq())) {
                           return false;
                        } else {
                           ja $$5 = $$3.dq();
                           List<ja> $$6 = ja.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(ja::i).collect(ac.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cci($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
