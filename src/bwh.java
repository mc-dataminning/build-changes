import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class bwh {
   private static final int a = 300;

   public static buh<bso> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$3x -> $$3x.group($$3x.b(cbr.C), $$3x.b(cbr.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        ir $$11 = $$3x.<iz>b($$4).b();
                        if ($$11.a($$7.du(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.dZ().a($$6.aa(), $$6.Z());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
