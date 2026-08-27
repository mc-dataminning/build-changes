import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmy {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static ble<bjm> a() {
      return bop.a((Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$0 -> $$0.group($$0.b(bsn.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  gw $$5 = $$0.<hd>b($$1).b();
                  if ($$5.a($$3.dl(), 3.0)) {
                     dfd $$6 = $$2.a_($$5);
                     if ($$6.a(cte.od)) {
                        csy $$7 = (csy)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
