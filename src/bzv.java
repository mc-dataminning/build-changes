import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class bzv {
   private static final int a = 300;

   public static bxv<bwb> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$3x -> $$3x.group($$3x.b(cff.C), $$3x.b(cff.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        jh $$11 = $$3x.<jp>b($$4).b();
                        if ($$11.a($$7.dv(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.eb().a($$6.ad(), $$6.ac());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
