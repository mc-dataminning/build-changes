import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwl {
   public static bxz<btq> a(brj $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bxz<btq> a(brj $$0, Function<buv, Float> $$1) {
      return cab.a(
         (Function<cab.b<btq>, ? extends App<cab.c<btq>, cae<btq>>>)($$2 -> $$2.group($$2.b(cdz.K), $$2.a(cdz.n), $$2.c(cdz.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        btq $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cec $$10 = new cec(new bwz($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bwz($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
