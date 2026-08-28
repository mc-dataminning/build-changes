import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableInt;

public class byp {
   private static final int a = 300;

   public static bwp<buv> a(int $$0, int $$1) {
      int $$2 = $$0 * 20;
      MutableInt $$3 = new MutableInt(0);
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$3x -> $$3x.group($$3x.b(cdz.C), $$3x.b(cdz.D))
               .apply($$3x, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                     long $$9 = $$3x.<Long>b($$5);
                     boolean $$10 = $$9 + 300L <= $$8;
                     if ($$3.getValue() <= $$2 && !$$10) {
                        jg $$11 = $$3x.<jo>b($$4).b();
                        if ($$11.a($$7.dx(), (double)$$1)) {
                           $$3.increment();
                        }

                        return true;
                     } else {
                        $$5.b();
                        $$4.b();
                        $$7.ed().a($$6.ab(), $$6.aa());
                        $$3.setValue(0);
                        return true;
                     }
                  }))
      );
   }
}
