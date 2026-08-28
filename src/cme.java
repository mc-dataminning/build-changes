import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cme extends cga implements cks, cmg {
   private static final akg<Boolean> ca = akk.a(cme.class, aki.k);
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
   protected static final ImmutableList<? extends ceu<? extends cet<? super cme>>> bY = ImmutableList.of(ceu.c, ceu.d, ceu.o, ceu.n);
   protected static final ImmutableList<? extends cdn<?>> bZ = ImmutableList.of(
      cdn.r,
      cdn.g,
      cdn.h,
      cdn.k,
      cdn.l,
      cdn.n,
      cdn.m,
      cdn.E,
      cdn.t,
      cdn.o,
      cdn.p,
      cdn.aq,
      new cdn[]{cdn.z, cdn.as, cdn.at, cdn.ap, cdn.K, cdn.aw, cdn.ax, cdn.Z}
   );

   public cme(btv<? extends cme> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean A() {
      return true;
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.s, 40.0).a(bvr.v, 0.3F).a(bvr.p, 0.6F).a(bvr.d, 1.0).a(bvr.c, 6.0);
   }

   @Override
   public boolean E(bto $$0) {
      if (!($$0 instanceof buk)) {
         return false;
      } else {
         this.cj = 10;
         this.dS().a(this, (byte)4);
         this.b(awe.mr);
         cmf.a(this, (buk)$$0);
         return cmg.a(this, (buk)$$0);
      }
   }

   @Override
   protected void e(buk $$0) {
      if (this.t()) {
         cmg.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof buk) {
            cmf.b(this, (buk)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bvl.b<cme> dY() {
      return bvl.a(bZ, bY);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return cmf.a(this.dY().a($$0));
   }

   @Override
   public bvl<cme> dX() {
      return (bvl<cme>)super.dX();
   }

   @Override
   protected void ad() {
      this.dS().ah().a("hoglinBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      cmf.a(this);
      if (this.y()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(awe.ms);
            this.a((arh)this.dS());
         }
      } else {
         this.ck = 0;
      }
   }

   @Override
   public void m_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.m_();
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.bN = 3;
         this.g(bvr.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bvr.c).a(6.0);
      }
   }

   public static boolean c(btv<cme> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return !$$1.a_($$3.e()).a(dhl.kK);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fY();
   }

   @Override
   public float a(je $$0, dej $$1) {
      if (cmf.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dhl.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      brp $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fW();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awe.mr);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gp() {
      return this.cj;
   }

   @Override
   public boolean ei() {
      return true;
   }

   @Override
   protected int ek() {
      return this.bN;
   }

   private void a(arh $$0) {
      cls $$1 = this.a(btv.bt, true);
      if ($$1 != null) {
         $$1.a(new bsv(bsx.i, 200, 0));
      }
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.am);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.gr()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.at().a(ca, $$0);
   }

   private boolean gr() {
      return this.at().a(ca);
   }

   public boolean y() {
      return !this.dS().B_().b() && !this.gr() && !this.ge();
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gq() {
      return this.t() && !this.cl;
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      cme $$2 = btv.Z.a($$0, btu.e);
      if ($$2 != null) {
         $$2.fW();
      }

      return $$2;
   }

   @Override
   public boolean gw() {
      return !cmf.c(this) && super.gw();
   }

   @Override
   public awf di() {
      return awf.f;
   }

   @Override
   protected awd w() {
      return this.dS().B ? null : cmf.b(this).orElse(null);
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.mu;
   }

   @Override
   protected awd n_() {
      return awe.mt;
   }

   @Override
   protected awd aT() {
      return awe.mZ;
   }

   @Override
   protected awd aU() {
      return awe.mY;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.mw, 0.15F, 1.0F);
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Nullable
   @Override
   public buk m() {
      return this.R();
   }
}
