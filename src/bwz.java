import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwz {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bve<btk> a() {
      return byq.a((Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$0 -> $$0.group($$0.b(cco.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  iz $$5 = $$0.<jh>b($$1).b();
                  if ($$5.a($$3.dp(), 3.0)) {
                     drx $$6 = $$2.a_($$5);
                     if ($$6.a(dew.od)) {
                        deq $$7 = (deq)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
