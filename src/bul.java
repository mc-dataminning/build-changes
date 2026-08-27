import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bul {
   public static bsm<bqt> a(float $$0, bnq $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bsm<bqt> a(bqg<?> $$0, float $$1, bnq $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bsm<bqt> a(float $$0, bnq $$1, Predicate<bqt> $$2) {
      float $$3 = $$0 * $$0;
      bul.a $$4 = new bul.a($$1);
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$3x -> $$3x.group($$3x.c(bzw.n), $$3x.b(bzw.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bqt> $$9 = $$3x.<bzy>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bqa)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bsw($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bnq a;
      private int b;

      public a(bnq $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(axt $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
