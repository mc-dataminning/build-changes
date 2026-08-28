import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clz extends cfv implements ckn, cmb {
   private static final akg<Boolean> cb = akk.a(clz.class, aki.k);
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
   protected static final ImmutableList<? extends cep<? extends ceo<? super clz>>> bZ = ImmutableList.of(cep.c, cep.d, cep.o, cep.n);
   protected static final ImmutableList<? extends cdi<?>> ca = ImmutableList.of(
      cdi.r,
      cdi.g,
      cdi.h,
      cdi.k,
      cdi.l,
      cdi.n,
      cdi.m,
      cdi.E,
      cdi.t,
      cdi.o,
      cdi.p,
      cdi.aq,
      new cdi[]{cdi.z, cdi.as, cdi.at, cdi.ap, cdi.K, cdi.aw, cdi.ax, cdi.Z}
   );

   public clz(btq<? extends clz> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   public boolean A() {
      return true;
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.s, 40.0).a(bvm.v, 0.3F).a(bvm.p, 0.6F).a(bvm.d, 1.0).a(bvm.c, 6.0);
   }

   @Override
   public boolean E(btj $$0) {
      if (!($$0 instanceof buf)) {
         return false;
      } else {
         this.ck = 10;
         this.dS().a(this, (byte)4);
         this.b(awd.mr);
         cma.a(this, (buf)$$0);
         return cmb.a(this, (buf)$$0);
      }
   }

   @Override
   protected void e(buf $$0) {
      if (this.t()) {
         cmb.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof buf) {
            cma.b(this, (buf)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bvg.b<clz> dY() {
      return bvg.a(ca, bZ);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return cma.a(this.dY().a($$0));
   }

   @Override
   public bvg<clz> dX() {
      return (bvg<clz>)super.dX();
   }

   @Override
   protected void ad() {
      this.dS().ah().a("hoglinBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      cma.a(this);
      if (this.y()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(awd.ms);
            this.a((arg)this.dS());
         }
      } else {
         this.cl = 0;
      }
   }

   @Override
   public void m_() {
      if (this.ck > 0) {
         this.ck--;
      }

      super.m_();
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.bO = 3;
         this.g(bvm.c).a(0.5);
      } else {
         this.bO = 5;
         this.g(bvm.c).a(6.0);
      }
   }

   public static boolean c(btq<clz> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return !$$1.a_($$3.e()).a(dgx.kK);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fX();
   }

   @Override
   public float a(je $$0, ddv $$1) {
      if (cma.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dgx.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      brk $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fV();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(awd.mr);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int go() {
      return this.ck;
   }

   @Override
   public boolean ei() {
      return true;
   }

   @Override
   protected int ek() {
      return this.bO;
   }

   private void a(arg $$0) {
      cln $$1 = this.a(btq.bt, true);
      if ($$1 != null) {
         $$1.b(new bsq(bss.i, 200, 0));
      }
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.am);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.gq()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cl);
      if (this.cm) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.cl = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.at().a(cb, $$0);
   }

   private boolean gq() {
      return this.at().a(cb);
   }

   public boolean y() {
      return !this.dS().B_().b() && !this.gq() && !this.gd();
   }

   private void y(boolean $$0) {
      this.cm = $$0;
   }

   public boolean gp() {
      return this.t() && !this.cm;
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      clz $$2 = btq.Z.a($$0, btp.e);
      if ($$2 != null) {
         $$2.fV();
      }

      return $$2;
   }

   @Override
   public boolean gv() {
      return !cma.c(this) && super.gv();
   }

   @Override
   public awe di() {
      return awe.f;
   }

   @Override
   protected awc w() {
      return this.dS().B ? null : cma.b(this).orElse(null);
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.mu;
   }

   @Override
   protected awc n_() {
      return awd.mt;
   }

   @Override
   protected awc aT() {
      return awd.mZ;
   }

   @Override
   protected awc aU() {
      return awd.mY;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.mw, 0.15F, 1.0F);
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Nullable
   @Override
   public buf m() {
      return this.R();
   }
}
