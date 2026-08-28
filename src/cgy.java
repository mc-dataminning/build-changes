import javax.annotation.Nullable;

public class cgy extends cfx implements bva, cle {
   private static final akg<Byte> b = akk.a(cgy.class, aki.a);
   private static final byte c = 16;

   public cgy(btv<? extends cgy> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccg(this, 1.25, 20, 10.0F));
      this.bS.a(2, new ccu(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new cbp(this, cnu.class, 6.0F));
      this.bS.a(4, new ccc(this));
      this.bT.a(1, new cda<>(this, bum.class, 10, true, false, $$0 -> $$0 instanceof cks));
   }

   public static bvq.a q() {
      return bum.E().a(bvr.s, 4.0).a(bvr.v, 0.2F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.x($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fo() {
      return true;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B) {
         if (this.dS().t(this.ds()).a(aws.ae)) {
            this.a(this.dT().d(), 1.0F);
         }

         if (!this.dS().ac().b(dec.c)) {
            return;
         }

         duo $$0 = dhl.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = azd.a(this.dx() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = azd.a(this.dz());
            int $$4 = azd.a(this.dD() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            je $$5 = new je($$2, $$3, $$4);
            if (this.dS().a_($$5).l() && $$0.a((dej)this.dS(), $$5)) {
               this.dS().b($$5, $$0);
               this.dS().a(dzl.i, $$5, dzl.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(buk $$0, float $$1) {
      double $$2 = $$0.dx() - this.dx();
      double $$3 = $$0.dB() - 1.1F;
      double $$4 = $$0.dD() - this.dD();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dS() instanceof arh $$6) {
         cvp $$7 = new cvp(cvt.qD);
         coo.a(cot::new, $$6, $$7, this, $$2, $$3 + $$5, $$4, 1.6F, 12.0F);
      }

      this.a(awe.yM, 1.0F, 0.4F / (this.dV().i() * 0.4F + 0.8F));
   }

   @Override
   protected brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.rW) && this.a()) {
         this.a(awf.h);
         this.a(dzl.M, $$0);
         if (!this.dS().B) {
            $$2.a(1, $$0, d($$1));
         }

         return brp.a;
      } else {
         return brp.e;
      }
   }

   @Override
   public void a(awf $$0) {
      this.dS().a(null, this, awe.yN, $$0, 1.0F, 1.0F);
      if (!this.dS().w_()) {
         this.x(false);
         this.a(etd.aR, $$0x -> this.a($$0x, this.cP()));
      }
   }

   @Override
   public boolean a() {
      return this.bI() && this.t();
   }

   public boolean t() {
      return (this.am.a(b) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(b);
      if ($$0) {
         this.am.a(b, (byte)($$1 | 16));
      } else {
         this.am.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected awd w() {
      return awe.yJ;
   }

   @Nullable
   @Override
   protected awd d(bsg $$0) {
      return awe.yL;
   }

   @Nullable
   @Override
   protected awd n_() {
      return awe.yK;
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)(0.75F * this.cP()), (double)(this.dn() * 0.4F));
   }
}
