import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chb extends cfb {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bZ;
   protected static final ImmutableList<cdz<? extends cdy<? super chb>>> e = ImmutableList.of(cdz.c, cdz.d, cdz.f, cdz.s);
   protected static final ImmutableList<ccs<?>> bY = ImmutableList.of(ccs.n, ccs.h, ccs.m, ccs.E, ccs.t, ccs.K, ccs.P, ccs.R, ccs.O, ccs.r, ccs.Z);

   public chb(bsz<? extends cfb> $$0, dbx $$1) {
      super($$0, $$1);
      this.bP = new bzr(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bzq(this, 10);
   }

   @Override
   protected cda b(dbx $$0) {
      return new cdc(this, $$0);
   }

   @Override
   protected buq.b<chb> dT() {
      return buq.a(bY, e);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return chc.a(this.dT().a($$0));
   }

   @Override
   public buq<chb> dS() {
      return (buq<chb>)super.dS();
   }

   @Override
   protected avy gr() {
      return avz.zr;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("tadpoleBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("tadpoleActivityUpdate");
      chc.a(this);
      this.dP().ag().c();
      super.Z();
   }

   public static buv.a gs() {
      return btq.A().a(buw.r, 1.0).a(buw.q, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.t(this.bZ + 1);
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Age", this.bZ);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avy v() {
      return null;
   }

   @Nullable
   @Override
   protected avy d(brm $$0) {
      return avz.zt;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.zq;
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqt.a(this.dP().B);
      } else {
         return cfg.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cuo $$0) {
      cfg.a(this, $$0);
      cxd.a(km.N, $$0, $$0x -> $$0x.a("Age", this.gt()));
   }

   @Override
   public void c(ur $$0) {
      cfg.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cuo b() {
      return new cuo(cur.qK);
   }

   @Override
   public avy y() {
      return avz.dn;
   }

   private boolean o(cuo $$0) {
      return $$0.a(awx.al);
   }

   private void a(cmw $$0, cuo $$1) {
      this.b($$0, $$1);
      this.c(bsn.d_(this.gv()));
      this.dP().a(li.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cmw $$0, cuo $$1) {
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
      if (this.dP() instanceof are $$0) {
         cgy $$1 = bsz.R.a(this.dP());
         if ($$1 != null) {
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.a($$0, this.dP().d_($$1.dp()), bts.i, null);
            $$1.t(this.gg());
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            $$1.fU();
            this.a(avz.zs, 0.15F, 1.0F);
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
