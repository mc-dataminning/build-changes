import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cmz extends cgv implements cln, cnb {
   private static final ako<Boolean> cc = aks.a(cmz.class, akq.k);
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
   protected static final ImmutableList<? extends cfp<? extends cfo<? super cmz>>> bZ = ImmutableList.of(cfp.c, cfp.d, cfp.o, cfp.n);
   protected static final ImmutableList<? extends cei<?>> ca = ImmutableList.of(
      cei.r,
      cei.g,
      cei.h,
      cei.k,
      cei.l,
      cei.n,
      cei.m,
      cei.E,
      cei.t,
      cei.o,
      cei.p,
      cei.aq,
      new cei[]{cei.z, cei.as, cei.at, cei.ap, cei.K, cei.aw, cei.ax, cei.Z}
   );

   public cmz(bup<? extends cmz> $$0, dff $$1) {
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

   public static bwl.a q() {
      return clv.gB().a(bwm.s, 40.0).a(bwm.v, 0.3F).a(bwm.p, 0.6F).a(bwm.d, 1.0).a(bwm.c, 6.0);
   }

   @Override
   public boolean E(bui $$0) {
      if (!($$0 instanceof bve)) {
         return false;
      } else {
         this.cj = 10;
         this.dY().a(this, (byte)4);
         this.b(awo.mp);
         cna.a(this, (bve)$$0);
         return cnb.a(this, (bve)$$0);
      }
   }

   @Override
   protected void e(bve $$0) {
      if (this.t()) {
         cnb.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dY().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bve) {
            cna.b(this, (bve)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bwg.b<cmz> ef() {
      return bwg.a(ca, bZ);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cna.a(this.ef().a($$0));
   }

   @Override
   public bwg<cmz> ee() {
      return (bwg<cmz>)super.ee();
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("hoglinBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
      cna.a(this);
      if (this.y()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(awo.mq);
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
         this.g(bwm.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bwm.c).a(6.0);
      }
   }

   public static boolean c(bup<cmz> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return !$$1.a_($$3.e()).a(dil.kK);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
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
   public float a(jh $$0, dfi $$1) {
      if (cna.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dil.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      bsh $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.gb();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awo.mp);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gv() {
      return this.cj;
   }

   @Override
   public boolean ep() {
      return true;
   }

   @Override
   protected int er() {
      return this.bN;
   }

   private void gx() {
      this.a(bup.bt, bud.a(this, true, false), $$0 -> $$0.a(new btn(btp.i, 200, 0)));
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.aq);
   }

   public boolean t() {
      return !this.p_();
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void b(un $$0) {
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
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.aw().a(cc, $$0);
   }

   private boolean gy() {
      return this.aw().a(cc);
   }

   public boolean y() {
      return !this.dY().D_().b() && !this.gy() && !this.gi();
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gw() {
      return this.t() && !this.cl;
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      cmz $$2 = bup.Z.a($$0, buo.e);
      if ($$2 != null) {
         $$2.gb();
      }

      return $$2;
   }

   @Override
   public boolean gC() {
      return !cna.c(this) && super.gC();
   }

   @Override
   public awp do() {
      return awp.f;
   }

   @Override
   protected awn w() {
      return this.dY().C ? null : cna.b(this).orElse(null);
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.ms;
   }

   @Override
   protected awn o_() {
      return awo.mr;
   }

   @Override
   protected awn aX() {
      return awo.mX;
   }

   @Override
   protected awn aY() {
      return awo.mW;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.mu, 0.15F, 1.0F);
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   @Nullable
   @Override
   public bve m() {
      return this.R();
   }
}
