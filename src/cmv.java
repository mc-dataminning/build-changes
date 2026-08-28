import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cmv extends cgr implements clj, cmx {
   private static final akl<Boolean> cc = akp.a(cmv.class, akn.k);
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
   protected static final ImmutableList<? extends cfl<? extends cfk<? super cmv>>> bZ = ImmutableList.of(cfl.c, cfl.d, cfl.o, cfl.n);
   protected static final ImmutableList<? extends cee<?>> ca = ImmutableList.of(
      cee.r,
      cee.g,
      cee.h,
      cee.k,
      cee.l,
      cee.n,
      cee.m,
      cee.E,
      cee.t,
      cee.o,
      cee.p,
      cee.aq,
      new cee[]{cee.z, cee.as, cee.at, cee.ap, cee.K, cee.aw, cee.ax, cee.Z}
   );

   public cmv(bul<? extends cmv> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @VisibleForTesting
   public void t(int $$0) {
      this.ck = $$0;
   }

   @Override
   public boolean A() {
      return true;
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.s, 40.0).a(bwi.v, 0.3F).a(bwi.p, 0.6F).a(bwi.d, 1.0).a(bwi.c, 6.0);
   }

   @Override
   public boolean E(bue $$0) {
      if (!($$0 instanceof bva)) {
         return false;
      } else {
         this.cj = 10;
         this.dX().a(this, (byte)4);
         this.b(awl.mp);
         cmw.a(this, (bva)$$0);
         return cmx.a(this, (bva)$$0);
      }
   }

   @Override
   protected void e(bva $$0) {
      if (this.t()) {
         cmx.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dX().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bva) {
            cmw.b(this, (bva)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bwc.b<cmv> ee() {
      return bwc.a(ca, bZ);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cmw.a(this.ee().a($$0));
   }

   @Override
   public bwc<cmv> ed() {
      return (bwc<cmv>)super.ed();
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("hoglinBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      cmw.a(this);
      if (this.y()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(awl.mq);
            this.gw();
         }
      } else {
         this.ck = 0;
      }
   }

   @Override
   public void n_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.n_();
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.bN = 3;
         this.g(bwi.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bwi.c).a(6.0);
      }
   }

   public static boolean c(bul<cmv> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return !$$1.a_($$3.e()).a(dig.kK);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.gb();
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      if (cmw.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dig.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      bsd $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.ga();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awl.mp);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gu() {
      return this.cj;
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected int eq() {
      return this.bN;
   }

   private void gw() {
      this.a(bul.bt, btz.a(this, true, false), $$0 -> $$0.a(new btj(btl.i, 200, 0)));
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ap);
   }

   public boolean t() {
      return !this.p_();
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.gx()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.aw().a(cc, $$0);
   }

   private boolean gx() {
      return this.aw().a(cc);
   }

   public boolean y() {
      return !this.dX().D_().b() && !this.gx() && !this.gh();
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gv() {
      return this.t() && !this.cl;
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      cmv $$2 = bul.Z.a($$0, buk.e);
      if ($$2 != null) {
         $$2.ga();
      }

      return $$2;
   }

   @Override
   public boolean gB() {
      return !cmw.c(this) && super.gB();
   }

   @Override
   public awm dn() {
      return awm.f;
   }

   @Override
   protected awk w() {
      return this.dX().C ? null : cmw.b(this).orElse(null);
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.ms;
   }

   @Override
   protected awk o_() {
      return awl.mr;
   }

   @Override
   protected awk aW() {
      return awl.mX;
   }

   @Override
   protected awk aX() {
      return awl.mW;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.mu, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   @Nullable
   @Override
   public bva m() {
      return this.R();
   }
}
