import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqb {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bog<bmo> a() {
      return brs.a((Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$0 -> $$0.group($$0.b(bvq.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  hx $$5 = $$0.<ig>b($$1).b();
                  if ($$5.a($$3.dl(), 3.0)) {
                     djp $$6 = $$2.a_($$5);
                     if ($$6.a(cxa.od)) {
                        cwu $$7 = (cwu)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
