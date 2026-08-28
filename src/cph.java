import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cph extends cis implements cnr, cpj {
   private static final akj<Boolean> bJ = akn.a(cph.class, akl.k);
   private static final int bK = 40;
   private static final float bL = 0.3F;
   private static final int bM = 1;
   private static final float bN = 0.6F;
   private static final int bO = 6;
   private static final float bP = 0.5F;
   public static final int bF = 300;
   private int bQ;
   private int bR;
   private boolean bS;
   protected static final ImmutableList<? extends chl<? extends chk<? super cph>>> bG = ImmutableList.of(chl.c, chl.d, chl.o, chl.n);
   protected static final ImmutableList<? extends cge<?>> bH = ImmutableList.of(
      cge.s,
      cge.g,
      cge.h,
      cge.k,
      cge.l,
      cge.o,
      cge.n,
      cge.F,
      cge.u,
      cge.p,
      cge.q,
      cge.ar,
      new cge[]{cge.A, cge.at, cge.au, cge.aq, cge.L, cge.ax, cge.ay, cge.aa}
   );

   public cph(bwm<? extends cph> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.bR = $$0;
   }

   @Override
   public boolean w() {
      return true;
   }

   public static byh.a t() {
      return cnz.gt().a(byi.s, 40.0).a(byi.v, 0.3F).a(byi.p, 0.6F).a(byi.d, 1.0).a(byi.c, 6.0);
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      if ($$1 instanceof bxc $$2) {
         this.bQ = 10;
         this.dV().a(this, (byte)4);
         this.b(awn.mP);
         cpi.a(this, $$2);
         return cpj.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void d(bxc $$0) {
      if (this.x()) {
         cpj.a(this, $$0);
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxc $$4) {
         cpi.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected byc.b<cph> ec() {
      return byc.a(bH, bG);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return cpi.a(this.ec().a($$0));
   }

   @Override
   public byc<cph> eb() {
      return (byc<cph>)super.eb();
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("hoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cpi.a(this);
      if (this.gq()) {
         this.bR++;
         if (this.bR > 300) {
            this.b(awn.mQ);
            this.gs();
         }
      } else {
         this.bR = 0;
      }
   }

   @Override
   public void k_() {
      if (this.bQ > 0) {
         this.bQ--;
      }

      super.k_();
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.bx = 3;
         this.g(byi.c).a(0.5);
      } else {
         this.bx = 5;
         this.g(byi.c).a(6.0);
      }
   }

   public static boolean c(bwm<cph> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return !$$1.a_($$3.e()).a(dmc.ln);
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fZ();
   }

   @Override
   public float a(iu $$0, diy $$1) {
      if (cpi.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dmc.oZ) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      bub $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fY();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bQ = 10;
         this.b(awn.mP);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bQ;
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected int e(arq $$0) {
      return this.bx;
   }

   private void gs() {
      this.a(bwm.bN, bvx.a(this, true, false), $$0 -> $$0.a(new bvh(bvj.i, 200, 0)));
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.ap);
   }

   public boolean x() {
      return !this.n_();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.gt()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.bR);
      if (this.bS) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.bR = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.au().a(bJ, $$0);
   }

   private boolean gt() {
      return this.au().a(bJ);
   }

   public boolean gq() {
      return !this.dV().B_().b() && !this.gt() && !this.gf();
   }

   private void x(boolean $$0) {
      this.bS = $$0;
   }

   public boolean gr() {
      return this.x() && !this.bS;
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      cph $$2 = bwm.aj.a($$0, bwl.e);
      if ($$2 != null) {
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean gx() {
      return !cpi.c(this) && super.gx();
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return this.dV().C ? null : cpi.b(this).orElse(null);
   }

   @Override
   protected awm e(bus $$0) {
      return awn.mS;
   }

   @Override
   protected awm l_() {
      return awn.mR;
   }

   @Override
   protected awm aV() {
      return awn.nx;
   }

   @Override
   protected awm aW() {
      return awn.nw;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.mU, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Nullable
   @Override
   public bxc f() {
      return this.Q();
   }
}
