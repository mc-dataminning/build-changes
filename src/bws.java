import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bws {
   private static final int a = 1;

   public static bvl<btr> a(float $$0) {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$1 -> $$1.group($$1.a(ccv.n), $$1.c(ccv.m), $$1.b(ccv.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bR()) {
                        return false;
                     } else {
                        bsw $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvv($$8, true));
                           $$3.a(new ccy(new bvv($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
