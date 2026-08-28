import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgp extends cep {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int cb;
   protected static final ImmutableList<cdn<? extends cdm<? super cgp>>> e = ImmutableList.of(cdn.c, cdn.d, cdn.f, cdn.s);
   protected static final ImmutableList<ccg<?>> ca = ImmutableList.of(ccg.n, ccg.h, ccg.m, ccg.E, ccg.t, ccg.K, ccg.P, ccg.R, ccg.O, ccg.r, ccg.Z);

   public cgp(bsn<? extends cep> $$0, dcg $$1) {
      super($$0, $$1);
      this.bR = new bzf(this, 85, 10, 0.02F, 0.1F, true);
      this.bQ = new bze(this, 10);
   }

   @Override
   protected cco b(dcg $$0) {
      return new ccq(this, $$0);
   }

   @Override
   protected bue.b<cgp> dW() {
      return bue.a(ca, e);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return cgq.a(this.dW().a($$0));
   }

   @Override
   public bue<cgp> dV() {
      return (bue<cgp>)super.dV();
   }

   @Override
   protected avg go() {
      return avh.zu;
   }

   @Override
   protected void Z() {
      this.dR().ag().a("tadpoleBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
      this.dR().ag().a("tadpoleActivityUpdate");
      cgq.a(this);
      this.dR().ag().c();
      super.Z();
   }

   public static buj.a gp() {
      return bte.A().a(buk.v, 1.0).a(buk.s, 6.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dR().B) {
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
   protected avg v() {
      return null;
   }

   @Nullable
   @Override
   protected avg d(bra $$0) {
      return avh.zw;
   }

   @Nullable
   @Override
   protected avg n_() {
      return avh.zt;
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqh.a(this.dR().B);
      } else {
         return ceu.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cud $$0) {
      ceu.a(this, $$0);
      cwr.a(kn.N, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void c(tx $$0) {
      ceu.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cud b() {
      return new cud(cug.qK);
   }

   @Override
   public avg x() {
      return avh.dn;
   }

   private boolean o(cud $$0) {
      return $$0.a(awf.al);
   }

   private void a(cml $$0, cud $$1) {
      this.b($$0, $$1);
      this.c(bsb.d_(this.gs()));
      this.dR().a(lj.O, this.d(1.0), this.dz() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cml $$0, cud $$1) {
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
      if (this.dR() instanceof aqm $$0) {
         cgm $$1 = bsn.R.a(this.dR());
         if ($$1 != null) {
            $$1.b(this.dw(), this.dy(), this.dC(), this.dH(), this.dJ());
            $$1.a($$0, this.dR().d_($$1.dr()), btg.i, null);
            $$1.c(this.gc());
            if (this.ai()) {
               $$1.b(this.aj());
               $$1.p(this.cG());
            }

            $$1.fQ();
            $$1.a(this.a(this.at()));
            this.a(avh.zv, 0.15F, 1.0F);
            $$0.a_($$1);
            this.aq();
         }
      }
   }

   private int gs() {
      return Math.max(0, b - this.cb);
   }

   @Override
   public boolean eg() {
      return false;
   }
}
