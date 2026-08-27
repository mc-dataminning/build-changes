import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bry {
   public static bsa<box> a(float $$0) {
      return buc.a((Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$1 -> $$1.group($$1.c(bya.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dj())) {
                  return false;
               } else {
                  Optional<eov> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new byd($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eov a(apa $$0, box $$1) {
      awt $$2 = $$1.ef();
      ib $$3 = $$1.dj();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ib $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return eov.c($$5);
         }
      }

      return null;
   }

   public static boolean a(apa $$0, box $$1, ib $$2) {
      return $$0.h($$2) && (double)$$0.a(drq.a.e, $$2).v() <= $$1.dq();
   }
}
