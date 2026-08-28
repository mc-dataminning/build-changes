import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwr {
   private static final int a = 1;

   public static bvk<btq> a(float $$0) {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$1 -> $$1.group($$1.a(ccu.n), $$1.c(ccu.m), $$1.b(ccu.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bR()) {
                        return false;
                     } else {
                        bsv $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvu($$8, true));
                           $$3.a(new ccx(new bvu($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
