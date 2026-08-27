import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btd {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bri<bpp> a() {
      return buu.a((Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$0 -> $$0.group($$0.b(bys.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  ib $$5 = $$0.<ik>b($$1).b();
                  if ($$5.a($$3.dm(), 3.0)) {
                     dnb $$6 = $$2.a_($$5);
                     if ($$6.a(dae.od)) {
                        czy $$7 = (czy)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
