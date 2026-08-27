import javax.annotation.Nullable;

public class fld extends fmq {
   private final float a;
   private final fml b;

   fld(fis $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6, fml $$7) {
      super($$0, $$1, $$2, $$3);
      this.b = $$7;
      this.v = $$4;
      this.w = $$5;
      this.x = $$6;
      float $$8 = 0.9F;
      this.D *= 0.67499995F;
      int $$9 = (int)(32.0 / (Math.random() * 0.8 + 0.2));
      this.t = (int)Math.max((float)$$9 * 0.9F, 1.0F);
      this.b($$7);
      this.a = ((float)Math.random() - 0.5F) * 0.1F;
      this.z = (float)Math.random() * (float) (Math.PI * 2);
   }

   @Override
   public flu b() {
      return flu.b;
   }

   @Override
   public float b(float $$0) {
      return this.D * asb.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.b);
         this.A = this.z;
         this.z = this.z + (float) Math.PI * this.a * 2.0F;
         if (this.m) {
            this.A = this.z = 0.0F;
         }

         this.a(this.j, this.k, this.l);
         this.k -= 0.003F;
         this.k = Math.max(this.k, -0.14F);
      }
   }

   public static class a implements flt<in> {
      private final fml a;

      public a(fml $$0) {
         this.a = $$0;
      }

      @Nullable
      public flq a(in $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         dfd $$8 = $$0.c();
         if (!$$8.i() && $$8.l() == czg.a) {
            return null;
         } else {
            gw $$9 = gw.a($$2, $$3, $$4);
            int $$10 = eqp.O().aw().a($$8, $$1, $$9);
            if ($$8.b() instanceof cvw) {
               $$10 = ((cvw)$$8.b()).d($$8, $$1, $$9);
            }

            float $$11 = (float)($$10 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$10 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$10 & 0xFF) / 255.0F;
            return new fld($$1, $$2, $$3, $$4, $$11, $$12, $$13, this.a);
         }
      }
   }
}
