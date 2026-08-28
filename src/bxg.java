import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxg {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bvl<btr> a() {
      return byx.a((Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$0 -> $$0.group($$0.b(ccv.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  iz $$5 = $$0.<jh>b($$1).b();
                  if ($$5.a($$3.dp(), 3.0)) {
                     dse $$6 = $$2.a_($$5);
                     if ($$6.a(dfd.od)) {
                        dex $$7 = (dex)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
