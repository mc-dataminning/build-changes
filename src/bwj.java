import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bwj {
   public static buk<bsq> a(float $$0, bph $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static buk<bsq> a(bsc<?> $$0, float $$1, bph $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ak()));
   }

   private static buk<bsq> a(float $$0, bph $$1, Predicate<bsq> $$2) {
      float $$3 = $$0 * $$0;
      bwj.a $$4 = new bwj.a($$1);
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$3x -> $$3x.group($$3x.c(cbu.n), $$3x.b(cbu.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bsq> $$9 = $$3x.<cbw>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((brw)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new buu($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bph a;
      private int b;

      public a(bph $$0) {
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
