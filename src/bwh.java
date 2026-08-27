import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bwh {
   public static bui<bso> a(float $$0, bpf $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bui<bso> a(bsa<?> $$0, float $$1, bpf $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ak()));
   }

   private static bui<bso> a(float $$0, bpf $$1, Predicate<bso> $$2) {
      float $$3 = $$0 * $$0;
      bwh.a $$4 = new bwh.a($$1);
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$3x -> $$3x.group($$3x.c(cbs.n), $$3x.b(cbs.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bso> $$9 = $$3x.<cbu>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bru)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bus($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bpf a;
      private int b;

      public a(bpf $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ayk $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
