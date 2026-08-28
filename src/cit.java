import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cit extends cgs {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int ca;
   protected static final ImmutableList<cfq<? extends cfp<? super cit>>> bY = ImmutableList.of(cfq.c, cfq.d, cfq.f, cfq.s);
   protected static final ImmutableList<cej<?>> bZ = ImmutableList.of(cej.n, cej.h, cej.m, cej.E, cej.t, cej.K, cej.P, cej.R, cej.O, cej.r, cej.Z);

   public cit(buq<? extends cgs> $$0, dgg $$1) {
      super($$0, $$1);
      this.bP = new cbi(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbh(this, 10);
   }

   @Override
   protected cer b(dgg $$0) {
      return new cet(this, $$0);
   }

   @Override
   protected bwh.b<cit> ed() {
      return bwh.a(bZ, bY);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return ciu.a(this.ed().a($$0));
   }

   @Override
   public bwh<cit> ec() {
      return (bwh<cit>)super.ec();
   }

   @Override
   protected avy gp() {
      return avz.Ai;
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("tadpoleBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      ciu.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bwm.a gq() {
      return cgw.gu().a(bwn.v, 1.0).a(bwn.s, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         this.c(this.ca + 1);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Age", this.ca);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avy u() {
      return null;
   }

   @Nullable
   @Override
   protected avy e(bsz $$0) {
      return avz.Ak;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.Ah;
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bsi.a;
      } else {
         return cgy.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void i(cwn $$0) {
      cgy.a(this, $$0);
      cyw.a(kv.X, $$0, $$0x -> $$0x.a("Age", this.gr()));
   }

   @Override
   public void h(tq $$0) {
      cgy.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cwn W_() {
      return new cwn(cwr.rr);
   }

   @Override
   public avy t() {
      return avz.do;
   }

   private boolean j(cwn $$0) {
      return $$0.a(awx.ao);
   }

   private void a(cov $$0, cwn $$1) {
      this.b($$0, $$1);
      this.b(bua.d_(this.gt()));
      this.dW().a(lt.P, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cov $$0, cwn $$1) {
      $$1.a(1, $$0);
   }

   private int gr() {
      return this.ca;
   }

   private void b(int $$0) {
      this.c(this.ca + $$0 * 20);
   }

   private void c(int $$0) {
      this.ca = $$0;
      if (this.ca >= a) {
         this.gs();
      }
   }

   private void gs() {
      if (this.dW() instanceof arc $$0) {
         this.a(buq.ab, bue.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dW().d_($$1.dw()), bup.i, null);
            $$1.aj();
            $$1.a(this.a(this.aw()));
            this.a(avz.Aj, 0.15F, 1.0F);
         });
      }
   }

   private int gt() {
      return Math.max(0, a - this.ca);
   }

   @Override
   public boolean en() {
      return false;
   }
}
