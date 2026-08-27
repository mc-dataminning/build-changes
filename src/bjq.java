import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bjq {
   public static bhs<bfz> a(float $$0, bdi $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bhs<bfz> a(bfn<?> $$0, float $$1, bdi $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ae()));
   }

   private static bhs<bfz> a(float $$0, bdi $$1, Predicate<bfz> $$2) {
      float $$3 = $$0 * $$0;
      bjq.a $$4 = new bjq.a($$1);
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$3x -> $$3x.group($$3x.c(bpb.n), $$3x.b(bpb.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bfz> $$9 = $$3x.<bpd>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((bfj)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bic($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bdi a;
      private int b;

      public a(bdi $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(apf $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
