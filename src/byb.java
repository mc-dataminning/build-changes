import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byb {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bwg<bun> a() {
      return bzs.a((Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$0 -> $$0.group($$0.b(cdq.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  jf $$5 = $$0.<jn>b($$1).b();
                  if ($$5.a($$3.ds(), 3.0)) {
                     dus $$6 = $$2.a_($$5);
                     if ($$6.a(dho.od)) {
                        dhi $$7 = (dhi)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
