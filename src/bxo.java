import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bxo {
   public static bxq<bun> a(float $$0) {
      return bzs.a((Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$1 -> $$1.group($$1.c(cdq.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.ds())) {
                  return false;
               } else {
                  Optional<eyw> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cdt($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eyw a(arj $$0, bun $$1) {
      azn $$2 = $$1.dV();
      jf $$3 = $$1.ds();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jf $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return eyw.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arj $$0, bun $$1, jf $$2) {
      return $$0.h($$2) && (double)$$0.a(eao.a.e, $$2).v() <= $$1.dz();
   }
}
