import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class buc {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bsh<bqo> a() {
      return bvt.a((Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$0 -> $$0.group($$0.b(bzr.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  ib $$5 = $$0.<ik>b($$1).b();
                  if ($$5.a($$3.dm(), 3.0)) {
                     doz $$6 = $$2.a_($$5);
                     if ($$6.a(dca.od)) {
                        dbu $$7 = (dbu)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
