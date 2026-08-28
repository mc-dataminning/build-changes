import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbs {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bzx<byf> a() {
      return cdj.a((Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$0 -> $$0.group($$0.b(chh.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  iw $$5 = $$0.<jf>b($$1).b();
                  if ($$5.a($$3.dv(), 3.0)) {
                     ebq $$6 = $$2.a_($$5);
                     if ($$6.a(dnq.oJ)) {
                        dnk $$7 = (dnk)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
