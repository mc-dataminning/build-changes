import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cpb extends cio implements cnl, cpd {
   private static final akh<Boolean> bJ = akl.a(cpb.class, akj.k);
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
   protected static final ImmutableList<? extends chi<? extends chh<? super cpb>>> bG = ImmutableList.of(chi.c, chi.d, chi.o, chi.n);
   protected static final ImmutableList<? extends cgb<?>> bH = ImmutableList.of(
      cgb.s,
      cgb.g,
      cgb.h,
      cgb.k,
      cgb.l,
      cgb.o,
      cgb.n,
      cgb.F,
      cgb.u,
      cgb.p,
      cgb.q,
      cgb.ar,
      new cgb[]{cgb.A, cgb.at, cgb.au, cgb.aq, cgb.L, cgb.ax, cgb.ay, cgb.aa}
   );

   public cpb(bwj<? extends cpb> $$0, dip $$1) {
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

   public static bye.a t() {
      return cnt.gt().a(byf.s, 40.0).a(byf.v, 0.3F).a(byf.p, 0.6F).a(byf.d, 1.0).a(byf.c, 6.0);
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      if ($$1 instanceof bwz $$2) {
         this.bQ = 10;
         this.dV().a(this, (byte)4);
         this.b(awl.mO);
         cpc.a(this, $$2);
         return cpd.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void d(bwz $$0) {
      if (this.x()) {
         cpd.a(this, $$0);
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwz $$4) {
         cpc.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bxz.b<cpb> ec() {
      return bxz.a(bH, bG);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return cpc.a(this.ec().a($$0));
   }

   @Override
   public bxz<cpb> eb() {
      return (bxz<cpb>)super.eb();
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("hoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cpc.a(this);
      if (this.gq()) {
         this.bR++;
         if (this.bR > 300) {
            this.b(awl.mP);
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
         this.g(byf.c).a(0.5);
      } else {
         this.bx = 5;
         this.g(byf.c).a(6.0);
      }
   }

   public static boolean c(bwj<cpb> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return !$$1.a_($$3.e()).a(dlw.lm);
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
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
   public float a(iu $$0, dis $$1) {
      if (cpc.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dlw.oY) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      bty $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fY();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bQ = 10;
         this.b(awl.mO);
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
   protected int e(aro $$0) {
      return this.bx;
   }

   private void gs() {
      this.a(bwj.bN, bvu.a(this, true, false), $$0 -> $$0.a(new bve(bvg.i, 200, 0)));
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.ap);
   }

   public boolean x() {
      return !this.n_();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
   }

   @Override
   public void b(tx $$0) {
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
   public void a(tx $$0) {
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
   public bvq a(aro $$0, bvq $$1) {
      cpb $$2 = bwj.aj.a($$0, bwi.e);
      if ($$2 != null) {
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean gx() {
      return !cpc.c(this) && super.gx();
   }

   @Override
   public awm dm() {
      return awm.f;
   }

   @Override
   protected awk u() {
      return this.dV().C ? null : cpc.b(this).orElse(null);
   }

   @Override
   protected awk e(bup $$0) {
      return awl.mR;
   }

   @Override
   protected awk l_() {
      return awl.mQ;
   }

   @Override
   protected awk aV() {
      return awl.nw;
   }

   @Override
   protected awk aW() {
      return awl.nv;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.mT, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Nullable
   @Override
   public bwz f() {
      return this.Q();
   }
}
