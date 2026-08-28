import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxt {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bvy<buf> a() {
      return bzk.a((Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$0 -> $$0.group($$0.b(cdi.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  je $$5 = $$0.<jm>b($$1).b();
                  if ($$5.a($$3.ds(), 3.0)) {
                     dua $$6 = $$2.a_($$5);
                     if ($$6.a(dgx.od)) {
                        dgr $$7 = (dgr)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
