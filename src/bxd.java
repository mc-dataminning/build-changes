import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bxd {
   public static bve<btk> a(float $$0, bqa $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bve<btk> a(bsv<?> $$0, float $$1, bqa $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ak()));
   }

   private static bve<btk> a(float $$0, bqa $$1, Predicate<btk> $$2) {
      float $$3 = $$0 * $$0;
      bxd.a $$4 = new bxd.a($$1);
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$3x -> $$3x.group($$3x.c(cco.n), $$3x.b(cco.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btk> $$9 = $$3x.<ccq>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bsp)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bvo($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bqa a;
      private int b;

      public a(bqa $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azc $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
