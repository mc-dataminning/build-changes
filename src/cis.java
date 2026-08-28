import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cis extends cgr {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int ca;
   protected static final ImmutableList<cfp<? extends cfo<? super cis>>> bY = ImmutableList.of(cfp.c, cfp.d, cfp.f, cfp.s);
   protected static final ImmutableList<cei<?>> bZ = ImmutableList.of(cei.n, cei.h, cei.m, cei.E, cei.t, cei.K, cei.P, cei.R, cei.O, cei.r, cei.Z);

   public cis(bup<? extends cgr> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new cbh(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cbg(this, 10);
   }

   @Override
   protected ceq b(dff $$0) {
      return new ces(this, $$0);
   }

   @Override
   protected bwg.b<cis> ef() {
      return bwg.a(bZ, bY);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cit.a(this.ef().a($$0));
   }

   @Override
   public bwg<cis> ee() {
      return (bwg<cis>)super.ee();
   }

   @Override
   protected awn gw() {
      return awo.zy;
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("tadpoleBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
      $$0.a("tadpoleActivityUpdate");
      cit.a(this);
      $$0.c();
      super.ac();
   }

   public static bwl.a gx() {
      return cgv.gA().a(bwm.v, 1.0).a(bwm.s, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dY().C) {
         this.c(this.ca + 1);
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Age", this.ca);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awn w() {
      return null;
   }

   @Nullable
   @Override
   protected awn d(bsy $$0) {
      return awo.zA;
   }

   @Nullable
   @Override
   protected awn o_() {
      return awo.zx;
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if (this.l($$2)) {
         this.a($$0, $$2);
         return bsh.a;
      } else {
         return cgx.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void k(cwf $$0) {
      cgx.a(this, $$0);
      cyo.a(ku.X, $$0, $$0x -> $$0x.a("Age", this.gy()));
   }

   @Override
   public void h(un $$0) {
      cgx.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cwf X_() {
      return new cwf(cwj.qL);
   }

   @Override
   public awn y() {
      return awo.dn;
   }

   private boolean l(cwf $$0) {
      return $$0.a(axm.ap);
   }

   private void a(cor $$0, cwf $$1) {
      this.b($$0, $$1);
      this.b(btz.d_(this.gA()));
      this.dY().a(ls.O, this.d(1.0), this.dG() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cor $$0, cwf $$1) {
      $$1.a(1, $$0);
   }

   private int gy() {
      return this.ca;
   }

   private void b(int $$0) {
      this.c(this.ca + $$0 * 20);
   }

   private void c(int $$0) {
      this.ca = $$0;
      if (this.ca >= b) {
         this.gz();
      }
   }

   private void gz() {
      if (this.dY() instanceof arq $$0) {
         this.a(bup.R, bud.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dY().d_($$1.dy()), buo.i, null);
            $$1.gb();
            $$1.a(this.a(this.ay()));
            this.a(awo.zz, 0.15F, 1.0F);
         });
      }
   }

   private int gA() {
      return Math.max(0, b - this.ca);
   }

   @Override
   public boolean ep() {
      return false;
   }
}
