import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxy {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bwd<buk> a() {
      return bzp.a((Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$0 -> $$0.group($$0.b(cdn.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  je $$5 = $$0.<jm>b($$1).b();
                  if ($$5.a($$3.ds(), 3.0)) {
                     duo $$6 = $$2.a_($$5);
                     if ($$6.a(dhl.od)) {
                        dhf $$7 = (dhf)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
