import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bos {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bmy<blg> a() {
      return bqj.a((Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$0 -> $$0.group($$0.b(buh.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  ht $$5 = $$0.<ia>b($$1).b();
                  if ($$5.a($$3.dn(), 3.0)) {
                     dhi $$6 = $$2.a_($$5);
                     if ($$6.a(cvc.od)) {
                        cuw $$7 = (cuw)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
