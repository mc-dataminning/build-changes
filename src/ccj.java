import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccj extends bww implements cbf, ccl {
   private static final afs<Boolean> bW = afv.a(ccj.class, afu.k);
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
   protected static final ImmutableList<? extends bvr<? extends bvq<? super ccj>>> bT = ImmutableList.of(bvr.c, bvr.d, bvr.n, bvr.m);
   protected static final ImmutableList<? extends bum<?>> bU = ImmutableList.of(
      bum.r,
      bum.g,
      bum.h,
      bum.k,
      bum.l,
      bum.n,
      bum.m,
      bum.E,
      bum.t,
      bum.o,
      bum.p,
      bum.ap,
      new bum[]{bum.z, bum.ar, bum.as, bum.ao, bum.J, bum.av, bum.aw, bum.Y}
   );

   public ccj(bkz<? extends ccj> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cdz $$0) {
      return !this.fT();
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.l, 40.0).a(bmr.m, 0.3F).a(bmr.i, 0.6F).a(bmr.d, 1.0).a(bmr.c, 6.0);
   }

   @Override
   public boolean C(bkv $$0) {
      if (!($$0 instanceof bll)) {
         return false;
      } else {
         this.cf = 10;
         this.dN().a(this, (byte)4);
         this.a(aqv.li, 1.0F, this.eY());
         cck.a(this, (bll)$$0);
         return ccl.a(this, (bll)$$0);
      }
   }

   @Override
   protected void e(bll $$0) {
      if (this.w()) {
         ccl.b(this, $$0);
      }
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bll) {
            cck.b(this, (bll)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bml.b<ccj> dQ() {
      return bml.a(bU, bT);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return cck.a(this.dQ().a($$0));
   }

   @Override
   public bml<ccj> dP() {
      return (bml<ccj>)super.dP();
   }

   @Override
   protected void Z() {
      this.dN().ae().a("hoglinBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      cck.a(this);
      if (this.A()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(aqv.lj);
            this.c((ami)this.dN());
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
         this.a(bmr.c).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bmr.c).a(6.0);
      }
   }

   public static boolean c(bkz<ccj> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return !$$1.a_($$3.d()).a(cvh.kK);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      if ($$0.F_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fM();
   }

   @Override
   public float a(hx $$0, csi $$1) {
      if (cck.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cvh.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      bjb $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fK();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(aqv.li, 1.0F, this.eY());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gf() {
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

   private void c(ami $$0) {
      ccf $$1 = this.a(bkz.bo, true);
      if ($$1 != null) {
         $$1.b(new bki(bkk.i, 200, 0));
      }
   }

   @Override
   public boolean m(clo $$0) {
      return $$0.a(clr.dB);
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
   public void b(sd $$0) {
      super.b($$0);
      if (this.gm()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().b(bW, $$0);
   }

   private boolean gm() {
      return this.an().b(bW);
   }

   public boolean A() {
      return !this.dN().E_().b() && !this.gm() && !this.fV();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gl() {
      return this.w() && !this.ch;
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      ccj $$2 = bkz.W.a((csf)$$0);
      if ($$2 != null) {
         $$2.fK();
      }

      return $$2;
   }

   @Override
   public boolean gg() {
      return !cck.c(this) && super.gg();
   }

   @Override
   public aqw dc() {
      return aqw.f;
   }

   @Override
   protected aqu y() {
      return this.dN().B ? null : cck.b(this).orElse(null);
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.ll;
   }

   @Override
   protected aqu n_() {
      return aqv.lk;
   }

   @Override
   protected aqu aN() {
      return aqv.lQ;
   }

   @Override
   protected aqu aO() {
      return aqv.lP;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.ln, 0.15F, 1.0F);
   }

   protected void b(aqu $$0) {
      this.a($$0, this.eX(), this.eY());
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }
}
