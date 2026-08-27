import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmu {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bla<bji> a() {
      return bol.a((Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$0 -> $$0.group($$0.b(bsj.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  gw $$5 = $$0.<hf>b($$1).b();
                  if ($$5.a($$3.dl(), 3.0)) {
                     dfl $$6 = $$2.a_($$5);
                     if ($$6.a(csy.od)) {
                        cst $$7 = (cst)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
