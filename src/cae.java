import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cae {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static byj<bwr> a() {
      return cbv.a((Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$0 -> $$0.group($$0.b(cft.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  jj $$5 = $$0.<jr>b($$1).b();
                  if ($$5.a($$3.dv(), 3.0)) {
                     dym $$6 = $$2.a_($$5);
                     if ($$6.a(dkw.oF)) {
                        dkq $$7 = (dkq)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
