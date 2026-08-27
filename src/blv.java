import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blv {
   private static final int a = 1;

   public static bkp<biw> a(float $$0) {
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$1 -> $$1.group($$1.a(bry.n), $$1.c(bry.m), $$1.b(bry.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bN()) {
                        return false;
                     } else {
                        big $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bkz($$8, true));
                           $$3.a(new bsb(new bkz($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
