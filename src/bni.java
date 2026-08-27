import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bni {
   public static bnk<bkj> a(float $$0) {
      return bpm.a((Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$1 -> $$1.group($$1.c(btk.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.g($$3.dl())) {
                  return false;
               } else {
                  Optional<eif> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new btn($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eif a(alq $$0, bkj $$1) {
      ate $$2 = $$1.ef();
      ht $$3 = $$1.dl();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ht $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return eif.c($$5);
         }
      }

      return null;
   }

   public static boolean a(alq $$0, bkj $$1, ht $$2) {
      return $$0.g($$2) && (double)$$0.a(dlk.a.e, $$2).v() <= $$1.ds();
   }
}
