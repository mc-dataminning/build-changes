import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bpw {
   public static bnx<bmf> a(float $$0, bjg $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bnx<bmf> a(blt<?> $$0, float $$1, bjg $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bnx<bmf> a(float $$0, bjg $$1, Predicate<bmf> $$2) {
      float $$3 = $$0 * $$0;
      bpw.a $$4 = new bpw.a($$1);
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$3x -> $$3x.group($$3x.c(bvh.n), $$3x.b(bvh.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bmf> $$9 = $$3x.<bvj>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((blp)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new boh($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bjg a;
      private int b;

      public a(bjg $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(aup $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
