import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwn {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bus<bsy> a() {
      return bye.a((Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$0 -> $$0.group($$0.b(ccc.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  ja $$5 = $$0.<ji>b($$1).b();
                  if ($$5.a($$3.dp(), 3.0)) {
                     dsh $$6 = $$2.a_($$5);
                     if ($$6.a(dfh.od)) {
                        dfb $$7 = (dfb)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
