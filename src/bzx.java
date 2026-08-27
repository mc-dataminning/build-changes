import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bzx extends bxz {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bV;
   protected static final ImmutableList<bwx<? extends bww<? super bzx>>> e = ImmutableList.of(bwx.c, bwx.d, bwx.f, bwx.s);
   protected static final ImmutableList<bvq<?>> bU = ImmutableList.of(bvq.n, bvq.h, bvq.m, bvq.E, bvq.t, bvq.K, bvq.P, bvq.R, bvq.O, bvq.r, bvq.Z);

   public bzx(bmc<? extends bxz> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new bsp(this, 85, 10, 0.02F, 0.1F, true);
      this.bL = new bso(this, 10);
   }

   @Override
   protected bvy b(ctx $$0) {
      return new bwa(this, $$0);
   }

   @Override
   protected bno.b<bzx> dO() {
      return bno.a(bU, e);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return bzy.a(this.dO().a($$0));
   }

   @Override
   public bno<bzx> dN() {
      return (bno<bzx>)super.dN();
   }

   @Override
   protected ars gg() {
      return art.yM;
   }

   @Override
   protected void aa() {
      this.dL().af().a("tadpoleBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      this.dL().af().a("tadpoleActivityUpdate");
      bzy.a(this);
      this.dL().af().c();
      super.aa();
   }

   public static bnt.a gh() {
      return bmq.C().a(bnu.o, 1.0).a(bnu.n, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dL().B) {
         this.s(this.bV + 1);
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Age", this.bV);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected ars y() {
      return null;
   }

   @Nullable
   @Override
   protected ars d(bkv $$0) {
      return art.yO;
   }

   @Nullable
   @Override
   protected ars n_() {
      return art.yL;
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bkc.a(this.dL().B);
      } else {
         return bye.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cng $$0) {
      bye.a(this, $$0);
      so $$1 = $$0.w();
      $$1.a("Age", this.gi());
   }

   @Override
   public void c(so $$0) {
      bye.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cng b() {
      return new cng(cnj.qJ);
   }

   @Override
   public ars A() {
      return art.de;
   }

   private boolean m(cng $$0) {
      return bzu.bU.a($$0);
   }

   private void a(cfq $$0, cng $$1) {
      this.b($$0, $$1);
      this.c(blr.d_(this.gk()));
      this.dL().a(jx.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cfq $$0, cng $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   private int gi() {
      return this.bV;
   }

   private void c(int $$0) {
      this.s(this.bV + $$0 * 20);
   }

   private void s(int $$0) {
      this.bV = $$0;
      if (this.bV >= b) {
         this.gj();
      }
   }

   private void gj() {
      if (this.dL() instanceof ane $$0) {
         bzu $$1 = bmc.Q.a(this.dL());
         if ($$1 != null) {
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.a($$0, this.dL().d_($$1.dl()), bms.i, null, null);
            $$1.t(this.fV());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fK();
            this.a(art.yN, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gk() {
      return Math.max(0, b - this.bV);
   }

   @Override
   public boolean ec() {
      return false;
   }
}
