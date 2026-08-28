import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbh {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bzm<bxu> a() {
      return ccy.a((Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$0 -> $$0.group($$0.b(cgw.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  iv $$5 = $$0.<je>b($$1).b();
                  if ($$5.a($$3.dv(), 3.0)) {
                     ebe $$6 = $$2.a_($$5);
                     if ($$6.a(dne.oJ)) {
                        dmy $$7 = (dmy)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
