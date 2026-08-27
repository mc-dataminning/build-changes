import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bmw {
   public static bky<bjg> a(float $$0, bgj $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bky<bjg> a(biu<?> $$0, float $$1, bgj $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ah()));
   }

   private static bky<bjg> a(float $$0, bgj $$1, Predicate<bjg> $$2) {
      float $$3 = $$0 * $$0;
      bmw.a $$4 = new bmw.a($$1);
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$3x -> $$3x.group($$3x.c(bsh.n), $$3x.b(bsh.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bjg> $$9 = $$3x.<bsj>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((biq)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bli($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bgj a;
      private int b;

      public a(bgj $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(asc $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
