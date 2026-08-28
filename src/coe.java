import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class coe extends chw implements cmo, cog {
   private static final alc<Boolean> cd = alg.a(coe.class, ale.k);
   private static final int ce = 40;
   private static final float cf = 0.3F;
   private static final int cg = 1;
   private static final float ch = 0.6F;
   private static final int ci = 6;
   private static final float cj = 0.5F;
   public static final int bZ = 300;
   private int ck;
   private int cl;
   private boolean cm;
   protected static final ImmutableList<? extends cgq<? extends cgp<? super coe>>> ca = ImmutableList.of(cgq.c, cgq.d, cgq.o, cgq.n);
   protected static final ImmutableList<? extends cfj<?>> cb = ImmutableList.of(
      cfj.r,
      cfj.g,
      cfj.h,
      cfj.k,
      cfj.l,
      cfj.n,
      cfj.m,
      cfj.E,
      cfj.t,
      cfj.o,
      cfj.p,
      cfj.aq,
      new cfj[]{cfj.z, cfj.as, cfj.at, cfj.ap, cfj.K, cfj.aw, cfj.ax, cfj.Z}
   );

   public coe(bvq<? extends coe> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.cl = $$0;
   }

   @Override
   public boolean y() {
      return true;
   }

   public static bxm.a p() {
      return cmw.gr().a(bxn.s, 40.0).a(bxn.v, 0.3F).a(bxn.p, 0.6F).a(bxn.d, 1.0).a(bxn.c, 6.0);
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      if ($$1 instanceof bwf $$2) {
         this.ck = 10;
         this.dV().a(this, (byte)4);
         this.b(axf.mI);
         cof.a(this, $$2);
         return cog.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bwf $$0) {
      if (this.t()) {
         cog.a(this, $$0);
      }
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwf $$4) {
         cof.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bxh.b<coe> ec() {
      return bxh.a(cb, ca);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cof.a(this.ec().a($$0));
   }

   @Override
   public bxh<coe> eb() {
      return (bxh<coe>)super.eb();
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("hoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cof.a(this);
      if (this.gm()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(axf.mJ);
            this.go();
         }
      } else {
         this.cl = 0;
      }
   }

   @Override
   public void d_() {
      if (this.ck > 0) {
         this.ck--;
      }

      super.d_();
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.bO = 3;
         this.g(bxn.c).a(0.5);
      } else {
         this.bO = 5;
         this.g(bxn.c).a(6.0);
      }
   }

   public static boolean c(bvq<coe> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return !$$1.a_($$3.e()).a(dkn.lf);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.aj();
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      if (cof.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dkn.oR) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      bti $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.ai();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(axf.mI);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int x() {
      return this.ck;
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected int e(ash $$0) {
      return this.bO;
   }

   private void go() {
      this.a(bvq.bN, bve.a(this, true, false), $$0 -> $$0.a(new buo(buq.i, 200, 0)));
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.ar);
   }

   public boolean t() {
      return !this.e_();
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.gp()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cl);
      if (this.cm) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.cl = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.au().a(cd, $$0);
   }

   private boolean gp() {
      return this.au().a(cd);
   }

   public boolean gm() {
      return !this.dV().G_().b() && !this.gp() && !this.fZ();
   }

   private void y(boolean $$0) {
      this.cm = $$0;
   }

   public boolean gn() {
      return this.t() && !this.cm;
   }

   @Nullable
   @Override
   public bva a(ash $$0, bva $$1) {
      coe $$2 = bvq.ak.a($$0, bvp.e);
      if ($$2 != null) {
         $$2.ai();
      }

      return $$2;
   }

   @Override
   public boolean gt() {
      return !cof.c(this) && super.gt();
   }

   @Override
   public axg dm() {
      return axg.f;
   }

   @Override
   protected axe u() {
      return this.dV().C ? null : cof.b(this).orElse(null);
   }

   @Override
   protected axe e(btz $$0) {
      return axf.mL;
   }

   @Override
   protected axe o_() {
      return axf.mK;
   }

   @Override
   protected axe aV() {
      return axf.nq;
   }

   @Override
   protected axe aW() {
      return axf.np;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.mN, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Nullable
   @Override
   public bwf O_() {
      return this.O();
   }
}
