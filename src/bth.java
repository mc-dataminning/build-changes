import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bth {
   public static bri<bpp> a(float $$0, bmo $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bri<bpp> a(bpd<?> $$0, float $$1, bmo $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bri<bpp> a(float $$0, bmo $$1, Predicate<bpp> $$2) {
      float $$3 = $$0 * $$0;
      bth.a $$4 = new bth.a($$1);
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$3x -> $$3x.group($$3x.c(bys.n), $$3x.b(bys.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bpp> $$9 = $$3x.<byu>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((box)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new brs($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bmo a;
      private int b;

      public a(bmo $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(axd $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
