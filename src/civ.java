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

   public civ(bus<? extends cgu> $$0, dfm $$1) {
      super($$0, $$1);
      this.bP = new cbk(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbj(this, 10);
   }

   @Override
   protected cet b(dfm $$0) {
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
   protected awm gn() {
      return awn.zy;
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("tadpoleBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      ciw.a(this);
      $$1.c();
      super.a($$0);
   }

   public static bwo.a go() {
      return cgy.gr().a(bwp.v, 1.0).a(bwp.s, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         this.c(this.ca + 1);
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Age", this.ca);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awm t() {
      return null;
   }

   @Nullable
   @Override
   protected awm e(btb $$0) {
      return awn.zA;
   }

   @Nullable
   @Override
   protected awm n_() {
      return awn.zx;
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bsk.a;
      } else {
         return cha.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void i(cwm $$0) {
      cha.a(this, $$0);
      cyv.a(ku.X, $$0, $$0x -> $$0x.a("Age", this.gp()));
   }

   @Override
   public void h(ul $$0) {
      cha.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cwm V_() {
      return new cwm(cwq.qL);
   }

   @Override
   public awm v() {
      return awn.dn;
   }

   private boolean j(cwm $$0) {
      return $$0.a(axl.ap);
   }

   private void a(cou $$0, cwm $$1) {
      this.b($$0, $$1);
      this.b(buc.d_(this.gr()));
      this.dV().a(ls.O, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cou $$0, cwm $$1) {
      $$1.a(1, $$0);
   }

   private int gp() {
      return this.ca;
   }

   private void b(int $$0) {
      this.c(this.ca + $$0 * 20);
   }

   private void c(int $$0) {
      this.ca = $$0;
      if (this.ca >= a) {
         this.gq();
      }
   }

   private void gq() {
      if (this.dV() instanceof arp $$0) {
         this.a(bus.aa, bug.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bur.i, null);
            $$1.ai();
            $$1.a(this.a(this.aw()));
            this.a(awn.zz, 0.15F, 1.0F);
         });
      }
   }

   private int gr() {
      return Math.max(0, a - this.ca);
   }

   @Override
   public boolean em() {
      return false;
   }
}
