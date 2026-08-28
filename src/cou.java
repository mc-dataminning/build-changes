public class cou extends cst implements coh {
   private static final alg a = alg.b("drinking");
   private static final byi b = new byi(a, -0.25, byi.a.a);
   private static final akj<Boolean> bG = akn.a(cou.class, akl.k);
   private int bH;
   private cfv<cst> bI;
   private cfu<crc> bJ;

   public cou(bwo<? extends cou> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bI = new cfv<>(this, cst.class, true, ($$0, $$1) -> this.gF() && $$0.aq() != bwo.bI);
      this.bJ = new cfu<>(this, crc.class, 10, true, false, null);
      this.bD.a(1, new cdu(this));
      this.bD.a(2, new cez(this, 1.0, 60, 10.0F));
      this.bD.a(2, new cfn(this, 1.0));
      this.bD.a(3, new cei(this, crc.class, 8.0F));
      this.bD.a(3, new cev(this));
      this.bE.a(1, new cfs(this, cst.class));
      this.bE.a(2, this.bI);
      this.bE.a(3, this.bJ);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
   }

   @Override
   protected awm u() {
      return awn.Dw;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.DA;
   }

   @Override
   protected awm l_() {
      return awn.Dy;
   }

   public void y(boolean $$0) {
      this.au().a(bG, $$0);
   }

   public boolean j() {
      return this.au().a(bG);
   }

   public static byj.a m() {
      return cod.gu().a(byk.s, 26.0).a(byk.v, 0.25);
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bK()) {
         this.bI.k();
         if (this.bI.i() <= 0) {
            this.bJ.a(true);
         } else {
            this.bJ.a(false);
         }

         if (this.j()) {
            if (this.bH-- <= 0) {
               this.y(false);
               czd $$0 = this.fb();
               this.a(bwp.a, czd.k);
               daz $$1 = $$0.a(kj.R);
               if ($$0.a(czh.tt) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kj.S, 1.0F));
               }

               this.a(efh.l);
               this.g(byk.v).c(b.a());
            }
         } else {
            je<dax> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axh.a) && !this.b(bvl.m)) {
               $$2 = dba.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eI() != null && this.eI().a(axd.i)) && !this.b(bvl.l)) {
               $$2 = dba.l;
            } else if (this.ae.i() < 0.05F && this.eG() < this.eU()) {
               $$2 = dba.y;
            } else if (this.ae.i() < 0.5F && this.f() != null && !this.b(bvl.a) && this.f().g(this) > 121.0) {
               $$2 = dba.n;
            }

            if ($$2 != null) {
               this.a(bwp.a, daz.a(czh.tt, $$2));
               this.bH = this.fb().a((bxe)this);
               this.y(true);
               if (!this.bb()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.Dz, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               byg $$3 = this.g(byk.v);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ae.i() < 7.5E-4F) {
            this.dV().a(this, (byte)15);
         }
      }

      super.k_();
   }

   @Override
   public awm ae_() {
      return awn.Dx;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dV().a(lx.aq, this.dA() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dG() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(buu $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axd.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bxe $$0, float $$1) {
      if (!this.j()) {
         feq $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         je<dax> $$7 = dba.A;
         if ($$0 instanceof cst) {
            if ($$0.eG() <= 4.0F) {
               $$7 = dba.y;
            } else {
               $$7 = dba.F;
            }

            this.g(null);
         } else if ($$6 >= 8.0 && !$$0.b(bvl.b)) {
            $$7 = dba.q;
         } else if ($$0.eG() >= 8.0F && !$$0.b(bvl.s)) {
            $$7 = dba.C;
         } else if ($$6 <= 3.0 && !$$0.b(bvl.r) && this.ae.i() < 0.25F) {
            $$7 = dba.L;
         }

         if (this.dV() instanceof arq $$8) {
            czd $$9 = daz.a(czh.wz, $$7);
            crx.a(csk::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.DB, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }
}
