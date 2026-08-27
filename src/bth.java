import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class bth {
   public static bsm<brb> a(float $$0) {
      return bvy.a(
         (Function<bvy.b<brb>, ? extends App<bvy.c<brb>, bwb<brb>>>)($$1 -> $$1.group($$1.c(bzw.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dm())) {
                           return false;
                        } else {
                           id $$5 = $$3.dm();
                           List<id> $$6 = id.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(id::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new bzz($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
