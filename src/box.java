import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class box {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bnd<bll> a() {
      return bqo.a((Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$0 -> $$0.group($$0.b(bum.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  hx $$5 = $$0.<ie>b($$1).b();
                  if ($$5.a($$3.dn(), 3.0)) {
                     dhn $$6 = $$2.a_($$5);
                     if ($$6.a(cvh.od)) {
                        cvb $$7 = (cvb)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
