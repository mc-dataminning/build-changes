import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgd extends ced {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bZ;
   protected static final ImmutableList<cdb<? extends cda<? super cgd>>> e = ImmutableList.of(cdb.c, cdb.d, cdb.f, cdb.s);
   protected static final ImmutableList<cbu<?>> bY = ImmutableList.of(cbu.n, cbu.h, cbu.m, cbu.E, cbu.t, cbu.K, cbu.P, cbu.R, cbu.O, cbu.r, cbu.Z);

   public cgd(bsc<? extends ced> $$0, daz $$1) {
      super($$0, $$1);
      this.bP = new byt(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bys(this, 10);
   }

   @Override
   protected ccc b(daz $$0) {
      return new cce(this, $$0);
   }

   @Override
   protected bts.b<cgd> dT() {
      return bts.a(bY, e);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cge.a(this.dT().a($$0));
   }

   @Override
   public bts<cgd> dS() {
      return (bts<cgd>)super.dS();
   }

   @Override
   protected avh gq() {
      return avi.zr;
   }

   @Override
   protected void Y() {
      this.dP().af().a("tadpoleBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("tadpoleActivityUpdate");
      cge.a(this);
      this.dP().af().c();
      super.Y();
   }

   public static btx.a gr() {
      return bss.A().a(bty.r, 1.0).a(bty.q, 6.0);
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
   protected avh v() {
      return null;
   }

   @Nullable
   @Override
   protected avh d(bqp $$0) {
      return avi.zt;
   }

   @Nullable
   @Override
   protected avh o_() {
      return avi.zq;
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bpw.a(this.dP().B);
      } else {
         return cei.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(ctq $$0) {
      cei.a(this, $$0);
      cwf.a(kb.M, $$0, $$0x -> $$0x.a("Age", this.gs()));
   }

   @Override
   public void c(ud $$0) {
      cei.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public ctq b() {
      return new ctq(ctt.qK);
   }

   @Override
   public avh y() {
      return avi.dn;
   }

   private boolean o(ctq $$0) {
      return $$0.a(awf.al);
   }

   private void a(cly $$0, ctq $$1) {
      this.b($$0, $$1);
      this.c(brq.d_(this.gu()));
      this.dP().a(ky.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cly $$0, ctq $$1) {
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
      if (this.dP() instanceof aqn $$0) {
         cga $$1 = bsc.R.a(this.dP());
         if ($$1 != null) {
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.a($$0, this.dP().d_($$1.dp()), bsu.i, null);
            $$1.t(this.gf());
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            $$1.fT();
            this.a(avi.zs, 0.15F, 1.0F);
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
