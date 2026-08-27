import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bme {
   private static final int a = 1;

   public static bky<bjg> a(float $$0) {
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$1 -> $$1.group($$1.a(bsh.n), $$1.c(bsh.m), $$1.b(bsh.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        biq $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bli($$8, true));
                           $$3.a(new bsk(new bli($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
