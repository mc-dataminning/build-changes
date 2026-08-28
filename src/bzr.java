import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bzr {
   public static bxs<bvy> a(float $$0, bsj $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bxs<bvy> a(bvi<?> $$0, float $$1, bsj $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static bxs<bvy> a(float $$0, bsj $$1, Predicate<bvy> $$2) {
      float $$3 = $$0 * $$0;
      bzr.a $$4 = new bzr.a($$1);
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$3x -> $$3x.group($$3x.c(cfc.n), $$3x.b(cfc.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvy> $$9 = $$3x.<cfe>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bva)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new byc($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bsj a;
      private int b;

      public a(bsj $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azh $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
