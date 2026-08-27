import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpk {
   private static final int a = 1;

   public static bod<bml> a(float $$0) {
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$1 -> $$1.group($$1.a(bvn.n), $$1.c(bvn.m), $$1.b(bvn.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        blv $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bon($$8, true));
                           $$3.a(new bvq(new bon($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
