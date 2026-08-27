import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bms {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bky<bjg> a() {
      return boj.a((Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$0 -> $$0.group($$0.b(bsh.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  gw $$5 = $$0.<hd>b($$1).b();
                  if ($$5.a($$3.dl(), 3.0)) {
                     dfj $$6 = $$2.a_($$5);
                     if ($$6.a(csw.od)) {
                        csr $$7 = (csr)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
