import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bml {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bkr<biy> a() {
      return boc.a((Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$0 -> $$0.group($$0.b(bsa.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  gu $$5 = $$0.<hd>b($$1).b();
                  if ($$5.a($$3.dk(), 3.0)) {
                     dfa $$6 = $$2.a_($$5);
                     if ($$6.a(csn.od)) {
                        csi $$7 = (csi)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
