import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class ckw extends ckv {
   private static final ajy<cwq> e = akc.a(ckw.class, aka.h);
   private static final ajy<Integer> f = akc.a(ckw.class, aka.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public ckw(but<? extends ckw> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public ckw(dgj $$0, ji $$1, jn $$2) {
      this(but.as, $$0, $$1, $$2);
   }

   public ckw(but<? extends ckw> $$0, dgj $$1, ji $$2, jn $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(e, cwq.j);
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
   protected faw a(ji $$0, jn $$1) {
      float $$2 = 0.46875F;
      fbb $$3 = fbb.b($$0).a($$1, -0.46875);
      jn.a $$4 = $$1.o();
      double $$5 = $$4 == jn.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jn.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jn.a.c ? 0.0625 : 0.75;
      return faw.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean m() {
      if (this.k) {
         return true;
      } else if (!this.dV().g(this)) {
         return false;
      } else {
         dwy $$0 = this.dV().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dlq.n($$0) ? this.dV().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bvm $$0, fbb $$1) {
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

   private boolean a(btc $$0) {
      return !$$0.a(awr.l) && !this.A().f();
   }

   private static boolean e(btc $$0) {
      return $$0.a(awr.d) || $$0.h();
   }

   @Override
   public boolean b(btc $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(ebu.c, $$1.d());
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
   public void a(ard $$0, @Nullable bum $$1) {
      this.a(this.t(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(ebu.c, $$1);
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

   private void a(ard $$0, @Nullable bum $$1, boolean $$2) {
      if (!this.k) {
         cwq $$3 = this.A();
         this.b(cwq.j);
         if (!$$0.O().b(dgf.i)) {
            if ($$1 == null) {
               this.c($$3);
            }
         } else {
            if ($$1 instanceof coy $$4 && $$4.fV()) {
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

   private void c(cwq $$0) {
      eus $$1 = this.a($$0);
      if ($$1 != null) {
         euu $$2 = cxd.a($$1, this.dV());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public cwq A() {
      return this.au().a(e);
   }

   @Nullable
   public eus a(cwq $$0) {
      return $$0.a(kv.L);
   }

   public boolean B() {
      return this.A().b(kv.L);
   }

   public void b(cwq $$0) {
      this.a($$0, true);
   }

   public void a(cwq $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.au().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dV().c(this.a, djp.a);
      }
   }

   public avz v() {
      return awa.nU;
   }

   @Override
   public bwa a_(int $$0) {
      return $$0 == 0 ? bwa.a(this::A, this::b) : super.a_($$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      if ($$0.equals(e)) {
         this.d(this.A());
      }
   }

   private void d(cwq $$0) {
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
         this.dV().c(this.a, djp.a);
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
      cwq $$2;
      if ($$0.b("Item", 10)) {
         tq $$1 = $$0.p("Item");
         $$2 = cwq.a(this.dX(), (un)$$1).orElse(cwq.j);
      } else {
         $$2 = cwq.j;
      }

      cwq $$4 = this.A();
      if (!$$4.f() && !cwq.a($$2, $$4)) {
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
   public bsl a(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      boolean $$3 = !this.A().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return bsl.e;
      } else if (!$$0.dV().C) {
         if (!$$3) {
            if ($$4 && !this.dQ()) {
               euu $$5 = cxd.b($$2, this.dV());
               if ($$5 != null && $$5.a(256)) {
                  return bsl.d;
               } else {
                  this.b($$2);
                  this.a(ebu.c, $$0);
                  $$2.a(1, $$0);
                  return bsl.a;
               }
            } else {
               return bsl.e;
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.C() + 1);
            this.a(ebu.c, $$0);
            return bsl.a;
         }
      } else {
         return (bsl)(!$$3 && !$$4 ? bsl.e : bsl.a);
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
   public cwq dI() {
      cwq $$0 = this.A();
      return $$0.f() ? this.x() : $$0.v();
   }

   protected cwq x() {
      return new cwq(cwu.vb);
   }

   @Override
   public float dM() {
      jn $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ayz.b(180 + $$0.e() * 90 + this.C() * 45 + $$1);
   }
}
