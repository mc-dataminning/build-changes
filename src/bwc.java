import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwc {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static buh<bso> a() {
      return bxt.a((Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$0 -> $$0.group($$0.b(cbr.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  ir $$5 = $$0.<iz>b($$1).b();
                  if ($$5.a($$3.du(), 3.0)) {
                     dtc $$6 = $$2.a_($$5);
                     if ($$6.a(dfe.pc)) {
                        dex $$7 = (dex)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
