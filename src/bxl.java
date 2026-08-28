import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bxl {
   public static bxn<buk> a(float $$0) {
      return bzp.a((Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$1 -> $$1.group($$1.c(cdn.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.ds())) {
                  return false;
               } else {
                  Optional<eys> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cdq($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eys a(arh $$0, buk $$1) {
      azl $$2 = $$1.dV();
      je $$3 = $$1.ds();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         je $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return eys.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arh $$0, buk $$1, je $$2) {
      return $$0.h($$2) && (double)$$0.a(eak.a.e, $$2).v() <= $$1.dz();
   }
}
