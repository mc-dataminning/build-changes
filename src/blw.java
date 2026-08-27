import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class blw {
   public static bly<biw> a(float $$0) {
      return boa.a((Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$1 -> $$1.group($$1.c(bry.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.g($$3.dk())) {
                  return false;
               } else {
                  Optional<ehf> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bsb($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ehf a(aki $$0, biw $$1) {
      art $$2 = $$1.ee();
      gv $$3 = $$1.dk();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         gv $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ehf.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aki $$0, biw $$1, gv $$2) {
      return $$0.g($$2) && (double)$$0.a(dkh.a.e, $$2).v() <= $$1.dr();
   }
}
