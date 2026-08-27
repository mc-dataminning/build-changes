import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgb extends ceb {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bZ;
   protected static final ImmutableList<ccz<? extends ccy<? super cgb>>> e = ImmutableList.of(ccz.c, ccz.d, ccz.f, ccz.s);
   protected static final ImmutableList<cbs<?>> bY = ImmutableList.of(cbs.n, cbs.h, cbs.m, cbs.E, cbs.t, cbs.K, cbs.P, cbs.R, cbs.O, cbs.r, cbs.Z);

   public cgb(bsa<? extends ceb> $$0, dax $$1) {
      super($$0, $$1);
      this.bP = new byr(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new byq(this, 10);
   }

   @Override
   protected cca b(dax $$0) {
      return new ccc(this, $$0);
   }

   @Override
   protected btq.b<cgb> dT() {
      return btq.a(bY, e);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return cgc.a(this.dT().a($$0));
   }

   @Override
   public btq<cgb> dS() {
      return (btq<cgb>)super.dS();
   }

   @Override
   protected avg gq() {
      return avh.zr;
   }

   @Override
   protected void Y() {
      this.dP().af().a("tadpoleBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("tadpoleActivityUpdate");
      cgc.a(this);
      this.dP().af().c();
      super.Y();
   }

   public static btv.a gr() {
      return bsq.A().a(btw.r, 1.0).a(btw.q, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.t(this.bZ + 1);
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Age", this.bZ);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avg v() {
      return null;
   }

   @Nullable
   @Override
   protected avg d(bqn $$0) {
      return avh.zt;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.zq;
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bpu.a(this.dP().B);
      } else {
         return ceg.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cto $$0) {
      ceg.a(this, $$0);
      cwd.a(kb.M, $$0, $$0x -> $$0x.a("Age", this.gs()));
   }

   @Override
   public void c(ud $$0) {
      ceg.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cto b() {
      return new cto(ctr.qK);
   }

   @Override
   public avg y() {
      return avh.dn;
   }

   private boolean o(cto $$0) {
      return $$0.a(awe.al);
   }

   private void a(clw $$0, cto $$1) {
      this.b($$0, $$1);
      this.c(bro.d_(this.gu()));
      this.dP().a(ky.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(clw $$0, cto $$1) {
      $$1.a(1, $$0);
   }

   private int gs() {
      return this.bZ;
   }

   private void c(int $$0) {
      this.t(this.bZ + $$0 * 20);
   }

   private void t(int $$0) {
      this.bZ = $$0;
      if (this.bZ >= b) {
         this.gt();
      }
   }

   private void gt() {
      if (this.dP() instanceof aqm $$0) {
         cfy $$1 = bsa.R.a(this.dP());
         if ($$1 != null) {
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.a($$0, this.dP().d_($$1.dp()), bss.i, null);
            $$1.t(this.gf());
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            $$1.fT();
            this.a(avh.zs, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ao();
         }
      }
   }

   private int gu() {
      return Math.max(0, b - this.bZ);
   }

   @Override
   public boolean eh() {
      return false;
   }
}
