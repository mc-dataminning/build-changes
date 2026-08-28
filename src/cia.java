import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cia extends chr {
   private static final alc<jh> cc = alg.a(cia.class, ale.o);
   private static final alc<Boolean> cd = alg.a(cia.class, ale.k);
   private static final alc<Integer> ce = alg.a(cia.class, ale.b);
   static final cgs cf = cgs.b().a(10.0).d();
   public static final int bZ = 4800;
   private static final int cg = 2400;
   public static final Predicate<clw> ca = $$0 -> !$$0.v() && $$0.bL() && $$0.bj();
   public static final float cb = 0.65F;

   public cia(bvm<? extends cia> $$0, dha $$1) {
      super($$0, $$1);
      this.bQ = new cce(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new ccd(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      this.j(this.cs());
      this.w(0.0F);
      bwu $$4 = Objects.requireNonNullElseGet($$3, () -> new buw.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cia b(ash $$0, buw $$1) {
      return bvm.I.a($$0, bvl.e);
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
      this.bT.a(0, new cck(this));
      this.bT.a(0, new cej(this));
      this.bT.a(1, new cia.a(this));
      this.bT.a(2, new cia.b(this, 4.0));
      this.bT.a(4, new cdx(this, 1.0, 10));
      this.bT.a(4, new cdu(this));
      this.bT.a(5, new cdh(this, cps.class, 6.0F));
      this.bT.a(5, new ccp(this, 10));
      this.bT.a(6, new cdj(this, 1.2F, true));
      this.bT.a(8, new cia.c());
      this.bT.a(8, new ccu(this));
      this.bT.a(9, new ccg<>(this, cmo.class, 8.0F, 1.0, 1.0));
      this.bU.a(1, new cer(this, cmo.class).a());
   }

   public static bxi.a gm() {
      return bwd.C().a(bxj.s, 10.0).a(bxj.v, 1.2F).a(bxj.c, 3.0);
   }

   @Override
   protected cfn b(dha $$0) {
      return new cfp(this, $$0);
   }

   @Override
   public void gd() {
      this.a(axf.hq, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bwb $$0) {
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
   protected boolean o(bvf $$0) {
      return true;
   }

   @Override
   protected boolean f(bvn $$0) {
      return $$0 == bvn.a && this.fL();
   }

   @Override
   protected void a(ash $$0, clw $$1) {
      if (this.a(bvn.a).f()) {
         cxk $$2 = $$1.l();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bvn.a, $$2);
            this.g(bvn.a);
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
            fbs $$0 = this.g(0.0F);
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
   protected bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(ayd.aV)) {
         if (!this.dV().C) {
            this.a(axf.hs, 1.0F, 1.0F);
         }

         if (this.e_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.x(true);
            $$2.a(1, $$0);
         }

         return bte.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected axe e(btv $$0) {
      return axf.ht;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.hr;
   }

   @Nullable
   @Override
   protected axe u() {
      return this.bj() ? axf.hp : axf.ho;
   }

   @Override
   protected axe aW() {
      return axf.hw;
   }

   @Override
   protected axe aV() {
      return axf.hx;
   }

   protected boolean gn() {
      jh $$0 = this.L().i();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(fbs $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bwf.a, this.dy());
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

   static class a extends ccz {
      private final cia a;
      private boolean b;

      a(cia $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.a, ccz.a.b));
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
         dha $$0 = this.a.dV();
         if (this.a.gn() || this.a.L().m()) {
            fbs $$1 = fbs.b(this.a.p());
            fbs $$2 = cgw.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cgw.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jh $$3 = jh.a((ka)$$2);
               if (!$$0.b_($$3).a(aya.a) || !$$0.a_($$3).a(eue.b)) {
                  $$2 = cgw.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends ccz {
      private final cia a;
      private final double b;
      @Nullable
      private cps c;

      b(cia $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(ccz.a.a, ccz.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cia.cf, this.a);
         return this.c == null ? false : this.c.ck() && this.a.O_() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new buk(bum.D, 100), this.a);
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
            this.c.b(new buk(bum.D, 100), this.a);
         }
      }
   }

   class c extends ccz {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cia.this.af) {
            return false;
         } else {
            List<clw> $$0 = cia.this.dV().a(clw.class, cia.this.cR().c(8.0, 8.0, 8.0), cia.ca);
            return !$$0.isEmpty() || !cia.this.a(bvn.a).f();
         }
      }

      @Override
      public void d() {
         List<clw> $$0 = cia.this.dV().a(clw.class, cia.this.cR().c(8.0, 8.0, 8.0), cia.ca);
         if (!$$0.isEmpty()) {
            cia.this.L().a($$0.get(0), 1.2F);
            cia.this.a(axf.hv, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxk $$0 = cia.this.a(bvn.a);
         if (!$$0.f()) {
            this.a($$0);
            cia.this.a(bvn.a, cxk.k);
            this.b = cia.this.af + cia.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<clw> $$0 = cia.this.dV().a(clw.class, cia.this.cR().c(8.0, 8.0, 8.0), cia.ca);
         cxk $$1 = cia.this.a(bvn.a);
         if (!$$1.f()) {
            this.a($$1);
            cia.this.a(bvn.a, cxk.k);
         } else if (!$$0.isEmpty()) {
            cia.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cxk $$0) {
         if (!$$0.f()) {
            double $$1 = cia.this.dE() - 0.3F;
            clw $$2 = new clw(cia.this.dV(), cia.this.dA(), $$1, cia.this.dG(), $$0);
            $$2.b(40);
            $$2.b(cia.this);
            float $$3 = 0.3F;
            float $$4 = cia.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cia.this.ae.i();
            $$2.n(
               (double)(0.3F * -bae.a(cia.this.dL() * (float) (Math.PI / 180.0)) * bae.b(cia.this.dN() * (float) (Math.PI / 180.0)) + bae.b($$4) * $$5),
               (double)(0.3F * bae.a(cia.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * bae.b(cia.this.dL() * (float) (Math.PI / 180.0)) * bae.b(cia.this.dN() * (float) (Math.PI / 180.0)) + bae.a($$4) * $$5)
            );
            cia.this.dV().b($$2);
         }
      }
   }
}
