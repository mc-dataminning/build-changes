import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class byk {
   public static bym<bvi> a(float $$0) {
      return cao.a((Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$1 -> $$1.group($$1.c(cem.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<fbb> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cep($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fbb a(ard $$0, bvi $$1) {
      azh $$2 = $$1.dY();
      ji $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ji $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fbb.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ard $$0, bvi $$1, ji $$2) {
      return $$0.h($$2) && (double)$$0.a(ect.a.e, $$2).v() <= $$1.dC();
   }
}
