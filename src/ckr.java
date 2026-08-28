public class ckr extends coh implements ckf {
   private static final akq b = akq.b("drinking");
   private static final bus e = new bus(b, -0.25, bus.a.a);
   private static final ajv<Boolean> ca = ajz.a(ckr.class, ajx.k);
   private int cb;
   private ccf<coh> cc;
   private cce<cmv> cd;

   public ckr(bsw<? extends ckr> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.cc = new ccf<>(this, coh.class, true, $$0 -> $$0 != null && this.gD() && $$0.am() != bsw.bo);
      this.cd = new cce<>(this, cmv.class, 10, true, false, null);
      this.bU.a(1, new cae(this));
      this.bU.a(2, new cbj(this, 1.0, 60, 10.0F));
      this.bU.a(2, new cbx(this, 1.0));
      this.bU.a(3, new cas(this, cmv.class, 8.0F));
      this.bU.a(3, new cbf(this));
      this.bV.a(1, new ccc(this, coh.class));
      this.bV.a(2, this.cc);
      this.bV.a(3, this.cd);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   protected avn v() {
      return avo.Cs;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.Cw;
   }

   @Override
   protected avn n_() {
      return avo.Cu;
   }

   public void y(boolean $$0) {
      this.ar().a(ca, $$0);
   }

   public boolean s() {
      return this.ar().a(ca);
   }

   public static but.a t() {
      return ckb.gs().a(buu.s, 26.0).a(buu.v, 0.25);
   }

   @Override
   public void m_() {
      if (!this.dQ().B && this.bE()) {
         this.cc.k();
         if (this.cc.i() <= 0) {
            this.cd.a(true);
         } else {
            this.cd.a(false);
         }

         if (this.s()) {
            if (this.cb-- <= 0) {
               this.y(false);
               cuo $$0 = this.eU();
               this.a(bsx.a, cuo.l);
               cws $$1 = $$0.a(kq.G);
               if ($$0.a(cur.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dxw.l);
               this.f(buu.v).c(e.b());
            }
         } else {
            jm<cwq> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awj.a) && !this.b(bsa.m)) {
               $$2 = cwt.w;
            } else if (this.ah.i() < 0.15F && (this.bR() || this.ez() != null && this.ez().a(awf.i)) && !this.b(bsa.l)) {
               $$2 = cwt.l;
            } else if (this.ah.i() < 0.05F && this.ex() < this.eO()) {
               $$2 = cwt.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(bsa.a) && this.p().g(this) > 121.0) {
               $$2 = cwt.n;
            }

            if ($$2 != null) {
               this.a(bsx.a, cws.a(cur.sk, $$2));
               this.cb = this.eU().a((btl)this);
               this.y(true);
               if (!this.aX()) {
                  this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.Cv, this.df(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               buq $$3 = this.f(buu.v);
               $$3.c(b);
               $$3.b(e);
            }
         }

         if (this.ah.i() < 7.5E-4F) {
            this.dQ().a(this, (byte)15);
         }
      }

      super.m_();
   }

   @Override
   public avn ae_() {
      return avo.Ct;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dQ().a(lm.an, this.dv() + this.ah.k() * 0.13F, this.cL().e + 0.5 + this.ah.k() * 0.13F, this.dB() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(brj $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awf.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(btl $$0, float $$1) {
      if (!this.s()) {
         eww $$2 = $$0.dt();
         double $$3 = $$0.dv() + $$2.c - this.dv();
         double $$4 = $$0.dz() - 1.1F - this.dx();
         double $$5 = $$0.dB() + $$2.e - this.dB();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jm<cwq> $$7 = cwt.A;
         if ($$0 instanceof coh) {
            if ($$0.ex() <= 4.0F) {
               $$7 = cwt.y;
            } else {
               $$7 = cwt.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bsa.b)) {
            $$7 = cwt.q;
         } else if ($$0.ex() >= 8.0F && !$$0.b(bsa.s)) {
            $$7 = cwt.C;
         } else if ($$6 <= 3.0 && !$$0.b(bsa.r) && this.ah.i() < 0.25F) {
            $$7 = cwt.L;
         }

         cnz $$8 = new cnz(this.dQ(), this);
         $$8.a(cws.a(cur.vo, $$7));
         $$8.t($$8.dI() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aX()) {
            this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.Cx, this.df(), 1.0F, 0.8F + this.ah.i() * 0.4F);
         }

         this.dQ().b($$8);
      }
   }

   @Override
   public void a(aqt $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gn() {
      return false;
   }
}
