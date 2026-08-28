import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cnv extends cnu {
   private static final akl<czy> e = akp.a(cnv.class, akn.h);
   private static final akl<Integer> f = akp.a(cnv.class, akn.b);
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

   public cnv(bxc<? extends cnv> $$0, djx $$1) {
      super($$0, $$1);
      this.k(false);
   }

   public cnv(djx $$0, iv $$1, jb $$2) {
      this(bxc.at, $$0, $$1, $$2);
   }

   public cnv(bxc<? extends cnv> $$0, djx $$1, iv $$2, jb $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
      this.k(false);
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(e, czy.k);
      $$0.a(f, 0);
   }

   @Override
   protected void a(jb $$0) {
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
      this.f();
   }

   @Override
   protected ffl a(iv $$0, jb $$1) {
      float $$2 = 0.46875F;
      ffq $$3 = ffq.b($$0).a($$1, -0.46875);
      jb.a $$4 = $$1.o();
      double $$5 = $$4 == jb.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jb.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jb.a.c ? 0.0625 : 0.75;
      return ffl.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean g() {
      if (this.o) {
         return true;
      } else if (!this.dV().g(this)) {
         return false;
      } else {
         ebe $$0 = this.dV().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dpf.n($$0) ? this.dV().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bxy $$0, ffq $$1) {
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
   public void c(ars $$0) {
      this.d(this.w());
      super.c($$0);
   }

   private boolean a(bvi $$0) {
      return !$$0.a(axf.l) && !this.w().f();
   }

   private static boolean e(bvi $$0) {
      return $$0.a(axf.d) || $$0.h();
   }

   @Override
   public boolean b(bvi $$0) {
      return this.o && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (!this.o) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(ege.c, $$1.d());
            this.a(this.m(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public awo m() {
      return awp.og;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(ars $$0, @Nullable bwt $$1) {
      this.a(this.n(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(ege.c, $$1);
   }

   public awo n() {
      return awp.oe;
   }

   @Override
   public void v() {
      this.a(this.o(), 1.0F, 1.0F);
   }

   public awo o() {
      return awp.of;
   }

   private void a(ars $$0, @Nullable bwt $$1, boolean $$2) {
      if (!this.o) {
         czy $$3 = this.w();
         this.b(czy.k);
         if (!$$0.O().c(djt.j)) {
            if ($$1 == null) {
               this.d($$3);
            }
         } else {
            if ($$1 instanceof crx $$4 && $$4.fV()) {
               this.d($$3);
               return;
            }

            if ($$2) {
               this.a($$0, this.t());
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

   private void d(czy $$0) {
      ezh $$1 = this.a($$0);
      if ($$1 != null) {
         ezj $$2 = dal.a($$1, this.dV());
         if ($$2 != null) {
            $$2.a(this.a, this.ao());
         }
      }

      $$0.a(null);
   }

   public czy w() {
      return this.ar().a(e);
   }

   @Nullable
   public ezh a(czy $$0) {
      return $$0.a(kk.M);
   }

   public boolean x() {
      return this.w().c(kk.M);
   }

   public void b(czy $$0) {
      this.a($$0, true);
   }

   public void a(czy $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.ar().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.q(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dV().b(this.a, dne.a);
      }
   }

   public awo q() {
      return awp.od;
   }

   @Override
   public byl a_(int $$0) {
      return $$0 == 0 ? byl.a(this::w, this::b) : super.a_($$0);
   }

   @Override
   public void a(akl<?> $$0) {
      if ($$0.equals(e)) {
         this.e(this.w());
      }
   }

   private void e(czy $$0) {
      if (!$$0.f() && $$0.I() != this) {
         $$0.a(this);
      }

      this.f();
   }

   public int y() {
      return this.ar().a(f);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.ar().a(f, $$0 % 8);
      if ($$1 && this.a != null) {
         this.dV().b(this.a, dne.a);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (!this.w().f()) {
         alg<uy> $$1 = this.dX().a(un.a);
         $$0.a("Item", czy.b, $$1, this.w());
         $$0.a("ItemRotation", (byte)this.y());
         $$0.a("ItemDropChance", this.n);
      }

      $$0.a("Facing", jb.k, this.c);
      $$0.a("Invisible", this.co());
      $$0.a("Fixed", this.o);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      alg<uy> $$1 = this.dX().a(un.a);
      czy $$2 = $$0.<czy>a("Item", czy.b, $$1).orElse(czy.k);
      czy $$3 = this.w();
      if (!$$3.f() && !czy.a($$2, $$3)) {
         this.d($$3);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.b("ItemRotation", (byte)0), false);
         this.n = $$0.b("ItemDropChance", 1.0F);
      }

      this.a($$0.<jb>a("Facing", jb.k).orElse(jb.a));
      this.k($$0.b("Invisible", false));
      this.o = $$0.b("Fixed", false);
   }

   @Override
   public bur a(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      boolean $$3 = !this.w().f();
      boolean $$4 = !$$2.f();
      if (this.o) {
         return bur.e;
      } else if (!$$0.dV().C) {
         if (!$$3) {
            if ($$4 && !this.dQ()) {
               ezj $$5 = dal.b($$2, this.dV());
               if ($$5 != null && $$5.a(256)) {
                  return bur.d;
               } else {
                  this.b($$2);
                  this.a(ege.c, $$0);
                  $$2.a(1, $$0);
                  return bur.a;
               }
            } else {
               return bur.e;
            }
         } else {
            this.a(this.s(), 1.0F, 1.0F);
            this.b(this.y() + 1);
            this.a(ege.c, $$0);
            return bur.a;
         }
      } else {
         return (bur)(!$$3 && !$$4 ? bur.e : bur.a);
      }
   }

   public awo s() {
      return awp.oh;
   }

   public int z() {
      return this.w().f() ? 0 : this.y() % 8 + 1;
   }

   @Override
   public zh<abw> a(arq $$0) {
      return new abx(this, this.c.d(), this.j());
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      this.a(jb.a($$0.p()));
   }

   @Override
   public czy dI() {
      czy $$0 = this.w();
      return $$0.f() ? this.t() : $$0.v();
   }

   protected czy t() {
      return new czy(dac.vm);
   }

   @Override
   public float dM() {
      jb $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azo.b(180 + $$0.e() * 90 + this.y() * 45 + $$1);
   }
}
