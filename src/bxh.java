import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bxh {
   public static bvi<btn> a(float $$0, bqc $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bvi<btn> a(bsx<?> $$0, float $$1, bqc $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.am()));
   }

   private static bvi<btn> a(float $$0, bqc $$1, Predicate<btn> $$2) {
      float $$3 = $$0 * $$0;
      bxh.a $$4 = new bxh.a($$1);
      return byu.a(
         (Function<byu.b<btn>, ? extends App<byu.c<btn>, byx<btn>>>)($$3x -> $$3x.group($$3x.c(ccs.n), $$3x.b(ccs.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btn> $$9 = $$3x.<ccu>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bsr)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bvs($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bqc a;
      private int b;

      public a(bqc $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ayw $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
