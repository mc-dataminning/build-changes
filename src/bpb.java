import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bpb {
   public static bnd<bll> a(float $$0, bim $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bnd<bll> a(bkz<?> $$0, float $$1, bim $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ai()));
   }

   private static bnd<bll> a(float $$0, bim $$1, Predicate<bll> $$2) {
      float $$3 = $$0 * $$0;
      bpb.a $$4 = new bpb.a($$1);
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$3x -> $$3x.group($$3x.c(bum.n), $$3x.b(bum.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bll> $$9 = $$3x.<buo>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((bkv)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bnn($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bim a;
      private int b;

      public a(bim $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(atw $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
