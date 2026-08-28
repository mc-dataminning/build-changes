import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class caq {
   public static byr<bwz> a(float $$0, btj $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static byr<bwz> a(bwj<?> $$0, float $$1, btj $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.aq()));
   }

   private static byr<bwz> a(float $$0, btj $$1, Predicate<bwz> $$2) {
      float $$3 = $$0 * $$0;
      caq.a $$4 = new caq.a($$1);
      return ccd.a(
         (Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$3x -> $$3x.group($$3x.c(cgb.o), $$3x.b(cgb.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bwz> $$9 = $$3x.<cgd>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g($$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bzb($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final btj a;
      private int b;

      public a(btj $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azt $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
