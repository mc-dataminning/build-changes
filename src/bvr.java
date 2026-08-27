import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvr {
   private static final int a = 1;

   public static buk<bsq> a(float $$0) {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$1 -> $$1.group($$1.a(cbu.n), $$1.c(cbu.m), $$1.b(cbu.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bR()) {
                        return false;
                     } else {
                        brw $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new buu($$8, true));
                           $$3.a(new cbx(new buu($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
