import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzn {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bxs<bvy> a() {
      return cbe.a((Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$0 -> $$0.group($$0.b(cfc.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  ji $$5 = $$0.<jq>b($$1).b();
                  if ($$5.a($$3.du(), 3.0)) {
                     dxq $$6 = $$2.a_($$5);
                     if ($$6.a(dkg.oF)) {
                        dka $$7 = (dka)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
