import javax.annotation.Nullable;

public class cav extends bzv implements boy, cev {
   private static final aie<Byte> b = aih.a(cav.class, aig.a);
   private static final byte c = 16;

   public cav(bnw<? extends cav> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bwe(this, 1.25, 20, 10.0F));
      this.bO.a(2, new bws(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bvn(this, chl.class, 6.0F));
      this.bO.a(4, new bwa(this));
      this.bP.a(1, new bwy<>(this, bok.class, 10, true, false, $$0 -> $$0 instanceof cej));
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 4.0).a(bpp.o, 0.2F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, (byte)16);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.w());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         if (this.dM().t(this.dm()).a(atz.ae)) {
            this.a(this.dN().c(), 1.0F);
         }

         if (!this.dM().Z().b(cvn.c)) {
            return;
         }

         dlj $$0 = cyu.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = awi.a(this.dr() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = awi.a(this.dt());
            int $$4 = awi.a(this.dx() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            hz $$5 = new hz($$2, $$3, $$4);
            if (this.dM().a_($$5).i() && $$0.a((cvu)this.dM(), $$5)) {
               this.dM().b($$5, $$0);
               this.dM().a(dpw.i, $$5, dpw.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(boi $$0, float $$1) {
      cii $$2 = new cii(this.dM(), this);
      double $$3 = $$0.dv() - 1.1F;
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$3 - $$2.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(atl.xZ, 1.0F, 0.4F / (this.eh().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   @Override
   protected blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(cpg.rU) && this.a()) {
         this.a(atm.h);
         this.a(dpw.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return blw.a(this.dM().B);
      } else {
         return blw.d;
      }
   }

   @Override
   public void a(atm $$0) {
      this.dM().a(null, this, atl.ya, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         this.w(false);
         this.a(new cpd(cpg.fk), this.cI());
      }
   }

   @Override
   public boolean a() {
      return this.bx() && this.w();
   }

   public boolean w() {
      return (this.am.b(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(b);
      if ($$0) {
         this.am.b(b, (byte)($$1 | 16));
      } else {
         this.am.b(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected atk y() {
      return atl.xW;
   }

   @Nullable
   @Override
   protected atk d(bmp $$0) {
      return atl.xY;
   }

   @Nullable
   @Override
   protected atk n_() {
      return atl.xX;
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)(0.75F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
