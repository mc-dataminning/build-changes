import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dwi extends dwt {
   public static final Codec<dwi> a = big.b(0, 256).fieldOf("count").xmap(dwi::new, $$0 -> $$0.c).codec();
   private final big c;

   private dwi(big $$0) {
      this.c = $$0;
   }

   public static dwi a(big $$0) {
      return new dwi($$0);
   }

   public static dwi a(int $$0) {
      return a(bid.a($$0));
   }

   @Override
   public Stream<hx> a_(dwr $$0, atw $$1, hx $$2) {
      Builder<hx> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dmw.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new hx($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public dwu<?> b() {
      return dwu.i;
   }

   private static int a(dwr $$0, int $$1, int $$2, int $$3, int $$4) {
      hx.a $$5 = new hx.a($$1, $$2, $$3);
      int $$6 = 0;
      dhn $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dhn $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cvh.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dhn $$0) {
      return $$0.i() || $$0.a(cvh.G) || $$0.a(cvh.H);
   }
}
