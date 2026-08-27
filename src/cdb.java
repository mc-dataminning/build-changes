import javax.annotation.Nullable;

public class cdb extends ccb implements bre, chd {
   private static final aiy<Byte> b = ajc.a(cdb.class, aja.a);
   private static final byte c = 16;

   public cdb(bqb<? extends cdb> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new byk(this, 1.25, 20, 10.0F));
      this.bR.a(2, new byy(this, 1.0, 1.0000001E-5F));
      this.bR.a(3, new bxt(this, cjt.class, 6.0F));
      this.bR.a(4, new byg(this));
      this.bS.a(1, new bze<>(this, bqq.class, 10, true, false, $$0 -> $$0 instanceof cgr));
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 4.0).a(brv.r, 0.2F);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B) {
         if (this.dM().t(this.dm()).a(avb.ae)) {
            this.a(this.dN().c(), 1.0F);
         }

         if (!this.dM().aa().b(cyt.c)) {
            return;
         }

         doz $$0 = dca.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = axk.a(this.dr() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = axk.a(this.dt());
            int $$4 = axk.a(this.dx() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ib $$5 = new ib($$2, $$3, $$4);
            if (this.dM().a_($$5).i() && $$0.a((cza)this.dM(), $$5)) {
               this.dM().b($$5, $$0);
               this.dM().a(dts.i, $$5, dts.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bqo $$0, float $$1) {
      ckq $$2 = new ckq(this.dM(), this);
      double $$3 = $$0.dv() - 1.1F;
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$3 - $$2.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(aum.yk, 1.0F, 0.4F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   @Override
   protected boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.rU) && this.a()) {
         this.a(aun.h);
         this.a(dts.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return boa.a(this.dM().B);
      } else {
         return boa.d;
      }
   }

   @Override
   public void a(aun $$0) {
      this.dM().a(null, this, aum.yl, $$0, 1.0F, 1.0F);
      if (!this.dM().x_()) {
         this.w(false);
         this.a(new crj(crm.fk), this.cI());
      }
   }

   @Override
   public boolean a() {
      return this.bA() && this.u();
   }

   public boolean u() {
      return (this.an.a(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.a(b);
      if ($$0) {
         this.an.a(b, (byte)($$1 | 16));
      } else {
         this.an.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected aul v() {
      return aum.yh;
   }

   @Nullable
   @Override
   protected aul d(bot $$0) {
      return aum.yj;
   }

   @Nullable
   @Override
   protected aul o_() {
      return aum.yi;
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)(0.75F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
