import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bmp {
   public static bkr<biy> a(float $$0, bgb $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bkr<biy> a(bim<?> $$0, float $$1, bgb $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ag()));
   }

   private static bkr<biy> a(float $$0, bgb $$1, Predicate<biy> $$2) {
      float $$3 = $$0 * $$0;
      bmp.a $$4 = new bmp.a($$1);
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$3x -> $$3x.group($$3x.c(bsa.n), $$3x.b(bsa.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<biy> $$9 = $$3x.<bsc>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((bii)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new blb($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bgb a;
      private int b;

      public a(bgb $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(aru $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
