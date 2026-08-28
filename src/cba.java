import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class cba {
   public static bzb<bxj> a(float $$0, btr $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bzb<bxj> a(bwr<?> $$0, float $$1, btr $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.an()));
   }

   private static bzb<bxj> a(float $$0, btr $$1, Predicate<bxj> $$2) {
      float $$3 = $$0 * $$0;
      cba.a $$4 = new cba.a($$1);
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$3x -> $$3x.group($$3x.c(cgl.o), $$3x.b(cgl.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bxj> $$9 = $$3x.<cgn>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g($$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bzl($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final btr a;
      private int b;

      public a(btr $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azv $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
