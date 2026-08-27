import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdb extends bxi implements cbr, cdd {
   private static final afz<Boolean> bW = agc.a(cdb.class, agb.k);
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
   protected static final ImmutableList<? extends bwd<? extends bwc<? super cdb>>> bT = ImmutableList.of(bwd.c, bwd.d, bwd.n, bwd.m);
   protected static final ImmutableList<? extends bux<?>> bU = ImmutableList.of(
      bux.r,
      bux.g,
      bux.h,
      bux.k,
      bux.l,
      bux.n,
      bux.m,
      bux.E,
      bux.t,
      bux.o,
      bux.p,
      bux.ap,
      new bux[]{bux.z, bux.ar, bux.as, bux.ao, bux.J, bux.av, bux.aw, bux.Y}
   );

   public cdb(blj<? extends cdb> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cer $$0) {
      return !this.fS();
   }

   public static bna.a u() {
      return cbz.gk().a(bnb.l, 40.0).a(bnb.m, 0.3F).a(bnb.i, 0.6F).a(bnb.d, 1.0).a(bnb.c, 6.0);
   }

   @Override
   public boolean C(blf $$0) {
      if (!($$0 instanceof blv)) {
         return false;
      } else {
         this.cf = 10;
         this.dM().a(this, (byte)4);
         this.a(arc.lC, 1.0F, this.eX());
         cdc.a(this, (blv)$$0);
         return cdd.a(this, (blv)$$0);
      }
   }

   @Override
   protected void e(blv $$0) {
      if (this.w()) {
         cdd.b(this, $$0);
      }
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof blv) {
            cdc.b(this, (blv)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bmv.b<cdb> dP() {
      return bmv.a(bU, bT);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return cdc.a(this.dP().a($$0));
   }

   @Override
   public bmv<cdb> dO() {
      return (bmv<cdb>)super.dO();
   }

   @Override
   protected void Z() {
      this.dM().ae().a("hoglinBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      cdc.a(this);
      if (this.A()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(arc.lD);
            this.c((amp)this.dM());
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
         this.a(bnb.c).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bnb.c).a(6.0);
      }
   }

   public static boolean c(blj<cdb> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return !$$1.a_($$3.d()).a(cwb.kK);
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      if ($$0.F_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fL();
   }

   @Override
   public float a(hv $$0, ctb $$1) {
      if (cdc.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cwb.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      bjl $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fJ();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(arc.lC, 1.0F, this.eX());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int ge() {
      return this.cf;
   }

   @Override
   public boolean ec() {
      return true;
   }

   @Override
   public int ee() {
      return this.bJ;
   }

   private void c(amp $$0) {
      ccr $$1 = this.a(blj.bq, true);
      if ($$1 != null) {
         $$1.b(new bks(bku.i, 200, 0));
      }
   }

   @Override
   public boolean m(cmh $$0) {
      return $$0.a(cmk.dB);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bW, false);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      if (this.gl()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().b(bW, $$0);
   }

   private boolean gl() {
      return this.an().b(bW);
   }

   public boolean A() {
      return !this.dM().E_().b() && !this.gl() && !this.fU();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gk() {
      return this.w() && !this.ch;
   }

   @Nullable
   @Override
   public bla a(amp $$0, bla $$1) {
      cdb $$2 = blj.X.a((csy)$$0);
      if ($$2 != null) {
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean gf() {
      return !cdc.c(this) && super.gf();
   }

   @Override
   public ard db() {
      return ard.f;
   }

   @Override
   protected arb y() {
      return this.dM().B ? null : cdc.b(this).orElse(null);
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.lF;
   }

   @Override
   protected arb n_() {
      return arc.lE;
   }

   @Override
   protected arb aN() {
      return arc.mk;
   }

   @Override
   protected arb aO() {
      return arc.mj;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.lH, 0.15F, 1.0F);
   }

   protected void b(arb $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }
}
