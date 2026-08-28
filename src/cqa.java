public class cqa extends ctz implements cpo {
   private static final alr a = alr.b("drinking");
   private static final bzj b = new bzj(a, -0.25, bzj.a.a);
   private static final aku<Boolean> e = aky.a(cqa.class, akw.k);
   private int f;
   private cgw<ctz> bI;
   private cgv<csi> bJ;

   public cqa(bxn<? extends cqa> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bI = new cgw<>(this, ctz.class, true, ($$0, $$1) -> this.gI() && $$0.an() != bxn.bJ);
      this.bJ = new cgv<>(this, csi.class, 10, true, false, null);
      this.bF.a(1, new cev(this));
      this.bF.a(2, new cga(this, 1.0, 60, 10.0F));
      this.bF.a(2, new cgo(this, 1.0));
      this.bF.a(3, new cfj(this, csi.class, 8.0F));
      this.bF.a(3, new cfw(this));
      this.bG.a(1, new cgt(this, ctz.class));
      this.bG.a(2, this.bI);
      this.bG.a(3, this.bJ);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   protected awx u() {
      return awy.Dw;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.DA;
   }

   @Override
   protected awx l_() {
      return awy.Dy;
   }

   public void y(boolean $$0) {
      this.ar().a(e, $$0);
   }

   public boolean j() {
      return this.ar().a(e);
   }

   public static bzk.a m() {
      return cpk.gx().a(bzl.s, 26.0).a(bzl.v, 0.25);
   }

   @Override
   public void k_() {
      if (!this.dV().C && this.bJ()) {
         this.bI.k();
         if (this.bI.i() <= 0) {
            this.bJ.a(true);
         } else {
            this.bJ.a(false);
         }

         if (this.j()) {
            if (this.f-- <= 0) {
               this.y(false);
               dak $$0 = this.fb();
               this.a(bxo.a, dak.l);
               dcg $$1 = $$0.a(kl.R);
               if ($$0.a(dao.tt) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kl.S, 1.0F));
               }

               this.a(egq.l);
               this.g(bzl.v).c(b.a());
            }
         } else {
            jg<dce> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axs.a) && !this.b(bwk.m)) {
               $$2 = dch.w;
            } else if (this.ae.i() < 0.15F && (this.bX() || this.eI() != null && this.eI().a(axo.i)) && !this.b(bwk.l)) {
               $$2 = dch.l;
            } else if (this.ae.i() < 0.05F && this.eG() < this.eU()) {
               $$2 = dch.y;
            } else if (this.ae.i() < 0.5F && this.f() != null && !this.b(bwk.a) && this.f().g(this) > 121.0) {
               $$2 = dch.n;
            }

            if ($$2 != null) {
               this.a(bxo.a, dcg.a(dao.tt, $$2));
               this.f = this.fb().a((byf)this);
               this.y(true);
               if (!this.ba()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.Dz, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bzh $$3 = this.g(bzl.v);
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
   public awx aj_() {
      return awy.Dx;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dV().a(lz.aq, this.dA() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dG() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(bvt $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axo.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(byf $$0, float $$1) {
      if (!this.j()) {
         fgc $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jg<dce> $$7 = dch.A;
         if ($$0 instanceof ctz) {
            if ($$0.eG() <= 4.0F) {
               $$7 = dch.y;
            } else {
               $$7 = dch.F;
            }

            this.g(null);
         } else if ($$6 >= 8.0 && !$$0.b(bwk.b)) {
            $$7 = dch.q;
         } else if ($$0.eG() >= 8.0F && !$$0.b(bwk.s)) {
            $$7 = dch.C;
         } else if ($$6 <= 3.0 && !$$0.b(bwk.r) && this.ae.i() < 0.25F) {
            $$7 = dch.L;
         }

         if (this.dV() instanceof asb $$8) {
            dak $$9 = dcg.a(dao.wz, $$7);
            ctd.a(ctq::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.ba()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.DB, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(asb $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }
}
