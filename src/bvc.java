import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class bvc {
   public static buh<bsw> a(float $$0) {
      return bxt.a(
         (Function<bxt.b<bsw>, ? extends App<bxt.c<bsw>, bxw<bsw>>>)($$1 -> $$1.group($$1.c(cbr.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.du())) {
                           return false;
                        } else {
                           ir $$5 = $$3.du();
                           List<ir> $$6 = ir.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(ir::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cbu($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
