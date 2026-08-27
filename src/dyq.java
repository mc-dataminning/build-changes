import com.mojang.serialization.Codec;
import java.util.function.Function;

public class dyq extends dyy<dyp> {
   public dyq(Codec<dyp> $$0) {
      super($$0);
   }

   public boolean a(dyp $$0, ayk $$1) {
      return $$1.i() <= $$0.l;
   }

   public boolean a(dyt $$0, dyp $$1, dsx $$2, Function<io, ix<dbw>> $$3, ayk $$4, dwf $$5, dae $$6, dsw $$7) {
      int $$8 = (this.d() * 2 - 1) * 16;
      double $$9 = (double)$$6.a($$4.a(16));
      int $$10 = $$1.e.a($$4, $$0);
      double $$11 = (double)$$6.b($$4.a(16));
      float $$12 = $$4.i() * (float) (Math.PI * 2);
      float $$13 = $$1.b.a($$4);
      double $$14 = (double)$$1.f.a($$4);
      float $$15 = $$1.c.c.a($$4);
      int $$16 = (int)((float)$$8 * $$1.c.b.a($$4));
      int $$17 = 0;
      this.a($$0, $$1, $$2, $$3, $$4.g(), $$5, $$9, (double)$$10, $$11, $$15, $$12, $$13, 0, $$16, $$14, $$7);
      return true;
   }

   private void a(
      dyt $$0,
      dyp $$1,
      dsx $$2,
      Function<io, ix<dbw>> $$3,
      long $$4,
      dwf $$5,
      double $$6,
      double $$7,
      double $$8,
      float $$9,
      float $$10,
      float $$11,
      int $$12,
      int $$13,
      double $$14,
      dsw $$15
   ) {
      ayk $$16 = ayk.a($$4);
      float[] $$17 = this.a($$0, $$1, $$16);
      float $$18 = 0.0F;
      float $$19 = 0.0F;

      for (int $$20 = $$12; $$20 < $$13; $$20++) {
         double $$21 = 1.5 + (double)(ayd.a((float)$$20 * (float) Math.PI / (float)$$13) * $$9);
         double $$22 = $$21 * $$14;
         $$21 *= (double)$$1.c.e.a($$16);
         $$22 = this.a($$1, $$16, $$22, (float)$$13, (float)$$20);
         float $$23 = ayd.b($$11);
         float $$24 = ayd.a($$11);
         $$6 += (double)(ayd.b($$10) * $$23);
         $$7 += (double)$$24;
         $$8 += (double)(ayd.a($$10) * $$23);
         $$11 *= 0.7F;
         $$11 += $$19 * 0.05F;
         $$10 += $$18 * 0.05F;
         $$19 *= 0.8F;
         $$18 *= 0.5F;
         $$19 += ($$16.i() - $$16.i()) * $$16.i() * 2.0F;
         $$18 += ($$16.i() - $$16.i()) * $$16.i() * 4.0F;
         if ($$16.a(4) != 0) {
            if (!a($$2.f(), $$6, $$8, $$20, $$13, $$9)) {
               return;
            }

            this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$8, $$21, $$22, $$15, ($$1x, $$2x, $$3x, $$4x, $$5x) -> this.a($$1x, $$17, $$2x, $$3x, $$4x, $$5x));
         }
      }
   }

   private float[] a(dyt $$0, dyp $$1, ayk $$2) {
      int $$3 = $$0.b();
      float[] $$4 = new float[$$3];
      float $$5 = 1.0F;

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         if ($$6 == 0 || $$2.a($$1.c.d) == 0) {
            $$5 = 1.0F + $$2.i() * $$2.i();
         }

         $$4[$$6] = $$5 * $$5;
      }

      return $$4;
   }

   private double a(dyp $$0, ayk $$1, double $$2, float $$3, float $$4) {
      float $$5 = 1.0F - ayd.e(0.5F - $$4 / $$3) * 2.0F;
      float $$6 = $$0.c.f + $$0.c.g * $$5;
      return (double)$$6 * $$2 * (double)ayd.b($$1, 0.75F, 1.0F);
   }

   private boolean a(dyt $$0, float[] $$1, double $$2, double $$3, double $$4, int $$5) {
      int $$6 = $$5 - $$0.a();
      return ($$2 * $$2 + $$4 * $$4) * (double)$$1[$$6 - 1] + $$3 * $$3 / 6.0 >= 1.0;
   }
}
