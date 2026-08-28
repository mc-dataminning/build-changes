import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bwr {
   public static bus<bsy> a(float $$0, bpo $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bus<bsy> a(bsj<?> $$0, float $$1, bpo $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ak()));
   }

   private static bus<bsy> a(float $$0, bpo $$1, Predicate<bsy> $$2) {
      float $$3 = $$0 * $$0;
      bwr.a $$4 = new bwr.a($$1);
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$3x -> $$3x.group($$3x.c(ccc.n), $$3x.b(ccc.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bsy> $$9 = $$3x.<cce>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bsd)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bvc($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bpo a;
      private int b;

      public a(bpo $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(aym $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
