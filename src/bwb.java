import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bwb extends bug {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bte<? extends btd<? super bwb>>> e = ImmutableList.of(bte.c, bte.d, bte.f, bte.r);
   protected static final ImmutableList<brz<?>> bT = ImmutableList.of(brz.n, brz.h, brz.m, brz.E, brz.t, brz.J, brz.O, brz.Q, brz.N, brz.r, brz.Y);

   public bwb(bim<? extends bug> $$0, cpl $$1) {
      super($$0, $$1);
      this.bL = new boy(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new box(this, 10);
   }

   @Override
   protected bsh b(cpl $$0) {
      return new bsj(this, $$0);
   }

   @Override
   protected bjy.b<bwb> dN() {
      return bjy.a(bT, e);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return bwc.a(this.dN().a($$0));
   }

   @Override
   public bjy<bwb> dM() {
      return (bjy<bwb>)super.dM();
   }

   @Override
   protected aov gb() {
      return aow.xH;
   }

   @Override
   protected void V() {
      this.dK().ad().a("tadpoleBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("tadpoleActivityUpdate");
      bwc.a(this);
      this.dK().ad().c();
      super.V();
   }

   public static bkd.a gc() {
      return bja.x().a(bke.d, 1.0).a(bke.a, 6.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected aov r() {
      return null;
   }

   @Nullable
   @Override
   protected aov d(bhg $$0) {
      return aow.xJ;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.xG;
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bgq.a(this.dK().B);
      } else {
         return bul.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cix $$0) {
      bul.a(this, $$0);
      qr $$1 = $$0.w();
      $$1.a("Age", this.gd());
   }

   @Override
   public void c(qr $$0) {
      bul.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cix b() {
      return new cix(cja.pW);
   }

   @Override
   public aov t() {
      return aow.cG;
   }

   private boolean m(cix $$0) {
      return bvy.bT.a($$0);
   }

   private void a(cbm $$0, cix $$1) {
      this.b($$0, $$1);
      this.c(bid.d_(this.gf()));
      this.dK().a(iv.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cbm $$0, cix $$1) {
      if (!$$0.fR().d) {
         $$1.h(1);
      }
   }

   private int gd() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.ge();
      }
   }

   private void ge() {
      if (this.dK() instanceof akk $$0) {
         bvy $$1 = bim.O.a(this.dK());
         if ($$1 != null) {
            $$1.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$1.a($$0, this.dK().d_($$1.dk()), bjc.i, null, null);
            $$1.t(this.fQ());
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            $$1.fF();
            this.a(aow.xI, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ak();
         }
      }
   }

   private int gf() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean ea() {
      return false;
   }
}
