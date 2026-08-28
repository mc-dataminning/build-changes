public class cpp extends cto implements cpd {
   private static final ali a = ali.b("drinking");
   private static final byy b = new byy(a, -0.25, byy.a.a);
   private static final akl<Boolean> e = akp.a(cpp.class, akn.k);
   private int f;
   private cgl<cto> bI;
   private cgk<crx> bJ;

   public cpp(bxc<? extends cpp> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bI = new cgl<>(this, cto.class, true, ($$0, $$1) -> this.gI() && $$0.an() != bxc.bJ);
      this.bJ = new cgk<>(this, crx.class, 10, true, false, null);
      this.bF.a(1, new cek(this));
      this.bF.a(2, new cfp(this, 1.0, 60, 10.0F));
      this.bF.a(2, new cgd(this, 1.0));
      this.bF.a(3, new cey(this, crx.class, 8.0F));
      this.bF.a(3, new cfl(this));
      this.bG.a(1, new cgi(this, cto.class));
      this.bG.a(2, this.bI);
      this.bG.a(3, this.bJ);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   protected awo u() {
      return awp.Dw;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.DA;
   }

   @Override
   protected awo l_() {
      return awp.Dy;
   }

   public void y(boolean $$0) {
      this.ar().a(e, $$0);
   }

   public boolean j() {
      return this.ar().a(e);
   }

   public static byz.a m() {
      return coz.gx().a(bza.s, 26.0).a(bza.v, 0.25);
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
               czy $$0 = this.fb();
               this.a(bxd.a, czy.k);
               dbu $$1 = $$0.a(kk.R);
               if ($$0.a(dac.tt) && $$1 != null) {
                  $$1.a(this::a, $$0.a(kk.S, 1.0F));
               }

               this.a(ege.l);
               this.g(bza.v).c(b.a());
            }
         } else {
            jf<dbs> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(axj.a) && !this.b(bvz.m)) {
               $$2 = dbv.w;
            } else if (this.ae.i() < 0.15F && (this.bX() || this.eI() != null && this.eI().a(axf.i)) && !this.b(bvz.l)) {
               $$2 = dbv.l;
            } else if (this.ae.i() < 0.05F && this.eG() < this.eU()) {
               $$2 = dbv.y;
            } else if (this.ae.i() < 0.5F && this.f() != null && !this.b(bvz.a) && this.f().g(this) > 121.0) {
               $$2 = dbv.n;
            }

            if ($$2 != null) {
               this.a(bxd.a, dbu.a(dac.tt, $$2));
               this.f = this.fb().a((bxu)this);
               this.y(true);
               if (!this.ba()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.Dz, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               byw $$3 = this.g(bza.v);
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
   public awo ai_() {
      return awp.Dx;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dV().a(ly.aq, this.dA() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dG() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(bvi $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(axf.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bxu $$0, float $$1) {
      if (!this.j()) {
         ffq $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jf<dbs> $$7 = dbv.A;
         if ($$0 instanceof cto) {
            if ($$0.eG() <= 4.0F) {
               $$7 = dbv.y;
            } else {
               $$7 = dbv.F;
            }

            this.g(null);
         } else if ($$6 >= 8.0 && !$$0.b(bvz.b)) {
            $$7 = dbv.q;
         } else if ($$0.eG() >= 8.0F && !$$0.b(bvz.s)) {
            $$7 = dbv.C;
         } else if ($$6 <= 3.0 && !$$0.b(bvz.r) && this.ae.i() < 0.25F) {
            $$7 = dbv.L;
         }

         if (this.dV() instanceof ars $$8) {
            czy $$9 = dbu.a(dac.wz, $$7);
            css.a(ctf::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.ba()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.DB, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(ars $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }
}
