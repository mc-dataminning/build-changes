import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class bmo {
   private static final int a = 300;

   public static bkp<biw> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$3x -> $$3x.group($$3x.b(bry.C), $$3x.b(bry.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        gv $$11 = $$3x.<he>b($$4).b();
                        if ($$11.a($$7.dk(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.dM().a($$6.W(), $$6.V());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
