import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class byx {
   public static bwy<bve> a(float $$0, brs $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bwy<bve> a(bup<?> $$0, float $$1, brs $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ar()));
   }

   private static bwy<bve> a(float $$0, brs $$1, Predicate<bve> $$2) {
      float $$3 = $$0 * $$0;
      byx.a $$4 = new byx.a($$1);
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$3x -> $$3x.group($$3x.c(cei.n), $$3x.b(cei.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bve> $$9 = $$3x.<cek>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bui)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.A)) {
                        return false;
                     } else {
                        $$4x.a(new bxi($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final brs a;
      private int b;

      public a(brs $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(azv $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
