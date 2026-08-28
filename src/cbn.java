import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class cbn {
   public static bzo<bxw> a(float $$0, bue $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bzo<bxw> a(bxe<?> $$0, float $$1, bue $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.an()));
   }

   private static bzo<bxw> a(float $$0, bue $$1, Predicate<bxw> $$2) {
      float $$3 = $$0 * $$0;
      cbn.a $$4 = new cbn.a($$1);
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$3x -> $$3x.group($$3x.c(cgy.o), $$3x.b(cgy.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bxw> $$9 = $$3x.<cha>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g($$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bzy($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bue a;
      private int b;

      public a(bue $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azz $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
