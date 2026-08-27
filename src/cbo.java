import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cbo extends bzq {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<byo<? extends byn<? super cbo>>> e = ImmutableList.of(byo.c, byo.d, byo.f, byo.s);
   protected static final ImmutableList<bxh<?>> bT = ImmutableList.of(bxh.n, bxh.h, bxh.m, bxh.E, bxh.t, bxh.K, bxh.P, bxh.R, bxh.O, bxh.r, bxh.Z);

   public cbo(bnu<? extends bzq> $$0, cvn $$1) {
      super($$0, $$1);
      this.bL = new bug(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new buf(this, 10);
   }

   @Override
   protected bxp b(cvn $$0) {
      return new bxr(this, $$0);
   }

   @Override
   protected bpf.b<cbo> dP() {
      return bpf.a(bT, e);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cbp.a(this.dP().a($$0));
   }

   @Override
   public bpf<cbo> dO() {
      return (bpf<cbo>)super.dO();
   }

   @Override
   protected atj gh() {
      return atk.yM;
   }

   @Override
   protected void aa() {
      this.dM().af().a("tadpoleBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("tadpoleActivityUpdate");
      cbp.a(this);
      this.dM().af().c();
      super.aa();
   }

   public static bpk.a gi() {
      return boi.C().a(bpl.o, 1.0).a(bpl.n, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.t(this.bU + 1);
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected atj y() {
      return null;
   }

   @Nullable
   @Override
   protected atj d(bmn $$0) {
      return atk.yO;
   }

   @Nullable
   @Override
   protected atj n_() {
      return atk.yL;
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return blu.a(this.dM().B);
      } else {
         return bzv.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(coz $$0) {
      bzv.a(this, $$0);
      sw $$1 = $$0.x();
      $$1.a("Age", this.gj());
   }

   @Override
   public void c(sw $$0) {
      bzv.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public coz b() {
      return new coz(cpc.qJ);
   }

   @Override
   public atj A() {
      return atk.de;
   }

   private boolean m(coz $$0) {
      return cbl.bT.a($$0);
   }

   private void a(chh $$0, coz $$1) {
      this.b($$0, $$1);
      this.c(bnj.d_(this.gl()));
      this.dM().a(jz.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(chh $$0, coz $$1) {
      if (!$$0.fU().d) {
         $$1.h(1);
      }
   }

   private int gj() {
      return this.bU;
   }

   private void c(int $$0) {
      this.t(this.bU + $$0 * 20);
   }

   private void t(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gk();
      }
   }

   private void gk() {
      if (this.dM() instanceof aov $$0) {
         cbl $$1 = bnu.Q.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), bok.i, null, null);
            $$1.t(this.fW());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fL();
            this.a(atk.yN, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gl() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean ed() {
      return false;
   }
}
