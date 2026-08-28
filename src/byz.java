import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class byz {
   public static bxa<bvg> a(float $$0, bru $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bxa<bvg> a(bur<?> $$0, float $$1, bru $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static bxa<bvg> a(float $$0, bru $$1, Predicate<bvg> $$2) {
      float $$3 = $$0 * $$0;
      byz.a $$4 = new byz.a($$1);
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$3x -> $$3x.group($$3x.c(cek.n), $$3x.b(cek.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bvg> $$9 = $$3x.<cem>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((buk)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bxk($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bru a;
      private int b;

      public a(bru $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azh $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
