import javax.annotation.Nullable;

public class car extends bzr implements bow, cer {
   private static final aie<Byte> b = aih.a(car.class, aig.a);
   private static final byte c = 16;

   public car(bnu<? extends car> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bwa(this, 1.25, 20, 10.0F));
      this.bO.a(2, new bwo(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bvj(this, chh.class, 6.0F));
      this.bO.a(4, new bvw(this));
      this.bP.a(1, new bwu<>(this, boi.class, 10, true, false, $$0 -> $$0 instanceof cef));
   }

   public static bpk.a u() {
      return boi.C().a(bpl.n, 4.0).a(bpl.o, 0.2F);
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
         if (this.dM().t(this.dm()).a(aty.ae)) {
            this.a(this.dN().c(), 1.0F);
         }

         if (!this.dM().Z().b(cvj.c)) {
            return;
         }

         dlf $$0 = cyq.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = awh.a(this.dr() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = awh.a(this.dt());
            int $$4 = awh.a(this.dx() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            hz $$5 = new hz($$2, $$3, $$4);
            if (this.dM().a_($$5).i() && $$0.a((cvq)this.dM(), $$5)) {
               this.dM().b($$5, $$0);
               this.dM().a(dpp.i, $$5, dpp.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bog $$0, float $$1) {
      cie $$2 = new cie(this.dM(), this);
      double $$3 = $$0.dv() - 1.1F;
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$3 - $$2.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(atk.xY, 1.0F, 0.4F / (this.eh().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   @Override
   protected blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.a(cpc.rU) && this.a()) {
         this.a(atl.h);
         this.a(dpp.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return blu.a(this.dM().B);
      } else {
         return blu.d;
      }
   }

   @Override
   public void a(atl $$0) {
      this.dM().a(null, this, atk.xZ, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         this.w(false);
         this.a(new coz(cpc.fk), this.cI());
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
   protected atj y() {
      return atk.xV;
   }

   @Nullable
   @Override
   protected atj d(bmn $$0) {
      return atk.xX;
   }

   @Nullable
   @Override
   protected atj n_() {
      return atk.xW;
   }

   @Override
   public ens cJ() {
      return new ens(0.0, (double)(0.75F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
