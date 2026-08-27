import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class bvt {
   private static final int a = 300;

   public static btt<bsa> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$3x -> $$3x.group($$3x.b(cbd.C), $$3x.b(cbd.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        in $$11 = $$3x.<iv>b($$4).b();
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
