import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ceq extends ccq {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bZ;
   protected static final ImmutableList<cbo<? extends cbn<? super ceq>>> e = ImmutableList.of(cbo.c, cbo.d, cbo.f, cbo.s);
   protected static final ImmutableList<cah<?>> bY = ImmutableList.of(cah.n, cah.h, cah.m, cah.E, cah.t, cah.K, cah.P, cah.R, cah.O, cah.r, cah.Z);

   public ceq(bqr<? extends ccq> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new bxg(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bxf(this, 10);
   }

   @Override
   protected cap b(czu $$0) {
      return new car(this, $$0);
   }

   @Override
   protected bsf.b<ceq> dR() {
      return bsf.a(bY, e);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return cer.a(this.dR().a($$0));
   }

   @Override
   public bsf<ceq> dQ() {
      return (bsf<ceq>)super.dQ();
   }

   @Override
   protected auy gq() {
      return auz.zf;
   }

   @Override
   protected void Y() {
      this.dN().af().a("tadpoleBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("tadpoleActivityUpdate");
      cer.a(this);
      this.dN().af().c();
      super.Y();
   }

   public static bsk.a gr() {
      return brg.A().a(bsl.r, 1.0).a(bsl.q, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dN().B) {
         this.t(this.bZ + 1);
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Age", this.bZ);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected auy v() {
      return null;
   }

   @Nullable
   @Override
   protected auy d(bpj $$0) {
      return auz.zh;
   }

   @Nullable
   @Override
   protected auy o_() {
      return auz.ze;
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return boq.a(this.dN().B);
      } else {
         return ccv.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(csd $$0) {
      ccv.a(this, $$0);
      cuq.a(jz.E, $$0, $$0x -> $$0x.a("Age", this.gs()));
   }

   @Override
   public void c(ty $$0) {
      ccv.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public csd b() {
      return new csd(csg.qK);
   }

   @Override
   public auy y() {
      return auz.dn;
   }

   private boolean o(csd $$0) {
      return cen.bY.a($$0);
   }

   private void a(ckl $$0, csd $$1) {
      this.b($$0, $$1);
      this.c(bqf.d_(this.gu()));
      this.dN().a(kw.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(ckl $$0, csd $$1) {
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
      if (this.dN() instanceof aqe $$0) {
         cen $$1 = bqr.R.a(this.dN());
         if ($$1 != null) {
            $$1.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$1.a($$0, this.dN().d_($$1.dn()), bri.i, null);
            $$1.t(this.gf());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.o(this.cC());
            }

            $$1.fT();
            this.a(auz.zg, 0.15F, 1.0F);
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
