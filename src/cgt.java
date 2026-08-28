import javax.annotation.Nullable;

public class cgt extends cfs implements buv, ckz {
   private static final akg<Byte> b = akk.a(cgt.class, aki.a);
   private static final byte c = 16;

   public cgt(btq<? extends cgt> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bT.a(1, new ccb(this, 1.25, 20, 10.0F));
      this.bT.a(2, new ccp(this, 1.0, 1.0000001E-5F));
      this.bT.a(3, new cbk(this, cnp.class, 6.0F));
      this.bT.a(4, new cbx(this));
      this.bU.a(1, new ccv<>(this, buh.class, 10, true, false, $$0 -> $$0 instanceof ckn));
   }

   public static bvl.a q() {
      return buh.E().a(bvm.s, 4.0).a(bvm.v, 0.2F);
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
         if (this.dS().t(this.ds()).a(awr.ae)) {
            this.a(this.dT().d(), 1.0F);
         }

         if (!this.dS().ac().b(ddo.c)) {
            return;
         }

         dua $$0 = dgx.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = azc.a(this.dx() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = azc.a(this.dz());
            int $$4 = azc.a(this.dD() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            je $$5 = new je($$2, $$3, $$4);
            if (this.dS().a_($$5).l() && $$0.a((ddv)this.dS(), $$5)) {
               this.dS().b($$5, $$0);
               this.dS().a(dyx.i, $$5, dyx.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(buf $$0, float $$1) {
      double $$2 = $$0.dx() - this.dx();
      double $$3 = $$0.dB() - 1.1F;
      double $$4 = $$0.dD() - this.dD();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dS() instanceof arg $$6) {
         cvl $$7 = new cvl(cvo.qD);
         coi.a(coo::new, $$6, $$7, this, $$2, $$3 + $$5, $$4, 1.6F, 12.0F);
      }

      this.a(awd.yM, 1.0F, 0.4F / (this.dV().i() * 0.4F + 0.8F));
   }

   @Override
   protected brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.rW) && this.a()) {
         this.a(awe.h);
         this.a(dyx.M, $$0);
         if (!this.dS().B) {
            $$2.a(1, $$0, d($$1));
         }

         return brk.a;
      } else {
         return brk.e;
      }
   }

   @Override
   public void a(awe $$0) {
      this.dS().a(null, this, awd.yN, $$0, 1.0F, 1.0F);
      if (!this.dS().w_()) {
         this.x(false);
         this.a(esp.aR, $$0x -> this.a($$0x, this.cP()));
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
   protected awc w() {
      return awd.yJ;
   }

   @Nullable
   @Override
   protected awc d(bsb $$0) {
      return awd.yL;
   }

   @Nullable
   @Override
   protected awc n_() {
      return awd.yK;
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.75F * this.cP()), (double)(this.dn() * 0.4F));
   }
}
