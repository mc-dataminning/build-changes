import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class bmw {
   public static bmb<bks> a(float $$0) {
      return bpm.a(
         (Function<bpm.b<bks>, ? extends App<bpm.c<bks>, bpp<bks>>>)($$1 -> $$1.group($$1.c(btk.m))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.g($$3.dl())) {
                           return false;
                        } else {
                           ht $$5 = $$3.dl();
                           List<ht> $$6 = ht.b($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(ht::i).collect(Collectors.toList());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.g($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new btn($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
