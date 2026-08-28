import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bxf {
   public static bvg<btl> a(float $$0, bqb $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bvg<btl> a(bsw<?> $$0, float $$1, bqb $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.am()));
   }

   private static bvg<btl> a(float $$0, bqb $$1, Predicate<btl> $$2) {
      float $$3 = $$0 * $$0;
      bxf.a $$4 = new bxf.a($$1);
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$3x -> $$3x.group($$3x.c(ccq.n), $$3x.b(ccq.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<btl> $$9 = $$3x.<ccs>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g((bsq)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new bvq($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bqb a;
      private int b;

      public a(bqb $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ayv $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
