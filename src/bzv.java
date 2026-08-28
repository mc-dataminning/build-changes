import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzv {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bya<bwg> a() {
      return cbm.a((Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$0 -> $$0.group($$0.b(cfk.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  jh $$5 = $$0.<jp>b($$1).b();
                  if ($$5.a($$3.dw(), 3.0)) {
                     dxv $$6 = $$2.a_($$5);
                     if ($$6.a(dko.oy)) {
                        dki $$7 = (dki)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
