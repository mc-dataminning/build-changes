import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class bnt {
   public static bmy<blp> a(float $$0) {
      return bqj.a(
         (Function<bqj.b<blp>, ? extends App<bqj.c<blp>, bqm<blp>>>)($$1 -> $$1.group($$1.c(buh.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.g($$3.dn())) {
                           return false;
                        } else {
                           ht $$5 = $$3.dn();
                           List<ht> $$6 = ht.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(ht::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.g($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new buk($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
