import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsh {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static bsa<bpf> a(float $$0) {
      return a($$0, true);
   }

   public static bsa<bpf> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> bzu.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bc());
   }

   public static bqq<bpf> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> bzu.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static bqq<bpf> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static bqq<bpf> c(float $$0) {
      return a($$0, bsh::a, bof::bc);
   }

   private static bsa<bpf> a(float $$0, Function<bpf, eov> $$1, Predicate<bpf> $$2) {
      return buc.a((Function<buc.b<bpf>, ? extends App<buc.c<bpf>, buf<bpf>>>)($$3 -> $$3.group($$3.c(bya.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               if (!$$2.test($$5)) {
                  return false;
               } else {
                  Optional<eov> $$7 = Optional.ofNullable($$1.apply($$5));
                  $$3x.a($$7.map($$1xxxx -> new byd($$1xxxx, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eov a(bpf $$0) {
      eov $$1 = null;
      eov $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = bqr.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dh().e($$0.dh().a($$1).d().d((double)$$3[0], (double)$$3[1], (double)$$3[0]));
         }

         if ($$2 == null || $$0.dJ().b_(ib.a($$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static eov a(bpf $$0, int $$1, int $$2) {
      eov $$3 = $$0.f(0.0F);
      return bzp.a($$0, $$1, $$2, -2, $$3.c, $$3.e, (float) (Math.PI / 2));
   }
}
