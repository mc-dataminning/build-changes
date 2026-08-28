import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnz extends chp implements cmk, cob {
   private static final ajx<Boolean> bJ = akb.a(cnz.class, ajz.k);
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
   protected static final ImmutableList<? extends cgj<? extends cgi<? super cnz>>> bG = ImmutableList.of(cgj.c, cgj.d, cgj.o, cgj.n);
   protected static final ImmutableList<? extends cfc<?>> bH = ImmutableList.of(
      cfc.r,
      cfc.g,
      cfc.h,
      cfc.k,
      cfc.l,
      cfc.n,
      cfc.m,
      cfc.E,
      cfc.t,
      cfc.o,
      cfc.p,
      cfc.aq,
      new cfc[]{cfc.z, cfc.as, cfc.at, cfc.ap, cfc.K, cfc.aw, cfc.ax, cfc.Z}
   );

   public cnz(bvi<? extends cnz> $$0, dgz $$1) {
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

   public static bxf.a t() {
      return cms.gv().a(bxg.s, 40.0).a(bxg.v, 0.3F).a(bxg.p, 0.6F).a(bxg.d, 1.0).a(bxg.c, 6.0);
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      if ($$1 instanceof bvy $$2) {
         this.bQ = 10;
         this.dU().a(this, (byte)4);
         this.b(awa.mO);
         coa.a(this, $$2);
         return cob.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bvy $$0) {
      if (this.x()) {
         cob.a(this, $$0);
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvy $$4) {
         coa.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bxa.b<cnz> eb() {
      return bxa.a(bH, bG);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return coa.a(this.eb().a($$0));
   }

   @Override
   public bxa<cnz> ea() {
      return (bxa<cnz>)super.ea();
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("hoglinBrain");
      this.ea().a($$0, this);
      $$1.c();
      coa.a(this);
      if (this.gs()) {
         this.bR++;
         if (this.bR > 300) {
            this.b(awa.mP);
            this.gu();
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
   protected void X_() {
      if (this.n_()) {
         this.bx = 3;
         this.g(bxg.c).a(0.5);
      } else {
         this.bx = 5;
         this.g(bxg.c).a(6.0);
      }
   }

   public static boolean c(bvi<cnz> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return !$$1.a_($$3.e()).a(dkg.lm);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.gb();
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      if (coa.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dkg.oY) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      bsy $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.ga();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bQ = 10;
         this.b(awa.mO);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bQ;
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected int e(ard $$0) {
      return this.bx;
   }

   private void gu() {
      this.a(bvi.bM, buu.a(this, true, false), $$0 -> $$0.a(new bue(bug.i, 200, 0)));
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ap);
   }

   public boolean x() {
      return !this.n_();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.gv()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.bR);
      if (this.bS) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.bR = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.au().a(bJ, $$0);
   }

   private boolean gv() {
      return this.au().a(bJ);
   }

   public boolean gs() {
      return !this.dU().B_().b() && !this.gv() && !this.gh();
   }

   private void x(boolean $$0) {
      this.bS = $$0;
   }

   public boolean gt() {
      return this.x() && !this.bS;
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      cnz $$2 = bvi.aj.a($$0, bvh.e);
      if ($$2 != null) {
         $$2.ga();
      }

      return $$2;
   }

   @Override
   public boolean gz() {
      return !coa.c(this) && super.gz();
   }

   @Override
   public awb dl() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return this.dU().C ? null : coa.b(this).orElse(null);
   }

   @Override
   protected avz e(btp $$0) {
      return awa.mR;
   }

   @Override
   protected avz l_() {
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
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.mT, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Nullable
   @Override
   public bvy f() {
      return this.Q();
   }
}
