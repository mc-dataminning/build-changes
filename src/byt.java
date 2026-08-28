import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byt {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bwy<bve> a() {
      return cak.a((Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$0 -> $$0.group($$0.b(cei.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  jh $$5 = $$0.<jp>b($$1).b();
                  if ($$5.a($$3.dy(), 3.0)) {
                     dvo $$6 = $$2.a_($$5);
                     if ($$6.a(dil.od)) {
                        dif $$7 = (dif)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
