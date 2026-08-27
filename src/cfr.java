import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cfr extends bzt implements cef, cft {
   private static final aie<Boolean> bW = aih.a(cfr.class, aig.k);
   private static final float bX = 0.2F;
   private static final int bY = 40;
   private static final float bZ = 0.3F;
   private static final int ca = 1;
   private static final float cb = 0.6F;
   private static final int cc = 6;
   private static final float cd = 0.5F;
   private static final int ce = 300;
   private int cf;
   private int cg;
   private boolean ch;
   protected static final ImmutableList<? extends byo<? extends byn<? super cfr>>> bT = ImmutableList.of(byo.c, byo.d, byo.o, byo.n);
   protected static final ImmutableList<? extends bxh<?>> bU = ImmutableList.of(
      bxh.r,
      bxh.g,
      bxh.h,
      bxh.k,
      bxh.l,
      bxh.n,
      bxh.m,
      bxh.E,
      bxh.t,
      bxh.o,
      bxh.p,
      bxh.aq,
      new bxh[]{bxh.z, bxh.as, bxh.at, bxh.ap, bxh.K, bxh.aw, bxh.ax, bxh.Z}
   );

   public cfr(bnu<? extends cfr> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(chh $$0) {
      return !this.fU();
   }

   public static bpk.a u() {
      return cen.gm().a(bpl.n, 40.0).a(bpl.o, 0.3F).a(bpl.k, 0.6F).a(bpl.d, 1.0).a(bpl.c, 6.0);
   }

   @Override
   public boolean B(bno $$0) {
      if (!($$0 instanceof bog)) {
         return false;
      } else {
         this.cf = 10;
         this.dM().a(this, (byte)4);
         this.b(atk.lR);
         cfs.a(this, (bog)$$0);
         return cft.a(this, (bog)$$0);
      }
   }

   @Override
   protected void e(bog $$0) {
      if (this.w()) {
         cft.b(this, $$0);
      }
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bog) {
            cfs.b(this, (bog)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bpf.b<cfr> dP() {
      return bpf.a(bU, bT);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cfs.a(this.dP().a($$0));
   }

   @Override
   public bpf<cfr> dO() {
      return (bpf<cfr>)super.dO();
   }

   @Override
   protected void aa() {
      this.dM().af().a("hoglinBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().c();
      cfs.a(this);
      if (this.A()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(atk.lS);
            this.c((aov)this.dM());
         }
      } else {
         this.cg = 0;
      }
   }

   @Override
   public void d_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.d_();
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.bJ = 3;
         this.f(bpl.c).a(0.5);
      } else {
         this.bJ = 5;
         this.f(bpl.c).a(6.0);
      }
   }

   public static boolean c(bnu<cfr> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return !$$1.a_($$3.d()).a(cyq.kK);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      if ($$0.F_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fN();
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      if (cfs.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cyq.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      blu $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fL();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.b(atk.lR);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gg() {
      return this.cf;
   }

   @Override
   public boolean ed() {
      return true;
   }

   @Override
   public int ef() {
      return this.bJ;
   }

   private void c(aov $$0) {
      cff $$1 = this.a(bnu.br, true);
      if ($$1 != null) {
         $$1.b(new bnb(bnd.i, 200, 0));
      }
   }

   @Override
   public boolean m(coz $$0) {
      return $$0.a(cpc.dB);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bW, false);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.gn()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().b(bW, $$0);
   }

   private boolean gn() {
      return this.an().b(bW);
   }

   public boolean A() {
      return !this.dM().E_().b() && !this.gn() && !this.fW();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gm() {
      return this.w() && !this.ch;
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      cfr $$2 = bnu.Y.a((cvn)$$0);
      if ($$2 != null) {
         $$2.fL();
      }

      return $$2;
   }

   @Override
   public boolean gh() {
      return !cfs.c(this) && super.gh();
   }

   @Override
   public atl db() {
      return atl.f;
   }

   @Override
   protected atj y() {
      return this.dM().B ? null : cfs.b(this).orElse(null);
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.lU;
   }

   @Override
   protected atj n_() {
      return atk.lT;
   }

   @Override
   protected atj aN() {
      return atk.mz;
   }

   @Override
   protected atj aO() {
      return atk.my;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.lW, 0.15F, 1.0F);
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }
}
