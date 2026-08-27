import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bow {
   public static bmy<blg> a(float $$0, bii $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bmy<blg> a(bku<?> $$0, float $$1, bii $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bmy<blg> a(float $$0, bii $$1, Predicate<blg> $$2) {
      float $$3 = $$0 * $$0;
      bow.a $$4 = new bow.a($$1);
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$3x -> $$3x.group($$3x.c(buh.n), $$3x.b(buh.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<blg> $$9 = $$3x.<buj>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((bkq)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bni($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bii a;
      private int b;

      public a(bii $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ats $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
