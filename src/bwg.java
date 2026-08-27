import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bwg {
   public static buh<bso> a(float $$0, bpl $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static buh<bso> a(bsb<?> $$0, float $$1, bpl $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ak()));
   }

   private static buh<bso> a(float $$0, bpl $$1, Predicate<bso> $$2) {
      float $$3 = $$0 * $$0;
      bwg.a $$4 = new bwg.a($$1);
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$3x -> $$3x.group($$3x.c(cbr.n), $$3x.b(cbr.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bso> $$9 = $$3x.<cbt>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((brv)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bur($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bpl a;
      private int b;

      public a(bpl $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ayt $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
