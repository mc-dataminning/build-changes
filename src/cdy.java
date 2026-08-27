import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cdy extends cca {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bY;
   protected static final ImmutableList<cay<? extends cax<? super cdy>>> e = ImmutableList.of(cay.c, cay.d, cay.f, cay.s);
   protected static final ImmutableList<bzr<?>> bX = ImmutableList.of(bzr.n, bzr.h, bzr.m, bzr.E, bzr.t, bzr.K, bzr.P, bzr.R, bzr.O, bzr.r, bzr.Z);

   public cdy(bqb<? extends cca> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new bwq(this, 85, 10, 0.02F, 0.1F, true);
      this.bN = new bwp(this, 10);
   }

   @Override
   protected bzz b(cyx $$0) {
      return new cab(this, $$0);
   }

   @Override
   protected brp.b<cdy> dQ() {
      return brp.a(bX, e);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cdz.a(this.dQ().a($$0));
   }

   @Override
   public brp<cdy> dP() {
      return (brp<cdy>)super.dP();
   }

   @Override
   protected aul go() {
      return aum.yY;
   }

   @Override
   protected void Y() {
      this.dM().af().a("tadpoleBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("tadpoleActivityUpdate");
      cdz.a(this);
      this.dM().af().c();
      super.Y();
   }

   public static bru.a gp() {
      return bqq.A().a(brv.r, 1.0).a(brv.q, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B) {
         this.t(this.bY + 1);
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Age", this.bY);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected aul v() {
      return null;
   }

   @Nullable
   @Override
   protected aul d(bot $$0) {
      return aum.za;
   }

   @Nullable
   @Override
   protected aul o_() {
      return aum.yX;
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return boa.a(this.dM().B);
      } else {
         return ccf.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(crj $$0) {
      ccf.a(this, $$0);
      ctt.a(jp.E, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void c(tm $$0) {
      ccf.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public crj b() {
      return new crj(crm.qJ);
   }

   @Override
   public aul y() {
      return aum.dn;
   }

   private boolean o(crj $$0) {
      return cdv.bX.a($$0);
   }

   private void a(cjt $$0, crj $$1) {
      this.b($$0, $$1);
      this.c(bpp.d_(this.gs()));
      this.dM().a(kl.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cjt $$0, crj $$1) {
      $$1.a(1, $$0);
   }

   private int gq() {
      return this.bY;
   }

   private void c(int $$0) {
      this.t(this.bY + $$0 * 20);
   }

   private void t(int $$0) {
      this.bY = $$0;
      if (this.bY >= b) {
         this.gr();
      }
   }

   private void gr() {
      if (this.dM() instanceof aps $$0) {
         cdv $$1 = bqb.R.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), bqs.i, null);
            $$1.t(this.gd());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fS();
            this.a(aum.yZ, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gs() {
      return Math.max(0, b - this.bY);
   }

   @Override
   public boolean ee() {
      return false;
   }
}
