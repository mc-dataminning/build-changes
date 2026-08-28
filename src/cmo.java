public class cmo extends cqi implements cmc {
   private static final alj a = alj.b("drinking");
   private static final bwn b = new bwn(a, -0.25, bwn.a.a);
   private static final akm<Boolean> bY = akq.a(cmo.class, ako.k);
   private int bZ;
   private cea<cqi> ca;
   private cdz<cou> cb;

   public cmo(bus<? extends cmo> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.ca = new cea<>(this, cqi.class, true, ($$0, $$1) -> this.gD() && $$0.aq() != bus.bE);
      this.cb = new cdz<>(this, cou.class, 10, true, false, null);
      this.bS.a(1, new cbz(this));
      this.bS.a(2, new cde(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cds(this, 1.0));
      this.bS.a(3, new ccn(this, cou.class, 8.0F));
      this.bS.a(3, new cda(this));
      this.bT.a(1, new cdx(this, cqi.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected awm t() {
      return awn.Cw;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.CA;
   }

   @Override
   protected awm n_() {
      return awn.Cy;
   }

   public void z(boolean $$0) {
      this.au().a(bY, $$0);
   }

   @Override
   public boolean n() {
      return this.au().a(bY);
   }

   public static bwo.a q() {
      return cly.gs().a(bwp.s, 26.0).a(bwp.v, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dV().C && this.bL()) {
         this.ca.k();
         if (this.ca.i() <= 0) {
            this.cb.a(true);
         } else {
            this.cb.a(false);
         }

         if (this.n()) {
            if (this.bZ-- <= 0) {
               this.z(false);
               cwm $$0 = this.eX();
               this.a(but.a, cwm.k);
               cyl $$1 = $$0.a(ku.Q);
               if ($$0.a(cwq.sC) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(ear.l);
               this.g(bwp.v).c(b.b());
            }
         } else {
            jq<cyj> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axi.a) && !this.b(bts.m)) {
               $$2 = cym.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eF() != null && this.eF().a(axe.i)) && !this.b(bts.l)) {
               $$2 = cym.l;
            } else if (this.ae.i() < 0.05F && this.eD() < this.eR()) {
               $$2 = cym.y;
            } else if (this.ae.i() < 0.5F && this.aa_() != null && !this.b(bts.a) && this.aa_().g(this) > 121.0) {
               $$2 = cym.n;
            }

            if ($$2 != null) {
               this.a(but.a, cyl.a(cwq.sC, $$2));
               this.bZ = this.eX().a((bvh)this);
               this.z(true);
               if (!this.bb()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.Cz, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bwl $$3 = this.g(bwp.v);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ae.i() < 7.5E-4F) {
            this.dV().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public awm aj_() {
      return awn.Cx;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dV().a(ls.an, this.dA() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dG() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(btb $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axe.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bvh $$0, float $$1) {
      if (!this.n()) {
         ezy $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jq<cyj> $$7 = cym.A;
         if ($$0 instanceof cqi) {
            if ($$0.eD() <= 4.0F) {
               $$7 = cym.y;
            } else {
               $$7 = cym.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bts.b)) {
            $$7 = cym.q;
         } else if ($$0.eD() >= 8.0F && !$$0.b(bts.s)) {
            $$7 = cym.C;
         } else if ($$6 <= 3.0 && !$$0.b(bts.r) && this.ae.i() < 0.25F) {
            $$7 = cym.L;
         }

         if (this.dV() instanceof arp $$8) {
            cwm $$9 = cyl.a(cwq.vG, $$7);
            cpn.a(cpz::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.CB, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arp $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gn() {
      return false;
   }
}
