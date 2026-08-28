import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cjs extends cjr {
   private static final akg<cvl> f = akk.a(cjs.class, aki.h);
   private static final akg<Integer> g = akk.a(cjs.class, aki.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public cjs(btq<? extends cjs> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cjs(dds $$0, je $$1, jj $$2) {
      this(btq.ai, $$0, $$1, $$2);
   }

   public cjs(btq<? extends cjs> $$0, dds $$1, je $$2, jj $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(f, cvl.k);
      $$0.a(g, 0);
   }

   @Override
   protected void a(jj $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.w(0.0F);
         this.v((float)(this.d.e() * 90));
      } else {
         this.w((float)(-90 * $$0.f().a()));
         this.v(0.0F);
      }

      this.P = this.dK();
      this.O = this.dI();
      this.m();
   }

   @Override
   protected exz a(je $$0, jj $$1) {
      float $$2 = 0.46875F;
      eye $$3 = eye.b($$0).a($$1, -0.46875);
      jj.a $$4 = $$1.o();
      double $$5 = $$4 == jj.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jj.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jj.a.c ? 0.0625 : 0.75;
      return exz.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean o() {
      if (this.l) {
         return true;
      } else if (!this.dS().g(this)) {
         return false;
      } else {
         dua $$0 = this.dS().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dix.n($$0) ? this.dS().a(this, this.cO(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(buj $$0, eye $$1) {
      if (!this.l) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.l) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void ar() {
      this.d(this.C());
      super.ar();
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.l) {
         return !$$0.a(awu.d) && !$$0.h() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(awu.l) && !this.C().f()) {
         if (!this.dS().B) {
            this.b($$0.d(), false);
            this.a(dyx.c, $$0.d());
            this.a(this.t(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public awc t() {
      return awd.nA;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cH();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable btj $$0) {
      this.a(this.v(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dyx.c, $$0);
   }

   public awc v() {
      return awd.ny;
   }

   @Override
   public void B() {
      this.a(this.w(), 1.0F, 1.0F);
   }

   public awc w() {
      return awd.nz;
   }

   private void b(@Nullable btj $$0, boolean $$1) {
      if (!this.l) {
         cvl $$2 = this.C();
         this.c(cvl.k);
         if (!this.dS().ac().b(ddo.i)) {
            if ($$0 == null) {
               this.d($$2);
            }
         } else {
            if ($$0 instanceof cnp $$3 && $$3.fP()) {
               this.d($$2);
               return;
            }

            if ($$1) {
               this.b(this.z());
            }

            if (!$$2.f()) {
               $$2 = $$2.u();
               this.d($$2);
               if (this.af.i() < this.k) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void d(cvl $$0) {
      ert $$1 = this.a($$0);
      if ($$1 != null) {
         erv $$2 = cvx.a($$1, this.dS());
         if ($$2 != null) {
            $$2.a(this.b, this.ap());
         }
      }

      $$0.a(null);
   }

   public cvl C() {
      return this.at().a(f);
   }

   @Nullable
   public ert a(cvl $$0) {
      return $$0.a(kr.D);
   }

   public boolean D() {
      return this.C().b(kr.D);
   }

   public void c(cvl $$0) {
      this.a($$0, true);
   }

   public void a(cvl $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.at().a(f, $$0);
      if (!$$0.f()) {
         this.a(this.x(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dS().c(this.b, dgx.a);
      }
   }

   public awc x() {
      return awd.nx;
   }

   @Override
   public buw a_(int $$0) {
      return $$0 == 0 ? buw.a(this::C, this::c) : super.a_($$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if ($$0.equals(f)) {
         this.e(this.C());
      }
   }

   private void e(cvl $$0) {
      if (!$$0.f() && $$0.F() != this) {
         $$0.a(this);
      }

      this.m();
   }

   public int E() {
      return this.at().a(g);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.at().a(g, $$0 % 8);
      if ($$1 && this.b != null) {
         this.dS().c(this.b, dgx.a);
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (!this.C().f()) {
         $$0.a("Item", this.C().a(this.dU()));
         $$0.a("ItemRotation", (byte)this.E());
         $$0.a("ItemDropChance", this.k);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cm());
      $$0.a("Fixed", this.l);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      cvl $$2;
      if ($$0.b("Item", 10)) {
         uf $$1 = $$0.p("Item");
         $$2 = cvl.a(this.dU(), (vc)$$1).orElse(cvl.k);
      } else {
         $$2 = cvl.k;
      }

      cvl $$4 = this.C();
      if (!$$4.f() && !cvl.a($$2, $$4)) {
         this.d($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.k = $$0.j("ItemDropChance");
         }
      }

      this.a(jj.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.l = $$0.q("Fixed");
   }

   @Override
   public brk a(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      boolean $$3 = !this.C().f();
      boolean $$4 = !$$2.f();
      if (this.l) {
         return brk.e;
      } else if (!$$3) {
         if ($$4 && !this.dN()) {
            if ($$2.a(cvo.rV)) {
               erv $$5 = cvx.b($$2, this.dS());
               if ($$5 != null && $$5.a(256)) {
                  return brk.d;
               }
            }

            this.c($$2);
            this.a(dyx.c, $$0);
            $$2.a(1, $$0);
            return brk.a;
         } else {
            return brk.e;
         }
      } else {
         this.a(this.y(), 1.0F, 1.0F);
         this.b(this.E() + 1);
         this.a(dyx.c, $$0);
         return brk.a;
      }
   }

   public awc y() {
      return awd.nB;
   }

   public int F() {
      return this.C().f() ? 0 : this.E() % 8 + 1;
   }

   @Override
   public zk<abz> a(arf $$0) {
      return new aca(this, this.d.d(), this.q());
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      this.a(jj.a($$0.p()));
   }

   @Override
   public cvl dF() {
      cvl $$0 = this.C();
      return $$0.f() ? this.z() : $$0.u();
   }

   protected cvl z() {
      return new cvl(cvo.ue);
   }

   @Override
   public float dJ() {
      jj $$0 = this.cL();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azc.b(180 + $$0.e() * 90 + this.E() * 45 + $$1);
   }
}
