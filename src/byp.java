import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byp {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bwu<bva> a() {
      return cag.a((Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$0 -> $$0.group($$0.b(cee.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.A.i() <= 0.95F) {
                  return false;
               } else {
                  jh $$5 = $$0.<jp>b($$1).b();
                  if ($$5.a($$3.dx(), 3.0)) {
                     dvj $$6 = $$2.a_($$5);
                     if ($$6.a(dig.od)) {
                        dia $$7 = (dia)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
