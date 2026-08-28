import javax.annotation.Nullable;

public class ckf extends cjw {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private buc g;

   public ckf(cjt $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         fay $$0 = this.a.J(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.c.dB();
         double $$2 = this.a.c.e(0.5);
         double $$3 = this.a.c.dH();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.dZ().k() / 2.0;
            double $$6 = $$2 + this.a.dZ().k() / 2.0;
            double $$7 = $$3 + this.a.dZ().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dW().a(lt.h, $$5, $$6, $$7, -$$0.d * 0.08F * (double)$$8, -$$0.e * 0.6F, -$$0.f * 0.08F * (double)$$8);
            }

            $$0.b((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void a(arc $$0) {
      this.e++;
      if (this.e >= 200) {
         if (this.f >= 4) {
            this.a.gl().a(ckj.e);
         } else {
            this.a.gl().a(ckj.g);
         }
      } else if (this.e == 10) {
         fay $$1 = new fay(this.a.c.dB() - this.a.dB(), 0.0, this.a.c.dH() - this.a.dH()).d();
         float $$2 = 5.0F;
         double $$3 = this.a.c.dB() + $$1.d * 5.0 / 2.0;
         double $$4 = this.a.c.dH() + $$1.f * 5.0 / 2.0;
         double $$5 = this.a.c.e(0.5);
         double $$6 = $$5;
         ji.a $$7 = new ji.a($$3, $$5, $$4);

         while ($$0.u($$7)) {
            if (--$$6 < 0.0) {
               $$6 = $$5;
               break;
            }

            $$7.b($$3, $$6, $$4);
         }

         $$6 = (double)(ayy.a($$6) + 1);
         this.g = new buc($$0, $$3, $$6, $$4);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.a(200);
         this.g.a(lt.h);
         this.g.a(new bto(btq.g));
         $$0.b(this.g);
      }
   }

   @Override
   public void c() {
      this.e = 0;
      this.f++;
   }

   @Override
   public void d() {
      if (this.g != null) {
         this.g.at();
         this.g = null;
      }
   }

   @Override
   public ckj<ckf> h() {
      return ckj.f;
   }

   public void i() {
      this.f = 0;
   }
}
