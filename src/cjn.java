import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjn extends byq {
   public static final double bM = 0.6;
   public static final double bN = 0.8;
   public static final double bO = 1.33;
   private static final akl<jf<cjo>> bP = akp.a(cjn.class, akn.x);
   private static final akl<Boolean> bQ = akp.a(cjn.class, akn.k);
   private static final akl<Boolean> bR = akp.a(cjn.class, akn.k);
   private static final akl<Integer> bS = akp.a(cjn.class, akn.b);
   private static final alh<cjo> bT = cjp.b;
   private static final cyw bU = cyw.o;
   @Nullable
   private cjn.a<crx> bV;
   @Nullable
   private cfy bW;
   private float bX;
   private float bY;
   private float bZ;
   private float ca;
   private boolean cb;
   private float cc;
   private float cd;

   public cjn(bxc<? extends cjn> $$0, djx $$1) {
      super($$0, $$1);
      this.gM();
   }

   @Override
   protected void D() {
      this.bW = new cjn.c(this, 0.6, $$0 -> $$0.a(axm.ai), true);
      this.bF.a(1, new cek(this));
      this.bF.a(1, new byq.a(1.5));
      this.bF.a(2, new cfv(this));
      this.bF.a(3, new cjn.b(this));
      this.bF.a(4, this.bW);
      this.bF.a(5, new ced(this, 1.1, 8));
      this.bF.a(6, new ceo(this, 1.0, 10.0F, 5.0F));
      this.bF.a(7, new cee(this, 0.8));
      this.bF.a(8, new cew(this, 0.3F));
      this.bF.a(9, new cfg(this));
      this.bF.a(10, new cec(this, 0.8));
      this.bF.a(11, new cgd(this, 0.8, 1.0000001E-5F));
      this.bF.a(12, new cey(this, crx.class, 10.0F));
      this.bG.a(1, new cgm<>(this, ckk.class, false, null));
      this.bG.a(1, new cgm<>(this, ckr.class, false, ckr.bI));
   }

   public jf<cjo> gG() {
      return this.al.a(bP);
   }

   private void j(jf<cjo> $$0) {
      this.al.a(bP, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      if ($$0 == kk.aP) {
         return c((kj<T>)$$0, this.gG());
      } else {
         return $$0 == kk.aQ ? c((kj<T>)$$0, this.gI()) : super.a($$0);
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
      this.al.a(bQ, $$0);
   }

   public boolean gH() {
      return this.al.a(bQ);
   }

   void A(boolean $$0) {
      this.al.a(bR, $$0);
   }

   boolean gN() {
      return this.al.a(bR);
   }

   public cyw gI() {
      return cyw.a(this.al.a(bS));
   }

   private void a(cyw $$0) {
      this.al.a(bS, $$0.a());
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bP, cug.a(this.dX(), bT));
      $$0.a(bQ, false);
      $$0.a(bR, false);
      $$0.a(bS, bU.a());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      cug.a($$0, this.gG());
      $$0.a("CollarColor", cyw.s, this.gI());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      cug.a($$0, this.dX(), mh.aH).ifPresent(this::j);
      this.a($$0.<cyw>a("CollarColor", cyw.s).orElse(bU));
   }

   @Override
   public void a(ars $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(byg.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(byg.a);
            this.h(true);
         } else {
            this.b(byg.a);
            this.h(false);
         }
      } else {
         this.b(byg.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awo u() {
      if (this.q()) {
         if (this.gE()) {
            return awp.eb;
         } else {
            return this.ae.a(4) == 0 ? awp.ec : awp.dU;
         }
      } else {
         return awp.dV;
      }
   }

   @Override
   public int S() {
      return 120;
   }

   public void gJ() {
      this.b(awp.dY);
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.ea;
   }

   @Override
   protected awo l_() {
      return awp.dW;
   }

   public static byz.a gK() {
      return cjk.gz().a(bza.s, 10.0).a(bza.v, 0.3F).a(bza.c, 3.0);
   }

   @Override
   protected void gA() {
      this.a(awp.dX, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.bW != null && this.bW.i() && !this.q() && this.af % 100 == 0) {
         this.a(awp.dZ, 1.0F, 1.0F);
      }

      this.gO();
   }

   private void gO() {
      if ((this.gH() || this.gN()) && this.af % 5 == 0) {
         this.a(awp.eb, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gP();
      this.gQ();
      this.cb = false;
      if (this.gH()) {
         iv $$0 = this.dv();

         for (crx $$2 : this.dV().a(crx.class, new ffl($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fR()) {
               this.cb = true;
               break;
            }
         }
      }
   }

   public boolean gL() {
      return this.cb;
   }

   private void gP() {
      this.bY = this.bX;
      this.ca = this.bZ;
      if (this.gH()) {
         this.bX = Math.min(1.0F, this.bX + 0.15F);
         this.bZ = Math.min(1.0F, this.bZ + 0.08F);
      } else {
         this.bX = Math.max(0.0F, this.bX - 0.22F);
         this.bZ = Math.max(0.0F, this.bZ - 0.13F);
      }
   }

   private void gQ() {
      this.cd = this.cc;
      if (this.gN()) {
         this.cc = Math.min(1.0F, this.cc + 0.1F);
      } else {
         this.cc = Math.max(0.0F, this.cc - 0.13F);
      }
   }

   public float J(float $$0) {
      return azo.h($$0, this.bY, this.bX);
   }

   public float K(float $$0) {
      return azo.h($$0, this.ca, this.bZ);
   }

   public float L(float $$0) {
      return azo.h($$0, this.cd, this.cc);
   }

   @Nullable
   public cjn b(ars $$0, bwj $$1) {
      cjn $$2 = bxc.v.a($$0, bxb.e);
      if ($$2 != null && $$1 instanceof cjn $$3) {
         if (this.ae.h()) {
            $$2.j(this.gG());
         } else {
            $$2.j($$3.gG());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cyw $$4 = this.gI();
            cyw $$5 = $$3.gI();
            $$2.a(cyw.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cjk $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cjn $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      cjp.a(this.ae, this.dX(), cud.a($$0, this.dv())).ifPresent(this::j);
      return $$3;
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      czu $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cyx $$4) {
               cyw $$5 = $$4.a();
               if ($$5 != this.gI()) {
                  if (!this.dV().A_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.gc();
                  }

                  return bur.a;
               }
            } else if (this.i($$2) && this.eG() < this.eU()) {
               if (!this.dV().A_()) {
                  this.a($$0, $$1, $$2);
                  cvn $$6 = $$2.a(kk.v);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gA();
               }

               return bur.a;
            }

            bur $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gu());
               return bur.a;
            }

            return $$7;
         }
      } else if (this.i($$2)) {
         if (!this.dV().A_()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gc();
            this.gA();
         }

         return bur.a;
      }

      bur $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.gc();
      }

      return $$8;
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.ai);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.af > 2400;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      super.a($$0, $$1);
      this.gM();
   }

   protected void gM() {
      if (this.bV == null) {
         this.bV = new cjn.a<>(this, crx.class, 16.0F, 0.8, 1.33);
      }

      this.bF.a(this.bV);
      if (!this.q()) {
         this.bF.a(4, this.bV);
      }
   }

   private void f(crx $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.y(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public boolean cd() {
      return this.ch() || super.cd();
   }

   static class a<T extends bxu> extends cdx<T> {
      private final cjn i;

      public a(cjn $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bxa.e::test);
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

   static class b extends ceq {
      private final cjn a;
      @Nullable
      private crx b;
      @Nullable
      private iv c;
      private int d;

      public b(cjn $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gu()) {
            return false;
         } else {
            bxu $$0 = this.a.e();
            if ($$0 instanceof crx $$1) {
               this.b = $$1;
               if (!$$0.fR()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               iv $$2 = this.b.dv();
               ebe $$3 = this.a.dV().a_($$2);
               if ($$3.a(axe.T)) {
                  this.c = $$3.d(dmv.e).map($$1x -> $$2.a($$1x.g())).orElseGet(() -> new iv($$2));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cjn $$1 : this.a.dV().a(cjn.class, new ffl(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gH() || $$1.gN())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gu() && this.b != null && this.b.fR() && this.c != null && !this.h();
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
         float $$0 = this.a.dV().f(1.0F);
         if (this.b.gp() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dV().G_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.O().m();
      }

      private void i() {
         azx $$0 = this.a.dY();
         iv.a $$1 = new iv.a();
         $$1.g(this.a.S_() ? this.a.C().dv() : this.a.dv());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dv());
         this.a
            .a(
               a(this.a),
               fad.aq,
               ($$1x, $$2) -> $$1x.b(
                     new coc(
                        $$1x,
                        (double)$$1.u() - (double)azo.a(this.a.aV * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)azo.b(this.a.aV * (float) (Math.PI / 180.0)),
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

   static class c extends cfy {
      @Nullable
      private crx c;
      private final cjn d;

      public c(cjn $$0, double $$1, Predicate<czy> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dY().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dY().a(this.a(500)) == 0) {
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
