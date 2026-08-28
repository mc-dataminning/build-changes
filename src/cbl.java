import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class cbl {
   public static bzm<bxu> a(float $$0, buc $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bzm<bxu> a(bxc<?> $$0, float $$1, buc $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.an()));
   }

   private static bzm<bxu> a(float $$0, buc $$1, Predicate<bxu> $$2) {
      float $$3 = $$0 * $$0;
      cbl.a $$4 = new cbl.a($$1);
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$3x -> $$3x.group($$3x.c(cgw.o), $$3x.b(cgw.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bxu> $$9 = $$3x.<cgy>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g($$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bzw($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final buc a;
      private int b;

      public a(buc $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azx $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
