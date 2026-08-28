import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvh {
   public static bwu<bts> a(int $$0, float $$1) {
      return byw.a(
         (Function<byw.b<bts>, ? extends App<byw.c<bts>, byz<bts>>>)($$2 -> $$2.group($$2.c(ccu.m), $$2.a(ccu.n), $$2.b(ccu.o), $$2.b(ccu.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     btq $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<ccw>b($$6).a($$9)) {
                        $$4.a(new bvu($$9, true));
                        $$7.H().a(-$$1, 0.0F);
                        $$7.r(ayz.c($$7.dF(), $$7.ba, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
