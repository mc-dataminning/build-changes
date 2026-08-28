import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bzy {
   public static bxz<bwf> a(float $$0, bst $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bxz<bwf> a(bvq<?> $$0, float $$1, bst $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static bxz<bwf> a(float $$0, bst $$1, Predicate<bwf> $$2) {
      float $$3 = $$0 * $$0;
      bzy.a $$4 = new bzy.a($$1);
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$3x -> $$3x.group($$3x.c(cfj.n), $$3x.b(cfj.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bwf> $$9 = $$3x.<cfl>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bvj)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new byj($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bst a;
      private int b;

      public a(bst $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(bam $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
