import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class byc {
   public static bwd<buk> a(float $$0, bra $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bwd<buk> a(btv<?> $$0, float $$1, bra $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ao()));
   }

   private static bwd<buk> a(float $$0, bra $$1, Predicate<buk> $$2) {
      float $$3 = $$0 * $$0;
      byc.a $$4 = new byc.a($$1);
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$3x -> $$3x.group($$3x.c(cdn.n), $$3x.b(cdn.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<buk> $$9 = $$3x.<cdp>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bto)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bwn($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bra a;
      private int b;

      public a(bra $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azl $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
