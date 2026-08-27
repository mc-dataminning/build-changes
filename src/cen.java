import javax.annotation.Nullable;

public class cen extends cdn implements bsq, cir {
   private static final ajm<Byte> b = ajq.a(cen.class, ajo.a);
   private static final byte c = 16;

   public cen(brn<? extends cen> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzw(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cak(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new bzf(this, clh.class, 6.0F));
      this.bS.a(4, new bzs(this));
      this.bT.a(1, new caq<>(this, bsc.class, 10, true, false, $$0 -> $$0 instanceof cif));
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 4.0).a(bth.r, 0.2F);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dN().B) {
         if (this.dN().t(this.dn()).a(avq.ae)) {
            this.a(this.dO().c(), 1.0F);
         }

         if (!this.dN().aa().b(czz.c)) {
            return;
         }

         dqh $$0 = ddg.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = axz.a(this.ds() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = axz.a(this.du());
            int $$4 = axz.a(this.dy() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            in $$5 = new in($$2, $$3, $$4);
            if (this.dN().a_($$5).i() && $$0.a((dag)this.dN(), $$5)) {
               this.dN().b($$5, $$0);
               this.dN().a(dva.i, $$5, dva.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bsa $$0, float $$1) {
      cme $$2 = new cme(this.dN(), this);
      double $$3 = $$0.dw() - 1.1F;
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$3 - $$2.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avc.ys, 1.0F, 0.4F / (this.ej().i() * 0.4F + 0.8F));
      this.dN().b($$2);
   }

   @Override
   protected bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.rV) && this.a()) {
         this.a(avd.h);
         this.a(dva.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bpm.a(this.dN().B);
      } else {
         return bpm.d;
      }
   }

   @Override
   public void a(avd $$0) {
      this.dN().a(null, this, avc.yt, $$0, 1.0F, 1.0F);
      if (!this.dN().x_()) {
         this.w(false);
         this.a(new csz(ctc.fl), this.cJ());
      }
   }

   @Override
   public boolean a() {
      return this.bB() && this.u();
   }

   public boolean u() {
      return (this.ao.a(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(b);
      if ($$0) {
         this.ao.a(b, (byte)($$1 | 16));
      } else {
         this.ao.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected avb v() {
      return avc.yp;
   }

   @Nullable
   @Override
   protected avb d(bqf $$0) {
      return avc.yr;
   }

   @Nullable
   @Override
   protected avb o_() {
      return avc.yq;
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)(0.75F * this.cJ()), (double)(this.dh() * 0.4F));
   }
}
