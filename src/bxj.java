import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class bxj {
   private static final int a = 300;

   public static bvj<btp> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$3x -> $$3x.group($$3x.b(cct.C), $$3x.b(cct.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        iz $$11 = $$3x.<jh>b($$4).b();
                        if ($$11.a($$7.dp(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.dS().a($$6.aa(), $$6.Z());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
