import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cof extends chx implements cmp, coh {
   private static final alc<Boolean> cd = alg.a(cof.class, ale.k);
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
   protected static final ImmutableList<? extends cgr<? extends cgq<? super cof>>> ca = ImmutableList.of(cgr.c, cgr.d, cgr.o, cgr.n);
   protected static final ImmutableList<? extends cfk<?>> cb = ImmutableList.of(
      cfk.r,
      cfk.g,
      cfk.h,
      cfk.k,
      cfk.l,
      cfk.n,
      cfk.m,
      cfk.E,
      cfk.t,
      cfk.o,
      cfk.p,
      cfk.aq,
      new cfk[]{cfk.z, cfk.as, cfk.at, cfk.ap, cfk.K, cfk.aw, cfk.ax, cfk.Z}
   );

   public cof(bvr<? extends cof> $$0, dhi $$1) {
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

   public static bxn.a p() {
      return cmx.gt().a(bxo.s, 40.0).a(bxo.v, 0.3F).a(bxo.p, 0.6F).a(bxo.d, 1.0).a(bxo.c, 6.0);
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      if ($$1 instanceof bwg $$2) {
         this.ck = 10;
         this.dW().a(this, (byte)4);
         this.b(axf.mI);
         cog.a(this, $$2);
         return coh.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bwg $$0) {
      if (this.t()) {
         coh.a(this, $$0);
      }
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwg $$4) {
         cog.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bxi.b<cof> ed() {
      return bxi.a(cb, ca);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return cog.a(this.ed().a($$0));
   }

   @Override
   public bxi<cof> ec() {
      return (bxi<cof>)super.ec();
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("hoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cog.a(this);
      if (this.go()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(axf.mJ);
            this.gq();
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
         this.g(bxo.c).a(0.5);
      } else {
         this.bO = 5;
         this.g(bxo.c).a(6.0);
      }
   }

   public static boolean c(bvr<cof> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return !$$1.a_($$3.e()).a(dko.lf);
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
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
   public float a(jh $$0, dhl $$1) {
      if (cog.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dko.oR) ? 10.0F : 0.0F;
      }
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      btj $$2 = super.b($$0, $$1);
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
   public boolean en() {
      return true;
   }

   @Override
   protected int e(ash $$0) {
      return this.bO;
   }

   private void gq() {
      this.a(bvr.bN, bvf.a(this, true, false), $$0 -> $$0.a(new bup(bur.i, 200, 0)));
   }

   @Override
   public boolean j(cxp $$0) {
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
      if (this.gr()) {
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

   private boolean gr() {
      return this.au().a(cd);
   }

   public boolean go() {
      return !this.dW().G_().b() && !this.gr() && !this.gb();
   }

   private void y(boolean $$0) {
      this.cm = $$0;
   }

   public boolean gp() {
      return this.t() && !this.cm;
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      cof $$2 = bvr.ak.a($$0, bvq.e);
      if ($$2 != null) {
         $$2.ai();
      }

      return $$2;
   }

   @Override
   public boolean gv() {
      return !cog.c(this) && super.gv();
   }

   @Override
   public axg dn() {
      return axg.f;
   }

   @Override
   protected axe u() {
      return this.dW().C ? null : cog.b(this).orElse(null);
   }

   @Override
   protected axe e(bua $$0) {
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
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.mN, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Nullable
   @Override
   public bwg O_() {
      return this.O();
   }
}
