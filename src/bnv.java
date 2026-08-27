import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnv {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bmb<bkj> a() {
      return bpm.a((Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$0 -> $$0.group($$0.b(btk.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  ht $$5 = $$0.<ia>b($$1).b();
                  if ($$5.a($$3.dl(), 3.0)) {
                     dgb $$6 = $$2.a_($$5);
                     if ($$6.a(cuc.od)) {
                        ctw $$7 = (ctw)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
