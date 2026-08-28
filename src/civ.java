import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class civ extends cgu {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int ca;
   protected static final ImmutableList<cfs<? extends cfr<? super civ>>> bY = ImmutableList.of(cfs.c, cfs.d, cfs.f, cfs.s);
   protected static final ImmutableList<cel<?>> bZ = ImmutableList.of(cel.n, cel.h, cel.m, cel.E, cel.t, cel.K, cel.P, cel.R, cel.O, cel.r, cel.Z);

   public civ(bus<? extends cgu> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cbk(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbj(this, 10);
   }

   @Override
   protected cet b(dgi $$0) {
      return new cev(this, $$0);
   }

   @Override
   protected bwj.b<civ> ec() {
      return bwj.a(bZ, bY);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return ciw.a(this.ec().a($$0));
   }

   @Override
   public bwj<civ> eb() {
      return (bwj<civ>)super.eb();
   }

   @Override
   protected avz gs() {
      return awa.Ai;
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("tadpoleBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      ciw.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bwo.a gt() {
      return cgy.gx().a(bwp.v, 1.0).a(bwp.s, 6.0);
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
   protected avz e(btb $$0) {
      return awa.Ak;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.Ah;
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bsk.a;
      } else {
         return cha.a($$0, $$1, this).orElse(super.b($$0, $$1));
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
   public void i(cwp $$0) {
      cha.a(this, $$0);
      cyy.a(kv.X, $$0, $$0x -> $$0x.a("Age", this.gu()));
   }

   @Override
   public void h(tq $$0) {
      cha.a(this, $$0);
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
      this.b(buc.d_(this.gw()));
      this.dV().a(lt.P, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cox $$0, cwp $$1) {
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
         this.a(bus.ab, bug.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bur.i, null);
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
