import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxc {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bvh<btn> a() {
      return byt.a((Function<byt.b<btn>, ? extends App<byt.c<btn>, byw<btn>>>)($$0 -> $$0.group($$0.b(ccr.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  iz $$5 = $$0.<jh>b($$1).b();
                  if ($$5.a($$3.dp(), 3.0)) {
                     dsa $$6 = $$2.a_($$5);
                     if ($$6.a(dez.od)) {
                        det $$7 = (det)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
