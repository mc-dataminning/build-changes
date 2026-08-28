import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ciu extends cgt {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int ca;
   protected static final ImmutableList<cfr<? extends cfq<? super ciu>>> bY = ImmutableList.of(cfr.c, cfr.d, cfr.f, cfr.s);
   protected static final ImmutableList<cek<?>> bZ = ImmutableList.of(cek.n, cek.h, cek.m, cek.E, cek.t, cek.K, cek.P, cek.R, cek.O, cek.r, cek.Z);

   public ciu(bur<? extends cgt> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cbj(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbi(this, 10);
   }

   @Override
   protected ces b(dgi $$0) {
      return new ceu(this, $$0);
   }

   @Override
   protected bwi.b<ciu> ed() {
      return bwi.a(bZ, bY);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return civ.a(this.ed().a($$0));
   }

   @Override
   public bwi<ciu> ec() {
      return (bwi<ciu>)super.ec();
   }

   @Override
   protected avz gp() {
      return awa.Aj;
   }

   @Override
   protected void a(arc $$0) {
      bos $$1 = bor.a();
      $$1.a("tadpoleBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      civ.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bwn.a gq() {
      return cgx.gu().a(bwo.v, 1.0).a(bwo.s, 6.0);
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
   protected avz u() {
      return null;
   }

   @Nullable
   @Override
   protected avz e(bta $$0) {
      return awa.Al;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.Ai;
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bsj.a;
      } else {
         return cgz.a($$0, $$1, this).orElse(super.b($$0, $$1));
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
   public void i(cwp $$0) {
      cgz.a(this, $$0);
      cyy.a(kv.X, $$0, $$0x -> $$0x.a("Age", this.gr()));
   }

   @Override
   public void h(tq $$0) {
      cgz.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cwp W_() {
      return new cwp(cwt.rr);
   }

   @Override
   public avz t() {
      return awa.do;
   }

   private boolean j(cwp $$0) {
      return $$0.a(awy.ao);
   }

   private void a(cox $$0, cwp $$1) {
      this.b($$0, $$1);
      this.b(bub.d_(this.gt()));
      this.dW().a(lt.P, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cox $$0, cwp $$1) {
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
         this.a(bur.ac, buf.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dW().d_($$1.dw()), buq.i, null);
            $$1.aj();
            $$1.a(this.a(this.aw()));
            this.a(awa.Ak, 0.15F, 1.0F);
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
