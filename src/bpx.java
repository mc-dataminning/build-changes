import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bpx {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bpq<bmx> a(float $$0) {
      return a($$0, true);
   }

   public static bpq<bmx> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> bxk.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bc());
   }

   public static bog<bmx> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> bxk.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bog<bmx> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bog<bmx> c(float $$0) {
      return a($$0, bpx::a, blw::bc);
   }

   private static bpq<bmx> a(float $$0, Function<bmx, emc> $$1, Predicate<bmx> $$2) {
      return brs.a((Function<brs.b<bmx>, ? extends App<brs.c<bmx>, brv<bmx>>>)($$3 -> $$3.group($$3.c(bvq.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<emc> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new bvt($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static emc a(bmx $$0) {
      emc $$1 = null;
      emc $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = boh.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dj().e($$0.dj().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dL().b_(hx.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static emc a(bmx $$0, int $$1, int $$2) {
      emc $$3 = $$0.f(0.0F);
      return bxf.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
