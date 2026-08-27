import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class bmx {
   private static final int a = 300;

   public static bky<bjg> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$3x -> $$3x.group($$3x.b(bsh.C), $$3x.b(bsh.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        gw $$11 = $$3x.<hd>b($$4).b();
                        if ($$11.a($$7.dl(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.dN().a($$6.W(), $$6.V());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
