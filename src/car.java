import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class car {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static byw<bxe> a() {
      return cci.a((Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$0 -> $$0.group($$0.b(cgg.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  iu $$5 = $$0.<jd>b($$1).b();
                  if ($$5.a($$3.dv(), 3.0)) {
                     eah $$6 = $$2.a_($$5);
                     if ($$6.a(dmh.oJ)) {
                        dmb $$7 = (dmb)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
