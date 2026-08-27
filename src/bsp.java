import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bsp {
   public static bqq<box> a(float $$0, blw $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bqq<box> a(bol<?> $$0, float $$1, blw $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bqq<box> a(float $$0, blw $$1, Predicate<box> $$2) {
      float $$3 = $$0 * $$0;
      bsp.a $$4 = new bsp.a($$1);
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$3x -> $$3x.group($$3x.c(bya.n), $$3x.b(bya.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<box> $$9 = $$3x.<byc>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((bof)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bra($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final blw a;
      private int b;

      public a(blw $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(awt $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
