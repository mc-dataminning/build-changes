public class cml extends cqf implements clz {
   private static final all b = all.b("drinking");
   private static final bwk c = new bwk(b, -0.25, bwk.a.a);
   private static final ako<Boolean> bY = aks.a(cml.class, akq.k);
   private int bZ;
   private cdx<cqf> ca;
   private cdw<cor> cb;

   public cml(bup<? extends cml> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.ca = new cdx<>(this, cqf.class, true, $$0 -> $$0 != null && this.gM() && $$0.ar() != bup.bo);
      this.cb = new cdw<>(this, cor.class, 10, true, false, null);
      this.bS.a(1, new cbw(this));
      this.bS.a(2, new cdb(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cdp(this, 1.0));
      this.bS.a(3, new cck(this, cor.class, 8.0F));
      this.bS.a(3, new ccx(this));
      this.bT.a(1, new cdu(this, cqf.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected awn w() {
      return awo.Cw;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.CA;
   }

   @Override
   protected awn o_() {
      return awo.Cy;
   }

   public void z(boolean $$0) {
      this.aw().a(bY, $$0);
   }

   @Override
   public boolean q() {
      return this.aw().a(bY);
   }

   public static bwl.a t() {
      return clv.gB().a(bwm.s, 26.0).a(bwm.v, 0.25);
   }

   @Override
   public void n_() {
      if (!this.dY().C && this.bN()) {
         this.ca.k();
         if (this.ca.i() <= 0) {
            this.cb.a(true);
         } else {
            this.cb.a(false);
         }

         if (this.q()) {
            if (this.bZ-- <= 0) {
               this.z(false);
               cwf $$0 = this.fc();
               this.a(buq.a, cwf.k);
               cye $$1 = $$0.a(ku.Q);
               if ($$0.a(cwj.sC) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(eak.l);
               this.g(bwm.v).c(c.b());
            }
         } else {
            jq<cyc> $$2 = null;
            if (this.af.i() < 0.15F && this.a(axj.a) && !this.b(btp.m)) {
               $$2 = cyf.w;
            } else if (this.af.i() < 0.15F && (this.ca() || this.eJ() != null && this.eJ().a(axf.i)) && !this.b(btp.l)) {
               $$2 = cyf.l;
            } else if (this.af.i() < 0.05F && this.eH() < this.eW()) {
               $$2 = cyf.y;
            } else if (this.af.i() < 0.5F && this.m() != null && !this.b(btp.a) && this.m().g(this) > 121.0) {
               $$2 = cyf.n;
            }

            if ($$2 != null) {
               this.a(buq.a, cye.a(cwj.sC, $$2));
               this.bZ = this.fc().a((bve)this);
               this.z(true);
               if (!this.bd()) {
                  this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.Cz, this.do(), 1.0F, 0.8F + this.af.i() * 0.4F);
               }

               bwi $$3 = this.g(bwm.v);
               $$3.c(b);
               $$3.b(c);
            }
         }

         if (this.af.i() < 7.5E-4F) {
            this.dY().a(this, (byte)15);
         }
      }

      super.n_();
   }

   @Override
   public awn aj_() {
      return awo.Cx;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.af.a(35) + 10; $$1++) {
            this.dY().a(ls.an, this.dD() + this.af.k() * 0.13F, this.cT().e + 0.5 + this.af.k() * 0.13F, this.dJ() + this.af.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bsy $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axf.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bve $$0, float $$1) {
      if (!this.q()) {
         ezr $$2 = $$0.dB();
         double $$3 = $$0.dD() + $$2.d - this.dD();
         double $$4 = $$0.dH() - 1.1F - this.dF();
         double $$5 = $$0.dJ() + $$2.f - this.dJ();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jq<cyc> $$7 = cyf.A;
         if ($$0 instanceof cqf) {
            if ($$0.eH() <= 4.0F) {
               $$7 = cyf.y;
            } else {
               $$7 = cyf.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(btp.b)) {
            $$7 = cyf.q;
         } else if ($$0.eH() >= 8.0F && !$$0.b(btp.s)) {
            $$7 = cyf.C;
         } else if ($$6 <= 3.0 && !$$0.b(btp.r) && this.af.i() < 0.25F) {
            $$7 = cyf.L;
         }

         if (this.dY() instanceof arq $$8) {
            cwf $$9 = cye.a(cwj.vG, $$7);
            cpk.a(cpw::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bd()) {
            this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.CB, this.do(), 1.0F, 0.8F + this.af.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gw() {
      return false;
   }
}
