import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class caw {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bzb<bxj> a() {
      return ccn.a((Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$0 -> $$0.group($$0.b(cgl.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  iv $$5 = $$0.<je>b($$1).b();
                  if ($$5.a($$3.du(), 3.0)) {
                     eao $$6 = $$2.a_($$5);
                     if ($$6.a(dmo.oJ)) {
                        dmi $$7 = (dmi)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
