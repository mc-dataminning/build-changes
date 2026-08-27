import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class bqd {
   private static final int a = 300;

   public static bod<bml> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$3x -> $$3x.group($$3x.b(bvn.C), $$3x.b(bvn.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        hx $$11 = $$3x.<ig>b($$4).b();
                        if ($$11.a($$7.dm(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.dO().a($$6.Y(), $$6.X());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
