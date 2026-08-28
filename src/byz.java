import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class byz {
   public static bzb<bvx> a(float $$0) {
      return cbd.a((Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$1 -> $$1.group($$1.c(cfb.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dw())) {
                  return false;
               } else {
                  Optional<fbr> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cfe($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fbr a(arx $$0, bvx $$1) {
      bac $$2 = $$1.dZ();
      jh $$3 = $$1.dw();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jh $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fbr.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arx $$0, bvx $$1, jh $$2) {
      return $$0.h($$2) && (double)$$0.a(edj.a.e, $$2).v() <= $$1.dD();
   }
}
