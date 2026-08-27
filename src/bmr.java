import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bmr {
   public static bkt<bjb> a(float $$0, bge $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bkt<bjb> a(bip<?> $$0, float $$1, bge $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ag()));
   }

   private static bkt<bjb> a(float $$0, bge $$1, Predicate<bjb> $$2) {
      float $$3 = $$0 * $$0;
      bmr.a $$4 = new bmr.a($$1);
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$3x -> $$3x.group($$3x.c(bsc.n), $$3x.b(bsc.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bjb> $$9 = $$3x.<bse>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((bil)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bld($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bge a;
      private int b;

      public a(bge $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(arx $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
