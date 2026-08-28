import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class eqi extends equ {
   public static final MapCodec<eqi> a = btl.b(0, 256).fieldOf("count").xmap(eqi::new, $$0 -> $$0.c);
   private final btl c;

   private eqi(btl $$0) {
      this.c = $$0;
   }

   public static eqi a(btl $$0) {
      return new eqi($$0);
   }

   public static eqi a(int $$0) {
      return a(bti.a($$0));
   }

   @Override
   public Stream<iv> a_(eqs $$0, azv $$1, iv $$2) {
      Builder<iv> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(egs.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new iv($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public eqv<?> b() {
      return eqv.i;
   }

   private static int a(eqs $$0, int $$1, int $$2, int $$3, int $$4) {
      iv.a $$5 = new iv.a($$1, $$2, $$3);
      int $$6 = 0;
      eat $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         eat $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dmt.I)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(eat $$0) {
      return $$0.l() || $$0.a(dmt.J) || $$0.a(dmt.K);
   }
}
