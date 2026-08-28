import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chd extends cfd {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bZ;
   protected static final ImmutableList<ceb<? extends cea<? super chd>>> e = ImmutableList.of(ceb.c, ceb.d, ceb.f, ceb.s);
   protected static final ImmutableList<ccu<?>> bY = ImmutableList.of(ccu.n, ccu.h, ccu.m, ccu.E, ccu.t, ccu.K, ccu.P, ccu.R, ccu.O, ccu.r, ccu.Z);

   public chd(btb<? extends cfd> $$0, dbz $$1) {
      super($$0, $$1);
      this.bP = new bzt(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bzs(this, 10);
   }

   @Override
   protected cdc b(dbz $$0) {
      return new cde(this, $$0);
   }

   @Override
   protected bus.b<chd> dT() {
      return bus.a(bY, e);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return che.a(this.dT().a($$0));
   }

   @Override
   public bus<chd> dS() {
      return (bus<chd>)super.dS();
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
      che.a(this);
      this.dP().ag().c();
      super.Z();
   }

   public static bux.a gs() {
      return bts.A().a(buy.r, 1.0).a(buy.q, 6.0);
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
   protected avz d(bro $$0) {
      return awa.zt;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.zq;
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqv.a(this.dP().B);
      } else {
         return cfi.a($$0, $$1, this).orElse(super.b($$0, $$1));
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
   public void n(cuq $$0) {
      cfi.a(this, $$0);
      cxf.a(km.N, $$0, $$0x -> $$0x.a("Age", this.gt()));
   }

   @Override
   public void c(us $$0) {
      cfi.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cuq b() {
      return new cuq(cut.qK);
   }

   @Override
   public avz y() {
      return awa.dn;
   }

   private boolean o(cuq $$0) {
      return $$0.a(awy.al);
   }

   private void a(cmy $$0, cuq $$1) {
      this.b($$0, $$1);
      this.c(bsp.d_(this.gv()));
      this.dP().a(li.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cmy $$0, cuq $$1) {
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
         cha $$1 = btb.R.a(this.dP());
         if ($$1 != null) {
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.a($$0, this.dP().d_($$1.dp()), btu.i, null);
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
