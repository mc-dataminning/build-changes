import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brs {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static bpx<bog> a() {
      return btj.a((Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$0 -> $$0.group($$0.b(bxh.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$2.z.i() <= 0.95F) {
                  return false;
               } else {
                  hz $$5 = $$0.<ii>b($$1).b();
                  if ($$5.a($$3.dm(), 3.0)) {
                     dlf $$6 = $$2.a_($$5);
                     if ($$6.a(cyq.od)) {
                        cyk $$7 = (cyk)$$6.b();
                        $$7.a($$3, $$2, $$5, null);
                     }
                  }

                  return true;
               }
            })));
   }
}
