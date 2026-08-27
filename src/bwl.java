import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bwl extends buq {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bto<? extends btn<? super bwl>>> e = ImmutableList.of(bto.c, bto.d, bto.f, bto.r);
   protected static final ImmutableList<bsj<?>> bT = ImmutableList.of(bsj.n, bsj.h, bsj.m, bsj.E, bsj.t, bsj.J, bsj.O, bsj.Q, bsj.N, bsj.r, bsj.Y);

   public bwl(biw<? extends buq> $$0, cpx $$1) {
      super($$0, $$1);
      this.bL = new bpi(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bph(this, 10);
   }

   @Override
   protected bsr b(cpx $$0) {
      return new bst(this, $$0);
   }

   @Override
   protected bki.b<bwl> dO() {
      return bki.a(bT, e);
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return bwm.a(this.dO().a($$0));
   }

   @Override
   public bki<bwl> dN() {
      return (bki<bwl>)super.dN();
   }

   @Override
   protected ape ge() {
      return apf.xH;
   }

   @Override
   protected void X() {
      this.dL().ad().a("tadpoleBrain");
      this.dN().a((aks)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("tadpoleActivityUpdate");
      bwm.a(this);
      this.dL().ad().c();
      super.X();
   }

   public static bkn.a gf() {
      return bjk.A().a(bko.d, 1.0).a(bko.a, 6.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected ape w() {
      return null;
   }

   @Nullable
   @Override
   protected ape d(bhq $$0) {
      return apf.xJ;
   }

   @Nullable
   @Override
   protected ape l_() {
      return apf.xG;
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bha.a(this.dL().B);
      } else {
         return buv.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cjh $$0) {
      buv.a(this, $$0);
      qy $$1 = $$0.w();
      $$1.a("Age", this.gg());
   }

   @Override
   public void c(qy $$0) {
      buv.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cjh b() {
      return new cjh(cjk.pW);
   }

   @Override
   public ape y() {
      return apf.cG;
   }

   private boolean m(cjh $$0) {
      return bwi.bT.a($$0);
   }

   private void a(cbw $$0, cjh $$1) {
      this.b($$0, $$1);
      this.c(bin.d_(this.gi()));
      this.dL().a(ix.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cbw $$0, cjh $$1) {
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
      if (this.dL() instanceof aks $$0) {
         bwi $$1 = biw.O.a(this.dL());
         if ($$1 != null) {
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.a($$0, this.dL().d_($$1.dl()), bjm.i, null, null);
            $$1.t(this.fT());
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            $$1.fI();
            this.a(apf.xI, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ak();
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
