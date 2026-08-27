import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bvs {
   public static btt<bsa> a(float $$0, box $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static btt<bsa> a(brn<?> $$0, float $$1, box $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static btt<bsa> a(float $$0, box $$1, Predicate<bsa> $$2) {
      float $$3 = $$0 * $$0;
      bvs.a $$4 = new bvs.a($$1);
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$3x -> $$3x.group($$3x.c(cbd.n), $$3x.b(cbd.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bsa> $$9 = $$3x.<cbf>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((brh)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bud($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final box a;
      private int b;

      public a(box $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ayg $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
