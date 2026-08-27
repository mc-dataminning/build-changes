import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class buw {
   public static bsx<bre> a(float $$0, bob $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bsx<bre> a(bqr<?> $$0, float $$1, bob $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bsx<bre> a(float $$0, bob $$1, Predicate<bre> $$2) {
      float $$3 = $$0 * $$0;
      buw.a $$4 = new buw.a($$1);
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$3x -> $$3x.group($$3x.c(cah.n), $$3x.b(cah.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bre> $$9 = $$3x.<caj>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bql)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bth($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bob a;
      private int b;

      public a(bob $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ayd $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
