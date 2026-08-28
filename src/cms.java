import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cms<E extends cmk> {
   public static bwd<buk> a(int $$0) {
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$1 -> $$1.group($$1.b(cdn.ad), $$1.a(cdn.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eX().f()) {
                        return false;
                     } else {
                        Optional<cke> $$7 = $$1.a($$3);
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
