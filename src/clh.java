import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clh extends cff implements cjv, clj {
   private static final akk<Boolean> cb = ako.a(clh.class, akm.k);
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
   protected static final ImmutableList<? extends cea<? extends cdz<? super clh>>> bY = ImmutableList.of(cea.c, cea.d, cea.o, cea.n);
   protected static final ImmutableList<? extends cct<?>> bZ = ImmutableList.of(
      cct.r,
      cct.g,
      cct.h,
      cct.k,
      cct.l,
      cct.n,
      cct.m,
      cct.E,
      cct.t,
      cct.o,
      cct.p,
      cct.aq,
      new cct[]{cct.z, cct.as, cct.at, cct.ap, cct.K, cct.aw, cct.ax, cct.Z}
   );

   public clh(bta<? extends clh> $$0, dby $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(cmx $$0) {
      return !this.gd();
   }

   public static buw.a s() {
      return ckd.gw().a(bux.q, 40.0).a(bux.r, 0.3F).a(bux.n, 0.6F).a(bux.d, 1.0).a(bux.c, 6.0);
   }

   @Override
   public boolean C(bsu $$0) {
      if (!($$0 instanceof btp)) {
         return false;
      } else {
         this.ck = 10;
         this.dP().a(this, (byte)4);
         this.b(awa.mq);
         cli.a(this, (btp)$$0);
         return clj.a(this, (btp)$$0);
      }
   }

   @Override
   protected void e(btp $$0) {
      if (this.u()) {
         clj.b(this, $$0);
      }
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btp) {
            cli.b(this, (btp)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bur.b<clh> dT() {
      return bur.a(bZ, bY);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return cli.a(this.dT().a($$0));
   }

   @Override
   public bur<clh> dS() {
      return (bur<clh>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("hoglinBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      cli.a(this);
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
         this.f(bux.c).a(0.5);
      } else {
         this.bN = 5;
         this.f(bux.c).a(6.0);
      }
   }

   public static boolean c(bta<clh> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return !$$1.a_($$3.d()).a(dfb.kK);
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
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
   public float a(iz $$0, dcb $$1) {
      if (cli.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dfb.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      bqu $$2 = super.b($$0, $$1);
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
      ckv $$1 = this.a(bta.bt, true);
      if ($$1 != null) {
         $$1.b(new bsc(bse.i, 200, 0));
      }
   }

   @Override
   public boolean o(cup $$0) {
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
   public bso a(arf $$0, bso $$1) {
      clh $$2 = bta.Z.a((dby)$$0);
      if ($$2 != null) {
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean gr() {
      return !cli.c(this) && super.gr();
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   protected avz v() {
      return this.dP().B ? null : cli.b(this).orElse(null);
   }

   @Override
   protected avz d(brn $$0) {
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
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.mv, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Nullable
   @Override
   public btp p() {
      return this.N();
   }
}
