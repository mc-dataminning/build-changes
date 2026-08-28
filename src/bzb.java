import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzb {
   public static bxa<bvg> a(bur<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$2x -> $$2x.group($$2x.a(cek.n), $$2x.c(cek.q), $$2x.b(cek.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvg> $$9 = $$2x.<cem>b($$5).a($$3xx -> $$3xx.g((buk)$$7) <= (double)$$2 && $$0.equals($$3xx.aq()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bvg $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bxk($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
