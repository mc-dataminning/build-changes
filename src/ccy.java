import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ccy extends cba {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bY;
   protected static final ImmutableList<bzy<? extends bzx<? super ccy>>> e = ImmutableList.of(bzy.c, bzy.d, bzy.f, bzy.s);
   protected static final ImmutableList<byr<?>> bX = ImmutableList.of(byr.n, byr.h, byr.m, byr.E, byr.t, byr.K, byr.P, byr.R, byr.O, byr.r, byr.Z);

   public ccy(bpc<? extends cba> $$0, cwz $$1) {
      super($$0, $$1);
      this.bO = new bvq(this, 85, 10, 0.02F, 0.1F, true);
      this.bN = new bvp(this, 10);
   }

   @Override
   protected byz b(cwz $$0) {
      return new bzb(this, $$0);
   }

   @Override
   protected bqp.b<ccy> dQ() {
      return bqp.a(bX, e);
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      return ccz.a(this.dQ().a($$0));
   }

   @Override
   public bqp<ccy> dP() {
      return (bqp<ccy>)super.dP();
   }

   @Override
   protected atx go() {
      return aty.yQ;
   }

   @Override
   protected void Y() {
      this.dM().ae().a("tadpoleBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("tadpoleActivityUpdate");
      ccz.a(this);
      this.dM().ae().c();
      super.Y();
   }

   public static bqu.a gp() {
      return bpq.A().a(bqv.r, 1.0).a(bqv.q, 6.0);
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
   protected atx d(bnv $$0) {
      return aty.yS;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.yP;
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bnc.a(this.dM().B);
      } else {
         return cbf.a($$0, $$1, this).orElse(super.b($$0, $$1));
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
   public void n(cqk $$0) {
      cbf.a(this, $$0);
      ta $$1 = $$0.x();
      $$1.a("Age", this.gq());
   }

   @Override
   public void c(ta $$0) {
      cbf.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cqk b() {
      return new cqk(cqn.qJ);
   }

   @Override
   public atx y() {
      return aty.di;
   }

   private boolean o(cqk $$0) {
      return ccv.bX.a($$0);
   }

   private void a(cis $$0, cqk $$1) {
      this.b($$0, $$1);
      this.c(bor.d_(this.gs()));
      this.dM().a(kc.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cis $$0, cqk $$1) {
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
         ccv $$1 = bpc.R.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), bps.i, null);
            $$1.t(this.gd());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fS();
            this.a(aty.yR, 0.15F, 1.0F);
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
