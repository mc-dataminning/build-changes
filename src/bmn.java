import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bmn {
   public static bkp<biw> a(float $$0, bfz $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bkp<biw> a(bik<?> $$0, float $$1, bfz $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ag()));
   }

   private static bkp<biw> a(float $$0, bfz $$1, Predicate<biw> $$2) {
      float $$3 = $$0 * $$0;
      bmn.a $$4 = new bmn.a($$1);
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$3x -> $$3x.group($$3x.c(bry.n), $$3x.b(bry.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<biw> $$9 = $$3x.<bsa>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((big)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bkz($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bfz a;
      private int b;

      public a(bfz $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(art $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
