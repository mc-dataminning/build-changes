import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmn {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bkt<bjb> a() {
      return boe.a((Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$0 -> $$0.group($$0.b(bsc.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  gw $$5 = $$0.<hf>b($$1).b();
                  if ($$5.a($$3.dk(), 3.0)) {
                     dfe $$6 = $$2.a_($$5);
                     if ($$6.a(csr.od)) {
                        csm $$7 = (csm)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
