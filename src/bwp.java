import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bwp extends buu {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bts<? extends btr<? super bwp>>> e = ImmutableList.of(bts.c, bts.d, bts.f, bts.r);
   protected static final ImmutableList<bsn<?>> bT = ImmutableList.of(bsn.n, bsn.h, bsn.m, bsn.E, bsn.t, bsn.J, bsn.O, bsn.Q, bsn.N, bsn.r, bsn.Y);

   public bwp(bja<? extends buu> $$0, cqb $$1) {
      super($$0, $$1);
      this.bL = new bpm(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bpl(this, 10);
   }

   @Override
   protected bsv b(cqb $$0) {
      return new bsx(this, $$0);
   }

   @Override
   protected bkm.b<bwp> dO() {
      return bkm.a(bT, e);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return bwq.a(this.dO().a($$0));
   }

   @Override
   public bkm<bwp> dN() {
      return (bkm<bwp>)super.dN();
   }

   @Override
   protected apf gf() {
      return apg.xH;
   }

   @Override
   protected void X() {
      this.dL().ad().a("tadpoleBrain");
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("tadpoleActivityUpdate");
      bwq.a(this);
      this.dL().ad().c();
      super.X();
   }

   public static bkr.a gg() {
      return bjo.A().a(bks.m, 1.0).a(bks.l, 6.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected apf w() {
      return null;
   }

   @Nullable
   @Override
   protected apf d(bhu $$0) {
      return apg.xJ;
   }

   @Nullable
   @Override
   protected apf l_() {
      return apg.xG;
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bhe.a(this.dL().B);
      } else {
         return buz.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void W() {
      super.W();
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
   public void l(cjl $$0) {
      buz.a(this, $$0);
      qw $$1 = $$0.w();
      $$1.a("Age", this.gh());
   }

   @Override
   public void c(qw $$0) {
      buz.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cjl b() {
      return new cjl(cjo.pW);
   }

   @Override
   public apf y() {
      return apg.cG;
   }

   private boolean m(cjl $$0) {
      return bwm.bT.a($$0);
   }

   private void a(cca $$0, cjl $$1) {
      this.b($$0, $$1);
      this.c(bir.d_(this.gj()));
      this.dL().a(iv.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cca $$0, cjl $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   private int gh() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gi();
      }
   }

   private void gi() {
      if (this.dL() instanceof akt $$0) {
         bwm $$1 = bja.O.a(this.dL());
         if ($$1 != null) {
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.a($$0, this.dL().d_($$1.dl()), bjq.i, null, null);
            $$1.t(this.fU());
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            $$1.fJ();
            this.a(apg.xI, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ak();
         }
      }
   }

   private int gj() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean eb() {
      return false;
   }
}
