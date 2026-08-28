import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class cau {
   private static final int a = 300;

   public static byu<bxc> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$3x -> $$3x.group($$3x.b(cge.D), $$3x.b(cge.E))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        iu $$11 = $$3x.<jd>b($$4).b();
                        if ($$11.a($$7.dv(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.eb().a($$6.af(), $$6.ae());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
