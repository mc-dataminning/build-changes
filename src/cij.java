import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cij extends bxn {
   public static final double bI = 0.6;
   public static final double bJ = 0.8;
   public static final double bK = 1.33;
   private static final akg<js<cik>> bL = akk.a(cij.class, aki.x);
   private static final akg<Boolean> bM = akk.a(cij.class, aki.k);
   private static final akg<Boolean> bN = akk.a(cij.class, aki.k);
   private static final akg<Integer> bO = akk.a(cij.class, aki.b);
   private static final alc<cik> bP = cik.d;
   @Nullable
   private cij.a<cqi> bQ;
   @Nullable
   private cev bR;
   private float bS;
   private float bT;
   private float bU;
   private float bV;
   private boolean bW;
   private float bX;
   private float bY;

   public cij(bwb<? extends cij> $$0, dhp $$1) {
      super($$0, $$1);
      this.gI();
   }

   @Override
   protected void D() {
      this.bR = new cij.c(this, 0.6, $$0 -> $$0.a(axi.ah), true);
      this.bB.a(1, new cdh(this));
      this.bB.a(1, new bxn.a(1.5));
      this.bB.a(2, new ces(this));
      this.bB.a(3, new cij.b(this));
      this.bB.a(4, this.bR);
      this.bB.a(5, new cda(this, 1.1, 8));
      this.bB.a(6, new cdl(this, 1.0, 10.0F, 5.0F));
      this.bB.a(7, new cdb(this, 0.8));
      this.bB.a(8, new cdt(this, 0.3F));
      this.bB.a(9, new ced(this));
      this.bB.a(10, new ccz(this, 0.8));
      this.bB.a(11, new cfa(this, 0.8, 1.0000001E-5F));
      this.bB.a(12, new cdv(this, cqi.class, 10.0F));
      this.bC.a(1, new cfj<>(this, cjc.class, false, null));
      this.bC.a(1, new cfj<>(this, cjk.class, false, cjk.bE));
   }

   public js<cik> gC() {
      return this.al.a(bL);
   }

   private void j(js<cik> $$0) {
      this.al.a(bL, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      if ($$0 == kx.aJ) {
         return b((kw<T>)$$0, this.gC());
      } else {
         return $$0 == kx.aK ? b((kw<T>)$$0, this.gE()) : super.a($$0);
      }
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aJ);
      this.a($$0, kx.aK);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aJ) {
         this.j(b(kx.aJ, $$1));
         return true;
      } else if ($$0 == kx.aK) {
         this.a(b(kx.aK, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   public void z(boolean $$0) {
      this.al.a(bM, $$0);
   }

   public boolean gD() {
      return this.al.a(bM);
   }

   void A(boolean $$0) {
      this.al.a(bN, $$0);
   }

   boolean gJ() {
      return this.al.a(bN);
   }

   public cwv gE() {
      return cwv.a(this.al.a(bO));
   }

   private void a(cwv $$0) {
      this.al.a(bO, $$0.a());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bL, md.ai.b(bP));
      $$0.a(bM, false);
      $$0.a(bN, false);
      $$0.a(bO, cwv.o.a());
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("variant", this.gC().e().orElse(bP).a().toString());
      $$0.a("CollarColor", (byte)this.gE().a());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      Optional.ofNullable(ald.c($$0.l("variant"))).map($$0x -> alc.a(me.l, $$0x)).flatMap(md.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwv.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(arn $$0) {
      if (this.L().b()) {
         double $$1 = this.L().c();
         if ($$1 == 0.6) {
            this.b(bxd.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bxd.a);
            this.h(true);
         } else {
            this.b(bxd.a);
            this.h(false);
         }
      } else {
         this.b(bxd.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awj u() {
      if (this.q()) {
         if (this.gA()) {
            return awk.dZ;
         } else {
            return this.ae.a(4) == 0 ? awk.ea : awk.dS;
         }
      } else {
         return awk.dT;
      }
   }

   @Override
   public int S() {
      return 120;
   }

   public void gF() {
      this.b(awk.dW);
   }

   @Override
   protected awj e(buh $$0) {
      return awk.dY;
   }

   @Override
   protected awj l_() {
      return awk.dU;
   }

   public static bxw.a gG() {
      return cig.gv().a(bxx.s, 10.0).a(bxx.v, 0.3F).a(bxx.c, 3.0);
   }

   @Override
   protected void gw() {
      this.a(awk.dV, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.bR != null && this.bR.i() && !this.q() && this.af % 100 == 0) {
         this.a(awk.dX, 1.0F, 1.0F);
      }

      this.gK();
   }

   private void gK() {
      if ((this.gD() || this.gJ()) && this.af % 5 == 0) {
         this.a(awk.dZ, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gL();
      this.gM();
      this.bW = false;
      if (this.gD()) {
         jj $$0 = this.dv();

         for (cqi $$2 : this.dV().a(cqi.class, new fcp($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fQ()) {
               this.bW = true;
               break;
            }
         }
      }
   }

   public boolean gH() {
      return this.bW;
   }

   private void gL() {
      this.bT = this.bS;
      this.bV = this.bU;
      if (this.gD()) {
         this.bS = Math.min(1.0F, this.bS + 0.15F);
         this.bU = Math.min(1.0F, this.bU + 0.08F);
      } else {
         this.bS = Math.max(0.0F, this.bS - 0.22F);
         this.bU = Math.max(0.0F, this.bU - 0.13F);
      }
   }

   private void gM() {
      this.bY = this.bX;
      if (this.gJ()) {
         this.bX = Math.min(1.0F, this.bX + 0.1F);
      } else {
         this.bX = Math.max(0.0F, this.bX - 0.13F);
      }
   }

   public float K(float $$0) {
      return azk.h($$0, this.bT, this.bS);
   }

   public float L(float $$0) {
      return azk.h($$0, this.bV, this.bU);
   }

   public float M(float $$0) {
      return azk.h($$0, this.bY, this.bX);
   }

   @Nullable
   public cij b(arn $$0, bvi $$1) {
      cij $$2 = bwb.u.a($$0, bwa.e);
      if ($$2 != null && $$1 instanceof cij $$3) {
         if (this.ae.h()) {
            $$2.j(this.gC());
         } else {
            $$2.j($$3.gC());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cwv $$4 = this.gE();
            cwv $$5 = $$3.gE();
            $$2.a(cwv.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cig $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cij $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.as() > 0.9F;
      axp<cik> $$5 = $$4 ? axa.b : axa.a;
      md.ai.a($$5, $$0.C_()).ifPresent(this::j);
      arn $$6 = $$0.a();
      if ($$6.b().a(this.dv(), axl.o).b()) {
         this.j(md.ai.b(cik.m));
         this.fY();
      }

      return $$3;
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      cxu $$3 = $$2.h();
      if (this.q()) {
         if (this.k($$0)) {
            if ($$3 instanceof cww $$4) {
               cwv $$5 = $$4.b();
               if ($$5 != this.gE()) {
                  if (!this.dV().w_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fY();
                  }

                  return btq.a;
               }
            } else if (this.k($$2) && this.eF() < this.eT()) {
               if (!this.dV().w_()) {
                  this.a($$0, $$1, $$2);
                  ctk $$6 = $$2.a(kx.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gw();
               }

               return btq.a;
            }

            btq $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gq());
               return btq.a;
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

         return btq.a;
      }

      btq $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fY();
      }

      return $$8;
   }

   @Override
   public boolean k(cxy $$0) {
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
      if (this.bQ == null) {
         this.bQ = new cij.a<>(this, cqi.class, 16.0F, 0.8, 1.33);
      }

      this.bB.a(this.bQ);
      if (!this.q()) {
         this.bB.a(4, this.bQ);
      }
   }

   private void f(cqi $$0) {
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

   static class a<T extends bwr> extends ccu<T> {
      private final cij i;

      public a(cij $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvz.e::test);
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

   static class b extends cdn {
      private final cij a;
      @Nullable
      private cqi b;
      @Nullable
      private jj c;
      private int d;

      public b(cij $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gq()) {
            return false;
         } else {
            bwr $$0 = this.a.e();
            if ($$0 instanceof cqi $$1) {
               this.b = $$1;
               if (!$$0.fQ()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jj $$2 = this.b.dv();
               dym $$3 = this.a.dV().a_($$2);
               if ($$3.a(awz.T)) {
                  this.c = $$3.d(dkn.e).map($$1x -> $$2.a($$1x.g())).orElseGet(() -> new jj($$2));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cij $$1 : this.a.dV().a(cij.class, new fcp(this.c).g(2.0))) {
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
         azs $$0 = this.a.dY();
         jj.a $$1 = new jj.a();
         $$1.g(this.a.O_() ? this.a.C().dv() : this.a.dv());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dv());
         this.a
            .a(
               a(this.a),
               exh.aq,
               ($$1x, $$2) -> $$1x.b(
                     new cmn(
                        $$1x,
                        (double)$$1.u() - (double)azk.a(this.a.aU * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)azk.b(this.a.aU * (float) (Math.PI / 180.0)),
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

   static class c extends cev {
      @Nullable
      private cqi c;
      private final cij d;

      public c(cij $$0, double $$1, Predicate<cxy> $$2, boolean $$3) {
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
