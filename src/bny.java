import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class bny {
   public static bnd<blu> a(float $$0) {
      return bqo.a(
         (Function<bqo.b<blu>, ? extends App<bqo.c<blu>, bqr<blu>>>)($$1 -> $$1.group($$1.c(bum.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.g($$3.dn())) {
                           return false;
                        } else {
                           hx $$5 = $$3.dn();
                           List<hx> $$6 = hx.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(hx::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.g($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new bup($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
