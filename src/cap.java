import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cap {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static byu<bxc> a() {
      return ccg.a((Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$0 -> $$0.group($$0.b(cge.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  iu $$5 = $$0.<jd>b($$1).b();
                  if ($$5.a($$3.dv(), 3.0)) {
                     dzz $$6 = $$2.a_($$5);
                     if ($$6.a(dmc.oG)) {
                        dlw $$7 = (dlw)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
