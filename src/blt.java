import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class blt {
   public static bky<bjp> a(float $$0) {
      return boj.a(
         (Function<boj.b<bjp>, ? extends App<boj.c<bjp>, bom<bjp>>>)($$1 -> $$1.group($$1.c(bsh.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.g($$3.dl())) {
                           return false;
                        } else {
                           gw $$5 = $$3.dl();
                           List<gw> $$6 = gw.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(gw::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.g($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new bsk($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
