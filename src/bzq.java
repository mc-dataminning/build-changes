import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bzq {
   public static bxr<bvx> a(float $$0, bsl $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bxr<bvx> a(bvi<?> $$0, float $$1, bsl $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static bxr<bvx> a(float $$0, bsl $$1, Predicate<bvx> $$2) {
      float $$3 = $$0 * $$0;
      bzq.a $$4 = new bzq.a($$1);
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$3x -> $$3x.group($$3x.c(cfb.n), $$3x.b(cfb.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvx> $$9 = $$3x.<cfd>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bvb)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new byb($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bsl a;
      private int b;

      public a(bsl $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(bac $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
