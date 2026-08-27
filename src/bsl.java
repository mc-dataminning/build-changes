import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsl {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bqq<box> a() {
      return buc.a((Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$0 -> $$0.group($$0.b(bya.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  ib $$5 = $$0.<ik>b($$1).b();
                  if ($$5.a($$3.dj(), 3.0)) {
                     dme $$6 = $$2.a_($$5);
                     if ($$6.a(czh.od)) {
                        czb $$7 = (czb)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
