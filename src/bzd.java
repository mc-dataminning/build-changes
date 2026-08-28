import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bzd {
   public static bzf<bwb> a(float $$0) {
      return cbh.a((Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$1 -> $$1.group($$1.c(cff.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<fbs> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cfi($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fbs a(ash $$0, bwb $$1) {
      bam $$2 = $$1.dY();
      jh $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jh $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fbs.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ash $$0, bwb $$1, jh $$2) {
      return $$0.h($$2) && (double)$$0.a(edi.a.e, $$2).v() <= $$1.dC();
   }
}
