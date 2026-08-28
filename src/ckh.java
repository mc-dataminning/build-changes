import java.util.UUID;

public class ckh extends cnx implements cjv {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bui e = new bui(b, "Drinking speed penalty", -0.25, bui.a.a);
   private static final ajp<Boolean> ca = ajt.a(ckh.class, ajr.k);
   private int cb;
   private cbv<cnx> cc;
   private cbu<cml> cd;

   public ckh(bsn<? extends ckh> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.cc = new cbv<>(this, cnx.class, true, $$0 -> $$0 != null && this.gE() && $$0.am() != bsn.bo);
      this.cd = new cbu<>(this, cml.class, 10, true, false, null);
      this.bU.a(1, new bzu(this));
      this.bU.a(2, new caz(this, 1.0, 60, 10.0F));
      this.bU.a(2, new cbn(this, 1.0));
      this.bU.a(3, new cai(this, cml.class, 8.0F));
      this.bU.a(3, new cav(this));
      this.bV.a(1, new cbs(this, cnx.class));
      this.bV.a(2, this.cc);
      this.bV.a(3, this.cd);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   protected avg v() {
      return avh.Cr;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.Cv;
   }

   @Override
   protected avg n_() {
      return avh.Ct;
   }

   public void y(boolean $$0) {
      this.ar().a(ca, $$0);
   }

   public boolean s() {
      return this.ar().a(ca);
   }

   public static buj.a t() {
      return cjr.gt().a(buk.s, 26.0).a(buk.v, 0.25);
   }

   @Override
   public void m_() {
      if (!this.dR().B && this.bF()) {
         this.cc.k();
         if (this.cc.i() <= 0) {
            this.cd.a(true);
         } else {
            this.cd.a(false);
         }

         if (this.s()) {
            if (this.cb-- <= 0) {
               this.y(false);
               cud $$0 = this.eV();
               this.a(bso.a, cud.l);
               cwe $$1 = $$0.a(kn.G);
               if ($$0.a(cug.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dxh.l);
               this.f(buk.v).b(e.b());
            }
         } else {
            jj<cwc> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awc.a) && !this.b(brr.m)) {
               $$2 = cwf.w;
            } else if (this.ah.i() < 0.15F && (this.bS() || this.eA() != null && this.eA().a(avy.j)) && !this.b(brr.l)) {
               $$2 = cwf.l;
            } else if (this.ah.i() < 0.05F && this.ey() < this.eP()) {
               $$2 = cwf.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(brr.a) && this.p().g(this) > 121.0) {
               $$2 = cwf.n;
            }

            if ($$2 != null) {
               this.a(bso.a, cwe.a(cug.sk, $$2));
               this.cb = this.eV().a((btc)this);
               this.y(true);
               if (!this.aY()) {
                  this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.Cu, this.dg(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               bug $$3 = this.f(buk.v);
               $$3.b(e.b());
               $$3.c(e);
            }
         }

         if (this.ah.i() < 7.5E-4F) {
            this.dR().a(this, (byte)15);
         }
      }

      super.m_();
   }

   @Override
   public avg ae_() {
      return avh.Cs;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dR().a(lj.an, this.dw() + this.ah.k() * 0.13F, this.cM().e + 0.5 + this.ah.k() * 0.13F, this.dC() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bra $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(avy.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(btc $$0, float $$1) {
      if (!this.s()) {
         ewh $$2 = $$0.du();
         double $$3 = $$0.dw() + $$2.c - this.dw();
         double $$4 = $$0.dA() - 1.1F - this.dy();
         double $$5 = $$0.dC() + $$2.e - this.dC();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jj<cwc> $$7 = cwf.A;
         if ($$0 instanceof cnx) {
            if ($$0.ey() <= 4.0F) {
               $$7 = cwf.y;
            } else {
               $$7 = cwf.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(brr.b)) {
            $$7 = cwf.q;
         } else if ($$0.ey() >= 8.0F && !$$0.b(brr.s)) {
            $$7 = cwf.C;
         } else if ($$6 <= 3.0 && !$$0.b(brr.r) && this.ah.i() < 0.25F) {
            $$7 = cwf.L;
         }

         cnp $$8 = new cnp(this.dR(), this);
         $$8.a(cwe.a(cug.vo, $$7));
         $$8.t($$8.dJ() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aY()) {
            this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.Cw, this.dg(), 1.0F, 0.8F + this.ah.i() * 0.4F);
         }

         this.dR().b($$8);
      }
   }

   @Override
   public void a(aqm $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean go() {
      return false;
   }
}
