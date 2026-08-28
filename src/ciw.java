import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ciw extends cgv {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int ca;
   protected static final ImmutableList<cft<? extends cfs<? super ciw>>> bY = ImmutableList.of(cft.c, cft.d, cft.f, cft.s);
   protected static final ImmutableList<cem<?>> bZ = ImmutableList.of(cem.n, cem.h, cem.m, cem.E, cem.t, cem.K, cem.P, cem.R, cem.O, cem.r, cem.Z);

   public ciw(but<? extends cgv> $$0, dgj $$1) {
      super($$0, $$1);
      this.bP = new cbl(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbk(this, 10);
   }

   @Override
   protected ceu b(dgj $$0) {
      return new cew(this, $$0);
   }

   @Override
   protected bwk.b<ciw> ec() {
      return bwk.a(bZ, bY);
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return cix.a(this.ec().a($$0));
   }

   @Override
   public bwk<ciw> eb() {
      return (bwk<ciw>)super.eb();
   }

   @Override
   protected avz gs() {
      return awa.Ai;
   }

   @Override
   protected void a(ard $$0) {
      bou $$1 = bot.a();
      $$1.a("tadpoleBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      cix.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bwp.a gt() {
      return cgz.gx().a(bwq.v, 1.0).a(bwq.s, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
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
   protected avz e(btc $$0) {
      return awa.Ak;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.Ah;
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bsl.a;
      } else {
         return chb.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void i(cwq $$0) {
      chb.a(this, $$0);
      cyz.a(kv.X, $$0, $$0x -> $$0x.a("Age", this.gu()));
   }

   @Override
   public void h(tq $$0) {
      chb.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cwq W_() {
      return new cwq(cwu.rr);
   }

   @Override
   public avz t() {
      return awa.do;
   }

   private boolean j(cwq $$0) {
      return $$0.a(awy.ao);
   }

   private void a(coy $$0, cwq $$1) {
      this.b($$0, $$1);
      this.b(bud.d_(this.gw()));
      this.dV().a(lt.P, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(coy $$0, cwq $$1) {
      $$1.a(1, $$0);
   }

   private int gu() {
      return this.ca;
   }

   private void b(int $$0) {
      this.c(this.ca + $$0 * 20);
   }

   private void c(int $$0) {
      this.ca = $$0;
      if (this.ca >= a) {
         this.gv();
      }
   }

   private void gv() {
      if (this.dV() instanceof ard $$0) {
         this.a(but.ab, buh.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bus.i, null);
            $$1.fY();
            $$1.a(this.a(this.aw()));
            this.a(awa.Aj, 0.15F, 1.0F);
         });
      }
   }

   private int gw() {
      return Math.max(0, a - this.ca);
   }

   @Override
   public boolean em() {
      return false;
   }
}
