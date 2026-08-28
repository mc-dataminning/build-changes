import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chs extends bwv implements bwy<jr<cht>> {
   public static final double bJ = 0.6;
   public static final double bK = 0.8;
   public static final double bL = 1.33;
   private static final ajx<jr<cht>> bM = akb.a(chs.class, ajz.x);
   private static final ajx<Boolean> bN = akb.a(chs.class, ajz.k);
   private static final ajx<Boolean> bO = akb.a(chs.class, ajz.k);
   private static final ajx<Integer> bP = akb.a(chs.class, ajz.b);
   private static final akt<cht> bQ = cht.c;
   @Nullable
   private chs.a<cpr> bR;
   @Nullable
   private cee bS;
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private boolean bX;
   private float bY;
   private float bZ;

   public chs(bvi<? extends chs> $$0, dgz $$1) {
      super($$0, $$1);
      this.gK();
   }

   @Override
   protected void D() {
      this.bS = new chs.c(this, 0.6, $$0 -> $$0.a(awy.ah), true);
      this.bC.a(1, new ccq(this));
      this.bC.a(1, new bwv.a(1.5));
      this.bC.a(2, new ceb(this));
      this.bC.a(3, new chs.b(this));
      this.bC.a(4, this.bS);
      this.bC.a(5, new ccj(this, 1.1, 8));
      this.bC.a(6, new ccu(this, 1.0, 10.0F, 5.0F));
      this.bC.a(7, new cck(this, 0.8));
      this.bC.a(8, new cdc(this, 0.3F));
      this.bC.a(9, new cdm(this));
      this.bC.a(10, new cci(this, 0.8));
      this.bC.a(11, new cej(this, 0.8, 1.0000001E-5F));
      this.bC.a(12, new cde(this, cpr.class, 10.0F));
      this.bD.a(1, new ces<>(this, cil.class, false, null));
      this.bD.a(1, new ces<>(this, cit.class, false, cit.bF));
   }

   public jr<cht> gE() {
      return this.al.a(bM);
   }

   public void j(jr<cht> $$0) {
      this.al.a(bM, $$0);
   }

   public void z(boolean $$0) {
      this.al.a(bN, $$0);
   }

   public boolean gF() {
      return this.al.a(bN);
   }

   void A(boolean $$0) {
      this.al.a(bO, $$0);
   }

   boolean gL() {
      return this.al.a(bO);
   }

   public cwe gG() {
      return cwe.a(this.al.a(bP));
   }

   private void a(cwe $$0) {
      this.al.a(bP, $$0.a());
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bM, mb.ai.b(bQ));
      $$0.a(bN, false);
      $$0.a(bO, false);
      $$0.a(bP, cwe.o.a());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("variant", this.gE().e().orElse(bQ).a().toString());
      $$0.a("CollarColor", (byte)this.gG().a());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(aku.c($$0.l("variant"))).map($$0x -> akt.a(mc.l, $$0x)).flatMap(mb.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwe.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(ard $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bwk.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bwk.a);
            this.h(true);
         } else {
            this.b(bwk.a);
            this.h(false);
         }
      } else {
         this.b(bwk.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avz u() {
      if (this.q()) {
         if (this.gC()) {
            return awa.dZ;
         } else {
            return this.ae.a(4) == 0 ? awa.ea : awa.dS;
         }
      } else {
         return awa.dT;
      }
   }

   @Override
   public int S() {
      return 120;
   }

   public void gH() {
      this.b(awa.dW);
   }

   @Override
   protected avz e(btp $$0) {
      return awa.dY;
   }

   @Override
   protected avz l_() {
      return awa.dU;
   }

   public static bxf.a gI() {
      return chp.gx().a(bxg.s, 10.0).a(bxg.v, 0.3F).a(bxg.c, 3.0);
   }

   @Override
   protected void gy() {
      this.a(awa.dV, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.bS != null && this.bS.i() && !this.q() && this.af % 100 == 0) {
         this.a(awa.dX, 1.0F, 1.0F);
      }

      this.gM();
   }

   private void gM() {
      if ((this.gF() || this.gL()) && this.af % 5 == 0) {
         this.a(awa.dZ, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gN();
      this.gO();
      this.bX = false;
      if (this.gF()) {
         ji $$0 = this.du();

         for (cpr $$2 : this.dU().a(cpr.class, new fbs($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fT()) {
               this.bX = true;
               break;
            }
         }
      }
   }

   public boolean gJ() {
      return this.bX;
   }

   private void gN() {
      this.bU = this.bT;
      this.bW = this.bV;
      if (this.gF()) {
         this.bT = Math.min(1.0F, this.bT + 0.15F);
         this.bV = Math.min(1.0F, this.bV + 0.08F);
      } else {
         this.bT = Math.max(0.0F, this.bT - 0.22F);
         this.bV = Math.max(0.0F, this.bV - 0.13F);
      }
   }

   private void gO() {
      this.bZ = this.bY;
      if (this.gL()) {
         this.bY = Math.min(1.0F, this.bY + 0.1F);
      } else {
         this.bY = Math.max(0.0F, this.bY - 0.13F);
      }
   }

   public float K(float $$0) {
      return ayz.h($$0, this.bU, this.bT);
   }

   public float L(float $$0) {
      return ayz.h($$0, this.bW, this.bV);
   }

   public float M(float $$0) {
      return ayz.h($$0, this.bZ, this.bY);
   }

   @Nullable
   public chs b(ard $$0, buq $$1) {
      chs $$2 = bvi.u.a($$0, bvh.e);
      if ($$2 != null && $$1 instanceof chs $$3) {
         if (this.ae.h()) {
            $$2.j(this.gE());
         } else {
            $$2.j($$3.gE());
         }

         if (this.q()) {
            $$2.a(this.W_());
            $$2.a(true, true);
            cwe $$4 = this.gG();
            cwe $$5 = $$3.gG();
            $$2.a(cwe.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(chp $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof chs $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.as() > 0.9F;
      axf<cht> $$5 = $$4 ? awq.b : awq.a;
      mb.ai.a($$5, $$0.C_()).ifPresent(this::j);
      ard $$6 = $$0.a();
      if ($$6.b().a(this.du(), axb.o).b()) {
         this.j(mb.ai.b(cht.l));
         this.ga();
      }

      return $$3;
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      cxd $$3 = $$2.h();
      if (this.q()) {
         if (this.k($$0)) {
            if ($$3 instanceof cwf $$4) {
               cwe $$5 = $$4.b();
               if ($$5 != this.gG()) {
                  if (!this.dU().w_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.ga();
                  }

                  return bsy.a;
               }
            } else if (this.j($$2) && this.eE() < this.eS()) {
               if (!this.dU().w_()) {
                  this.a($$0, $$1, $$2);
                  cst $$6 = $$2.a(kv.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gy();
               }

               return bsy.a;
            }

            bsy $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gs());
               return bsy.a;
            }

            return $$7;
         }
      } else if (this.j($$2)) {
         if (!this.dU().w_()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.ga();
            this.gy();
         }

         return bsy.a;
      }

      bsy $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.ga();
      }

      return $$8;
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ah);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.af > 2400;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      super.a($$0, $$1);
      this.gK();
   }

   protected void gK() {
      if (this.bR == null) {
         this.bR = new chs.a<>(this, cpr.class, 16.0F, 0.8, 1.33);
      }

      this.bC.a(this.bR);
      if (!this.q()) {
         this.bC.a(4, this.bR);
      }
   }

   private void f(cpr $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.y(true);
         this.dU().a(this, (byte)7);
      } else {
         this.dU().a(this, (byte)6);
      }
   }

   @Override
   public boolean cd() {
      return this.ch() || super.cd();
   }

   static class a<T extends bvy> extends ccd<T> {
      private final chs i;

      public a(chs $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvg.e::test);
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

   static class b extends ccw {
      private final chs a;
      @Nullable
      private cpr b;
      @Nullable
      private ji c;
      private int d;

      public b(chs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gs()) {
            return false;
         } else {
            bvy $$0 = this.a.ae_();
            if ($$0 instanceof cpr $$1) {
               this.b = $$1;
               if (!$$0.fT()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               ji $$2 = this.b.du();
               dxq $$3 = this.a.dU().a_($$2);
               if ($$3.a(awp.T)) {
                  this.c = $$3.d(djx.e).map($$1x -> $$2.a($$1x.g())).orElseGet(() -> new ji($$2));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (chs $$1 : this.a.dU().a(chs.class, new fbs(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gF() || $$1.gL())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gs() && this.b != null && this.b.fT() && this.c != null && !this.h();
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
         if (this.b.gr() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dU().C_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.O().m();
      }

      private void i() {
         azh $$0 = this.a.dX();
         ji.a $$1 = new ji.a();
         $$1.g(this.a.O_() ? this.a.C().du() : this.a.du());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.du());
         this.a
            .a(
               a(this.a),
               ewk.aq,
               ($$1x, $$2) -> $$1x.b(
                     new clw(
                        $$1x,
                        (double)$$1.u() - (double)ayz.a(this.a.aV * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)ayz.b(this.a.aV * (float) (Math.PI / 180.0)),
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

   static class c extends cee {
      @Nullable
      private cpr c;
      private final chs d;

      public c(chs $$0, double $$1, Predicate<cxh> $$2, boolean $$3) {
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
