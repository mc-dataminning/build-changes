import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bwv {
   public static buw<btc> a(float $$0, bps $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static buw<btc> a(bsn<?> $$0, float $$1, bps $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.am()));
   }

   private static buw<btc> a(float $$0, bps $$1, Predicate<btc> $$2) {
      float $$3 = $$0 * $$0;
      bwv.a $$4 = new bwv.a($$1);
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$3x -> $$3x.group($$3x.c(ccg.n), $$3x.b(ccg.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btc> $$9 = $$3x.<cci>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bsh)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bvg($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bps a;
      private int b;

      public a(bps $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ayo $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
