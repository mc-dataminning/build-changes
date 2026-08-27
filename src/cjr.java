import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjr extends cdp implements cif, cjt {
   private static final ajm<Boolean> cb = ajq.a(cjr.class, ajo.k);
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
   protected static final ImmutableList<? extends cck<? extends ccj<? super cjr>>> bY = ImmutableList.of(cck.c, cck.d, cck.o, cck.n);
   protected static final ImmutableList<? extends cbd<?>> bZ = ImmutableList.of(
      cbd.r,
      cbd.g,
      cbd.h,
      cbd.k,
      cbd.l,
      cbd.n,
      cbd.m,
      cbd.E,
      cbd.t,
      cbd.o,
      cbd.p,
      cbd.aq,
      new cbd[]{cbd.z, cbd.as, cbd.at, cbd.ap, cbd.K, cbd.aw, cbd.ax, cbd.Z}
   );

   public cjr(brn<? extends cjr> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(clh $$0) {
      return !this.gc();
   }

   public static btg.a r() {
      return cin.gv().a(bth.q, 40.0).a(bth.r, 0.3F).a(bth.n, 0.6F).a(bth.d, 1.0).a(bth.c, 6.0);
   }

   @Override
   public boolean C(brh $$0) {
      if (!($$0 instanceof bsa)) {
         return false;
      } else {
         this.ck = 10;
         this.dN().a(this, (byte)4);
         this.b(avc.mg);
         cjs.a(this, (bsa)$$0);
         return cjt.a(this, (bsa)$$0);
      }
   }

   @Override
   protected void e(bsa $$0) {
      if (this.u()) {
         cjt.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bsa) {
            cjs.b(this, (bsa)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected btb.b<cjr> dR() {
      return btb.a(bZ, bY);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cjs.a(this.dR().a($$0));
   }

   @Override
   public btb<cjr> dQ() {
      return (btb<cjr>)super.dQ();
   }

   @Override
   protected void Y() {
      this.dN().af().a("hoglinBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      cjs.a(this);
      if (this.y()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(avc.mh);
            this.c((aqh)this.dN());
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
         this.f(bth.c).a(0.5);
      } else {
         this.bN = 5;
         this.f(bth.c).a(6.0);
      }
   }

   public static boolean c(brn<cjr> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return !$$1.a_($$3.d()).a(ddg.kK);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
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
   public float a(in $$0, dag $$1) {
      if (cjs.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(ddg.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      bpm $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fT();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(avc.mg);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gp() {
      return this.ck;
   }

   @Override
   public boolean ef() {
      return true;
   }

   @Override
   public int eh() {
      return this.bN;
   }

   private void c(aqh $$0) {
      cjf $$1 = this.a(brn.bs, true);
      if ($$1 != null) {
         $$1.b(new bqt(bqv.i, 200, 0));
      }
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.am);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   @Override
   public void b(ua $$0) {
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
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cl = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().a(cb, $$0);
   }

   private boolean gw() {
      return this.an().a(cb);
   }

   public boolean y() {
      return !this.dN().D_().b() && !this.gw() && !this.gf();
   }

   private void x(boolean $$0) {
      this.cm = $$0;
   }

   public boolean gv() {
      return this.u() && !this.cm;
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      cjr $$2 = brn.Z.a((dad)$$0);
      if ($$2 != null) {
         $$2.fT();
      }

      return $$2;
   }

   @Override
   public boolean gq() {
      return !cjs.c(this) && super.gq();
   }

   @Override
   public avd dc() {
      return avd.f;
   }

   @Override
   protected avb v() {
      return this.dN().B ? null : cjs.b(this).orElse(null);
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.mj;
   }

   @Override
   protected avb o_() {
      return avc.mi;
   }

   @Override
   protected avb aN() {
      return avc.mO;
   }

   @Override
   protected avb aO() {
      return avc.mN;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.ml, 0.15F, 1.0F);
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }
}
