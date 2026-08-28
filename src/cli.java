import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cli extends cfg implements cjw, clk {
   private static final akk<Boolean> cb = ako.a(cli.class, akm.k);
   private static final float cc = 0.2F;
   private static final int cd = 40;
   private static final float ce = 0.3F;
   private static final int cf = 1;
   private static final float cg = 0.6F;
   private static final int ch = 6;
   private static final float ci = 0.5F;
   private static final int cj = 300;
   private int ck;
   private int cl;
   private boolean cm;
   protected static final ImmutableList<? extends ceb<? extends cea<? super cli>>> bY = ImmutableList.of(ceb.c, ceb.d, ceb.o, ceb.n);
   protected static final ImmutableList<? extends ccu<?>> bZ = ImmutableList.of(
      ccu.r,
      ccu.g,
      ccu.h,
      ccu.k,
      ccu.l,
      ccu.n,
      ccu.m,
      ccu.E,
      ccu.t,
      ccu.o,
      ccu.p,
      ccu.aq,
      new ccu[]{ccu.z, ccu.as, ccu.at, ccu.ap, ccu.K, ccu.aw, ccu.ax, ccu.Z}
   );

   public cli(btb<? extends cli> $$0, dbz $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(cmy $$0) {
      return !this.gd();
   }

   public static bux.a s() {
      return cke.gw().a(buy.q, 40.0).a(buy.r, 0.3F).a(buy.n, 0.6F).a(buy.d, 1.0).a(buy.c, 6.0);
   }

   @Override
   public boolean C(bsv $$0) {
      if (!($$0 instanceof btq)) {
         return false;
      } else {
         this.ck = 10;
         this.dP().a(this, (byte)4);
         this.b(awa.mq);
         clj.a(this, (btq)$$0);
         return clk.a(this, (btq)$$0);
      }
   }

   @Override
   protected void e(btq $$0) {
      if (this.u()) {
         clk.b(this, $$0);
      }
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btq) {
            clj.b(this, (btq)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bus.b<cli> dT() {
      return bus.a(bZ, bY);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return clj.a(this.dT().a($$0));
   }

   @Override
   public bus<cli> dS() {
      return (bus<cli>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("hoglinBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      clj.a(this);
      if (this.y()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(awa.mr);
            this.c((arf)this.dP());
         }
      } else {
         this.cl = 0;
      }
   }

   @Override
   public void n_() {
      if (this.ck > 0) {
         this.ck--;
      }

      super.n_();
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.bN = 3;
         this.f(buy.c).a(0.5);
      } else {
         this.bN = 5;
         this.f(buy.c).a(6.0);
      }
   }

   public static boolean c(btb<cli> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return !$$1.a_($$3.d()).a(dfc.kK);
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fW();
   }

   @Override
   public float a(iz $$0, dcc $$1) {
      if (clj.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dfc.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      bqv $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fU();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(awa.mq);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gq() {
      return this.ck;
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   public int ej() {
      return this.bN;
   }

   private void c(arf $$0) {
      ckw $$1 = this.a(btb.bt, true);
      if ($$1 != null) {
         $$1.b(new bsd(bsf.i, 200, 0));
      }
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.am);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      if (this.gx()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cl);
      if (this.cm) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cl = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.ap().a(cb, $$0);
   }

   private boolean gx() {
      return this.ap().a(cb);
   }

   public boolean y() {
      return !this.dP().D_().b() && !this.gx() && !this.gg();
   }

   private void x(boolean $$0) {
      this.cm = $$0;
   }

   public boolean gw() {
      return this.u() && !this.cm;
   }

   @Nullable
   @Override
   public bsp a(arf $$0, bsp $$1) {
      cli $$2 = btb.Z.a((dbz)$$0);
      if ($$2 != null) {
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean gr() {
      return !clj.c(this) && super.gr();
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   protected avz v() {
      return this.dP().B ? null : clj.b(this).orElse(null);
   }

   @Override
   protected avz d(bro $$0) {
      return awa.mt;
   }

   @Override
   protected avz o_() {
      return awa.ms;
   }

   @Override
   protected avz aP() {
      return awa.mY;
   }

   @Override
   protected avz aQ() {
      return awa.mX;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.mv, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Nullable
   @Override
   public btq p() {
      return this.N();
   }
}
