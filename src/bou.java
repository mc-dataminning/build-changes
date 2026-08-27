import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bou {
   private static final int a = 1;

   public static bnn<blv> a(float $$0) {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$1 -> $$1.group($$1.a(bux.n), $$1.c(bux.m), $$1.b(bux.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        blf $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bnx($$8, true));
                           $$3.a(new bva(new bnx($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
