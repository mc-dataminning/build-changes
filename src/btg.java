import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class btg {
   public static brh<bpo> a(float $$0, bmn $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static brh<bpo> a(bpc<?> $$0, float $$1, bmn $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static brh<bpo> a(float $$0, bmn $$1, Predicate<bpo> $$2) {
      float $$3 = $$0 * $$0;
      btg.a $$4 = new btg.a($$1);
      return but.a(
         (Function<but.b<bpo>, ? extends App<but.c<bpo>, buw<bpo>>>)($$3x -> $$3x.group($$3x.c(byr.n), $$3x.b(byr.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bpo> $$9 = $$3x.<byt>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bow)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new brr($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bmn a;
      private int b;

      public a(bmn $$0) {
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
