import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class blk {
   public static bkp<bjf> a(float $$0) {
      return boa.a(
         (Function<boa.b<bjf>, ? extends App<boa.c<bjf>, bod<bjf>>>)($$1 -> $$1.group($$1.c(bry.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.g($$3.dk())) {
                           return false;
                        } else {
                           gv $$5 = $$3.dk();
                           List<gv> $$6 = gv.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(gv::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.g($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new bsb($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
