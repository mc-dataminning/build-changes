public class ckt extends coj implements ckh {
   private static final akr b = akr.b("drinking");
   private static final buu e = new buu(b, -0.25, buu.a.a);
   private static final ajw<Boolean> cc = aka.a(ckt.class, ajy.k);
   private int cd;
   private cch<coj> ce;
   private ccg<cmx> cf;

   public ckt(bsx<? extends ckt> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.ce = new cch<>(this, coj.class, true, $$0 -> $$0 != null && this.gB() && $$0.am() != bsx.bo);
      this.cf = new ccg<>(this, cmx.class, 10, true, false, null);
      this.bW.a(1, new cag(this));
      this.bW.a(2, new cbl(this, 1.0, 60, 10.0F));
      this.bW.a(2, new cbz(this, 1.0));
      this.bW.a(3, new cau(this, cmx.class, 8.0F));
      this.bW.a(3, new cbh(this));
      this.bX.a(1, new cce(this, coj.class));
      this.bX.a(2, this.ce);
      this.bX.a(3, this.cf);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected avo v() {
      return avp.Cs;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.Cw;
   }

   @Override
   protected avo n_() {
      return avp.Cu;
   }

   public void z(boolean $$0) {
      this.ar().a(cc, $$0);
   }

   public boolean s() {
      return this.ar().a(cc);
   }

   public static buv.a t() {
      return ckd.gq().a(buw.s, 26.0).a(buw.v, 0.25);
   }

   @Override
   public void m_() {
      if (!this.dO().B && this.bE()) {
         this.ce.k();
         if (this.ce.i() <= 0) {
            this.cf.a(true);
         } else {
            this.cf.a(false);
         }

         if (this.s()) {
            if (this.cd-- <= 0) {
               this.z(false);
               cuq $$0 = this.eT();
               this.a(bsy.a, cuq.l);
               cwu $$1 = $$0.a(kq.G);
               if ($$0.a(cut.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dxz.l);
               this.f(buw.v).c(e.b());
            }
         } else {
            jm<cws> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awk.a) && !this.b(bsb.m)) {
               $$2 = cwv.w;
            } else if (this.ah.i() < 0.15F && (this.bR() || this.ey() != null && this.ey().a(awg.i)) && !this.b(bsb.l)) {
               $$2 = cwv.l;
            } else if (this.ah.i() < 0.05F && this.ew() < this.eN()) {
               $$2 = cwv.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(bsb.a) && this.p().g(this) > 121.0) {
               $$2 = cwv.n;
            }

            if ($$2 != null) {
               this.a(bsy.a, cwu.a(cut.sk, $$2));
               this.cd = this.eT().a((btn)this);
               this.z(true);
               if (!this.aX()) {
                  this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.Cv, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               bus $$3 = this.f(buw.v);
               $$3.c(b);
               $$3.b(e);
            }
         }

         if (this.ah.i() < 7.5E-4F) {
            this.dO().a(this, (byte)15);
         }
      }

      super.m_();
   }

   @Override
   public avo ai_() {
      return avp.Ct;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dO().a(lm.an, this.dt() + this.ah.k() * 0.13F, this.cK().e + 0.5 + this.ah.k() * 0.13F, this.dz() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(brk $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awg.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(btn $$0, float $$1) {
      if (!this.s()) {
         exc $$2 = $$0.dr();
         double $$3 = $$0.dt() + $$2.c - this.dt();
         double $$4 = $$0.dx() - 1.1F - this.dv();
         double $$5 = $$0.dz() + $$2.e - this.dz();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jm<cws> $$7 = cwv.A;
         if ($$0 instanceof coj) {
            if ($$0.ew() <= 4.0F) {
               $$7 = cwv.y;
            } else {
               $$7 = cwv.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bsb.b)) {
            $$7 = cwv.q;
         } else if ($$0.ew() >= 8.0F && !$$0.b(bsb.s)) {
            $$7 = cwv.C;
         } else if ($$6 <= 3.0 && !$$0.b(bsb.r) && this.ah.i() < 0.25F) {
            $$7 = cwv.L;
         }

         cob $$8 = new cob(this.dO(), this);
         $$8.a(cwu.a(cut.vo, $$7));
         $$8.u($$8.dG() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aX()) {
            this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.Cx, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
         }

         this.dO().b($$8);
      }
   }

   @Override
   public void a(aqu $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gl() {
      return false;
   }
}
