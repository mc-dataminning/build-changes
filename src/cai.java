import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class cai {
   public static byj<bwr> a(float $$0, btb $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static byj<bwr> a(bwb<?> $$0, float $$1, btb $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static byj<bwr> a(float $$0, btb $$1, Predicate<bwr> $$2) {
      float $$3 = $$0 * $$0;
      cai.a $$4 = new cai.a($$1);
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$3x -> $$3x.group($$3x.c(cft.o), $$3x.b(cft.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bwr> $$9 = $$3x.<cfv>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bvs)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new byt($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final btb a;
      private int b;

      public a(btb $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azs $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
