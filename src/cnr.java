import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cnr<E extends cnj> {
   public static bwz<bvf> a(int $$0) {
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$1 -> $$1.group($$1.b(cej.ad), $$1.a(cej.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fa().f()) {
                        return false;
                     } else {
                        Optional<cla> $$7 = $$1.a($$3);
                        if ($$7.isPresent() && $$7.get().a($$5, (double)$$0)) {
                           return false;
                        } else {
                           $$2.b();
                           return true;
                        }
                     }
                  }))
      );
   }
}
