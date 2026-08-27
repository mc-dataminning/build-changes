import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class bmy {
   public static bla<bji> a(float $$0, bgl $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static bla<bji> a(biw<?> $$0, float $$1, bgl $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ag()));
   }

   private static bla<bji> a(float $$0, bgl $$1, Predicate<bji> $$2) {
      float $$3 = $$0 * $$0;
      bmy.a $$4 = new bmy.a($$1);
      return bol.a(
         (Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$3x -> $$3x.group($$3x.c(bsj.n), $$3x.b(bsj.h))
               .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bji> $$9 = $$3x.<bsl>b($$5).a($$2.and($$2xxxx -> $$2xxxx.f((bis)$$7) <= (double)$$3));
                     if ($$9.isEmpty()) {
                        return false;
                     } else if (!$$4.a($$6.z)) {
                        return false;
                     } else {
                        $$4x.a(new blk($$9.get(), true));
                        return true;
                     }
                  }))
      );
   }

   public static final class a {
      private final bgl a;
      private int b;

      public a(bgl $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(ase $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
