import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brf {
   public static brh<bog> a(float $$0) {
      return btj.a((Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$1 -> $$1.group($$1.c(bxh.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dm())) {
                  return false;
               } else {
                  Optional<ens> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bxk($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ens a(aov $$0, bog $$1) {
      awo $$2 = $$1.eh();
      hz $$3 = $$1.dm();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         hz $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ens.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aov $$0, bog $$1, hz $$2) {
      return $$0.h($$2) && (double)$$0.a(dqo.a.e, $$2).v() <= $$1.dt();
   }
}
