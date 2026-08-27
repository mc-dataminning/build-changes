import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class brl {
   public static bqq<bpf> a(float $$0) {
      return buc.a(
         (Function<buc.b<bpf>, ? extends App<buc.c<bpf>, buf<bpf>>>)($$1 -> $$1.group($$1.c(bya.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.dj())) {
                           return false;
                        } else {
                           ib $$5 = $$3.dj();
                           List<ib> $$6 = ib.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(ib::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new byd($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
