import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cds extends bxy implements cch, cdu {
   private static final agm<Boolean> bW = agp.a(cds.class, ago.k);
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
   protected static final ImmutableList<? extends bwt<? extends bws<? super cds>>> bT = ImmutableList.of(bwt.c, bwt.d, bwt.n, bwt.m);
   protected static final ImmutableList<? extends bvn<?>> bU = ImmutableList.of(
      bvn.r,
      bvn.g,
      bvn.h,
      bvn.k,
      bvn.l,
      bvn.n,
      bvn.m,
      bvn.E,
      bvn.t,
      bvn.o,
      bvn.p,
      bvn.ap,
      new bvn[]{bvn.z, bvn.ar, bvn.as, bvn.ao, bvn.J, bvn.av, bvn.aw, bvn.Y}
   );

   public cds(blz<? extends cds> $$0, ctp $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cfi $$0) {
      return !this.fS();
   }

   public static bnq.a u() {
      return ccp.gk().a(bnr.l, 40.0).a(bnr.m, 0.3F).a(bnr.i, 0.6F).a(bnr.d, 1.0).a(bnr.c, 6.0);
   }

   @Override
   public boolean C(blv $$0) {
      if (!($$0 instanceof bml)) {
         return false;
      } else {
         this.cf = 10;
         this.dM().a(this, (byte)4);
         this.a(ars.lC, 1.0F, this.eX());
         cdt.a(this, (bml)$$0);
         return cdu.a(this, (bml)$$0);
      }
   }

   @Override
   protected void e(bml $$0) {
      if (this.w()) {
         cdu.b(this, $$0);
      }
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bml) {
            cdt.b(this, (bml)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bnl.b<cds> dP() {
      return bnl.a(bU, bT);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return cdt.a(this.dP().a($$0));
   }

   @Override
   public bnl<cds> dO() {
      return (bnl<cds>)super.dO();
   }

   @Override
   protected void Z() {
      this.dM().af().a("hoglinBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      cdt.a(this);
      if (this.A()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(ars.lD);
            this.c((and)this.dM());
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
         this.a(bnr.c).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bnr.c).a(6.0);
      }
   }

   public static boolean c(blz<cds> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return !$$1.a_($$3.d()).a(cws.kK);
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
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
   public float a(hx $$0, cts $$1) {
      if (cdt.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cws.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      bkb $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fJ();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(ars.lC, 1.0F, this.eX());
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

   private void c(and $$0) {
      cdh $$1 = this.a(blz.bq, true);
      if ($$1 != null) {
         $$1.b(new bli(blk.i, 200, 0));
      }
   }

   @Override
   public boolean m(cmy $$0) {
      return $$0.a(cnb.dB);
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
   public void b(sn $$0) {
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
   public void a(sn $$0) {
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
   public blq a(and $$0, blq $$1) {
      cds $$2 = blz.X.a((ctp)$$0);
      if ($$2 != null) {
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean gf() {
      return !cdt.c(this) && super.gf();
   }

   @Override
   public art db() {
      return art.f;
   }

   @Override
   protected arr y() {
      return this.dM().B ? null : cdt.b(this).orElse(null);
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.lF;
   }

   @Override
   protected arr n_() {
      return ars.lE;
   }

   @Override
   protected arr aN() {
      return ars.mk;
   }

   @Override
   protected arr aO() {
      return ars.mj;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.lH, 0.15F, 1.0F);
   }

   protected void b(arr $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }
}
