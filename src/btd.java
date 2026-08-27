import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class btd extends bri {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bqg<? extends bqf<? super btd>>> e = ImmutableList.of(bqg.c, bqg.d, bqg.f, bqg.r);
   protected static final ImmutableList<bpb<?>> bT = ImmutableList.of(bpb.n, bpb.h, bpb.m, bpb.E, bpb.t, bpb.J, bpb.O, bpb.Q, bpb.N, bpb.r, bpb.Y);

   public btd(bfn<? extends bri> $$0, cmm $$1) {
      super($$0, $$1);
      this.bL = new bma(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new blz(this, 10);
   }

   @Override
   protected bpj b(cmm $$0) {
      return new bpl(this, $$0);
   }

   @Override
   protected bha.b<btd> dL() {
      return bha.a(bT, e);
   }

   @Override
   protected bha<?> a(Dynamic<?> $$0) {
      return bte.a(this.dL().a($$0));
   }

   @Override
   public bha<btd> dK() {
      return (bha<btd>)super.dK();
   }

   @Override
   protected amg fZ() {
      return amh.xB;
   }

   @Override
   protected void W() {
      this.dI().ad().a("tadpoleBrain");
      this.dK().a((aif)this.dI(), this);
      this.dI().ad().c();
      this.dI().ad().a("tadpoleActivityUpdate");
      bte.a(this);
      this.dI().ad().c();
      super.W();
   }

   public static bhf.a ga() {
      return bgb.y().a(bhg.d, 1.0).a(bhg.a, 6.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dI().B) {
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
   protected amg s() {
      return null;
   }

   @Nullable
   @Override
   protected amg d(ben $$0) {
      return amh.xD;
   }

   @Nullable
   @Override
   protected amg g_() {
      return amh.xA;
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bdx.a(this.dI().B);
      } else {
         return brn.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void V() {
      super.V();
      za.a(this);
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cfz $$0) {
      brn.a(this, $$0);
      qr $$1 = $$0.w();
      $$1.a("Age", this.gb());
   }

   @Override
   public void c(qr $$0) {
      brn.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cfz b() {
      return new cfz(cgc.pW);
   }

   @Override
   public amg w() {
      return amh.cG;
   }

   private boolean m(cfz $$0) {
      return bta.bT.a($$0);
   }

   private void a(byo $$0, cfz $$1) {
      this.b($$0, $$1);
      this.c(bfe.d_(this.gd()));
      this.dI().a(iv.K, this.d(1.0), this.dq() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(byo $$0, cfz $$1) {
      if (!$$0.fO().d) {
         $$1.h(1);
      }
   }

   private int gb() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gc();
      }
   }

   private void gc() {
      if (this.dI() instanceof aif $$0) {
         bta $$1 = bfn.O.a(this.dI());
         if ($$1 != null) {
            $$1.b(this.dn(), this.dp(), this.dt(), this.dy(), this.dA());
            $$1.a($$0, this.dI().d_($$1.di()), bgd.i, null, null);
            $$1.t(this.fQ());
            if (this.aa()) {
               $$1.b(this.ab());
               $$1.n(this.cy());
            }

            $$1.fF();
            this.a(amh.xC, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ai();
         }
      }
   }

   private int gd() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean dY() {
      return false;
   }
}
