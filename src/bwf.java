import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwf {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static buk<bsq> a() {
      return bxw.a((Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$0 -> $$0.group($$0.b(cbu.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  io $$5 = $$0.<iw>b($$1).b();
                  if ($$5.a($$3.dp(), 3.0)) {
                     drd $$6 = $$2.a_($$5);
                     if ($$6.a(dec.od)) {
                        ddw $$7 = (ddw)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
