import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class byg {
   private static final int a = 300;

   public static bwg<bun> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$3x -> $$3x.group($$3x.b(cdq.C), $$3x.b(cdq.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        jf $$11 = $$3x.<jn>b($$4).b();
                        if ($$11.a($$7.ds(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.dY().a($$6.ab(), $$6.aa());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
