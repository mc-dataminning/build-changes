import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bps {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bnx<bmf> a() {
      return brj.a((Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$0 -> $$0.group($$0.b(bvh.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  hx $$5 = $$0.<ig>b($$1).b();
                  if ($$5.a($$3.dm(), 3.0)) {
                     dja $$6 = $$2.a_($$5);
                     if ($$6.a(cwl.od)) {
                        cwf $$7 = (cwf)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
