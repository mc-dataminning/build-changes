import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class cbx {
   private static final int a = 300;

   public static bzx<byf> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$3x -> $$3x.group($$3x.b(chh.D), $$3x.b(chh.E))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        iw $$11 = $$3x.<jf>b($$4).b();
                        if ($$11.a($$7.dv(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.ec().a($$6.af(), $$6.ae());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
