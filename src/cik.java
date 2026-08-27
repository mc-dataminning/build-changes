import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cik extends cci implements cgy, cim {
   private static final aja<Boolean> ca = aje.a(cik.class, ajc.k);
   private static final float cb = 0.2F;
   private static final int cc = 40;
   private static final float cd = 0.3F;
   private static final int ce = 1;
   private static final float cf = 0.6F;
   private static final int cg = 6;
   private static final float ch = 0.5F;
   private static final int ci = 300;
   private int cj;
   private int ck;
   private boolean cl;
   protected static final ImmutableList<? extends cbd<? extends cbc<? super cik>>> bX = ImmutableList.of(cbd.c, cbd.d, cbd.o, cbd.n);
   protected static final ImmutableList<? extends bzw<?>> bY = ImmutableList.of(
      bzw.r,
      bzw.g,
      bzw.h,
      bzw.k,
      bzw.l,
      bzw.n,
      bzw.m,
      bzw.E,
      bzw.t,
      bzw.o,
      bzw.p,
      bzw.aq,
      new bzw[]{bzw.z, bzw.as, bzw.at, bzw.ap, bzw.K, bzw.aw, bzw.ax, bzw.Z}
   );

   public cik(bqg<? extends cik> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public boolean a(cka $$0) {
      return !this.gb();
   }

   public static brz.a r() {
      return chg.gt().a(bsa.q, 40.0).a(bsa.r, 0.3F).a(bsa.n, 0.6F).a(bsa.d, 1.0).a(bsa.c, 6.0);
   }

   @Override
   public boolean C(bqa $$0) {
      if (!($$0 instanceof bqt)) {
         return false;
      } else {
         this.cj = 10;
         this.dM().a(this, (byte)4);
         this.b(auo.mb);
         cil.a(this, (bqt)$$0);
         return cim.a(this, (bqt)$$0);
      }
   }

   @Override
   protected void e(bqt $$0) {
      if (this.u()) {
         cim.b(this, $$0);
      }
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bqt) {
            cil.b(this, (bqt)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bru.b<cik> dQ() {
      return bru.a(bY, bX);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cil.a(this.dQ().a($$0));
   }

   @Override
   public bru<cik> dP() {
      return (bru<cik>)super.dP();
   }

   @Override
   protected void Y() {
      this.dM().af().a("hoglinBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
      cil.a(this);
      if (this.y()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(auo.mc);
            this.c((apu)this.dM());
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
         this.bM = 3;
         this.f(bsa.c).a(0.5);
      } else {
         this.bM = 5;
         this.f(bsa.c).a(6.0);
      }
   }

   public static boolean c(bqg<cik> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return !$$1.a_($$3.d()).a(dcj.kK);
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fU();
   }

   @Override
   public float a(id $$0, czj $$1) {
      if (cil.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dcj.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      bof $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fS();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(auo.mb);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gn() {
      return this.cj;
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   public int eg() {
      return this.bM;
   }

   private void c(apu $$0) {
      chy $$1 = this.a(bqg.bs, true);
      if ($$1 != null) {
         $$1.b(new bpm(bpo.i, 200, 0));
      }
   }

   @Override
   public boolean o(crs $$0) {
      return $$0.a(crv.dB);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().a(ca, $$0);
   }

   private boolean gu() {
      return this.an().a(ca);
   }

   public boolean y() {
      return !this.dM().D_().b() && !this.gu() && !this.gd();
   }

   private void x(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gt() {
      return this.u() && !this.cl;
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      cik $$2 = bqg.Z.a((czg)$$0);
      if ($$2 != null) {
         $$2.fS();
      }

      return $$2;
   }

   @Override
   public boolean go() {
      return !cil.c(this) && super.go();
   }

   @Override
   public aup db() {
      return aup.f;
   }

   @Override
   protected aun v() {
      return this.dM().B ? null : cil.b(this).orElse(null);
   }

   @Override
   protected aun d(boy $$0) {
      return auo.me;
   }

   @Override
   protected aun o_() {
      return auo.md;
   }

   @Override
   protected aun aN() {
      return auo.mJ;
   }

   @Override
   protected aun aO() {
      return auo.mI;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.mg, 0.15F, 1.0F);
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }
}
