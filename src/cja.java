import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cja extends ciz {
   private static final ajw<cuq> f = aka.a(cja.class, ajy.h);
   private static final ajw<Integer> g = aka.a(cja.class, ajy.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public cja(bsx<? extends cja> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cja(dcw $$0, jd $$1, ji $$2) {
      this(bsx.ai, $$0, $$1, $$2);
   }

   public cja(bsx<? extends cja> $$0, dcw $$1, jd $$2, ji $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(f, cuq.l);
      $$0.a(g, 0);
   }

   @Override
   protected void a(ji $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.u(0.0F);
         this.t((float)(this.d.e() * 90));
      } else {
         this.u((float)(-90 * $$0.f().a()));
         this.t(0.0F);
      }

      this.P = this.dG();
      this.O = this.dE();
      this.p();
   }

   @Override
   protected ewx a(jd $$0, ji $$1) {
      float $$2 = 0.46875F;
      exc $$3 = exc.b($$0).a($$1, -0.46875);
      ji.a $$4 = $$1.o();
      double $$5 = $$4 == ji.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == ji.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == ji.a.c ? 0.0625 : 0.75;
      return ewx.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean s() {
      if (this.l) {
         return true;
      } else if (!this.dO().g(this)) {
         return false;
      } else {
         dtc $$0 = this.dO().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dia.m($$0) ? this.dO().a(this, this.cK(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(bts $$0, exc $$1) {
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
   public boolean a(brk $$0, float $$1) {
      if (this.l) {
         return !$$0.a(awg.d) && !$$0.h() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(awg.l) && !this.D().e()) {
         if (!this.dO().B) {
            this.b($$0.d(), false);
            this.a(dxz.c, $$0.d());
            this.a(this.v(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public avo v() {
      return avp.nz;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cD();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable bsr $$0) {
      this.a(this.w(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dxz.c, $$0);
   }

   public avo w() {
      return avp.nx;
   }

   @Override
   public void C() {
      this.a(this.x(), 1.0F, 1.0F);
   }

   public avo x() {
      return avp.ny;
   }

   private void b(@Nullable bsr $$0, boolean $$1) {
      if (!this.l) {
         cuq $$2 = this.D();
         this.a(cuq.l);
         if (!this.dO().ab().b(dcs.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cmx $$3 && $$3.fL()) {
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

   private void c(cuq $$0) {
      eqr $$1 = this.E();
      if ($$1 != null) {
         eqt $$2 = cvc.a($$1, this.dO());
         if ($$2 != null) {
            $$2.a(this.b, this.an());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public cuq D() {
      return this.ar().a(f);
   }

   @Nullable
   public eqr E() {
      return this.D().a(kq.B);
   }

   @Override
   public boolean F() {
      return this.D().b(kq.B);
   }

   public void a(cuq $$0) {
      this.a($$0, true);
   }

   public void a(cuq $$0, boolean $$1) {
      if (!$$0.e()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.ar().a(f, $$0);
      if (!$$0.e()) {
         this.a(this.y(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dO().c(this.b, dga.a);
      }
   }

   public avo y() {
      return avp.nw;
   }

   @Override
   public bug a_(int $$0) {
      return $$0 == 0 ? bug.a(this::D, this::a) : super.a_($$0);
   }

   @Override
   public void a(ajw<?> $$0) {
      if ($$0.equals(f)) {
         this.d(this.D());
      }
   }

   private void d(cuq $$0) {
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
         this.dO().c(this.b, dga.a);
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (!this.D().e()) {
         $$0.a("Item", this.D().a(this.dQ()));
         $$0.a("ItemRotation", (byte)this.H());
         $$0.a("ItemDropChance", this.k);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ci());
      $$0.a("Fixed", this.l);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      cuq $$2;
      if ($$0.b("Item", 10)) {
         ub $$1 = $$0.p("Item");
         $$2 = cuq.a(this.dQ(), (uy)$$1).orElse(cuq.l);
      } else {
         $$2 = cuq.l;
      }

      cuq $$4 = this.D();
      if (!$$4.e() && !cuq.a($$2, $$4)) {
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
      this.k($$0.q("Invisible"));
      this.l = $$0.q("Fixed");
   }

   @Override
   public bqr a(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      boolean $$3 = !this.D().e();
      boolean $$4 = !$$2.e();
      if (this.l) {
         return bqr.e;
      } else if (!this.dO().B) {
         if (!$$3) {
            if ($$4 && !this.dJ()) {
               if ($$2.a(cut.rU)) {
                  eqt $$5 = cvc.b($$2, this.dO());
                  if ($$5 != null && $$5.a(256)) {
                     return bqr.f;
                  }
               }

               this.a($$2);
               this.a(dxz.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.z(), 1.0F, 1.0F);
            this.b(this.H() + 1);
            this.a(dxz.c, $$0);
         }

         return bqr.c;
      } else {
         return !$$3 && !$$4 ? bqr.e : bqr.a;
      }
   }

   public avo z() {
      return avp.nA;
   }

   public int I() {
      return this.D().e() ? 0 : this.H() % 8 + 1;
   }

   @Override
   public zg<abu> a(aqt $$0) {
      return new abv(this, this.d.d(), this.t());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.a(ji.a($$0.p()));
   }

   @Override
   public cuq dB() {
      cuq $$0 = this.D();
      return $$0.e() ? this.A() : $$0.s();
   }

   protected cuq A() {
      return new cuq(cut.uc);
   }

   @Override
   public float dF() {
      ji $$0 = this.cH();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ayo.b(180 + $$0.e() * 90 + this.H() * 45 + $$1);
   }
}
