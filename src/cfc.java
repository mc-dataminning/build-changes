import javax.annotation.Nullable;

public class cfc extends cec implements btf, cjg {
   private static final ajr<Byte> b = ajv.a(cfc.class, ajt.a);
   private static final byte c = 16;

   public cfc(bsa<? extends cfc> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cal(this, 1.25, 20, 10.0F));
      this.bS.a(2, new caz(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new bzu(this, clw.class, 6.0F));
      this.bS.a(4, new cah(this));
      this.bT.a(1, new cbf<>(this, bsq.class, 10, true, false, $$0 -> $$0 instanceof ciu));
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 4.0).a(btw.r, 0.2F);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         if (this.dP().t(this.dp()).a(avv.ae)) {
            this.a(this.dQ().c(), 1.0F);
         }

         if (!this.dP().aa().b(dat.c)) {
            return;
         }

         drb $$0 = dea.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ayd.a(this.du() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ayd.a(this.dw());
            int $$4 = ayd.a(this.dA() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            io $$5 = new io($$2, $$3, $$4);
            if (this.dP().a_($$5).i() && $$0.a((dba)this.dP(), $$5)) {
               this.dP().b($$5, $$0);
               this.dP().a(dvu.i, $$5, dvu.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bso $$0, float $$1) {
      cmt $$2 = new cmt(this.dP(), this);
      double $$3 = $$0.dy() - 1.1F;
      double $$4 = $$0.du() - this.du();
      double $$5 = $$3 - $$2.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avh.yD, 1.0F, 0.4F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   @Override
   protected bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.a(ctr.rV) && this.a()) {
         this.a(avi.h);
         this.a(dvu.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bpu.a(this.dP().B);
      } else {
         return bpu.d;
      }
   }

   @Override
   public void a(avi $$0) {
      this.dP().a(null, this, avh.yE, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         this.w(false);
         this.a(new cto(ctr.fl), this.cL());
      }
   }

   @Override
   public boolean a() {
      return this.bD() && this.u();
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
   protected avg v() {
      return avh.yA;
   }

   @Nullable
   @Override
   protected avg d(bqn $$0) {
      return avh.yC;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.yB;
   }

   @Override
   public euk cM() {
      return new euk(0.0, (double)(0.75F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
