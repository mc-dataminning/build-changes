import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cie extends chv {
   private static final alc<jh> cc = alg.a(cie.class, ale.o);
   private static final alc<Boolean> cd = alg.a(cie.class, ale.k);
   private static final alc<Integer> ce = alg.a(cie.class, ale.b);
   static final cgw cf = cgw.b().a(10.0).d();
   public static final int bZ = 4800;
   private static final int cg = 2400;
   public static final Predicate<cma> ca = $$0 -> !$$0.v() && $$0.bL() && $$0.bj();
   public static final float cb = 0.65F;

   public cie(bvq<? extends cie> $$0, dhh $$1) {
      super($$0, $$1);
      this.bQ = new cci(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new cch(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      this.j(this.cs());
      this.w(0.0F);
      bwy $$4 = Objects.requireNonNullElseGet($$3, () -> new bva.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cie b(ash $$0, bva $$1) {
      return bvq.I.a($$0, bvp.e);
   }

   @Override
   public float ei() {
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
      this.bT.a(0, new cco(this));
      this.bT.a(0, new cen(this));
      this.bT.a(1, new cie.a(this));
      this.bT.a(2, new cie.b(this, 4.0));
      this.bT.a(4, new ceb(this, 1.0, 10));
      this.bT.a(4, new cdy(this));
      this.bT.a(5, new cdl(this, cpw.class, 6.0F));
      this.bT.a(5, new cct(this, 10));
      this.bT.a(6, new cdn(this, 1.2F, true));
      this.bT.a(8, new cie.c());
      this.bT.a(8, new ccy(this));
      this.bT.a(9, new cck<>(this, cms.class, 8.0F, 1.0, 1.0));
      this.bU.a(1, new cev(this, cms.class).a());
   }

   public static bxm.a gm() {
      return bwh.C().a(bxn.s, 10.0).a(bxn.v, 1.2F).a(bxn.c, 3.0);
   }

   @Override
   protected cfr b(dhh $$0) {
      return new cft(this, $$0);
   }

   @Override
   public void gd() {
      this.a(axf.hr, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bwf $$0) {
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
   protected boolean o(bvj $$0) {
      return true;
   }

   @Override
   protected boolean f(bvr $$0) {
      return $$0 == bvr.a && this.fL();
   }

   @Override
   protected void a(ash $$0, cma $$1) {
      if (this.a(bvr.a).f()) {
         cxo $$2 = $$1.l();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bvr.a, $$2);
            this.g(bvr.a);
            this.a($$1, $$2.L());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.fZ()) {
         this.j(this.cs());
      } else {
         if (this.bl()) {
            this.s(2400);
         } else {
            this.s(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dW().t(), 1.0F);
            }

            if (this.aJ()) {
               this.h(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dV().C && this.bj() && this.dy().h() > 0.03) {
            fbx $$0 = this.g(0.0F);
            float $$1 = bae.b(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = bae.a(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dV()
                  .a(ls.at, this.dA() - $$0.d * (double)$$3 + (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dV()
                  .a(ls.at, this.dA() - $$0.d * (double)$$3 - (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
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
         this.dV().a($$0, this.d(1.0), this.dD() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(ayd.aV)) {
         if (!this.dV().C) {
            this.a(axf.ht, 1.0F, 1.0F);
         }

         if (this.e_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bti.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected axe e(btz $$0) {
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

   protected boolean gn() {
      jh $$0 = this.L().i();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(fbx $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bwj.a, this.dy());
         this.h(this.dy().c(0.9));
         if (this.O_() == null) {
            this.h(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   static class a extends cdd {
      private final cie a;
      private boolean b;

      a(cie $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdd.a.a, cdd.a.b));
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
         return !jh.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dV() instanceof ash) {
            ash $$0 = (ash)this.a.dV();
            this.b = false;
            this.a.L().o();
            jh $$1 = this.a.dv();
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
         if (jh.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dhh $$0 = this.a.dV();
         if (this.a.gn() || this.a.L().m()) {
            fbx $$1 = fbx.b(this.a.p());
            fbx $$2 = cha.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cha.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jh $$3 = jh.a((ka)$$2);
               if (!$$0.b_($$3).a(aya.a) || !$$0.a_($$3).a(eul.b)) {
                  $$2 = cha.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends cdd {
      private final cie a;
      private final double b;
      @Nullable
      private cpw c;

      b(cie $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cdd.a.a, cdd.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cie.cf, this.a);
         return this.c == null ? false : this.c.ck() && this.a.O_() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new buo(buq.D, 100), this.a);
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

         if (this.c.ck() && this.c.dV().A.a(6) == 0) {
            this.c.b(new buo(buq.D, 100), this.a);
         }
      }
   }

   class c extends cdd {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cie.this.af) {
            return false;
         } else {
            List<cma> $$0 = cie.this.dV().a(cma.class, cie.this.cR().c(8.0, 8.0, 8.0), cie.ca);
            return !$$0.isEmpty() || !cie.this.a(bvr.a).f();
         }
      }

      @Override
      public void d() {
         List<cma> $$0 = cie.this.dV().a(cma.class, cie.this.cR().c(8.0, 8.0, 8.0), cie.ca);
         if (!$$0.isEmpty()) {
            cie.this.L().a($$0.get(0), 1.2F);
            cie.this.a(axf.hw, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxo $$0 = cie.this.a(bvr.a);
         if (!$$0.f()) {
            this.a($$0);
            cie.this.a(bvr.a, cxo.k);
            this.b = cie.this.af + cie.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<cma> $$0 = cie.this.dV().a(cma.class, cie.this.cR().c(8.0, 8.0, 8.0), cie.ca);
         cxo $$1 = cie.this.a(bvr.a);
         if (!$$1.f()) {
            this.a($$1);
            cie.this.a(bvr.a, cxo.k);
         } else if (!$$0.isEmpty()) {
            cie.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cxo $$0) {
         if (!$$0.f()) {
            double $$1 = cie.this.dE() - 0.3F;
            cma $$2 = new cma(cie.this.dV(), cie.this.dA(), $$1, cie.this.dG(), $$0);
            $$2.b(40);
            $$2.b(cie.this);
            float $$3 = 0.3F;
            float $$4 = cie.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cie.this.ae.i();
            $$2.n(
               (double)(0.3F * -bae.a(cie.this.dL() * (float) (Math.PI / 180.0)) * bae.b(cie.this.dN() * (float) (Math.PI / 180.0)) + bae.b($$4) * $$5),
               (double)(0.3F * bae.a(cie.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * bae.b(cie.this.dL() * (float) (Math.PI / 180.0)) * bae.b(cie.this.dN() * (float) (Math.PI / 180.0)) + bae.a($$4) * $$5)
            );
            cie.this.dV().b($$2);
         }
      }
   }
}
