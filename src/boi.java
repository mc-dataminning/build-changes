import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class boi {
   public static bnn<bme> a(float $$0) {
      return bqz.a(
         (Function<bqz.b<bme>, ? extends App<bqz.c<bme>, brc<bme>>>)($$1 -> $$1.group($$1.c(bux.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.g($$3.dm())) {
                           return false;
                        } else {
                           hv $$5 = $$3.dm();
                           List<hv> $$6 = hv.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(hv::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.g($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new bva($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
