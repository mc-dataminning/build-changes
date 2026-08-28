import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxd {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bvi<bto> a() {
      return byu.a((Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$0 -> $$0.group($$0.b(ccs.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  iz $$5 = $$0.<jh>b($$1).b();
                  if ($$5.a($$3.dp(), 3.0)) {
                     dsb $$6 = $$2.a_($$5);
                     if ($$6.a(dfa.od)) {
                        deu $$7 = (deu)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
