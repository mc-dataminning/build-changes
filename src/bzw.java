import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class bzw {
   public static bzb<bxr> a(float $$0) {
      return ccn.a(
         (Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$1 -> $$1.group($$1.c(cgl.n))
               .apply(
                  $$1,
                  $$1x -> ($$2, $$3, $$4) -> {
                        if ($$2.h($$3.du())) {
                           return false;
                        } else {
                           iv $$5 = $$3.du();
                           List<iv> $$6 = iv.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(iv::j).collect(ag.b());
                           Collections.shuffle($$6);
                           $$6.stream()
                              .filter($$1xxx -> !$$2.h($$1xxx))
                              .filter($$2x -> $$2.a($$2x, $$3))
                              .filter($$2x -> $$2.g($$3))
                              .findFirst()
                              .ifPresent($$2x -> $$1x.a(new cgo($$2x, $$0, 0)));
                           return true;
                        }
                     }
               ))
      );
   }
}
