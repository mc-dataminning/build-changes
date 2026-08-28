import javax.annotation.Nullable;

public class chz extends chq {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private bsc g;

   public chz(chn $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         ewf $$0 = this.a.G(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.e.dv();
         double $$2 = this.a.e.e(0.5);
         double $$3 = this.a.e.dB();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.dT().k() / 2.0;
            double $$6 = $$2 + this.a.dT().k() / 2.0;
            double $$7 = $$3 + this.a.dT().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dQ().a(lj.h, $$5, $$6, $$7, -$$0.c * 0.08F * (double)$$8, -$$0.d * 0.6F, -$$0.e * 0.08F * (double)$$8);
            }

            $$0.b((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void c() {
      this.e++;
      if (this.e >= 200) {
         if (this.f >= 4) {
            this.a.gl().a(cid.e);
         } else {
            this.a.gl().a(cid.g);
         }
      } else if (this.e == 10) {
         ewf $$0 = new ewf(this.a.e.dv() - this.a.dv(), 0.0, this.a.e.dB() - this.a.dB()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.e.dv() + $$0.c * 5.0 / 2.0;
         double $$3 = this.a.e.dB() + $$0.e * 5.0 / 2.0;
         double $$4 = this.a.e.e(0.5);
         double $$5 = $$4;
         ja.a $$6 = new ja.a($$2, $$4, $$3);

         while (this.a.dQ().u($$6)) {
            if (--$$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.b($$2, $$5, $$3);
         }

         $$5 = (double)(ayg.a($$5) + 1);
         this.g = new bsc(this.a.dQ(), $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.a(200);
         this.g.a(lj.h);
         this.g.a(new bro(brq.g));
         this.a.dQ().b(this.g);
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.f++;
   }

   @Override
   public void e() {
      if (this.g != null) {
         this.g.ap();
         this.g = null;
      }
   }

   @Override
   public cid<chz> i() {
      return cid.f;
   }

   public void j() {
      this.f = 0;
   }
}
