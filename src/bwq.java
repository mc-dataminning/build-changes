import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwq {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static buv<btb> a() {
      return byh.a((Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$0 -> $$0.group($$0.b(ccf.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  ja $$5 = $$0.<ji>b($$1).b();
                  if ($$5.a($$3.dq(), 3.0)) {
                     dsk $$6 = $$2.a_($$5);
                     if ($$6.a(dfj.od)) {
                        dfd $$7 = (dfd)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
