import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class brw {
   public static bpx<bog> a(float $$0, blf $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bpx<bog> a(bnu<?> $$0, float $$1, blf $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bpx<bog> a(float $$0, blf $$1, Predicate<bog> $$2) {
      float $$3 = $$0 * $$0;
      brw.a $$4 = new brw.a($$1);
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$3x -> $$3x.group($$3x.c(bxh.n), $$3x.b(bxh.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bog> $$9 = $$3x.<bxj>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((bno)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bqh($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final blf a;
      private int b;

      public a(blf $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(awo $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
