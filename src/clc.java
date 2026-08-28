import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clc extends cfa implements cjq, cle {
   private static final akg<Boolean> cb = akk.a(clc.class, aki.k);
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
   protected static final ImmutableList<? extends cdv<? extends cdu<? super clc>>> bY = ImmutableList.of(cdv.c, cdv.d, cdv.o, cdv.n);
   protected static final ImmutableList<? extends cco<?>> bZ = ImmutableList.of(
      cco.r,
      cco.g,
      cco.h,
      cco.k,
      cco.l,
      cco.n,
      cco.m,
      cco.E,
      cco.t,
      cco.o,
      cco.p,
      cco.aq,
      new cco[]{cco.z, cco.as, cco.at, cco.ap, cco.K, cco.aw, cco.ax, cco.Z}
   );

   public clc(bsv<? extends clc> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(cms $$0) {
      return !this.gd();
   }

   public static bur.a s() {
      return cjy.gw().a(bus.q, 40.0).a(bus.r, 0.3F).a(bus.n, 0.6F).a(bus.d, 1.0).a(bus.c, 6.0);
   }

   @Override
   public boolean C(bsp $$0) {
      if (!($$0 instanceof btk)) {
         return false;
      } else {
         this.ck = 10;
         this.dP().a(this, (byte)4);
         this.b(avw.mq);
         cld.a(this, (btk)$$0);
         return cle.a(this, (btk)$$0);
      }
   }

   @Override
   protected void e(btk $$0) {
      if (this.u()) {
         cle.b(this, $$0);
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btk) {
            cld.b(this, (btk)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bum.b<clc> dT() {
      return bum.a(bZ, bY);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return cld.a(this.dT().a($$0));
   }

   @Override
   public bum<clc> dS() {
      return (bum<clc>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("hoglinBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().c();
      cld.a(this);
      if (this.y()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(avw.mr);
            this.c((arb)this.dP());
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
         this.f(bus.c).a(0.5);
      } else {
         this.bN = 5;
         this.f(bus.c).a(6.0);
      }
   }

   public static boolean c(bsv<clc> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return !$$1.a_($$3.d()).a(dew.kK);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
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
   public float a(iz $$0, dbw $$1) {
      if (cld.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dew.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      bqp $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fU();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(avw.mq);
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

   private void c(arb $$0) {
      ckq $$1 = this.a(bsv.bt, true);
      if ($$1 != null) {
         $$1.b(new brx(brz.i, 200, 0));
      }
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.am);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   @Override
   public void b(ur $$0) {
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
   public void a(ur $$0) {
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
   public bsj a(arb $$0, bsj $$1) {
      clc $$2 = bsv.Z.a((dbt)$$0);
      if ($$2 != null) {
         $$2.fU();
      }

      return $$2;
   }

   @Override
   public boolean gr() {
      return !cld.c(this) && super.gr();
   }

   @Override
   public avx de() {
      return avx.f;
   }

   @Override
   protected avv v() {
      return this.dP().B ? null : cld.b(this).orElse(null);
   }

   @Override
   protected avv d(bri $$0) {
      return avw.mt;
   }

   @Override
   protected avv o_() {
      return avw.ms;
   }

   @Override
   protected avv aP() {
      return avw.mY;
   }

   @Override
   protected avv aQ() {
      return avw.mX;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.mv, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   @Nullable
   @Override
   public btk p() {
      return this.N();
   }
}
