import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cir extends bxv {
   public static final double bJ = 0.6;
   public static final double bK = 0.8;
   public static final double bL = 1.33;
   private static final akh<je<cis>> bM = akl.a(cir.class, akj.x);
   private static final akh<Boolean> bN = akl.a(cir.class, akj.k);
   private static final akh<Boolean> bO = akl.a(cir.class, akj.k);
   private static final akh<Integer> bP = akl.a(cir.class, akj.b);
   private static final ald<cis> bQ = cit.b;
   @Nullable
   private cir.a<cqs> bR;
   @Nullable
   private cfd bS;
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private boolean bX;
   private float bY;
   private float bZ;

   public cir(bwj<? extends cir> $$0, dip $$1) {
      super($$0, $$1);
      this.gI();
   }

   @Override
   protected void D() {
      this.bS = new cir.c(this, 0.6, $$0 -> $$0.a(axi.ah), true);
      this.bC.a(1, new cdp(this));
      this.bC.a(1, new bxv.a(1.5));
      this.bC.a(2, new cfa(this));
      this.bC.a(3, new cir.b(this));
      this.bC.a(4, this.bS);
      this.bC.a(5, new cdi(this, 1.1, 8));
      this.bC.a(6, new cdt(this, 1.0, 10.0F, 5.0F));
      this.bC.a(7, new cdj(this, 0.8));
      this.bC.a(8, new ceb(this, 0.3F));
      this.bC.a(9, new cel(this));
      this.bC.a(10, new cdh(this, 0.8));
      this.bC.a(11, new cfi(this, 0.8, 1.0000001E-5F));
      this.bC.a(12, new ced(this, cqs.class, 10.0F));
      this.bD.a(1, new cfr<>(this, cjk.class, false, null));
      this.bD.a(1, new cfr<>(this, cjs.class, false, cjs.bF));
   }

   public je<cis> gC() {
      return this.al.a(bM);
   }

   private void j(je<cis> $$0) {
      this.al.a(bM, $$0);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      if ($$0 == kj.aM) {
         return c((ki<T>)$$0, this.gC());
      } else {
         return $$0 == kj.aN ? c((ki<T>)$$0, this.gE()) : super.a($$0);
      }
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aM);
      this.a($$0, kj.aN);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aM) {
         this.j(c(kj.aM, $$1));
         return true;
      } else if ($$0 == kj.aN) {
         this.a(c(kj.aN, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void z(boolean $$0) {
      this.al.a(bN, $$0);
   }

   public boolean gD() {
      return this.al.a(bN);
   }

   void A(boolean $$0) {
      this.al.a(bO, $$0);
   }

   boolean gJ() {
      return this.al.a(bO);
   }

   public cxq gE() {
      return cxq.a(this.al.a(bP));
   }

   private void a(cxq $$0) {
      this.al.a(bP, $$0.a());
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bM, cta.a(this.dX(), bQ));
      $$0.a(bN, false);
      $$0.a(bO, false);
      $$0.a(bP, cxq.o.a());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cta.a($$0, this.gC());
      $$0.a("CollarColor", (byte)this.gE().a());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      cta.a($$0, this.dX(), mg.aH).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cxq.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(aro $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bxl.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bxl.a);
            this.h(true);
         } else {
            this.b(bxl.a);
            this.h(false);
         }
      } else {
         this.b(bxl.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awk u() {
      if (this.q()) {
         if (this.gA()) {
            return awl.dZ;
         } else {
            return this.ae.a(4) == 0 ? awl.ea : awl.dS;
         }
      } else {
         return awl.dT;
      }
   }

   @Override
   public int S() {
      return 120;
   }

   public void gF() {
      this.b(awl.dW);
   }

   @Override
   protected awk e(bup $$0) {
      return awl.dY;
   }

   @Override
   protected awk l_() {
      return awl.dU;
   }

   public static bye.a gG() {
      return cio.gv().a(byf.s, 10.0).a(byf.v, 0.3F).a(byf.c, 3.0);
   }

   @Override
   protected void gw() {
      this.a(awl.dV, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.bS != null && this.bS.i() && !this.q() && this.af % 100 == 0) {
         this.a(awl.dX, 1.0F, 1.0F);
      }

      this.gK();
   }

   private void gK() {
      if ((this.gD() || this.gJ()) && this.af % 5 == 0) {
         this.a(awl.dZ, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gL();
      this.gM();
      this.bX = false;
      if (this.gD()) {
         iu $$0 = this.dv();

         for (cqs $$2 : this.dV().a(cqs.class, new fdr($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fQ()) {
               this.bX = true;
               break;
            }
         }
      }
   }

   public boolean gH() {
      return this.bX;
   }

   private void gL() {
      this.bU = this.bT;
      this.bW = this.bV;
      if (this.gD()) {
         this.bT = Math.min(1.0F, this.bT + 0.15F);
         this.bV = Math.min(1.0F, this.bV + 0.08F);
      } else {
         this.bT = Math.max(0.0F, this.bT - 0.22F);
         this.bV = Math.max(0.0F, this.bV - 0.13F);
      }
   }

   private void gM() {
      this.bZ = this.bY;
      if (this.gJ()) {
         this.bY = Math.min(1.0F, this.bY + 0.1F);
      } else {
         this.bY = Math.max(0.0F, this.bY - 0.13F);
      }
   }

   public float J(float $$0) {
      return azk.h($$0, this.bU, this.bT);
   }

   public float K(float $$0) {
      return azk.h($$0, this.bW, this.bV);
   }

   public float L(float $$0) {
      return azk.h($$0, this.bZ, this.bY);
   }

   @Nullable
   public cir b(aro $$0, bvq $$1) {
      cir $$2 = bwj.u.a($$0, bwi.e);
      if ($$2 != null && $$1 instanceof cir $$3) {
         if (this.ae.h()) {
            $$2.j(this.gC());
         } else {
            $$2.j($$3.gC());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cxq $$4 = this.gE();
            cxq $$5 = $$3.gE();
            $$2.a(cxq.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cio $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cir $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      cit.a(this.ae, this.dX(), csx.a($$0, this.dv())).ifPresent(this::j);
      return $$3;
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      cyo $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cxr $$4) {
               cxq $$5 = $$4.a();
               if ($$5 != this.gE()) {
                  if (!this.dV().w_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fY();
                  }

                  return bty.a;
               }
            } else if (this.k($$2) && this.eF() < this.eT()) {
               if (!this.dV().w_()) {
                  this.a($$0, $$1, $$2);
                  cuh $$6 = $$2.a(kj.v);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gw();
               }

               return bty.a;
            }

            bty $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gq());
               return bty.a;
            }

            return $$7;
         }
      } else if (this.k($$2)) {
         if (!this.dV().w_()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.fY();
            this.gw();
         }

         return bty.a;
      }

      bty $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fY();
      }

      return $$8;
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.ah);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.af > 2400;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      super.a($$0, $$1);
      this.gI();
   }

   protected void gI() {
      if (this.bR == null) {
         this.bR = new cir.a<>(this, cqs.class, 16.0F, 0.8, 1.33);
      }

      this.bC.a(this.bR);
      if (!this.q()) {
         this.bC.a(4, this.bR);
      }
   }

   private void f(cqs $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.y(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bwz> extends cdc<T> {
      private final cir i;

      public a(cir $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bwh.e::test);
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

   static class b extends cdv {
      private final cir a;
      @Nullable
      private cqs b;
      @Nullable
      private iu c;
      private int d;

      public b(cir $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gq()) {
            return false;
         } else {
            bwz $$0 = this.a.e();
            if ($$0 instanceof cqs $$1) {
               this.b = $$1;
               if (!$$0.fQ()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               iu $$2 = this.b.dv();
               dzo $$3 = this.a.dV().a_($$2);
               if ($$3.a(axa.T)) {
                  this.c = $$3.d(dln.e).map($$1x -> $$2.a($$1x.g())).orElseGet(() -> new iu($$2));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cir $$1 : this.a.dV().a(cir.class, new fdr(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gD() || $$1.gJ())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gq() && this.b != null && this.b.fQ() && this.c != null && !this.h();
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
         if (this.b.go() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dV().C_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.O().m();
      }

      private void i() {
         azt $$0 = this.a.dY();
         iu.a $$1 = new iu.a();
         $$1.g(this.a.O_() ? this.a.C().dv() : this.a.dv());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dv());
         this.a
            .a(
               a(this.a),
               eyj.aq,
               ($$1x, $$2) -> $$1x.b(
                     new cmx(
                        $$1x,
                        (double)$$1.u() - (double)azk.a(this.a.aV * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)azk.b(this.a.aV * (float) (Math.PI / 180.0)),
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

   static class c extends cfd {
      @Nullable
      private cqs c;
      private final cir d;

      public c(cir $$0, double $$1, Predicate<cys> $$2, boolean $$3) {
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
