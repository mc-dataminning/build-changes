import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bly {
   public static bma<biy> a(float $$0) {
      return boc.a((Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$1 -> $$1.group($$1.c(bsa.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.g($$3.dk())) {
                  return false;
               } else {
                  Optional<ehe> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bsd($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ehe a(akk $$0, biy $$1) {
      aru $$2 = $$1.ee();
      gu $$3 = $$1.dk();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         gu $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ehe.c($$5);
         }
      }

      return null;
   }

   public static boolean a(akk $$0, biy $$1, gu $$2) {
      return $$0.g($$2) && (double)$$0.a(dkj.a.e, $$2).v() <= $$1.dr();
   }
}
