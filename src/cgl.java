import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgl extends cel {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int cb;
   protected static final ImmutableList<cdj<? extends cdi<? super cgl>>> e = ImmutableList.of(cdj.c, cdj.d, cdj.f, cdj.s);
   protected static final ImmutableList<ccc<?>> ca = ImmutableList.of(ccc.n, ccc.h, ccc.m, ccc.E, ccc.t, ccc.K, ccc.P, ccc.R, ccc.O, ccc.r, ccc.Z);

   public cgl(bsj<? extends cel> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new bzb(this, 85, 10, 0.02F, 0.1F, true);
      this.bQ = new bza(this, 10);
   }

   @Override
   protected cck b(dcd $$0) {
      return new ccm(this, $$0);
   }

   @Override
   protected bua.b<cgl> dU() {
      return bua.a(ca, e);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return cgm.a(this.dU().a($$0));
   }

   @Override
   public bua<cgl> dT() {
      return (bua<cgl>)super.dT();
   }

   @Override
   protected ave go() {
      return avf.zu;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("tadpoleBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("tadpoleActivityUpdate");
      cgm.a(this);
      this.dP().ag().c();
      super.Z();
   }

   public static buf.a gp() {
      return bta.A().a(bug.v, 1.0).a(bug.s, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.s(this.cb + 1);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Age", this.cb);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected ave v() {
      return null;
   }

   @Nullable
   @Override
   protected ave d(bqw $$0) {
      return avf.zw;
   }

   @Nullable
   @Override
   protected ave o_() {
      return avf.zt;
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqd.a(this.dP().B);
      } else {
         return ceq.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cua $$0) {
      ceq.a(this, $$0);
      cwo.a(kn.N, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void c(tx $$0) {
      ceq.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cua b() {
      return new cua(cud.qK);
   }

   @Override
   public ave y() {
      return avf.dn;
   }

   private boolean o(cua $$0) {
      return $$0.a(awd.al);
   }

   private void a(cmh $$0, cua $$1) {
      this.b($$0, $$1);
      this.c(brx.d_(this.gs()));
      this.dP().a(lj.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cmh $$0, cua $$1) {
      $$1.a(1, $$0);
   }

   private int gq() {
      return this.cb;
   }

   private void c(int $$0) {
      this.s(this.cb + $$0 * 20);
   }

   private void s(int $$0) {
      this.cb = $$0;
      if (this.cb >= b) {
         this.gr();
      }
   }

   private void gr() {
      if (this.dP() instanceof aqk $$0) {
         cgi $$1 = bsj.R.a(this.dP());
         if ($$1 != null) {
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.a($$0, this.dP().d_($$1.dp()), btc.i, null);
            $$1.t(this.gc());
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            $$1.fQ();
            this.a(avf.zv, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ao();
         }
      }
   }

   private int gs() {
      return Math.max(0, b - this.cb);
   }

   @Override
   public boolean ee() {
      return false;
   }
}
