import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbj {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bzo<bxw> a() {
      return cda.a((Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$0 -> $$0.group($$0.b(cgy.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  iw $$5 = $$0.<jf>b($$1).b();
                  if ($$5.a($$3.dv(), 3.0)) {
                     ebg $$6 = $$2.a_($$5);
                     if ($$6.a(dng.oJ)) {
                        dna $$7 = (dna)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
