import javax.annotation.Nullable;

public class cdr extends ccr implements bru, chv {
   private static final ajk<Byte> b = ajo.a(cdr.class, ajm.a);
   private static final byte c = 16;

   public cdr(bqr<? extends cdr> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bza(this, 1.25, 20, 10.0F));
      this.bS.a(2, new bzo(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new byj(this, ckl.class, 6.0F));
      this.bS.a(4, new byw(this));
      this.bT.a(1, new bzu<>(this, brg.class, 10, true, false, $$0 -> $$0 instanceof chj));
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 4.0).a(bsl.r, 0.2F);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(ty $$0) {
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
         if (this.dN().t(this.dn()).a(avn.ae)) {
            this.a(this.dO().c(), 1.0F);
         }

         if (!this.dN().aa().b(czq.c)) {
            return;
         }

         dpy $$0 = dcx.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = axw.a(this.ds() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = axw.a(this.du());
            int $$4 = axw.a(this.dy() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            im $$5 = new im($$2, $$3, $$4);
            if (this.dN().a_($$5).i() && $$0.a((czx)this.dN(), $$5)) {
               this.dN().b($$5, $$0);
               this.dN().a(dur.i, $$5, dur.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bre $$0, float $$1) {
      cli $$2 = new cli(this.dN(), this);
      double $$3 = $$0.dw() - 1.1F;
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$3 - $$2.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(auz.yr, 1.0F, 0.4F / (this.ej().i() * 0.4F + 0.8F));
      this.dN().b($$2);
   }

   @Override
   protected boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(csg.rV) && this.a()) {
         this.a(ava.h);
         this.a(dur.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, d($$1));
         }

         return boq.a(this.dN().B);
      } else {
         return boq.d;
      }
   }

   @Override
   public void a(ava $$0) {
      this.dN().a(null, this, auz.ys, $$0, 1.0F, 1.0F);
      if (!this.dN().x_()) {
         this.w(false);
         this.a(new csd(csg.fl), this.cJ());
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
   protected auy v() {
      return auz.yo;
   }

   @Nullable
   @Override
   protected auy d(bpj $$0) {
      return auz.yq;
   }

   @Nullable
   @Override
   protected auy o_() {
      return auz.yp;
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.75F * this.cJ()), (double)(this.dh() * 0.4F));
   }
}
