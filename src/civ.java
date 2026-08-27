import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class civ extends cct implements chj, cix {
   private static final ajk<Boolean> cb = ajo.a(civ.class, ajm.k);
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
   protected static final ImmutableList<? extends cbo<? extends cbn<? super civ>>> bY = ImmutableList.of(cbo.c, cbo.d, cbo.o, cbo.n);
   protected static final ImmutableList<? extends cah<?>> bZ = ImmutableList.of(
      cah.r,
      cah.g,
      cah.h,
      cah.k,
      cah.l,
      cah.n,
      cah.m,
      cah.E,
      cah.t,
      cah.o,
      cah.p,
      cah.aq,
      new cah[]{cah.z, cah.as, cah.at, cah.ap, cah.K, cah.aw, cah.ax, cah.Z}
   );

   public civ(bqr<? extends civ> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(ckl $$0) {
      return !this.gc();
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.q, 40.0).a(bsl.r, 0.3F).a(bsl.n, 0.6F).a(bsl.d, 1.0).a(bsl.c, 6.0);
   }

   @Override
   public boolean C(bql $$0) {
      if (!($$0 instanceof bre)) {
         return false;
      } else {
         this.ck = 10;
         this.dN().a(this, (byte)4);
         this.b(auz.mg);
         ciw.a(this, (bre)$$0);
         return cix.a(this, (bre)$$0);
      }
   }

   @Override
   protected void e(bre $$0) {
      if (this.u()) {
         cix.b(this, $$0);
      }
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bre) {
            ciw.b(this, (bre)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bsf.b<civ> dR() {
      return bsf.a(bZ, bY);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return ciw.a(this.dR().a($$0));
   }

   @Override
   public bsf<civ> dQ() {
      return (bsf<civ>)super.dQ();
   }

   @Override
   protected void Y() {
      this.dN().af().a("hoglinBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
      ciw.a(this);
      if (this.y()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(auz.mh);
            this.c((aqe)this.dN());
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
         this.f(bsl.c).a(0.5);
      } else {
         this.bN = 5;
         this.f(bsl.c).a(6.0);
      }
   }

   public static boolean c(bqr<civ> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return !$$1.a_($$3.d()).a(dcx.kK);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
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
   public float a(im $$0, czx $$1) {
      if (ciw.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dcx.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      boq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fT();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(auz.mg);
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

   private void c(aqe $$0) {
      cij $$1 = this.a(bqr.bs, true);
      if ($$1 != null) {
         $$1.b(new bpx(bpz.i, 200, 0));
      }
   }

   @Override
   public boolean o(csd $$0) {
      return $$0.a(csg.dC);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   @Override
   public void b(ty $$0) {
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
   public void a(ty $$0) {
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
   public bqf a(aqe $$0, bqf $$1) {
      civ $$2 = bqr.Z.a((czu)$$0);
      if ($$2 != null) {
         $$2.fT();
      }

      return $$2;
   }

   @Override
   public boolean gq() {
      return !ciw.c(this) && super.gq();
   }

   @Override
   public ava dc() {
      return ava.f;
   }

   @Override
   protected auy v() {
      return this.dN().B ? null : ciw.b(this).orElse(null);
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.mj;
   }

   @Override
   protected auy o_() {
      return auz.mi;
   }

   @Override
   protected auy aN() {
      return auz.mO;
   }

   @Override
   protected auy aO() {
      return auz.mN;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.ml, 0.15F, 1.0F);
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }
}
