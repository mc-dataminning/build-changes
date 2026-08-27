import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bqb {
   public static boc<bmk> a(float $$0, bjl $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static boc<bmk> a(bly<?> $$0, float $$1, bjl $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static boc<bmk> a(float $$0, bjl $$1, Predicate<bmk> $$2) {
      float $$3 = $$0 * $$0;
      bqb.a $$4 = new bqb.a($$1);
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$3x -> $$3x.group($$3x.c(bvm.n), $$3x.b(bvm.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bmk> $$9 = $$3x.<bvo>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((blu)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bom($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bjl a;
      private int b;

      public a(bjl $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(auu $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
