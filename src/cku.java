import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cku extends ckt {
   private static final ajy<cwo> e = akc.a(cku.class, aka.h);
   private static final ajy<Integer> f = akc.a(cku.class, aka.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public cku(bur<? extends cku> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cku(dgh $$0, ji $$1, jn $$2) {
      this(bur.as, $$0, $$1, $$2);
   }

   public cku(bur<? extends cku> $$0, dgh $$1, ji $$2, jn $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(e, cwo.j);
      $$0.a(f, 0);
   }

   @Override
   protected void a(jn $$0) {
      Validate.notNull($$0);
      this.c = $$0;
      if ($$0.o().d()) {
         this.w(0.0F);
         this.v((float)(this.c.e() * 90));
      } else {
         this.w((float)(-90 * $$0.f().a()));
         this.v(0.0F);
      }

      this.O = this.dN();
      this.N = this.dL();
      this.l();
   }

   @Override
   protected fau a(ji $$0, jn $$1) {
      float $$2 = 0.46875F;
      faz $$3 = faz.b($$0).a($$1, -0.46875);
      jn.a $$4 = $$1.o();
      double $$5 = $$4 == jn.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jn.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jn.a.c ? 0.0625 : 0.75;
      return fau.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean m() {
      if (this.k) {
         return true;
      } else if (!this.dV().g(this)) {
         return false;
      } else {
         dww $$0 = this.dV().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dlo.n($$0) ? this.dV().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bvk $$0, faz $$1) {
      if (!this.k) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.k) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void c(ard $$0) {
      this.c(this.A());
      super.c($$0);
   }

   private boolean a(bta $$0) {
      return !$$0.a(awr.l) && !this.A().f();
   }

   private static boolean e(bta $$0) {
      return $$0.a(awr.d) || $$0.h();
   }

   @Override
   public boolean b(bta $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(ebs.c, $$1.d());
            this.a(this.s(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public avz s() {
      return awa.nX;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(ard $$0, @Nullable buk $$1) {
      this.a(this.t(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(ebs.c, $$1);
   }

   public avz t() {
      return awa.nV;
   }

   @Override
   public void z() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public avz u() {
      return awa.nW;
   }

   private void a(ard $$0, @Nullable buk $$1, boolean $$2) {
      if (!this.k) {
         cwo $$3 = this.A();
         this.b(cwo.j);
         if (!$$0.O().b(dgd.i)) {
            if ($$1 == null) {
               this.c($$3);
            }
         } else {
            if ($$1 instanceof cow $$4 && $$4.fV()) {
               this.c($$3);
               return;
            }

            if ($$2) {
               this.a($$0, this.x());
            }

            if (!$$3.f()) {
               $$3 = $$3.v();
               this.c($$3);
               if (this.ae.i() < this.j) {
                  this.a($$0, $$3);
               }
            }
         }
      }
   }

   private void c(cwo $$0) {
      euq $$1 = this.a($$0);
      if ($$1 != null) {
         eus $$2 = cxb.a($$1, this.dV());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public cwo A() {
      return this.au().a(e);
   }

   @Nullable
   public euq a(cwo $$0) {
      return $$0.a(kv.L);
   }

   public boolean B() {
      return this.A().b(kv.L);
   }

   public void b(cwo $$0) {
      this.a($$0, true);
   }

   public void a(cwo $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.au().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dV().c(this.a, djn.a);
      }
   }

   public avz v() {
      return awa.nU;
   }

   @Override
   public bvy a_(int $$0) {
      return $$0 == 0 ? bvy.a(this::A, this::b) : super.a_($$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      if ($$0.equals(e)) {
         this.d(this.A());
      }
   }

   private void d(cwo $$0) {
      if (!$$0.f() && $$0.I() != this) {
         $$0.a(this);
      }

      this.l();
   }

   public int C() {
      return this.au().a(f);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.au().a(f, $$0 % 8);
      if ($$1 && this.a != null) {
         this.dV().c(this.a, djn.a);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (!this.A().f()) {
         $$0.a("Item", this.A().a(this.dX()));
         $$0.a("ItemRotation", (byte)this.C());
         $$0.a("ItemDropChance", this.j);
      }

      $$0.a("Facing", (byte)this.c.d());
      $$0.a("Invisible", this.cp());
      $$0.a("Fixed", this.k);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      cwo $$2;
      if ($$0.b("Item", 10)) {
         tq $$1 = $$0.p("Item");
         $$2 = cwo.a(this.dX(), (un)$$1).orElse(cwo.j);
      } else {
         $$2 = cwo.j;
      }

      cwo $$4 = this.A();
      if (!$$4.f() && !cwo.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.j = $$0.j("ItemDropChance");
         }
      }

      this.a(jn.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.k = $$0.q("Fixed");
   }

   @Override
   public bsj a(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      boolean $$3 = !this.A().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return bsj.e;
      } else if (!$$0.dV().C) {
         if (!$$3) {
            if ($$4 && !this.dQ()) {
               eus $$5 = cxb.b($$2, this.dV());
               if ($$5 != null && $$5.a(256)) {
                  return bsj.d;
               } else {
                  this.b($$2);
                  this.a(ebs.c, $$0);
                  $$2.a(1, $$0);
                  return bsj.a;
               }
            } else {
               return bsj.e;
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.C() + 1);
            this.a(ebs.c, $$0);
            return bsj.a;
         }
      } else {
         return (bsj)(!$$3 && !$$4 ? bsj.e : bsj.a);
      }
   }

   public avz w() {
      return awa.nY;
   }

   public int D() {
      return this.A().f() ? 0 : this.C() % 8 + 1;
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, this.c.d(), this.p());
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      this.a(jn.a($$0.p()));
   }

   @Override
   public cwo dI() {
      cwo $$0 = this.A();
      return $$0.f() ? this.x() : $$0.v();
   }

   protected cwo x() {
      return new cwo(cws.vb);
   }

   @Override
   public float dM() {
      jn $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ayz.b(180 + $$0.e() * 90 + this.C() * 45 + $$1);
   }
}
