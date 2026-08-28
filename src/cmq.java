import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cmq extends cgm implements cle, cms {
   private static final akk<Boolean> cc = ako.a(cmq.class, akm.k);
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
   protected static final ImmutableList<? extends cfg<? extends cff<? super cmq>>> bZ = ImmutableList.of(cfg.c, cfg.d, cfg.o, cfg.n);
   protected static final ImmutableList<? extends cdz<?>> ca = ImmutableList.of(
      cdz.r,
      cdz.g,
      cdz.h,
      cdz.k,
      cdz.l,
      cdz.n,
      cdz.m,
      cdz.E,
      cdz.t,
      cdz.o,
      cdz.p,
      cdz.aq,
      new cdz[]{cdz.z, cdz.as, cdz.at, cdz.ap, cdz.K, cdz.aw, cdz.ax, cdz.Z}
   );

   public cmq(bug<? extends cmq> $$0, dev $$1) {
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

   public static bwc.a q() {
      return clm.gB().a(bwd.s, 40.0).a(bwd.v, 0.3F).a(bwd.p, 0.6F).a(bwd.d, 1.0).a(bwd.c, 6.0);
   }

   @Override
   public boolean E(btz $$0) {
      if (!($$0 instanceof buv)) {
         return false;
      } else {
         this.cj = 10;
         this.dX().a(this, (byte)4);
         this.b(awk.mp);
         cmr.a(this, (buv)$$0);
         return cms.a(this, (buv)$$0);
      }
   }

   @Override
   protected void e(buv $$0) {
      if (this.t()) {
         cms.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dX().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof buv) {
            cmr.b(this, (buv)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bvx.b<cmq> ee() {
      return bvx.a(ca, bZ);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cmr.a(this.ee().a($$0));
   }

   @Override
   public bvx<cmq> ed() {
      return (bvx<cmq>)super.ed();
   }

   @Override
   protected void ac() {
      this.dX().ah().a("hoglinBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      cmr.a(this);
      if (this.y()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(awk.mq);
            this.gx();
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
         this.g(bwd.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bwd.c).a(6.0);
      }
   }

   public static boolean c(bug<cmq> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return !$$1.a_($$3.e()).a(dia.kK);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.gc();
   }

   @Override
   public float a(jg $$0, dey $$1) {
      if (cmr.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dia.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      bry $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.gb();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awk.mp);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gv() {
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

   private void gx() {
      this.a(bug.bt, btu.a(this, true, false), $$0 -> $$0.a(new bte(btg.i, 200, 0)));
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.an);
   }

   public boolean t() {
      return !this.p_();
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (this.gy()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.av().a(cc, $$0);
   }

   private boolean gy() {
      return this.av().a(cc);
   }

   public boolean y() {
      return !this.dX().D_().b() && !this.gy() && !this.gi();
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gw() {
      return this.t() && !this.cl;
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      cmq $$2 = bug.Z.a($$0, buf.e);
      if ($$2 != null) {
         $$2.gb();
      }

      return $$2;
   }

   @Override
   public boolean gC() {
      return !cmr.c(this) && super.gC();
   }

   @Override
   public awl dn() {
      return awl.f;
   }

   @Override
   protected awj w() {
      return this.dX().C ? null : cmr.b(this).orElse(null);
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.ms;
   }

   @Override
   protected awj o_() {
      return awk.mr;
   }

   @Override
   protected awj aV() {
      return awk.mX;
   }

   @Override
   protected awj aW() {
      return awk.mW;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.mu, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   @Nullable
   @Override
   public buv m() {
      return this.R();
   }
}
