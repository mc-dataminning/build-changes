import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwd {
   private static final int a = 1;

   public static buw<btc> a(float $$0) {
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$1 -> $$1.group($$1.a(ccg.n), $$1.c(ccg.m), $$1.b(ccg.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bT()) {
                        return false;
                     } else {
                        bsh $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvg($$8, true));
                           $$3.a(new ccj(new bvg($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
