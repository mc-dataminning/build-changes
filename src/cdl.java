import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdl extends bxs implements ccb, cdn {
   private static final agj<Boolean> bW = agm.a(cdl.class, agl.k);
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
   protected static final ImmutableList<? extends bwn<? extends bwm<? super cdl>>> bT = ImmutableList.of(bwn.c, bwn.d, bwn.n, bwn.m);
   protected static final ImmutableList<? extends bvh<?>> bU = ImmutableList.of(
      bvh.r,
      bvh.g,
      bvh.h,
      bvh.k,
      bvh.l,
      bvh.n,
      bvh.m,
      bvh.E,
      bvh.t,
      bvh.o,
      bvh.p,
      bvh.ap,
      new bvh[]{bvh.z, bvh.ar, bvh.as, bvh.ao, bvh.J, bvh.av, bvh.aw, bvh.Y}
   );

   public cdl(blt<? extends cdl> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cfb $$0) {
      return !this.fS();
   }

   public static bnk.a u() {
      return ccj.gk().a(bnl.l, 40.0).a(bnl.m, 0.3F).a(bnl.i, 0.6F).a(bnl.d, 1.0).a(bnl.c, 6.0);
   }

   @Override
   public boolean C(blp $$0) {
      if (!($$0 instanceof bmf)) {
         return false;
      } else {
         this.cf = 10;
         this.dM().a(this, (byte)4);
         this.a(arm.lC, 1.0F, this.eX());
         cdm.a(this, (bmf)$$0);
         return cdn.a(this, (bmf)$$0);
      }
   }

   @Override
   protected void e(bmf $$0) {
      if (this.w()) {
         cdn.b(this, $$0);
      }
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bmf) {
            cdm.b(this, (bmf)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bnf.b<cdl> dP() {
      return bnf.a(bU, bT);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return cdm.a(this.dP().a($$0));
   }

   @Override
   public bnf<cdl> dO() {
      return (bnf<cdl>)super.dO();
   }

   @Override
   protected void Z() {
      this.dM().af().a("hoglinBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      cdm.a(this);
      if (this.A()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(arm.lD);
            this.c((amz)this.dM());
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
         this.a(bnl.c).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bnl.c).a(6.0);
      }
   }

   public static boolean c(blt<cdl> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return !$$1.a_($$3.d()).a(cwl.kK);
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
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
   public float a(hx $$0, ctl $$1) {
      if (cdm.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cwl.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      bjv $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fJ();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(arm.lC, 1.0F, this.eX());
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

   private void c(amz $$0) {
      cdb $$1 = this.a(blt.bq, true);
      if ($$1 != null) {
         $$1.b(new blc(ble.i, 200, 0));
      }
   }

   @Override
   public boolean m(cmr $$0) {
      return $$0.a(cmu.dB);
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
   public void b(sl $$0) {
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
   public void a(sl $$0) {
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
   public blk a(amz $$0, blk $$1) {
      cdl $$2 = blt.X.a((cti)$$0);
      if ($$2 != null) {
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean gf() {
      return !cdm.c(this) && super.gf();
   }

   @Override
   public arn db() {
      return arn.f;
   }

   @Override
   protected arl y() {
      return this.dM().B ? null : cdm.b(this).orElse(null);
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.lF;
   }

   @Override
   protected arl n_() {
      return arm.lE;
   }

   @Override
   protected arl aN() {
      return arm.mk;
   }

   @Override
   protected arl aO() {
      return arm.mj;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.lH, 0.15F, 1.0F);
   }

   protected void b(arl $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }
}
