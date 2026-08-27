import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bus {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bsx<bre> a() {
      return bwj.a((Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$0 -> $$0.group($$0.b(cah.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  im $$5 = $$0.<iu>b($$1).b();
                  if ($$5.a($$3.dn(), 3.0)) {
                     dpy $$6 = $$2.a_($$5);
                     if ($$6.a(dcx.od)) {
                        dcr $$7 = (dcr)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
