import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzq {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bxv<bwb> a() {
      return cbh.a((Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$0 -> $$0.group($$0.b(cff.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  jh $$5 = $$0.<jp>b($$1).b();
                  if ($$5.a($$3.dv(), 3.0)) {
                     dxn $$6 = $$2.a_($$5);
                     if ($$6.a(dkg.oy)) {
                        dka $$7 = (dka)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
