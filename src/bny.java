import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bny {
   public static bmb<bkj> a(bkm $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag().f()), $$1);
   }

   public static bnk<bkj> a(bjx<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag()), $$1);
   }

   public static bnk<bkj> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bnk<bkj> a(Predicate<bkj> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$2x -> $$2x.group($$2x.c(btk.n), $$2x.b(btk.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bkj> $$8 = $$2x.<btm>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bjt)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bml($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
