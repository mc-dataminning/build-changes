import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class bsq {
   private static final int a = 300;

   public static bqq<box> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$3x -> $$3x.group($$3x.b(bya.C), $$3x.b(bya.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        ib $$11 = $$3x.<ik>b($$4).b();
                        if ($$11.a($$7.dj(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.dM().a($$6.Y(), $$6.X());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
