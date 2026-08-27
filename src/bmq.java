import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmq {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bmj<bjr> a(float $$0) {
      return a($$0, true);
   }

   public static bmj<bjr> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> bub.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.ba());
   }

   public static bla<bjr> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> bub.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bla<bjr> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bla<bjr> c(float $$0) {
      return a($$0, bmq::a, bis::ba);
   }

   private static bmj<bjr> a(float $$0, Function<bjr, ehp> $$1, Predicate<bjr> $$2) {
      return bol.a((Function<bol.b<bjr>, ? extends App<bol.c<bjr>, boo<bjr>>>)($$3 -> $$3.group($$3.c(bsj.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<ehp> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bsm($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ehp a(bjr $$0) {
      ehp $$1 = null;
      ehp $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = blb.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dj().e($$0.dj().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dL().b_(gw.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static ehp a(bjr $$0, int $$1, int $$2) {
      ehp $$3 = $$0.f(0.0F);
      return btw.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
