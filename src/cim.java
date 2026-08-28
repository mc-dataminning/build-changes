import javax.annotation.Nullable;

public class cim extends cid {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private bsn g;

   public cim(cia $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         exc $$0 = this.a.H(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.e.dt();
         double $$2 = this.a.e.e(0.5);
         double $$3 = this.a.e.dz();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.dR().k() / 2.0;
            double $$6 = $$2 + this.a.dR().k() / 2.0;
            double $$7 = $$3 + this.a.dR().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dO().a(lm.h, $$5, $$6, $$7, -$$0.c * 0.08F * (double)$$8, -$$0.d * 0.6F, -$$0.e * 0.08F * (double)$$8);
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
            this.a.gh().a(ciq.e);
         } else {
            this.a.gh().a(ciq.g);
         }
      } else if (this.e == 10) {
         exc $$0 = new exc(this.a.e.dt() - this.a.dt(), 0.0, this.a.e.dz() - this.a.dz()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.e.dt() + $$0.c * 5.0 / 2.0;
         double $$3 = this.a.e.dz() + $$0.e * 5.0 / 2.0;
         double $$4 = this.a.e.e(0.5);
         double $$5 = $$4;
         jd.a $$6 = new jd.a($$2, $$4, $$3);

         while (this.a.dO().u($$6)) {
            if (--$$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.b($$2, $$5, $$3);
         }

         $$5 = (double)(ayo.a($$5) + 1);
         this.g = new bsn(this.a.dO(), $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.a(200);
         this.g.a(lm.h);
         this.g.a(new brz(bsb.g));
         this.a.dO().b(this.g);
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
         this.g.aq();
         this.g = null;
      }
   }

   @Override
   public ciq<cim> i() {
      return ciq.f;
   }

   public void j() {
      this.f = 0;
   }
}
