import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgz extends cez {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int cb;
   protected static final ImmutableList<cdx<? extends cdw<? super cgz>>> e = ImmutableList.of(cdx.c, cdx.d, cdx.f, cdx.s);
   protected static final ImmutableList<ccq<?>> ca = ImmutableList.of(ccq.n, ccq.h, ccq.m, ccq.E, ccq.t, ccq.K, ccq.P, ccq.R, ccq.O, ccq.r, ccq.Z);

   public cgz(bsw<? extends cez> $$0, dcu $$1) {
      super($$0, $$1);
      this.bR = new bzp(this, 85, 10, 0.02F, 0.1F, true);
      this.bQ = new bzo(this, 10);
   }

   @Override
   protected ccy b(dcu $$0) {
      return new cda(this, $$0);
   }

   @Override
   protected buo.b<cgz> dV() {
      return buo.a(ca, e);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return cha.a(this.dV().a($$0));
   }

   @Override
   public buo<cgz> dU() {
      return (buo<cgz>)super.dU();
   }

   @Override
   protected avn gn() {
      return avo.zu;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("tadpoleBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("tadpoleActivityUpdate");
      cha.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   public static but.a go() {
      return btn.A().a(buu.v, 1.0).a(buu.s, 6.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dQ().B) {
         this.s(this.cb + 1);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Age", this.cb);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avn v() {
      return null;
   }

   @Nullable
   @Override
   protected avn d(brj $$0) {
      return avo.zw;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.zt;
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqq.a(this.dQ().B);
      } else {
         return cfe.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cuo $$0) {
      cfe.a(this, $$0);
      cxf.a(kq.N, $$0, $$0x -> $$0x.a("Age", this.gp()));
   }

   @Override
   public void c(ua $$0) {
      cfe.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cuo b() {
      return new cuo(cur.qK);
   }

   @Override
   public avn x() {
      return avo.dn;
   }

   private boolean o(cuo $$0) {
      return $$0.a(awm.al);
   }

   private void a(cmv $$0, cuo $$1) {
      this.b($$0, $$1);
      this.c(bsk.d_(this.gr()));
      this.dQ().a(lm.O, this.d(1.0), this.dy() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cmv $$0, cuo $$1) {
      $$1.a(1, $$0);
   }

   private int gp() {
      return this.cb;
   }

   private void c(int $$0) {
      this.s(this.cb + $$0 * 20);
   }

   private void s(int $$0) {
      this.cb = $$0;
      if (this.cb >= b) {
         this.gq();
      }
   }

   private void gq() {
      if (this.dQ() instanceof aqt $$0) {
         cgw $$1 = bsw.R.a(this.dQ());
         if ($$1 != null) {
            $$1.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
            $$1.a($$0, this.dQ().d_($$1.dq()), btp.i, null);
            $$1.c(this.gb());
            if (this.ai()) {
               $$1.b(this.aj());
               $$1.p(this.cF());
            }

            $$1.fP();
            $$1.a(this.a(this.at()));
            this.a(avo.zv, 0.15F, 1.0F);
            $$0.a_($$1);
            this.aq();
         }
      }
   }

   private int gr() {
      return Math.max(0, b - this.cb);
   }

   @Override
   public boolean ef() {
      return false;
   }
}
