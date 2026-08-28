import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class coa extends chs implements cmk, coc {
   private static final alc<Boolean> cd = alg.a(coa.class, ale.k);
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
   protected static final ImmutableList<? extends cgm<? extends cgl<? super coa>>> ca = ImmutableList.of(cgm.c, cgm.d, cgm.o, cgm.n);
   protected static final ImmutableList<? extends cff<?>> cb = ImmutableList.of(
      cff.r,
      cff.g,
      cff.h,
      cff.k,
      cff.l,
      cff.n,
      cff.m,
      cff.E,
      cff.t,
      cff.o,
      cff.p,
      cff.aq,
      new cff[]{cff.z, cff.as, cff.at, cff.ap, cff.K, cff.aw, cff.ax, cff.Z}
   );

   public coa(bvm<? extends coa> $$0, dha $$1) {
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

   public static bxi.a p() {
      return cms.gr().a(bxj.s, 40.0).a(bxj.v, 0.3F).a(bxj.p, 0.6F).a(bxj.d, 1.0).a(bxj.c, 6.0);
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      if ($$1 instanceof bwb $$2) {
         this.ck = 10;
         this.dV().a(this, (byte)4);
         this.b(axf.mH);
         cob.a(this, $$2);
         return coc.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bwb $$0) {
      if (this.t()) {
         coc.a(this, $$0);
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwb $$4) {
         cob.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bxd.b<coa> ec() {
      return bxd.a(cb, ca);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cob.a(this.ec().a($$0));
   }

   @Override
   public bxd<coa> eb() {
      return (bxd<coa>)super.eb();
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("hoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cob.a(this);
      if (this.gm()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(axf.mI);
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
         this.g(bxj.c).a(0.5);
      } else {
         this.bO = 5;
         this.g(bxj.c).a(6.0);
      }
   }

   public static boolean c(bvm<coa> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return !$$1.a_($$3.e()).a(dkg.lf);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
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
   public float a(jh $$0, dhd $$1) {
      if (cob.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dkg.oR) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      bte $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.ai();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(axf.mH);
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
      this.a(bvm.bN, bva.a(this, true, false), $$0 -> $$0.a(new buk(bum.i, 200, 0)));
   }

   @Override
   public boolean j(cxk $$0) {
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
   public buw a(ash $$0, buw $$1) {
      coa $$2 = bvm.ak.a($$0, bvl.e);
      if ($$2 != null) {
         $$2.ai();
      }

      return $$2;
   }

   @Override
   public boolean gt() {
      return !cob.c(this) && super.gt();
   }

   @Override
   public axg dm() {
      return axg.f;
   }

   @Override
   protected axe u() {
      return this.dV().C ? null : cob.b(this).orElse(null);
   }

   @Override
   protected axe e(btv $$0) {
      return axf.mK;
   }

   @Override
   protected axe o_() {
      return axf.mJ;
   }

   @Override
   protected axe aV() {
      return axf.np;
   }

   @Override
   protected axe aW() {
      return axf.no;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.mM, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Nullable
   @Override
   public bwb O_() {
      return this.O();
   }
}
