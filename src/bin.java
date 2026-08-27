import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class bin {
   public static bhs<bgi> a(float $$0) {
      return bld.a(
         (Function<bld.b<bgi>, ? extends App<bld.c<bgi>, blg<bgi>>>)($$1 -> $$1.group($$1.c(bpb.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.g($$3.di())) {
                           return false;
                        } else {
                           gu $$5 = $$3.di();
                           List<gu> $$6 = gu.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(gu::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.g($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new bpe($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
