public class cpr extends ctq implements cpf {
   private static final alk a = alk.b("drinking");
   private static final bza b = new bza(a, -0.25, bza.a.a);
   private static final akn<Boolean> e = akr.a(cpr.class, akp.k);
   private int f;
   private cgn<ctq> bI;
   private cgm<crz> bJ;

   public cpr(bxe<? extends cpr> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bI = new cgn<>(this, ctq.class, true, ($$0, $$1) -> this.gI() && $$0.an() != bxe.bJ);
      this.bJ = new cgm<>(this, crz.class, 10, true, false, null);
      this.bF.a(1, new cem(this));
      this.bF.a(2, new cfr(this, 1.0, 60, 10.0F));
      this.bF.a(2, new cgf(this, 1.0));
      this.bF.a(3, new cfa(this, crz.class, 8.0F));
      this.bF.a(3, new cfn(this));
      this.bG.a(1, new cgk(this, ctq.class));
      this.bG.a(2, this.bI);
      this.bG.a(3, this.bJ);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   protected awq u() {
      return awr.Dw;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.DA;
   }

   @Override
   protected awq l_() {
      return awr.Dy;
   }

   public void y(boolean $$0) {
      this.ar().a(e, $$0);
   }

   public boolean j() {
      return this.ar().a(e);
   }

   public static bzb.a m() {
      return cpb.gx().a(bzc.s, 26.0).a(bzc.v, 0.25);
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
               daa $$0 = this.fb();
               this.a(bxf.a, daa.k);
               dbw $$1 = $$0.a(kl.R);
               if ($$0.a(dae.tt) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kl.S, 1.0F));
               }

               this.a(egg.l);
               this.g(bzc.v).c(b.a());
            }
         } else {
            jg<dbu> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axl.a) && !this.b(bwb.m)) {
               $$2 = dbx.w;
            } else if (this.ae.i() < 0.15F && (this.bX() || this.eI() != null && this.eI().a(axh.i)) && !this.b(bwb.l)) {
               $$2 = dbx.l;
            } else if (this.ae.i() < 0.05F && this.eG() < this.eU()) {
               $$2 = dbx.y;
            } else if (this.ae.i() < 0.5F && this.f() != null && !this.b(bwb.a) && this.f().g(this) > 121.0) {
               $$2 = dbx.n;
            }

            if ($$2 != null) {
               this.a(bxf.a, dbw.a(dae.tt, $$2));
               this.f = this.fb().a((bxw)this);
               this.y(true);
               if (!this.ba()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awr.Dz, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               byy $$3 = this.g(bzc.v);
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
   public awq ai_() {
      return awr.Dx;
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
   protected float f(bvk $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axh.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bxw $$0, float $$1) {
      if (!this.j()) {
         ffs $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jg<dbu> $$7 = dbx.A;
         if ($$0 instanceof ctq) {
            if ($$0.eG() <= 4.0F) {
               $$7 = dbx.y;
            } else {
               $$7 = dbx.F;
            }

            this.g(null);
         } else if ($$6 >= 8.0 && !$$0.b(bwb.b)) {
            $$7 = dbx.q;
         } else if ($$0.eG() >= 8.0F && !$$0.b(bwb.s)) {
            $$7 = dbx.C;
         } else if ($$6 <= 3.0 && !$$0.b(bwb.r) && this.ae.i() < 0.25F) {
            $$7 = dbx.L;
         }

         if (this.dV() instanceof aru $$8) {
            daa $$9 = dbw.a(dae.wz, $$7);
            csu.a(cth::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.ba()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awr.DB, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(aru $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }
}
