import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class bux {
   private static final int a = 300;

   public static bsx<bre> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$3x -> $$3x.group($$3x.b(cah.C), $$3x.b(cah.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        im $$11 = $$3x.<iu>b($$4).b();
                        if ($$11.a($$7.dn(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.dQ().a($$6.Z(), $$6.Y());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
