import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bxi {
   public static bvj<btp> a(float $$0, bqf $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bvj<btp> a(bta<?> $$0, float $$1, bqf $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ak()));
   }

   private static bvj<btp> a(float $$0, bqf $$1, Predicate<btp> $$2) {
      float $$3 = $$0 * $$0;
      bxi.a $$4 = new bxi.a($$1);
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$3x -> $$3x.group($$3x.c(cct.n), $$3x.b(cct.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btp> $$9 = $$3x.<ccv>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bsu)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bvt($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bqf a;
      private int b;

      public a(bqf $$0) {
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
