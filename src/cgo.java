import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgo extends ceo {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int cb;
   protected static final ImmutableList<cdm<? extends cdl<? super cgo>>> e = ImmutableList.of(cdm.c, cdm.d, cdm.f, cdm.s);
   protected static final ImmutableList<ccf<?>> ca = ImmutableList.of(ccf.n, ccf.h, ccf.m, ccf.E, ccf.t, ccf.K, ccf.P, ccf.R, ccf.O, ccf.r, ccf.Z);

   public cgo(bsm<? extends ceo> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new bze(this, 85, 10, 0.02F, 0.1F, true);
      this.bQ = new bzd(this, 10);
   }

   @Override
   protected ccn b(dcf $$0) {
      return new ccp(this, $$0);
   }

   @Override
   protected bud.b<cgo> dV() {
      return bud.a(ca, e);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return cgp.a(this.dV().a($$0));
   }

   @Override
   public bud<cgo> dU() {
      return (bud<cgo>)super.dU();
   }

   @Override
   protected avg gp() {
      return avh.zu;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("tadpoleBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("tadpoleActivityUpdate");
      cgp.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   public static bui.a gq() {
      return btd.A().a(buj.v, 1.0).a(buj.s, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dQ().B) {
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
   protected avg d(bqz $$0) {
      return avh.zw;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.zt;
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqg.a(this.dQ().B);
      } else {
         return cet.a($$0, $$1, this).orElse(super.b($$0, $$1));
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
   public void n(cuc $$0) {
      cet.a(this, $$0);
      cwq.a(kn.N, $$0, $$0x -> $$0x.a("Age", this.gr()));
   }

   @Override
   public void c(tx $$0) {
      cet.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cuc b() {
      return new cuc(cuf.qK);
   }

   @Override
   public avg y() {
      return avh.dn;
   }

   private boolean o(cuc $$0) {
      return $$0.a(awf.al);
   }

   private void a(cmk $$0, cuc $$1) {
      this.b($$0, $$1);
      this.c(bsa.d_(this.gt()));
      this.dQ().a(lj.O, this.d(1.0), this.dy() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cmk $$0, cuc $$1) {
      $$1.a(1, $$0);
   }

   private int gr() {
      return this.cb;
   }

   private void c(int $$0) {
      this.s(this.cb + $$0 * 20);
   }

   private void s(int $$0) {
      this.cb = $$0;
      if (this.cb >= b) {
         this.gs();
      }
   }

   private void gs() {
      if (this.dQ() instanceof aqm $$0) {
         cgl $$1 = bsm.R.a(this.dQ());
         if ($$1 != null) {
            $$1.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
            $$1.a($$0, this.dQ().d_($$1.dq()), btf.i, null);
            $$1.t(this.gd());
            if (this.ah()) {
               $$1.b(this.ai());
               $$1.o(this.cF());
            }

            $$1.fR();
            $$1.a(this.a(this.as()));
            this.a(avh.zv, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ap();
         }
      }
   }

   private int gt() {
      return Math.max(0, b - this.cb);
   }

   @Override
   public boolean ef() {
      return false;
   }
}
