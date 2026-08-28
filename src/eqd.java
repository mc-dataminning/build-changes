import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class eqd extends eqp {
   public static final MapCodec<eqd> a = btl.b(0, 256).fieldOf("count").xmap(eqd::new, $$0 -> $$0.c);
   private final btl c;

   private eqd(btl $$0) {
      this.c = $$0;
   }

   public static eqd a(btl $$0) {
      return new eqd($$0);
   }

   public static eqd a(int $$0) {
      return a(bti.a($$0));
   }

   @Override
   public Stream<iv> a_(eqn $$0, azv $$1, iv $$2) {
      Builder<iv> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(egn.a.e, $$7, $$8);
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
   public eqq<?> b() {
      return eqq.i;
   }

   private static int a(eqn $$0, int $$1, int $$2, int $$3, int $$4) {
      iv.a $$5 = new iv.a($$1, $$2, $$3);
      int $$6 = 0;
      eao $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         eao $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dmo.I)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(eao $$0) {
      return $$0.l() || $$0.a(dmo.J) || $$0.a(dmo.K);
   }
}
