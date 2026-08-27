import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bqf {
   public static bog<bmo> a(float $$0, bjn $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bog<bmo> a(bmc<?> $$0, float $$1, bjn $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bog<bmo> a(float $$0, bjn $$1, Predicate<bmo> $$2) {
      float $$3 = $$0 * $$0;
      bqf.a $$4 = new bqf.a($$1);
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$3x -> $$3x.group($$3x.c(bvq.n), $$3x.b(bvq.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bmo> $$9 = $$3x.<bvs>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((blw)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new boq($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bjn a;
      private int b;

      public a(bjn $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(auw $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
