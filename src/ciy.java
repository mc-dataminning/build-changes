import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class ciy extends cix {
   private static final ajv<cuo> f = ajz.a(ciy.class, ajx.h);
   private static final ajv<Integer> g = ajz.a(ciy.class, ajx.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public ciy(bsw<? extends ciy> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public ciy(dcu $$0, jd $$1, ji $$2) {
      this(bsw.ai, $$0, $$1, $$2);
   }

   public ciy(bsw<? extends ciy> $$0, dcu $$1, jd $$2, ji $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(f, cuo.l);
      $$0.a(g, 0);
   }

   @Override
   protected void a(ji $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.t(0.0F);
         this.s((float)(this.d.e() * 90));
      } else {
         this.t((float)(-90 * $$0.f().a()));
         this.s(0.0F);
      }

      this.P = this.dI();
      this.O = this.dG();
      this.p();
   }

   @Override
   protected ewr a(jd $$0, ji $$1) {
      float $$2 = 0.46875F;
      eww $$3 = eww.b($$0).a($$1, -0.46875);
      ji.a $$4 = $$1.o();
      double $$5 = $$4 == ji.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == ji.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == ji.a.c ? 0.0625 : 0.75;
      return ewr.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean s() {
      if (this.l) {
         return true;
      } else if (!this.dQ().g(this)) {
         return false;
      } else {
         dta $$0 = this.dQ().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dhy.m($$0) ? this.dQ().a(this, this.cL(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(btq $$0, eww $$1) {
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
   public void ap() {
      this.c(this.D());
      super.ap();
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.l) {
         return !$$0.a(awf.d) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(awf.l) && !this.D().e()) {
         if (!this.dQ().B) {
            this.b($$0.d(), false);
            this.a(dxw.c, $$0.d());
            this.a(this.v(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public avn v() {
      return avo.nz;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cE();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable bsq $$0) {
      this.a(this.w(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dxw.c, $$0);
   }

   public avn w() {
      return avo.nx;
   }

   @Override
   public void C() {
      this.a(this.x(), 1.0F, 1.0F);
   }

   public avn x() {
      return avo.ny;
   }

   private void b(@Nullable bsq $$0, boolean $$1) {
      if (!this.l) {
         cuo $$2 = this.D();
         this.a(cuo.l);
         if (!this.dQ().ab().b(dcq.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cmv $$3 && $$3.fM()) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.A());
            }

            if (!$$2.e()) {
               $$2 = $$2.s();
               this.c($$2);
               if (this.ah.i() < this.k) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(cuo $$0) {
      eql $$1 = this.E();
      if ($$1 != null) {
         eqn $$2 = cva.a($$1, this.dQ());
         if ($$2 != null) {
            $$2.a(this.b, this.an());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public cuo D() {
      return this.ar().a(f);
   }

   @Nullable
   public eql E() {
      return this.D().a(kq.B);
   }

   public boolean F() {
      return this.D().b(kq.B);
   }

   public void a(cuo $$0) {
      this.a($$0, true);
   }

   public void a(cuo $$0, boolean $$1) {
      if (!$$0.e()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.ar().a(f, $$0);
      if (!$$0.e()) {
         this.a(this.y(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dQ().c(this.b, dfy.a);
      }
   }

   public avn y() {
      return avo.nw;
   }

   @Override
   public bue a_(int $$0) {
      return $$0 == 0 ? bue.a(this::D, this::a) : super.a_($$0);
   }

   @Override
   public void a(ajv<?> $$0) {
      if ($$0.equals(f)) {
         this.d(this.D());
      }
   }

   private void d(cuo $$0) {
      if (!$$0.e() && $$0.D() != this) {
         $$0.a(this);
      }

      this.p();
   }

   public int H() {
      return this.ar().a(g);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.ar().a(g, $$0 % 8);
      if ($$1 && this.b != null) {
         this.dQ().c(this.b, dfy.a);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (!this.D().e()) {
         $$0.a("Item", this.D().a(this.dS()));
         $$0.a("ItemRotation", (byte)this.H());
         $$0.a("ItemDropChance", this.k);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ci());
      $$0.a("Fixed", this.l);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cuo $$2;
      if ($$0.b("Item", 10)) {
         ua $$1 = $$0.p("Item");
         $$2 = cuo.a(this.dS(), (ux)$$1).orElse(cuo.l);
      } else {
         $$2 = cuo.l;
      }

      cuo $$4 = this.D();
      if (!$$4.e() && !cuo.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.e()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.k = $$0.j("ItemDropChance");
         }
      }

      this.a(ji.a($$0.f("Facing")));
      this.l($$0.q("Invisible"));
      this.l = $$0.q("Fixed");
   }

   @Override
   public bqq a(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      boolean $$3 = !this.D().e();
      boolean $$4 = !$$2.e();
      if (this.l) {
         return bqq.e;
      } else if (!this.dQ().B) {
         if (!$$3) {
            if ($$4 && !this.dL()) {
               if ($$2.a(cur.rU)) {
                  eqn $$5 = cva.b($$2, this.dQ());
                  if ($$5 != null && $$5.a(256)) {
                     return bqq.f;
                  }
               }

               this.a($$2);
               this.a(dxw.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.z(), 1.0F, 1.0F);
            this.b(this.H() + 1);
            this.a(dxw.c, $$0);
         }

         return bqq.c;
      } else {
         return !$$3 && !$$4 ? bqq.e : bqq.a;
      }
   }

   public avn z() {
      return avo.nA;
   }

   public int I() {
      return this.D().e() ? 0 : this.H() % 8 + 1;
   }

   @Override
   public zf<abt> dm() {
      return new abu(this, this.d.d(), this.t());
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      this.a(ji.a($$0.p()));
   }

   @Override
   public cuo dD() {
      cuo $$0 = this.D();
      return $$0.e() ? this.A() : $$0.s();
   }

   protected cuo A() {
      return new cuo(cur.uc);
   }

   @Override
   public float dH() {
      ji $$0 = this.cI();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ayn.b(180 + $$0.e() * 90 + this.H() * 45 + $$1);
   }
}
