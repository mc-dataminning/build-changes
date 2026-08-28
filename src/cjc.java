import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjc extends byf {
   public static final double bK = 0.6;
   public static final double bL = 0.8;
   public static final double bM = 1.33;
   private static final akj<jf<cjd>> bN = akn.a(cjc.class, akl.x);
   private static final akj<Boolean> bO = akn.a(cjc.class, akl.k);
   private static final akj<Boolean> bP = akn.a(cjc.class, akl.k);
   private static final akj<Integer> bQ = akn.a(cjc.class, akl.b);
   private static final alf<cjd> bR = cje.b;
   private static final cyl bS = cyl.o;
   @Nullable
   private cjc.a<crm> bT;
   @Nullable
   private cfn bU;
   private float bV;
   private float bW;
   private float bX;
   private float bY;
   private boolean bZ;
   private float ca;
   private float cb;

   public cjc(bwr<? extends cjc> $$0, djm $$1) {
      super($$0, $$1);
      this.gL();
   }

   @Override
   protected void D() {
      this.bU = new cjc.c(this, 0.6, $$0 -> $$0.a(axk.ai), true);
      this.bD.a(1, new cdz(this));
      this.bD.a(1, new byf.a(1.5));
      this.bD.a(2, new cfk(this));
      this.bD.a(3, new cjc.b(this));
      this.bD.a(4, this.bU);
      this.bD.a(5, new cds(this, 1.1, 8));
      this.bD.a(6, new ced(this, 1.0, 10.0F, 5.0F));
      this.bD.a(7, new cdt(this, 0.8));
      this.bD.a(8, new cel(this, 0.3F));
      this.bD.a(9, new cev(this));
      this.bD.a(10, new cdr(this, 0.8));
      this.bD.a(11, new cfs(this, 0.8, 1.0000001E-5F));
      this.bD.a(12, new cen(this, crm.class, 10.0F));
      this.bE.a(1, new cgb<>(this, cjz.class, false, null));
      this.bE.a(1, new cgb<>(this, ckg.class, false, ckg.bG));
   }

   public jf<cjd> gF() {
      return this.al.a(bN);
   }

   private void j(jf<cjd> $$0) {
      this.al.a(bN, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      if ($$0 == kk.aP) {
         return c((kj<T>)$$0, this.gF());
      } else {
         return $$0 == kk.aQ ? c((kj<T>)$$0, this.gH()) : super.a($$0);
      }
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aP);
      this.a($$0, kk.aQ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aP) {
         this.j(c(kk.aP, $$1));
         return true;
      } else if ($$0 == kk.aQ) {
         this.a(c(kk.aQ, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void z(boolean $$0) {
      this.al.a(bO, $$0);
   }

   public boolean gG() {
      return this.al.a(bO);
   }

   void A(boolean $$0) {
      this.al.a(bP, $$0);
   }

   boolean gM() {
      return this.al.a(bP);
   }

   public cyl gH() {
      return cyl.a(this.al.a(bQ));
   }

   private void a(cyl $$0) {
      this.al.a(bQ, $$0.a());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bN, ctv.a(this.dW(), bR));
      $$0.a(bO, false);
      $$0.a(bP, false);
      $$0.a(bQ, bS.a());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ctv.a($$0, this.gF());
      $$0.a("CollarColor", cyl.s, this.gH());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctv.a($$0, this.dW(), mh.aH).ifPresent(this::j);
      this.a($$0.<cyl>a("CollarColor", cyl.s).orElse(bS));
   }

   @Override
   public void a(arq $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bxv.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bxv.a);
            this.h(true);
         } else {
            this.b(bxv.a);
            this.h(false);
         }
      } else {
         this.b(bxv.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awm u() {
      if (this.q()) {
         if (this.gD()) {
            return awn.eb;
         } else {
            return this.ae.a(4) == 0 ? awn.ec : awn.dU;
         }
      } else {
         return awn.dV;
      }
   }

   @Override
   public int S() {
      return 120;
   }

   public void gI() {
      this.b(awn.dY);
   }

   @Override
   protected awm e(bux $$0) {
      return awn.ea;
   }

   @Override
   protected awm l_() {
      return awn.dW;
   }

   public static byo.a gJ() {
      return ciz.gy().a(byp.s, 10.0).a(byp.v, 0.3F).a(byp.c, 3.0);
   }

   @Override
   protected void gz() {
      this.a(awn.dX, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.bU != null && this.bU.i() && !this.q() && this.af % 100 == 0) {
         this.a(awn.dZ, 1.0F, 1.0F);
      }

      this.gN();
   }

   private void gN() {
      if ((this.gG() || this.gM()) && this.af % 5 == 0) {
         this.a(awn.eb, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gO();
      this.gP();
      this.bZ = false;
      if (this.gG()) {
         iv $$0 = this.du();

         for (crm $$2 : this.dU().a(crm.class, new fex($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fQ()) {
               this.bZ = true;
               break;
            }
         }
      }
   }

   public boolean gK() {
      return this.bZ;
   }

   private void gO() {
      this.bW = this.bV;
      this.bY = this.bX;
      if (this.gG()) {
         this.bV = Math.min(1.0F, this.bV + 0.15F);
         this.bX = Math.min(1.0F, this.bX + 0.08F);
      } else {
         this.bV = Math.max(0.0F, this.bV - 0.22F);
         this.bX = Math.max(0.0F, this.bX - 0.13F);
      }
   }

   private void gP() {
      this.cb = this.ca;
      if (this.gM()) {
         this.ca = Math.min(1.0F, this.ca + 0.1F);
      } else {
         this.ca = Math.max(0.0F, this.ca - 0.13F);
      }
   }

   public float J(float $$0) {
      return azm.h($$0, this.bW, this.bV);
   }

   public float K(float $$0) {
      return azm.h($$0, this.bY, this.bX);
   }

   public float L(float $$0) {
      return azm.h($$0, this.cb, this.ca);
   }

   @Nullable
   public cjc b(arq $$0, bvy $$1) {
      cjc $$2 = bwr.u.a($$0, bwq.e);
      if ($$2 != null && $$1 instanceof cjc $$3) {
         if (this.ae.h()) {
            $$2.j(this.gF());
         } else {
            $$2.j($$3.gF());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cyl $$4 = this.gH();
            cyl $$5 = $$3.gH();
            $$2.a(cyl.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(ciz $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cjc $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      cje.a(this.ae, this.dW(), cts.a($$0, this.du())).ifPresent(this::j);
      return $$3;
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      czj $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cym $$4) {
               cyl $$5 = $$4.a();
               if ($$5 != this.gH()) {
                  if (!this.dU().w_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.gb();
                  }

                  return bug.a;
               }
            } else if (this.i($$2) && this.eF() < this.eT()) {
               if (!this.dU().w_()) {
                  this.a($$0, $$1, $$2);
                  cvc $$6 = $$2.a(kk.v);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gz();
               }

               return bug.a;
            }

            bug $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gt());
               return bug.a;
            }

            return $$7;
         }
      } else if (this.i($$2)) {
         if (!this.dU().w_()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gb();
            this.gz();
         }

         return bug.a;
      }

      bug $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.gb();
      }

      return $$8;
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.ai);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.af > 2400;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      super.a($$0, $$1);
      this.gL();
   }

   protected void gL() {
      if (this.bT == null) {
         this.bT = new cjc.a<>(this, crm.class, 16.0F, 0.8, 1.33);
      }

      this.bD.a(this.bT);
      if (!this.q()) {
         this.bD.a(4, this.bT);
      }
   }

   private void f(crm $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.y(true);
         this.dU().a(this, (byte)7);
      } else {
         this.dU().a(this, (byte)6);
      }
   }

   @Override
   public boolean cc() {
      return this.cg() || super.cc();
   }

   static class a<T extends bxj> extends cdm<T> {
      private final cjc i;

      public a(cjc $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwp.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.q() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.q() && super.c();
      }
   }

   static class b extends cef {
      private final cjc a;
      @Nullable
      private crm b;
      @Nullable
      private iv c;
      private int d;

      public b(cjc $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gt()) {
            return false;
         } else {
            bxj $$0 = this.a.e();
            if ($$0 instanceof crm $$1) {
               this.b = $$1;
               if (!$$0.fQ()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               iv $$2 = this.b.du();
               eat $$3 = this.a.dU().a_($$2);
               if ($$3.a(axc.T)) {
                  this.c = $$3.d(dmk.e).map($$1x -> $$2.a($$1x.g())).orElseGet(() -> new iv($$2));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cjc $$1 : this.a.dU().a(cjc.class, new fex(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gG() || $$1.gM())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gt() && this.b != null && this.b.fQ() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.x(false);
            this.a.O().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.z(false);
         float $$0 = this.a.dU().f(1.0F);
         if (this.b.go() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dU().C_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.O().m();
      }

      private void i() {
         azv $$0 = this.a.dX();
         iv.a $$1 = new iv.a();
         $$1.g(this.a.O_() ? this.a.C().du() : this.a.du());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.du());
         this.a
            .a(
               a(this.a),
               ezp.aq,
               ($$1x, $$2) -> $$1x.b(
                     new cnr(
                        $$1x,
                        (double)$$1.u() - (double)azm.a(this.a.aV * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)azm.b(this.a.aV * (float) (Math.PI / 180.0)),
                        $$2
                     )
                  )
            );
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.O().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g(this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }
      }
   }

   static class c extends cfn {
      @Nullable
      private crm c;
      private final cjc d;

      public c(cjc $$0, double $$1, Predicate<czn> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dX().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dX().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }
   }
}
