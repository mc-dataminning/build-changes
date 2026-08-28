import com.mojang.serialization.Codec;
import java.util.function.Function;

public class eft extends efw<efs> {
   public eft(Codec<efs> $$0) {
      super($$0);
   }

   public boolean a(efs $$0, bam $$1) {
      return $$1.i() <= $$0.l;
   }

   public boolean a(efr $$0, efs $$1, dzq $$2, Function<jh, jq<dik>> $$3, bam $$4, edc $$5, dgo $$6, dzp $$7) {
      int $$8 = kj.c(this.d() * 2 - 1);
      int $$9 = $$4.a($$4.a($$4.a(this.a()) + 1) + 1);

      for (int $$10 = 0; $$10 < $$9; $$10++) {
         double $$11 = (double)$$6.a($$4.a(16));
         double $$12 = (double)$$1.e.a($$4, $$0);
         double $$13 = (double)$$6.b($$4.a(16));
         double $$14 = (double)$$1.b.a($$4);
         double $$15 = (double)$$1.c.a($$4);
         double $$16 = (double)$$1.j.a($$4);
         efw.a $$17 = ($$1x, $$2x, $$3x, $$4x, $$5x) -> a($$2x, $$3x, $$4x, $$16);
         int $$18 = 1;
         if ($$4.a(4) == 0) {
            double $$19 = (double)$$1.f.a($$4);
            float $$20 = 1.0F + $$4.i() * 6.0F;
            this.a($$0, $$1, $$2, $$3, $$5, $$11, $$12, $$13, $$20, $$19, $$7, $$17);
            $$18 += $$4.a(4);
         }

         for (int $$21 = 0; $$21 < $$18; $$21++) {
            float $$22 = $$4.i() * (float) (Math.PI * 2);
            float $$23 = ($$4.i() - 0.5F) / 4.0F;
            float $$24 = this.a($$4);
            int $$25 = $$8 - $$4.a($$8 / 4);
            int $$26 = 0;
            this.a($$0, $$1, $$2, $$3, $$4.g(), $$5, $$11, $$12, $$13, $$14, $$15, $$24, $$22, $$23, 0, $$25, this.b(), $$7, $$17);
         }
      }

      return true;
   }

   protected int a() {
      return 15;
   }

   protected float a(bam $$0) {
      float $$1 = $$0.i() * 2.0F + $$0.i();
      if ($$0.a(10) == 0) {
         $$1 *= $$0.i() * $$0.i() * 3.0F + 1.0F;
      }

      return $$1;
   }

   protected double b() {
      return 1.0;
   }

   protected void a(
      efr $$0, efs $$1, dzq $$2, Function<jh, jq<dik>> $$3, edc $$4, double $$5, double $$6, double $$7, float $$8, double $$9, dzp $$10, efw.a $$11
   ) {
      double $$12 = 1.5 + (double)(bae.a((float) (Math.PI / 2)) * $$8);
      double $$13 = $$12 * $$9;
      this.a($$0, $$1, $$2, $$3, $$4, $$5 + 1.0, $$6, $$7, $$12, $$13, $$10, $$11);
   }

   protected void a(
      efr $$0,
      efs $$1,
      dzq $$2,
      Function<jh, jq<dik>> $$3,
      long $$4,
      edc $$5,
      double $$6,
      double $$7,
      double $$8,
      double $$9,
      double $$10,
      float $$11,
      float $$12,
      float $$13,
      int $$14,
      int $$15,
      double $$16,
      dzp $$17,
      efw.a $$18
   ) {
      bam $$19 = bam.a($$4);
      int $$20 = $$19.a($$15 / 2) + $$15 / 4;
      boolean $$21 = $$19.a(6) == 0;
      float $$22 = 0.0F;
      float $$23 = 0.0F;

      for (int $$24 = $$14; $$24 < $$15; $$24++) {
         double $$25 = 1.5 + (double)(bae.a((float) Math.PI * (float)$$24 / (float)$$15) * $$11);
         double $$26 = $$25 * $$16;
         float $$27 = bae.b($$13);
         $$6 += (double)(bae.b($$12) * $$27);
         $$7 += (double)bae.a($$13);
         $$8 += (double)(bae.a($$12) * $$27);
         $$13 *= $$21 ? 0.92F : 0.7F;
         $$13 += $$23 * 0.1F;
         $$12 += $$22 * 0.1F;
         $$23 *= 0.9F;
         $$22 *= 0.75F;
         $$23 += ($$19.i() - $$19.i()) * $$19.i() * 2.0F;
         $$22 += ($$19.i() - $$19.i()) * $$19.i() * 4.0F;
         if ($$24 == $$20 && $$11 > 1.0F) {
            this.a(
               $$0,
               $$1,
               $$2,
               $$3,
               $$19.g(),
               $$5,
               $$6,
               $$7,
               $$8,
               $$9,
               $$10,
               $$19.i() * 0.5F + 0.5F,
               $$12 - (float) (Math.PI / 2),
               $$13 / 3.0F,
               $$24,
               $$15,
               1.0,
               $$17,
               $$18
            );
            this.a(
               $$0,
               $$1,
               $$2,
               $$3,
               $$19.g(),
               $$5,
               $$6,
               $$7,
               $$8,
               $$9,
               $$10,
               $$19.i() * 0.5F + 0.5F,
               $$12 + (float) (Math.PI / 2),
               $$13 / 3.0F,
               $$24,
               $$15,
               1.0,
               $$17,
               $$18
            );
            return;
         }

         if ($$19.a(4) != 0) {
            if (!a($$2.f(), $$6, $$8, $$24, $$15, $$11)) {
               return;
            }

            this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$8, $$25 * $$9, $$26 * $$10, $$17, $$18);
         }
      }
   }

   private static boolean a(double $$0, double $$1, double $$2, double $$3) {
      return $$1 <= $$3 ? true : $$0 * $$0 + $$1 * $$1 + $$2 * $$2 >= 1.0;
   }
}
