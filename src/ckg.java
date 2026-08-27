import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckg extends cee implements ciu, cki {
   private static final ajr<Boolean> cb = ajv.a(ckg.class, ajt.k);
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
   protected static final ImmutableList<? extends ccz<? extends ccy<? super ckg>>> bY = ImmutableList.of(ccz.c, ccz.d, ccz.o, ccz.n);
   protected static final ImmutableList<? extends cbs<?>> bZ = ImmutableList.of(
      cbs.r,
      cbs.g,
      cbs.h,
      cbs.k,
      cbs.l,
      cbs.n,
      cbs.m,
      cbs.E,
      cbs.t,
      cbs.o,
      cbs.p,
      cbs.aq,
      new cbs[]{cbs.z, cbs.as, cbs.at, cbs.ap, cbs.K, cbs.aw, cbs.ax, cbs.Z}
   );

   public ckg(bsa<? extends ckg> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(clw $$0) {
      return !this.gc();
   }

   public static btv.a s() {
      return cjc.gv().a(btw.q, 40.0).a(btw.r, 0.3F).a(btw.n, 0.6F).a(btw.d, 1.0).a(btw.c, 6.0);
   }

   @Override
   public boolean C(bru $$0) {
      if (!($$0 instanceof bso)) {
         return false;
      } else {
         this.ck = 10;
         this.dP().a(this, (byte)4);
         this.b(avh.mq);
         ckh.a(this, (bso)$$0);
         return cki.a(this, (bso)$$0);
      }
   }

   @Override
   protected void e(bso $$0) {
      if (this.u()) {
         cki.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bso) {
            ckh.b(this, (bso)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected btq.b<ckg> dT() {
      return btq.a(bZ, bY);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return ckh.a(this.dT().a($$0));
   }

   @Override
   public btq<ckg> dS() {
      return (btq<ckg>)super.dS();
   }

   @Override
   protected void Y() {
      this.dP().af().a("hoglinBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
      ckh.a(this);
      if (this.y()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(avh.mr);
            this.c((aqm)this.dP());
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
         this.f(btw.c).a(0.5);
      } else {
         this.bN = 5;
         this.f(btw.c).a(6.0);
      }
   }

   public static boolean c(bsa<ckg> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return !$$1.a_($$3.d()).a(dea.kK);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fV();
   }

   @Override
   public float a(io $$0, dba $$1) {
      if (ckh.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dea.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      bpu $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fT();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(avh.mq);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gp() {
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

   private void c(aqm $$0) {
      cju $$1 = this.a(bsa.bt, true);
      if ($$1 != null) {
         $$1.b(new brc(bre.i, 200, 0));
      }
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.am);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.gw()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cl);
      if (this.cm) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cl = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.ap().a(cb, $$0);
   }

   private boolean gw() {
      return this.ap().a(cb);
   }

   public boolean y() {
      return !this.dP().D_().b() && !this.gw() && !this.gf();
   }

   private void x(boolean $$0) {
      this.cm = $$0;
   }

   public boolean gv() {
      return this.u() && !this.cm;
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      ckg $$2 = bsa.Z.a((dax)$$0);
      if ($$2 != null) {
         $$2.fT();
      }

      return $$2;
   }

   @Override
   public boolean gq() {
      return !ckh.c(this) && super.gq();
   }

   @Override
   public avi de() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return this.dP().B ? null : ckh.b(this).orElse(null);
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.mt;
   }

   @Override
   protected avg o_() {
      return avh.ms;
   }

   @Override
   protected avg aP() {
      return avh.mY;
   }

   @Override
   protected avg aQ() {
      return avh.mX;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.mv, 0.15F, 1.0F);
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }
}
