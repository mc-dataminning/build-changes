import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cif extends chw {
   private static final alc<jh> cc = alg.a(cif.class, ale.o);
   private static final alc<Boolean> cd = alg.a(cif.class, ale.k);
   private static final alc<Integer> ce = alg.a(cif.class, ale.b);
   static final cgx cf = cgx.b().a(10.0).d();
   public static final int bZ = 4800;
   private static final int cg = 2400;
   public static final Predicate<cmb> ca = $$0 -> !$$0.v() && $$0.bL() && $$0.bj();
   public static final float cb = 0.65F;

   public cif(bvr<? extends cif> $$0, dhi $$1) {
      super($$0, $$1);
      this.bQ = new ccj(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new cci(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      this.j(this.cs());
      this.w(0.0F);
      bwz $$4 = Objects.requireNonNullElseGet($$3, () -> new bvb.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cif b(ash $$0, bvb $$1) {
      return bvr.I.a($$0, bvq.e);
   }

   @Override
   public float ej() {
      return this.e_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void h(jh $$0) {
      this.al.a(cc, $$0);
   }

   public jh p() {
      return this.al.a(cc);
   }

   public boolean t() {
      return this.al.a(cd);
   }

   public void x(boolean $$0) {
      this.al.a(cd, $$0);
   }

   public int x() {
      return this.al.a(ce);
   }

   public void s(int $$0) {
      this.al.a(ce, $$0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cc, jh.c);
      $$0.a(cd, false);
      $$0.a(ce, 2400);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.p().u());
      $$0.a("TreasurePosY", this.p().v());
      $$0.a("TreasurePosZ", this.p().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(ux $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new jh($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.s($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccp(this));
      this.bT.a(0, new ceo(this));
      this.bT.a(1, new cif.a(this));
      this.bT.a(2, new cif.b(this, 4.0));
      this.bT.a(4, new cec(this, 1.0, 10));
      this.bT.a(4, new cdz(this));
      this.bT.a(5, new cdm(this, cpx.class, 6.0F));
      this.bT.a(5, new ccu(this, 10));
      this.bT.a(6, new cdo(this, 1.2F, true));
      this.bT.a(8, new cif.c());
      this.bT.a(8, new ccz(this));
      this.bT.a(9, new ccl<>(this, cmt.class, 8.0F, 1.0, 1.0));
      this.bU.a(1, new cew(this, cmt.class).a());
   }

   public static bxn.a go() {
      return bwi.C().a(bxo.s, 10.0).a(bxo.v, 1.2F).a(bxo.c, 3.0);
   }

   @Override
   protected cfs b(dhi $$0) {
      return new cfu(this, $$0);
   }

   @Override
   public void gf() {
      this.a(axf.hr, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bwg $$0) {
      return !this.e_() && super.c($$0);
   }

   @Override
   public int cs() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cs();
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   protected boolean o(bvk $$0) {
      return true;
   }

   @Override
   protected boolean f(bvs $$0) {
      return $$0 == bvs.a && this.fN();
   }

   @Override
   protected void a(ash $$0, cmb $$1) {
      if (this.a(bvs.a).f()) {
         cxp $$2 = $$1.l();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bvs.a, $$2);
            this.g(bvs.a);
            this.a($$1, $$2.L());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gb()) {
         this.j(this.cs());
      } else {
         if (this.bl()) {
            this.s(2400);
         } else {
            this.s(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dX().t(), 1.0F);
            }

            if (this.aJ()) {
               this.h(this.dz().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dW().C && this.bj() && this.dz().h() > 0.03) {
            fby $$0 = this.g(0.0F);
            float $$1 = bae.b(this.dM() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = bae.a(this.dM() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dW()
                  .a(ls.at, this.dB() - $$0.d * (double)$$3 + (double)$$1, this.dD() - $$0.e, this.dH() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dW()
                  .a(ls.at, this.dB() - $$0.d * (double)$$3 - (double)$$1, this.dD() - $$0.e, this.dH() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(ls.O);
      } else {
         super.b($$0);
      }
   }

   private void a(lq $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dW().a($$0, this.d(1.0), this.dE() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(ayd.aV)) {
         if (!this.dW().C) {
            this.a(axf.ht, 1.0F, 1.0F);
         }

         if (this.e_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return btj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected axe e(bua $$0) {
      return axf.hu;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.hs;
   }

   @Nullable
   @Override
   protected axe u() {
      return this.bj() ? axf.hq : axf.hp;
   }

   @Override
   protected axe aW() {
      return axf.hx;
   }

   @Override
   protected axe aV() {
      return axf.hy;
   }

   protected boolean gp() {
      jh $$0 = this.L().i();
      return $$0 != null ? $$0.a(this.du(), 12.0) : false;
   }

   @Override
   public void a_(fby $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bwk.a, this.dz());
         this.h(this.dz().c(0.9));
         if (this.O_() == null) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   static class a extends cde {
      private final cif a;
      private boolean b;

      a(cif $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cde.a.a, cde.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.ct() >= 100;
      }

      @Override
      public boolean c() {
         jh $$0 = this.a.p();
         return !jh.a((double)$$0.u(), this.a.dD(), (double)$$0.w()).a(this.a.du(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dW() instanceof ash) {
            ash $$0 = (ash)this.a.dW();
            this.b = false;
            this.a.L().o();
            jh $$1 = this.a.dw();
            jh $$2 = $$0.a(ayg.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.h($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         jh $$0 = this.a.p();
         if (jh.a((double)$$0.u(), this.a.dD(), (double)$$0.w()).a(this.a.du(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dhi $$0 = this.a.dW();
         if (this.a.gp() || this.a.L().m()) {
            fby $$1 = fby.b(this.a.p());
            fby $$2 = chb.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = chb.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jh $$3 = jh.a((ka)$$2);
               if (!$$0.b_($$3).a(aya.a) || !$$0.a_($$3).a(eum.b)) {
                  $$2 = chb.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.H().a($$2.d, $$2.e, $$2.f, (float)(this.a.aa() + 20), (float)this.a.Z());
            this.a.L().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cde {
      private final cif a;
      private final double b;
      @Nullable
      private cpx c;

      b(cif $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cde.a.a, cde.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cif.cf, this.a);
         return this.c == null ? false : this.c.ck() && this.a.O_() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bup(bur.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.L().o();
      }

      @Override
      public void a() {
         this.a.H().a(this.c, (float)(this.a.aa() + 20), (float)this.a.Z());
         if (this.a.g(this.c) < 6.25) {
            this.a.L().o();
         } else {
            this.a.L().a(this.c, this.b);
         }

         if (this.c.ck() && this.c.dW().A.a(6) == 0) {
            this.c.b(new bup(bur.D, 100), this.a);
         }
      }
   }

   class c extends cde {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cif.this.af) {
            return false;
         } else {
            List<cmb> $$0 = cif.this.dW().a(cmb.class, cif.this.cR().c(8.0, 8.0, 8.0), cif.ca);
            return !$$0.isEmpty() || !cif.this.a(bvs.a).f();
         }
      }

      @Override
      public void d() {
         List<cmb> $$0 = cif.this.dW().a(cmb.class, cif.this.cR().c(8.0, 8.0, 8.0), cif.ca);
         if (!$$0.isEmpty()) {
            cif.this.L().a($$0.get(0), 1.2F);
            cif.this.a(axf.hw, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxp $$0 = cif.this.a(bvs.a);
         if (!$$0.f()) {
            this.a($$0);
            cif.this.a(bvs.a, cxp.j);
            this.b = cif.this.af + cif.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<cmb> $$0 = cif.this.dW().a(cmb.class, cif.this.cR().c(8.0, 8.0, 8.0), cif.ca);
         cxp $$1 = cif.this.a(bvs.a);
         if (!$$1.f()) {
            this.a($$1);
            cif.this.a(bvs.a, cxp.j);
         } else if (!$$0.isEmpty()) {
            cif.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cxp $$0) {
         if (!$$0.f()) {
            double $$1 = cif.this.dF() - 0.3F;
            cmb $$2 = new cmb(cif.this.dW(), cif.this.dB(), $$1, cif.this.dH(), $$0);
            $$2.b(40);
            $$2.b(cif.this);
            float $$3 = 0.3F;
            float $$4 = cif.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cif.this.ae.i();
            $$2.n(
               (double)(0.3F * -bae.a(cif.this.dM() * (float) (Math.PI / 180.0)) * bae.b(cif.this.dO() * (float) (Math.PI / 180.0)) + bae.b($$4) * $$5),
               (double)(0.3F * bae.a(cif.this.dO() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * bae.b(cif.this.dM() * (float) (Math.PI / 180.0)) * bae.b(cif.this.dO() * (float) (Math.PI / 180.0)) + bae.a($$4) * $$5)
            );
            cif.this.dW().b($$2);
         }
      }
   }
}
