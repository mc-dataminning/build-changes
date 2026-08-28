import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwq {
   private static final int a = 1;

   public static bvj<btp> a(float $$0) {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$1 -> $$1.group($$1.a(cct.n), $$1.c(cct.m), $$1.b(cct.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bR()) {
                        return false;
                     } else {
                        bsu $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvt($$8, true));
                           $$3.a(new ccw(new bvt($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
