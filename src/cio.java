import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cio extends cin {
   private static final ajp<cud> f = ajt.a(cio.class, ajr.h);
   private static final ajp<Integer> g = ajt.a(cio.class, ajr.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public cio(bsn<? extends cio> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cio(dcg $$0, ja $$1, jf $$2) {
      this(bsn.ai, $$0, $$1, $$2);
   }

   public cio(bsn<? extends cio> $$0, dcg $$1, ja $$2, jf $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(f, cud.l);
      $$0.a(g, 0);
   }

   @Override
   protected void a(jf $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.t(0.0F);
         this.s((float)(this.d.e() * 90));
      } else {
         this.t((float)(-90 * $$0.f().a()));
         this.s(0.0F);
      }

      this.P = this.dJ();
      this.O = this.dH();
      this.p();
   }

   @Override
   protected ewc a(ja $$0, jf $$1) {
      float $$2 = 0.46875F;
      ewh $$3 = ewh.b($$0).a($$1, -0.46875);
      jf.a $$4 = $$1.o();
      double $$5 = $$4 == jf.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jf.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jf.a.c ? 0.0625 : 0.75;
      return ewc.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean s() {
      if (this.l) {
         return true;
      } else if (!this.dR().g(this)) {
         return false;
      } else {
         dsl $$0 = this.dR().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dhk.m($$0) ? this.dR().a(this, this.cM(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(bth $$0, ewh $$1) {
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
   public boolean a(bra $$0, float $$1) {
      if (this.l) {
         return !$$0.a(avy.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(avy.m) && !this.D().e()) {
         if (!this.dR().B) {
            this.b($$0.d(), false);
            this.a(dxh.c, $$0.d());
            this.a(this.v(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public avg v() {
      return avh.nz;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cF();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable bsh $$0) {
      this.a(this.w(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dxh.c, $$0);
   }

   public avg w() {
      return avh.nx;
   }

   @Override
   public void C() {
      this.a(this.x(), 1.0F, 1.0F);
   }

   public avg x() {
      return avh.ny;
   }

   private void b(@Nullable bsh $$0, boolean $$1) {
      if (!this.l) {
         cud $$2 = this.D();
         this.a(cud.l);
         if (!this.dR().ab().b(dcc.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cml $$3 && $$3.fN()) {
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

   private void c(cud $$0) {
      epw $$1 = this.E();
      if ($$1 != null) {
         epy $$2 = cul.a($$1, this.dR());
         if ($$2 != null) {
            $$2.a(this.b, this.an());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public cud D() {
      return this.ar().a(f);
   }

   @Nullable
   public epw E() {
      return this.D().a(kn.B);
   }

   public boolean F() {
      return this.D().b(kn.B);
   }

   public void a(cud $$0) {
      this.a($$0, true);
   }

   public void a(cud $$0, boolean $$1) {
      if (!$$0.e()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.ar().a(f, $$0);
      if (!$$0.e()) {
         this.a(this.y(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dR().c(this.b, dfk.a);
      }
   }

   public avg y() {
      return avh.nw;
   }

   @Override
   public btu a_(int $$0) {
      return $$0 == 0 ? btu.a(this::D, this::a) : super.a_($$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      if ($$0.equals(f)) {
         this.d(this.D());
      }
   }

   private void d(cud $$0) {
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
         this.dR().c(this.b, dfk.a);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (!this.D().e()) {
         $$0.a("Item", this.D().a(this.dT()));
         $$0.a("ItemRotation", (byte)this.H());
         $$0.a("ItemDropChance", this.k);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cj());
      $$0.a("Fixed", this.l);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      cud $$2;
      if ($$0.b("Item", 10)) {
         tx $$1 = $$0.p("Item");
         $$2 = cud.a(this.dT(), (uu)$$1).orElse(cud.l);
      } else {
         $$2 = cud.l;
      }

      cud $$4 = this.D();
      if (!$$4.e() && !cud.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.e()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.k = $$0.j("ItemDropChance");
         }
      }

      this.a(jf.a($$0.f("Facing")));
      this.l($$0.q("Invisible"));
      this.l = $$0.q("Fixed");
   }

   @Override
   public bqh a(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      boolean $$3 = !this.D().e();
      boolean $$4 = !$$2.e();
      if (this.l) {
         return bqh.e;
      } else if (!this.dR().B) {
         if (!$$3) {
            if ($$4 && !this.dM()) {
               if ($$2.a(cug.rU)) {
                  epy $$5 = cul.b($$2, this.dR());
                  if ($$5 != null && $$5.a(256)) {
                     return bqh.f;
                  }
               }

               this.a($$2);
               this.a(dxh.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.z(), 1.0F, 1.0F);
            this.b(this.H() + 1);
            this.a(dxh.c, $$0);
         }

         return bqh.c;
      } else {
         return !$$3 && !$$4 ? bqh.e : bqh.a;
      }
   }

   public avg z() {
      return avh.nA;
   }

   public int I() {
      return this.D().e() ? 0 : this.H() % 8 + 1;
   }

   @Override
   public zb<abn> dn() {
      return new abo(this, this.d.d(), this.t());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.a(jf.a($$0.p()));
   }

   @Override
   public cud dE() {
      cud $$0 = this.D();
      return $$0.e() ? this.A() : $$0.s();
   }

   protected cud A() {
      return new cud(cug.uc);
   }

   @Override
   public float dI() {
      jf $$0 = this.cJ();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ayg.b(180 + $$0.e() * 90 + this.H() * 45 + $$1);
   }
}
