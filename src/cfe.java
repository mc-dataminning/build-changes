import javax.annotation.Nullable;

public class cfe extends cee implements bth, cji {
   private static final ajs<Byte> b = ajw.a(cfe.class, aju.a);
   private static final byte c = 16;

   public cfe(bsc<? extends cfe> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new can(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cbb(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new bzw(this, cly.class, 6.0F));
      this.bS.a(4, new caj(this));
      this.bT.a(1, new cbh<>(this, bss.class, 10, true, false, $$0 -> $$0 instanceof ciw));
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 4.0).a(bty.r, 0.2F);
   }

   @Override
   protected void a(ajw.a $$0) {
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
         if (this.dP().t(this.dp()).a(avw.ae)) {
            this.a(this.dQ().c(), 1.0F);
         }

         if (!this.dP().aa().b(dav.c)) {
            return;
         }

         drd $$0 = dec.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ayf.a(this.du() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ayf.a(this.dw());
            int $$4 = ayf.a(this.dA() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            io $$5 = new io($$2, $$3, $$4);
            if (this.dP().a_($$5).i() && $$0.a((dbc)this.dP(), $$5)) {
               this.dP().b($$5, $$0);
               this.dP().a(dvw.i, $$5, dvw.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bsq $$0, float $$1) {
      cmv $$2 = new cmv(this.dP(), this);
      double $$3 = $$0.dy() - 1.1F;
      double $$4 = $$0.du() - this.du();
      double $$5 = $$3 - $$2.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avi.yD, 1.0F, 0.4F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   @Override
   protected bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.rV) && this.a()) {
         this.a(avj.h);
         this.a(dvw.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bpw.a(this.dP().B);
      } else {
         return bpw.d;
      }
   }

   @Override
   public void a(avj $$0) {
      this.dP().a(null, this, avi.yE, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         this.w(false);
         this.a(new ctq(ctt.fl), this.cL());
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
   protected avh v() {
      return avi.yA;
   }

   @Nullable
   @Override
   protected avh d(bqp $$0) {
      return avi.yC;
   }

   @Nullable
   @Override
   protected avh o_() {
      return avi.yB;
   }

   @Override
   public eum cM() {
      return new eum(0.0, (double)(0.75F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
