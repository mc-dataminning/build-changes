import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class clp extends clo {
   private static final ajx<cxh> e = akb.a(clp.class, ajz.h);
   private static final ajx<Integer> f = akb.a(clp.class, ajz.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public clp(bvi<? extends clp> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public clp(dgz $$0, ji $$1, jn $$2) {
      this(bvi.as, $$0, $$1, $$2);
   }

   public clp(bvi<? extends clp> $$0, dgz $$1, ji $$2, jn $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(e, cxh.k);
      $$0.a(f, 0);
   }

   @Override
   protected void a(jn $$0) {
      Validate.notNull($$0);
      this.c = $$0;
      if ($$0.o().d()) {
         this.x(0.0F);
         this.w((float)(this.c.e() * 90));
      } else {
         this.x((float)(-90 * $$0.f().a()));
         this.w(0.0F);
      }

      this.O = this.dM();
      this.N = this.dK();
      this.f();
   }

   @Override
   protected fbs a(ji $$0, jn $$1) {
      float $$2 = 0.46875F;
      fbx $$3 = fbx.b($$0).a($$1, -0.46875);
      jn.a $$4 = $$1.o();
      double $$5 = $$4 == jn.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jn.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jn.a.c ? 0.0625 : 0.75;
      return fbs.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean g() {
      if (this.k) {
         return true;
      } else if (!this.dU().g(this)) {
         return false;
      } else {
         dxq $$0 = this.dU().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dmh.n($$0) ? this.dU().a(this, this.cQ(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bwc $$0, fbx $$1) {
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
      this.c(this.w());
      super.c($$0);
   }

   private boolean a(btp $$0) {
      return !$$0.a(awr.l) && !this.w().f();
   }

   private static boolean e(btp $$0) {
      return $$0.a(awr.d) || $$0.h();
   }

   @Override
   public boolean b(btp $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(ecp.c, $$1.d());
            this.a(this.m(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public avz m() {
      return awa.oc;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cJ();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(ard $$0, @Nullable bva $$1) {
      this.a(this.n(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(ecp.c, $$1);
   }

   public avz n() {
      return awa.oa;
   }

   @Override
   public void v() {
      this.a(this.o(), 1.0F, 1.0F);
   }

   public avz o() {
      return awa.ob;
   }

   private void a(ard $$0, @Nullable bva $$1, boolean $$2) {
      if (!this.k) {
         cxh $$3 = this.w();
         this.b(cxh.k);
         if (!$$0.O().b(dgv.i)) {
            if ($$1 == null) {
               this.c($$3);
            }
         } else {
            if ($$1 instanceof cpr $$4 && $$4.fX()) {
               this.c($$3);
               return;
            }

            if ($$2) {
               this.a($$0, this.t());
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

   private void c(cxh $$0) {
      evo $$1 = this.a($$0);
      if ($$1 != null) {
         evq $$2 = cxu.a($$1, this.dU());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public cxh w() {
      return this.au().a(e);
   }

   @Nullable
   public evo a(cxh $$0) {
      return $$0.a(kv.M);
   }

   public boolean x() {
      return this.w().b(kv.M);
   }

   public void b(cxh $$0) {
      this.a($$0, true);
   }

   public void a(cxh $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.au().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.q(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dU().b(this.a, dkg.a);
      }
   }

   public avz q() {
      return awa.nZ;
   }

   @Override
   public bwq a_(int $$0) {
      return $$0 == 0 ? bwq.a(this::w, this::b) : super.a_($$0);
   }

   @Override
   public void a(ajx<?> $$0) {
      if ($$0.equals(e)) {
         this.d(this.w());
      }
   }

   private void d(cxh $$0) {
      if (!$$0.f() && $$0.I() != this) {
         $$0.a(this);
      }

      this.f();
   }

   public int y() {
      return this.au().a(f);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.au().a(f, $$0 % 8);
      if ($$1 && this.a != null) {
         this.dU().b(this.a, dkg.a);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (!this.w().f()) {
         $$0.a("Item", this.w().a(this.dW()));
         $$0.a("ItemRotation", (byte)this.y());
         $$0.a("ItemDropChance", this.j);
      }

      $$0.a("Facing", (byte)this.c.d());
      $$0.a("Invisible", this.co());
      $$0.a("Fixed", this.k);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      cxh $$2;
      if ($$0.b("Item", 10)) {
         tq $$1 = $$0.p("Item");
         $$2 = cxh.a(this.dW(), (un)$$1).orElse(cxh.k);
      } else {
         $$2 = cxh.k;
      }

      cxh $$4 = this.w();
      if (!$$4.f() && !cxh.a($$2, $$4)) {
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
   public bsy a(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      boolean $$3 = !this.w().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return bsy.e;
      } else if (!$$0.dU().C) {
         if (!$$3) {
            if ($$4 && !this.dP()) {
               evq $$5 = cxu.b($$2, this.dU());
               if ($$5 != null && $$5.a(256)) {
                  return bsy.d;
               } else {
                  this.b($$2);
                  this.a(ecp.c, $$0);
                  $$2.a(1, $$0);
                  return bsy.a;
               }
            } else {
               return bsy.e;
            }
         } else {
            this.a(this.s(), 1.0F, 1.0F);
            this.b(this.y() + 1);
            this.a(ecp.c, $$0);
            return bsy.a;
         }
      } else {
         return (bsy)(!$$3 && !$$4 ? bsy.e : bsy.a);
      }
   }

   public avz s() {
      return awa.od;
   }

   public int z() {
      return this.w().f() ? 0 : this.y() % 8 + 1;
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, this.c.d(), this.j());
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      this.a(jn.a($$0.p()));
   }

   @Override
   public cxh dH() {
      cxh $$0 = this.w();
      return $$0.f() ? this.t() : $$0.v();
   }

   protected cxh t() {
      return new cxh(cxl.vd);
   }

   @Override
   public float dL() {
      jn $$0 = this.cN();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ayz.b(180 + $$0.e() * 90 + this.y() * 45 + $$1);
   }
}
