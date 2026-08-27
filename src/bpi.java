import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpi {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bnn<blv> a() {
      return bqz.a((Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$0 -> $$0.group($$0.b(bux.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  hv $$5 = $$0.<id>b($$1).b();
                  if ($$5.a($$3.dm(), 3.0)) {
                     dip $$6 = $$2.a_($$5);
                     if ($$6.a(cwb.od)) {
                        cvv $$7 = (cvv)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
