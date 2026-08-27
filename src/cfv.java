import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cfv extends bzx implements cej, cfx {
   private static final aie<Boolean> bW = aih.a(cfv.class, aig.k);
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
   protected static final ImmutableList<? extends bys<? extends byr<? super cfv>>> bT = ImmutableList.of(bys.c, bys.d, bys.o, bys.n);
   protected static final ImmutableList<? extends bxl<?>> bU = ImmutableList.of(
      bxl.r,
      bxl.g,
      bxl.h,
      bxl.k,
      bxl.l,
      bxl.n,
      bxl.m,
      bxl.E,
      bxl.t,
      bxl.o,
      bxl.p,
      bxl.aq,
      new bxl[]{bxl.z, bxl.as, bxl.at, bxl.ap, bxl.K, bxl.aw, bxl.ax, bxl.Z}
   );

   public cfv(bnw<? extends cfv> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(chl $$0) {
      return !this.fU();
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.n, 40.0).a(bpp.o, 0.3F).a(bpp.k, 0.6F).a(bpp.d, 1.0).a(bpp.c, 6.0);
   }

   @Override
   public boolean B(bnq $$0) {
      if (!($$0 instanceof boi)) {
         return false;
      } else {
         this.cf = 10;
         this.dM().a(this, (byte)4);
         this.b(atl.lS);
         cfw.a(this, (boi)$$0);
         return cfx.a(this, (boi)$$0);
      }
   }

   @Override
   protected void e(boi $$0) {
      if (this.w()) {
         cfx.b(this, $$0);
      }
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof boi) {
            cfw.b(this, (boi)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bpj.b<cfv> dP() {
      return bpj.a(bU, bT);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cfw.a(this.dP().a($$0));
   }

   @Override
   public bpj<cfv> dO() {
      return (bpj<cfv>)super.dO();
   }

   @Override
   protected void aa() {
      this.dM().ae().a("hoglinBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      cfw.a(this);
      if (this.A()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(atl.lT);
            this.c((aow)this.dM());
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
         this.f(bpp.c).a(0.5);
      } else {
         this.bJ = 5;
         this.f(bpp.c).a(6.0);
      }
   }

   public static boolean c(bnw<cfv> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return !$$1.a_($$3.d()).a(cyu.kK);
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
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
   public float a(hz $$0, cvu $$1) {
      if (cfw.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cyu.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      blw $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fL();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.b(atl.lS);
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

   private void c(aow $$0) {
      cfj $$1 = this.a(bnw.br, true);
      if ($$1 != null) {
         $$1.b(new bnd(bnf.i, 200, 0));
      }
   }

   @Override
   public boolean m(cpd $$0) {
      return $$0.a(cpg.dB);
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
   public bnl a(aow $$0, bnl $$1) {
      cfv $$2 = bnw.Y.a((cvr)$$0);
      if ($$2 != null) {
         $$2.fL();
      }

      return $$2;
   }

   @Override
   public boolean gh() {
      return !cfw.c(this) && super.gh();
   }

   @Override
   public atm db() {
      return atm.f;
   }

   @Override
   protected atk y() {
      return this.dM().B ? null : cfw.b(this).orElse(null);
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.lV;
   }

   @Override
   protected atk n_() {
      return atl.lU;
   }

   @Override
   protected atk aN() {
      return atl.mA;
   }

   @Override
   protected atk aO() {
      return atl.mz;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.lX, 0.15F, 1.0F);
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }
}
