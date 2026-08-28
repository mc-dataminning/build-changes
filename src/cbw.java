import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class cbw {
   public static bzx<byf> a(float $$0, bun $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bzx<byf> a(bxn<?> $$0, float $$1, bun $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.an()));
   }

   private static bzx<byf> a(float $$0, bun $$1, Predicate<byf> $$2) {
      float $$3 = $$0 * $$0;
      cbw.a $$4 = new cbw.a($$1);
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$3x -> $$3x.group($$3x.c(chh.o), $$3x.b(chh.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<byf> $$9 = $$3x.<chj>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g($$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new cah($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bun a;
      private int b;

      public a(bun $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(bai $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
