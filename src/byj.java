import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class byj {
   public static byl<bvh> a(float $$0) {
      return can.a((Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$1 -> $$1.group($$1.c(cel.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<fba> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new ceo($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fba a(ard $$0, bvh $$1) {
      azh $$2 = $$1.dY();
      ji $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ji $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fba.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ard $$0, bvh $$1, ji $$2) {
      return $$0.h($$2) && (double)$$0.a(ecs.a.e, $$2).v() <= $$1.dC();
   }
}
