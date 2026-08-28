import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class byz {
   private static final int a = 300;

   public static bwz<bvf> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$3x -> $$3x.group($$3x.b(cej.C), $$3x.b(cej.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        ji $$11 = $$3x.<jq>b($$4).b();
                        if ($$11.a($$7.dw(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.ec().a($$6.ae(), $$6.ad());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
