import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class bts {
   public static bsx<brm> a(float $$0) {
      return bwj.a(
         (Function<bwj.b<brm>, ? extends App<bwj.c<brm>, bwm<brm>>>)($$1 -> $$1.group($$1.c(cah.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dn())) {
                           return false;
                        } else {
                           im $$5 = $$3.dn();
                           List<im> $$6 = im.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(im::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cak($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
