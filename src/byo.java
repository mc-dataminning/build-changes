import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class byo {
   public static bwp<buv> a(float $$0, brj $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bwp<buv> a(bug<?> $$0, float $$1, brj $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static bwp<buv> a(float $$0, brj $$1, Predicate<buv> $$2) {
      float $$3 = $$0 * $$0;
      byo.a $$4 = new byo.a($$1);
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$3x -> $$3x.group($$3x.c(cdz.n), $$3x.b(cdz.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<buv> $$9 = $$3x.<ceb>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((btz)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bwz($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final brj a;
      private int b;

      public a(brj $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azr $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
