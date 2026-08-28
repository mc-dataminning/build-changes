import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwo {
   private static final int a = 1;

   public static bvh<btn> a(float $$0) {
      return byt.a(
         (Function<byt.b<btn>, ? extends App<byt.c<btn>, byw<btn>>>)($$1 -> $$1.group($$1.a(ccr.n), $$1.c(ccr.m), $$1.b(ccr.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bR()) {
                        return false;
                     } else {
                        bss $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvr($$8, true));
                           $$3.a(new ccu(new bvr($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
