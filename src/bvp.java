import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvp {
   public static bvr<bso> a(float $$0) {
      return bxt.a((Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$1 -> $$1.group($$1.c(cbr.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.du())) {
                  return false;
               } else {
                  Optional<ewu> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cbu($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ewu a(aqt $$0, bso $$1) {
      ayt $$2 = $$1.et();
      ir $$3 = $$1.du();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ir $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ewu.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aqt $$0, bso $$1, ir $$2) {
      return $$0.h($$2) && (double)$$0.a(dyu.a.e, $$2).v() <= $$1.dB();
   }
}
