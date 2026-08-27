import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bri {
   private static final int a = 1;

   public static bqb<boi> a(float $$0) {
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$1 -> $$1.group($$1.a(bxl.n), $$1.c(bxl.m), $$1.b(bxl.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        bnq $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.m($$8);
                        } else {
                           $$2.a(new bql($$8, true));
                           $$3.a(new bxo(new bql($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
