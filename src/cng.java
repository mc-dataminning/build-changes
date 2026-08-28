import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cng extends cgz implements clr, cni {
   private static final ajy<Boolean> cc = akc.a(cng.class, aka.k);
   private static final int cd = 40;
   private static final float ce = 0.3F;
   private static final int cf = 1;
   private static final float cg = 0.6F;
   private static final int ch = 6;
   private static final float ci = 0.5F;
   public static final int bY = 300;
   private int cj;
   private int ck;
   private boolean cl;
   protected static final ImmutableList<? extends cft<? extends cfs<? super cng>>> bZ = ImmutableList.of(cft.c, cft.d, cft.o, cft.n);
   protected static final ImmutableList<? extends cem<?>> ca = ImmutableList.of(
      cem.r,
      cem.g,
      cem.h,
      cem.k,
      cem.l,
      cem.n,
      cem.m,
      cem.E,
      cem.t,
      cem.o,
      cem.p,
      cem.aq,
      new cem[]{cem.z, cem.as, cem.at, cem.ap, cem.K, cem.aw, cem.ax, cem.Z}
   );

   public cng(but<? extends cng> $$0, dgj $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.ck = $$0;
   }

   @Override
   public boolean y() {
      return true;
   }

   public static bwp.a p() {
      return clz.gx().a(bwq.s, 40.0).a(bwq.v, 0.3F).a(bwq.p, 0.6F).a(bwq.d, 1.0).a(bwq.c, 6.0);
   }

   @Override
   public boolean c(ard $$0, bum $$1) {
      if ($$1 instanceof bvi $$2) {
         this.cj = 10;
         this.dV().a(this, (byte)4);
         this.b(awa.mO);
         cnh.a(this, $$2);
         return cni.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bvi $$0) {
      if (this.t()) {
         cni.a(this, $$0);
      }
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvi $$4) {
         cnh.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bwk.b<cng> ec() {
      return bwk.a(ca, bZ);
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return cnh.a(this.ec().a($$0));
   }

   @Override
   public bwk<cng> eb() {
      return (bwk<cng>)super.eb();
   }

   @Override
   protected void a(ard $$0) {
      bou $$1 = bot.a();
      $$1.a("hoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cnh.a(this);
      if (this.gs()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(awa.mP);
            this.gu();
         }
      } else {
         this.ck = 0;
      }
   }

   @Override
   public void d_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.d_();
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.bN = 3;
         this.g(bwq.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bwq.c).a(6.0);
      }
   }

   public static boolean c(but<cng> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return !$$1.a_($$3.e()).a(djp.lm);
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fZ();
   }

   @Override
   public float a(ji $$0, dgm $$1) {
      if (cnh.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(djp.oY) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      bsl $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fY();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awa.mO);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int x() {
      return this.cj;
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected int e(ard $$0) {
      return this.bN;
   }

   private void gu() {
      this.a(but.bM, buh.a(this, true, false), $$0 -> $$0.a(new btr(btt.i, 200, 0)));
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.ap);
   }

   public boolean t() {
      return !this.e_();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.gv()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.au().a(cc, $$0);
   }

   private boolean gv() {
      return this.au().a(cc);
   }

   public boolean gs() {
      return !this.dV().G_().b() && !this.gv() && !this.gf();
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gt() {
      return this.t() && !this.cl;
   }

   @Nullable
   @Override
   public bud a(ard $$0, bud $$1) {
      cng $$2 = but.aj.a($$0, bus.e);
      if ($$2 != null) {
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean gz() {
      return !cnh.c(this) && super.gz();
   }

   @Override
   public awb dm() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return this.dV().C ? null : cnh.b(this).orElse(null);
   }

   @Override
   protected avz e(btc $$0) {
      return awa.mR;
   }

   @Override
   protected avz o_() {
      return awa.mQ;
   }

   @Override
   protected avz aV() {
      return awa.nw;
   }

   @Override
   protected avz aW() {
      return awa.nv;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.mT, 0.15F, 1.0F);
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Nullable
   @Override
   public bvi O_() {
      return this.R();
   }
}
