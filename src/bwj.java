import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bwj extends buo {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<btm<? extends btl<? super bwj>>> e = ImmutableList.of(btm.c, btm.d, btm.f, btm.r);
   protected static final ImmutableList<bsh<?>> bT = ImmutableList.of(bsh.n, bsh.h, bsh.m, bsh.E, bsh.t, bsh.J, bsh.O, bsh.Q, bsh.N, bsh.r, bsh.Y);

   public bwj(biu<? extends buo> $$0, cpv $$1) {
      super($$0, $$1);
      this.bL = new bpg(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bpf(this, 10);
   }

   @Override
   protected bsp b(cpv $$0) {
      return new bsr(this, $$0);
   }

   @Override
   protected bkg.b<bwj> dO() {
      return bkg.a(bT, e);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return bwk.a(this.dO().a($$0));
   }

   @Override
   public bkg<bwj> dN() {
      return (bkg<bwj>)super.dN();
   }

   @Override
   protected apd ge() {
      return ape.xH;
   }

   @Override
   protected void Y() {
      this.dL().ad().a("tadpoleBrain");
      this.dN().a((akr)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("tadpoleActivityUpdate");
      bwk.a(this);
      this.dL().ad().c();
      super.Y();
   }

   public static bkl.a gf() {
      return bji.A().a(bkm.d, 1.0).a(bkm.a, 6.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected apd w() {
      return null;
   }

   @Nullable
   @Override
   protected apd d(bho $$0) {
      return ape.xJ;
   }

   @Nullable
   @Override
   protected apd l_() {
      return ape.xG;
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bgy.a(this.dL().B);
      } else {
         return but.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void X() {
      super.X();
      abc.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cjf $$0) {
      but.a(this, $$0);
      qx $$1 = $$0.w();
      $$1.a("Age", this.gg());
   }

   @Override
   public void c(qx $$0) {
      but.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cjf b() {
      return new cjf(cji.pW);
   }

   @Override
   public apd y() {
      return ape.cG;
   }

   private boolean m(cjf $$0) {
      return bwg.bT.a($$0);
   }

   private void a(cbu $$0, cjf $$1) {
      this.b($$0, $$1);
      this.c(bil.d_(this.gi()));
      this.dL().a(ix.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cbu $$0, cjf $$1) {
      if (!$$0.fS().d) {
         $$1.h(1);
      }
   }

   private int gg() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gh();
      }
   }

   private void gh() {
      if (this.dL() instanceof akr $$0) {
         bwg $$1 = biu.O.a(this.dL());
         if ($$1 != null) {
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.a($$0, this.dL().d_($$1.dl()), bjk.i, null, null);
            $$1.t(this.fT());
            if (this.ad()) {
               $$1.b(this.ae());
               $$1.n(this.cB());
            }

            $$1.fI();
            this.a(ape.xI, 0.15F, 1.0F);
            $$0.a_($$1);
            this.al();
         }
      }
   }

   private int gi() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean eb() {
      return false;
   }
}
