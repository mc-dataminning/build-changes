import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bxx {
   public static bxz<buv> a(float $$0) {
      return cab.a((Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$1 -> $$1.group($$1.c(cdz.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dx())) {
                  return false;
               } else {
                  Optional<ezh> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cec($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ezh a(arm $$0, buv $$1) {
      azr $$2 = $$1.ea();
      jg $$3 = $$1.dx();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jg $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ezh.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arm $$0, buv $$1, jg $$2) {
      return $$0.h($$2) && (double)$$0.a(eaz.a.e, $$2).v() <= $$1.dE();
   }
}
