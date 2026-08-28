import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bzr {
   public static bzt<bwr> a(float $$0) {
      return cbv.a((Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$1 -> $$1.group($$1.c(cft.n)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<fcu> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cfw($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fcu a(arn $$0, bwr $$1) {
      azs $$2 = $$1.dY();
      jj $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jj $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fcu.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arn $$0, bwr $$1, jj $$2) {
      return $$0.h($$2) && (double)$$0.a(eel.a.e, $$2).v() <= $$1.dC();
   }
}
