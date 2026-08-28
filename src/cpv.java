import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpv extends coz {
   private static final int bI = 20;
   private static final int bJ = 1;
   private static final int bK = 20;
   private static final int bL = 3;
   private static final int bM = 5;
   private static final int bN = 10;
   private static final float bO = 3.0F;
   private static final int bP = 1;
   private static final int bQ = 80;
   public bwk a = new bwk();
   public bwk b = new bwk();
   public bwk c = new bwk();
   public bwk d = new bwk();
   public bwk e = new bwk();
   public bwk f = new bwk();
   private int bR = 0;
   private int bS = 0;
   private static final cst bT = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, awp.cF, $$1.dm(), 1.0F, 1.0F);
      cst.b.deflect($$0, $$1, $$2);
   };

   public static byz.a j() {
      return bxw.E().a(bza.v, 0.63F).a(bza.s, 30.0).a(bza.m, 24.0).a(bza.c, 3.0);
   }

   public cpv(bxc<? extends coz> $$0, djx $$1) {
      super($$0, $$1);
      this.a(eyf.z, -1.0F);
      this.a(eyf.o, -1.0F);
      this.bA = 10;
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cpw.a(this, this.ed().a($$0));
   }

   @Override
   public byu<cpv> ec() {
      return (byu<cpv>)super.ec();
   }

   @Override
   protected byu.b<cpv> ed() {
      return byu.a(cpw.f, cpw.e);
   }

   @Override
   public void a(akl<?> $$0) {
      if (this.dV().A_() && aq.equals($$0)) {
         this.gu();
         byg $$1 = this.at();
         switch ($$1) {
            case q:
               this.e.b(this.af);
               break;
            case r:
               this.f.b(this.af);
               break;
            case p:
               this.b.b(this.af);
         }
      }

      super.a($$0);
   }

   private void gu() {
      this.e.a();
      this.a.a();
      this.f.a();
      this.d.a();
   }

   @Override
   public void h() {
      byg $$0 = this.at();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.m().b(1 + this.dY().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.af);
            this.n();
      }

      this.a.b(this.af);
      if ($$0 != byg.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.bS = this.bS == 0 ? this.ae.a(1, 80) : this.bS - 1;
      if (this.bS == 0) {
         this.q();
      }

      super.h();
   }

   public cpv m() {
      this.bR = 0;
      return this;
   }

   public void n() {
      if (++this.bR <= 5) {
         ebe $$0 = !this.dw().l() ? this.dw() : this.bs();
         ffq $$1 = this.dy();
         ffq $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new lq(ly.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bY()) {
         ffq $$1 = this.cR().f();
         ffq $$2 = new ffq($$1.d, this.dt().e, $$1.f);
         ebe $$3 = !this.dw().l() ? this.dw() : this.bs();
         if ($$3.o() != dtp.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dV().a(new lq(ly.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void T() {
      if (this.f() == null || !this.aH()) {
         this.dV().a(this, this.u(), this.dm(), 1.0F, 1.0F);
      }
   }

   @Override
   public void q() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dV().a(this, awp.cP, this.dm(), $$1, $$0);
   }

   @Override
   public cst a(css $$0) {
      if ($$0.an() != bxc.t && $$0.an() != bxc.bI) {
         return this.an().a(axh.r) ? bT : cst.a;
      } else {
         return cst.a;
      }
   }

   @Override
   public awq dm() {
      return awq.f;
   }

   @Override
   protected awo l_() {
      return awp.cN;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.cO;
   }

   @Override
   protected awo u() {
      return this.aH() ? awp.cH : awp.cI;
   }

   public Optional<bxu> t() {
      return this.ec().c(cgw.y).map(bvi::d).filter($$0 -> $$0 instanceof bxu).map($$0 -> (bxu)$$0);
   }

   public boolean l(ffq $$0) {
      ffq $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("breezeBrain");
      this.ec().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cpw.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a((bxu)this);
      ago.a(this);
   }

   @Override
   public boolean a(bxc<?> $$0) {
      return $$0 == bxc.bT || $$0 == bxc.aq;
   }

   @Override
   public int af() {
      return 30;
   }

   @Override
   public int ah() {
      return 25;
   }

   public double x() {
      return this.dC() + (double)(this.dr() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(ars $$0, bvi $$1) {
      return $$1.d() instanceof cpv || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(double $$0, float $$1, bvi $$2) {
      if ($$0 > 3.0) {
         this.a(awp.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.c;
   }

   @Nullable
   @Override
   public bxu f() {
      return this.Q();
   }
}
