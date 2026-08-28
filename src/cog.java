import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cog extends cof {
   private static final aku<dak> e = aky.a(cog.class, akw.h);
   private static final aku<Integer> f = aky.a(cog.class, akw.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private static final byte j = 0;
   private static final float k = 1.0F;
   private static final boolean l = false;
   private static final boolean m = false;
   private float n = 1.0F;
   private boolean o = false;

   public cog(bxn<? extends cog> $$0, dkj $$1) {
      super($$0, $$1);
      this.k(false);
   }

   public cog(dkj $$0, iw $$1, jc $$2) {
      this(bxn.at, $$0, $$1, $$2);
   }

   public cog(bxn<? extends cog> $$0, dkj $$1, iw $$2, jc $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
      this.k(false);
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(e, dak.l);
      $$0.a(f, 0);
   }

   @Override
   protected void a(jc $$0) {
      Validate.notNull($$0);
      this.c = $$0;
      if ($$0.o().d()) {
         this.x(0.0F);
         this.w((float)(this.c.e() * 90));
      } else {
         this.x((float)(-90 * $$0.f().a()));
         this.w(0.0F);
      }

      this.O = this.dN();
      this.N = this.dL();
      this.e();
   }

   @Override
   protected ffx a(iw $$0, jc $$1) {
      float $$2 = 0.46875F;
      fgc $$3 = fgc.b($$0).a($$1, -0.46875);
      jc.a $$4 = $$1.o();
      double $$5 = $$4 == jc.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jc.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jc.a.c ? 0.0625 : 0.75;
      return ffx.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean f() {
      if (this.o) {
         return true;
      } else if (!this.dV().g(this)) {
         return false;
      } else {
         ebq $$0 = this.dV().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dpr.n($$0) ? this.dV().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(byj $$0, fgc $$1) {
      if (!this.o) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (!this.o) {
         super.i($$0, $$1, $$2);
      }
   }

   @Override
   public void c(asb $$0) {
      this.d(this.v());
      super.c($$0);
   }

   private boolean a(bvt $$0) {
      return !$$0.a(axo.l) && !this.v().f();
   }

   private static boolean e(bvt $$0) {
      return $$0.a(axo.d) || $$0.h();
   }

   @Override
   public boolean b(bvt $$0) {
      return this.o && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (!this.o) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(egq.c, $$1.d());
            this.a(this.l(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public awx l() {
      return awy.og;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(asb $$0, @Nullable bxe $$1) {
      this.a(this.m(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(egq.c, $$1);
   }

   public awx m() {
      return awy.oe;
   }

   @Override
   public void u() {
      this.a(this.n(), 1.0F, 1.0F);
   }

   public awx n() {
      return awy.of;
   }

   private void a(asb $$0, @Nullable bxe $$1, boolean $$2) {
      if (!this.o) {
         dak $$3 = this.v();
         this.b(dak.l);
         if (!$$0.O().c(dkf.j)) {
            if ($$1 == null) {
               this.d($$3);
            }
         } else {
            if ($$1 instanceof csi $$4 && $$4.fV()) {
               this.d($$3);
               return;
            }

            if ($$2) {
               this.a($$0, this.s());
            }

            if (!$$3.f()) {
               $$3 = $$3.v();
               this.d($$3);
               if (this.ae.i() < this.n) {
                  this.a($$0, $$3);
               }
            }
         }
      }
   }

   private void d(dak $$0) {
      ezt $$1 = this.a($$0);
      if ($$1 != null) {
         ezv $$2 = dax.a($$1, this.dV());
         if ($$2 != null) {
            $$2.a(this.a, this.ao());
         }
      }

      $$0.a(null);
   }

   public dak v() {
      return this.ar().a(e);
   }

   @Nullable
   public ezt a(dak $$0) {
      return $$0.a(kl.M);
   }

   public boolean w() {
      return this.v().c(kl.M);
   }

   public void b(dak $$0) {
      this.a($$0, true);
   }

   public void a(dak $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.ar().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.p(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dV().b(this.a, dnq.a);
      }
   }

   public awx p() {
      return awy.od;
   }

   @Override
   public byw a_(int $$0) {
      return $$0 == 0 ? byw.a(this::v, this::b) : super.a_($$0);
   }

   @Override
   public void a(aku<?> $$0) {
      if ($$0.equals(e)) {
         this.e(this.v());
      }
   }

   private void e(dak $$0) {
      if (!$$0.f() && $$0.I() != this) {
         $$0.a(this);
      }

      this.e();
   }

   public int x() {
      return this.ar().a(f);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.ar().a(f, $$0 % 8);
      if ($$1 && this.a != null) {
         this.dV().b(this.a, dnq.a);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      dak $$1 = this.v();
      if (!$$1.f()) {
         alp<va> $$2 = this.dX().a(uo.a);
         $$0.a("Item", dak.b, $$2, $$1);
      }

      $$0.a("ItemRotation", (byte)this.x());
      $$0.a("ItemDropChance", this.n);
      $$0.a("Facing", jc.k, this.c);
      $$0.a("Invisible", this.co());
      $$0.a("Fixed", this.o);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      alp<va> $$1 = this.dX().a(uo.a);
      dak $$2 = $$0.<dak>a("Item", dak.b, $$1).orElse(dak.l);
      dak $$3 = this.v();
      if (!$$3.f() && !dak.a($$2, $$3)) {
         this.d($$3);
      }

      this.a($$2, false);
      this.a($$0.b("ItemRotation", (byte)0), false);
      this.n = $$0.b("ItemDropChance", 1.0F);
      this.a($$0.<jc>a("Facing", jc.k).orElse(jc.a));
      this.k($$0.b("Invisible", false));
      this.o = $$0.b("Fixed", false);
   }

   @Override
   public bvc a(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      boolean $$3 = !this.v().f();
      boolean $$4 = !$$2.f();
      if (this.o) {
         return bvc.e;
      } else if (!$$0.dV().C) {
         if (!$$3) {
            if ($$4 && !this.dQ()) {
               ezv $$5 = dax.b($$2, this.dV());
               if ($$5 != null && $$5.a(256)) {
                  return bvc.d;
               } else {
                  this.b($$2);
                  this.a(egq.c, $$0);
                  $$2.a(1, $$0);
                  return bvc.a;
               }
            } else {
               return bvc.e;
            }
         } else {
            this.a(this.r(), 1.0F, 1.0F);
            this.b(this.x() + 1);
            this.a(egq.c, $$0);
            return bvc.a;
         }
      } else {
         return (bvc)(!$$3 && !$$4 ? bvc.e : bvc.a);
      }
   }

   public awx r() {
      return awy.oh;
   }

   public int y() {
      return this.v().f() ? 0 : this.x() % 8 + 1;
   }

   @Override
   public zo<acf> a(arz $$0) {
      return new acg(this, this.c.d(), this.i());
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      this.a(jc.a($$0.p()));
   }

   @Override
   public dak dI() {
      dak $$0 = this.v();
      return $$0.f() ? this.s() : $$0.v();
   }

   protected dak s() {
      return new dak(dao.vm);
   }

   @Override
   public float dM() {
      jc $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azz.b(180 + $$0.e() * 90 + this.x() * 45 + $$1);
   }
}
