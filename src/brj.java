import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brj {
   public static brl<boi> a(float $$0) {
      return btn.a((Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$1 -> $$1.group($$1.c(bxl.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dm())) {
                  return false;
               } else {
                  Optional<enz> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bxo($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static enz a(aow $$0, boi $$1) {
      awp $$2 = $$1.eh();
      hz $$3 = $$1.dm();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         hz $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return enz.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aow $$0, boi $$1, hz $$2) {
      return $$0.h($$2) && (double)$$0.a(dqv.a.e, $$2).v() <= $$1.dt();
   }
}
