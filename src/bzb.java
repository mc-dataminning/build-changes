import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bzb {
   public static bxc<bvi> a(float $$0, brw $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bxc<bvi> a(but<?> $$0, float $$1, brw $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static bxc<bvi> a(float $$0, brw $$1, Predicate<bvi> $$2) {
      float $$3 = $$0 * $$0;
      bzb.a $$4 = new bzb.a($$1);
      return cao.a(
         (Function<cao.b<bvi>, ? extends App<cao.c<bvi>, car<bvi>>>)($$3x -> $$3x.group($$3x.c(cem.n), $$3x.b(cem.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvi> $$9 = $$3x.<ceo>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bum)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bxm($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final brw a;
      private int b;

      public a(brw $$0) {
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
