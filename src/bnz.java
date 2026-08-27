import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bnz {
   public static bmb<bkj> a(float $$0, bhm $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bmb<bkj> a(bjx<?> $$0, float $$1, bhm $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ag()));
   }

   private static bmb<bkj> a(float $$0, bhm $$1, Predicate<bkj> $$2) {
      float $$3 = $$0 * $$0;
      bnz.a $$4 = new bnz.a($$1);
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$3x -> $$3x.group($$3x.c(btk.n), $$3x.b(btk.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bkj> $$9 = $$3x.<btm>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((bjt)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bml($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bhm a;
      private int b;

      public a(bhm $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ate $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
