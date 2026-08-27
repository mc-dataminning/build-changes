import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsc {
   public static bqb<boi> a(bnw<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$2x -> $$2x.group($$2x.a(bxl.n), $$2x.c(bxl.q), $$2x.b(bxl.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<boi> $$9 = $$2x.<bxn>b($$5).a($$3xx -> $$3xx.f((bnq)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        boi $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bql($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
