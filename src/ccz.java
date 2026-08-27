import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ccz extends cbb {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bY;
   protected static final ImmutableList<bzz<? extends bzy<? super ccz>>> e = ImmutableList.of(bzz.c, bzz.d, bzz.f, bzz.s);
   protected static final ImmutableList<bys<?>> bX = ImmutableList.of(bys.n, bys.h, bys.m, bys.E, bys.t, bys.K, bys.P, bys.R, bys.O, bys.r, bys.Z);

   public ccz(bpd<? extends cbb> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new bvr(this, 85, 10, 0.02F, 0.1F, true);
      this.bN = new bvq(this, 10);
   }

   @Override
   protected bza b(cxb $$0) {
      return new bzc(this, $$0);
   }

   @Override
   protected bqq.b<ccz> dQ() {
      return bqq.a(bX, e);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return cda.a(this.dQ().a($$0));
   }

   @Override
   public bqq<ccz> dP() {
      return (bqq<ccz>)super.dP();
   }

   @Override
   protected atx go() {
      return aty.yV;
   }

   @Override
   protected void Y() {
      this.dM().ae().a("tadpoleBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("tadpoleActivityUpdate");
      cda.a(this);
      this.dM().ae().c();
      super.Y();
   }

   public static bqv.a gp() {
      return bpr.A().a(bqw.r, 1.0).a(bqw.q, 6.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dM().B) {
         this.t(this.bY + 1);
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Age", this.bY);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected atx v() {
      return null;
   }

   @Nullable
   @Override
   protected atx d(bnw $$0) {
      return aty.yX;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.yU;
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bnd.a(this.dM().B);
      } else {
         return cbg.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   public boolean s() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cqm $$0) {
      cbg.a(this, $$0);
      ta $$1 = $$0.x();
      $$1.a("Age", this.gq());
   }

   @Override
   public void c(ta $$0) {
      cbg.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cqm b() {
      return new cqm(cqp.qJ);
   }

   @Override
   public atx y() {
      return aty.dm;
   }

   private boolean o(cqm $$0) {
      return ccw.bX.a($$0);
   }

   private void a(ciu $$0, cqm $$1) {
      this.b($$0, $$1);
      this.c(bos.d_(this.gs()));
      this.dM().a(kc.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(ciu $$0, cqm $$1) {
      $$1.a(1, $$0);
   }

   private int gq() {
      return this.bY;
   }

   private void c(int $$0) {
      this.t(this.bY + $$0 * 20);
   }

   private void t(int $$0) {
      this.bY = $$0;
      if (this.bY >= b) {
         this.gr();
      }
   }

   private void gr() {
      if (this.dM() instanceof apf $$0) {
         ccw $$1 = bpd.S.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), bpt.i, null);
            $$1.t(this.gd());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fS();
            this.a(aty.yW, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gs() {
      return Math.max(0, b - this.bY);
   }

   @Override
   public boolean ee() {
      return false;
   }
}
