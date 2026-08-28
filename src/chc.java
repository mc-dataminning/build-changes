import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chc extends cfc {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bZ;
   protected static final ImmutableList<cea<? extends cdz<? super chc>>> e = ImmutableList.of(cea.c, cea.d, cea.f, cea.s);
   protected static final ImmutableList<cct<?>> bY = ImmutableList.of(cct.n, cct.h, cct.m, cct.E, cct.t, cct.K, cct.P, cct.R, cct.O, cct.r, cct.Z);

   public chc(bta<? extends cfc> $$0, dby $$1) {
      super($$0, $$1);
      this.bP = new bzs(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bzr(this, 10);
   }

   @Override
   protected cdb b(dby $$0) {
      return new cdd(this, $$0);
   }

   @Override
   protected bur.b<chc> dT() {
      return bur.a(bY, e);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return chd.a(this.dT().a($$0));
   }

   @Override
   public bur<chc> dS() {
      return (bur<chc>)super.dS();
   }

   @Override
   protected avz gr() {
      return awa.zr;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("tadpoleBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("tadpoleActivityUpdate");
      chd.a(this);
      this.dP().ag().c();
      super.Z();
   }

   public static buw.a gs() {
      return btr.A().a(bux.r, 1.0).a(bux.q, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.t(this.bZ + 1);
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Age", this.bZ);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avz v() {
      return null;
   }

   @Nullable
   @Override
   protected avz d(brn $$0) {
      return awa.zt;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.zq;
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqu.a(this.dP().B);
      } else {
         return cfh.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cup $$0) {
      cfh.a(this, $$0);
      cxe.a(km.N, $$0, $$0x -> $$0x.a("Age", this.gt()));
   }

   @Override
   public void c(us $$0) {
      cfh.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cup b() {
      return new cup(cus.qK);
   }

   @Override
   public avz y() {
      return awa.dn;
   }

   private boolean o(cup $$0) {
      return $$0.a(awy.al);
   }

   private void a(cmx $$0, cup $$1) {
      this.b($$0, $$1);
      this.c(bso.d_(this.gv()));
      this.dP().a(li.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cmx $$0, cup $$1) {
      $$1.a(1, $$0);
   }

   private int gt() {
      return this.bZ;
   }

   private void c(int $$0) {
      this.t(this.bZ + $$0 * 20);
   }

   private void t(int $$0) {
      this.bZ = $$0;
      if (this.bZ >= b) {
         this.gu();
      }
   }

   private void gu() {
      if (this.dP() instanceof arf $$0) {
         cgz $$1 = bta.R.a(this.dP());
         if ($$1 != null) {
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.a($$0, this.dP().d_($$1.dp()), btt.i, null);
            $$1.t(this.gg());
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            $$1.fU();
            this.a(awa.zs, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ao();
         }
      }
   }

   private int gv() {
      return Math.max(0, b - this.bZ);
   }

   @Override
   public boolean eh() {
      return false;
   }
}
