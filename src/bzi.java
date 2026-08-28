import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bzi {
   public static bzk<bwg> a(float $$0) {
      return cbm.a((Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$1 -> $$1.group($$1.c(cfk.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dw())) {
                  return false;
               } else {
                  Optional<fby> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cfn($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fby a(ash $$0, bwg $$1) {
      bam $$2 = $$1.dZ();
      jh $$3 = $$1.dw();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jh $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fby.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ash $$0, bwg $$1, jh $$2) {
      return $$0.h($$2) && (double)$$0.a(edq.a.e, $$2).v() <= $$1.dD();
   }
}
