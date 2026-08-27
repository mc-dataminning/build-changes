import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bnc {
   public static ble<bjm> a(float $$0, bgp $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static ble<bjm> a(bja<?> $$0, float $$1, bgp $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ag()));
   }

   private static ble<bjm> a(float $$0, bgp $$1, Predicate<bjm> $$2) {
      float $$3 = $$0 * $$0;
      bnc.a $$4 = new bnc.a($$1);
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$3x -> $$3x.group($$3x.c(bsn.n), $$3x.b(bsn.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bjm> $$9 = $$3x.<bsp>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((biw)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new blo($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bgp a;
      private int b;

      public a(bgp $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ash $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
