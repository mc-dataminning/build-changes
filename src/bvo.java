import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvo {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static btt<bsa> a() {
      return bxf.a((Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$0 -> $$0.group($$0.b(cbd.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  in $$5 = $$0.<iv>b($$1).b();
                  if ($$5.a($$3.dn(), 3.0)) {
                     dqh $$6 = $$2.a_($$5);
                     if ($$6.a(ddg.od)) {
                        dda $$7 = (dda)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
