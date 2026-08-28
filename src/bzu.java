import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzu {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bxz<bwf> a() {
      return cbl.a((Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$0 -> $$0.group($$0.b(cfj.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  jh $$5 = $$0.<jp>b($$1).b();
                  if ($$5.a($$3.dw(), 3.0)) {
                     dxu $$6 = $$2.a_($$5);
                     if ($$6.a(dkn.oy)) {
                        dkh $$7 = (dkh)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
