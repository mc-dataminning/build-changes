import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxb {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bvg<btl> a() {
      return bys.a((Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$0 -> $$0.group($$0.b(ccq.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  jd $$5 = $$0.<jl>b($$1).b();
                  if ($$5.a($$3.dq(), 3.0)) {
                     dta $$6 = $$2.a_($$5);
                     if ($$6.a(dfy.od)) {
                        dfs $$7 = (dfs)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
