import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cfm extends cdm {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bZ;
   protected static final ImmutableList<cck<? extends ccj<? super cfm>>> e = ImmutableList.of(cck.c, cck.d, cck.f, cck.s);
   protected static final ImmutableList<cbd<?>> bY = ImmutableList.of(cbd.n, cbd.h, cbd.m, cbd.E, cbd.t, cbd.K, cbd.P, cbd.R, cbd.O, cbd.r, cbd.Z);

   public cfm(brn<? extends cdm> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new byc(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new byb(this, 10);
   }

   @Override
   protected cbl b(dad $$0) {
      return new cbn(this, $$0);
   }

   @Override
   protected btb.b<cfm> dR() {
      return btb.a(bY, e);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cfn.a(this.dR().a($$0));
   }

   @Override
   public btb<cfm> dQ() {
      return (btb<cfm>)super.dQ();
   }

   @Override
   protected avb gq() {
      return avc.zg;
   }

   @Override
   protected void Y() {
      this.dN().af().a("tadpoleBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("tadpoleActivityUpdate");
      cfn.a(this);
      this.dN().af().c();
      super.Y();
   }

   public static btg.a gr() {
      return bsc.A().a(bth.r, 1.0).a(bth.q, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dN().B) {
         this.t(this.bZ + 1);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Age", this.bZ);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avb v() {
      return null;
   }

   @Nullable
   @Override
   protected avb d(bqf $$0) {
      return avc.zi;
   }

   @Nullable
   @Override
   protected avb o_() {
      return avc.zf;
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bpm.a(this.dN().B);
      } else {
         return cdr.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(csz $$0) {
      cdr.a(this, $$0);
      cvm.a(ka.L, $$0, $$0x -> $$0x.a("Age", this.gs()));
   }

   @Override
   public void c(ua $$0) {
      cdr.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public csz b() {
      return new csz(ctc.qK);
   }

   @Override
   public avb y() {
      return avc.dn;
   }

   private boolean o(csz $$0) {
      return $$0.a(avz.al);
   }

   private void a(clh $$0, csz $$1) {
      this.b($$0, $$1);
      this.c(brb.d_(this.gu()));
      this.dN().a(kx.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(clh $$0, csz $$1) {
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
      if (this.dN() instanceof aqh $$0) {
         cfj $$1 = brn.R.a(this.dN());
         if ($$1 != null) {
            $$1.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$1.a($$0, this.dN().d_($$1.dn()), bse.i, null);
            $$1.t(this.gf());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.o(this.cC());
            }

            $$1.fT();
            this.a(avc.zh, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gu() {
      return Math.max(0, b - this.bZ);
   }

   @Override
   public boolean ef() {
      return false;
   }
}
