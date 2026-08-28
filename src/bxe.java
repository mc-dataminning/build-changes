import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxe {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bvj<btp> a() {
      return byv.a((Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$0 -> $$0.group($$0.b(cct.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  iz $$5 = $$0.<jh>b($$1).b();
                  if ($$5.a($$3.dp(), 3.0)) {
                     dsc $$6 = $$2.a_($$5);
                     if ($$6.a(dfb.od)) {
                        dev $$7 = (dev)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
