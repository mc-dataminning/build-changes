import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cin extends cim {
   private static final ajp<cuc> f = ajt.a(cin.class, ajr.h);
   private static final ajp<Integer> g = ajt.a(cin.class, ajr.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public cin(bsm<? extends cin> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cin(dcf $$0, ja $$1, jf $$2) {
      this(bsm.ai, $$0, $$1, $$2);
   }

   public cin(bsm<? extends cin> $$0, dcf $$1, ja $$2, jf $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(f, cuc.l);
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

      this.P = this.dI();
      this.O = this.dG();
      this.p();
   }

   @Override
   protected ewa a(ja $$0, jf $$1) {
      float $$2 = 0.46875F;
      ewf $$3 = ewf.b($$0).a($$1, -0.46875);
      jf.a $$4 = $$1.o();
      double $$5 = $$4 == jf.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jf.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jf.a.c ? 0.0625 : 0.75;
      return ewa.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean s() {
      if (this.l) {
         return true;
      } else if (!this.dQ().g(this)) {
         return false;
      } else {
         dsk $$0 = this.dQ().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dhj.m($$0) ? this.dQ().a(this, this.cL(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(btg $$0, ewf $$1) {
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
   public void ao() {
      this.c(this.D());
      super.ao();
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.l) {
         return !$$0.a(avy.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(avy.m) && !this.D().e()) {
         if (!this.dQ().B) {
            this.b($$0.d(), false);
            this.a(dxg.c, $$0.d());
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
      $$1 *= 64.0 * cE();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable bsg $$0) {
      this.a(this.w(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dxg.c, $$0);
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

   private void b(@Nullable bsg $$0, boolean $$1) {
      if (!this.l) {
         cuc $$2 = this.D();
         this.a(cuc.l);
         if (!this.dQ().ab().b(dcb.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cmk $$3 && $$3.fM()) {
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

   private void c(cuc $$0) {
      epu $$1 = this.E();
      if ($$1 != null) {
         epw $$2 = cuk.a($$1, this.dQ());
         if ($$2 != null) {
            $$2.a(this.b, this.am());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public cuc D() {
      return this.aq().a(f);
   }

   @Nullable
   public epu E() {
      return this.D().a(kn.B);
   }

   public boolean G() {
      return this.D().b(kn.B);
   }

   public void a(cuc $$0) {
      this.a($$0, true);
   }

   public void a(cuc $$0, boolean $$1) {
      if (!$$0.e()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.aq().a(f, $$0);
      if (!$$0.e()) {
         this.a(this.y(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dQ().c(this.b, dfj.a);
      }
   }

   public avg y() {
      return avh.nw;
   }

   @Override
   public btt a_(int $$0) {
      return $$0 == 0 ? btt.a(this::D, this::a) : super.a_($$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      if ($$0.equals(f)) {
         this.d(this.D());
      }
   }

   private void d(cuc $$0) {
      if (!$$0.e() && $$0.D() != this) {
         $$0.a(this);
      }

      this.p();
   }

   public int H() {
      return this.aq().a(g);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.aq().a(g, $$0 % 8);
      if ($$1 && this.b != null) {
         this.dQ().c(this.b, dfj.a);
      }
   }

   @Override
   public void b(tx $$0) {
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
   public void a(tx $$0) {
      super.a($$0);
      cuc $$2;
      if ($$0.b("Item", 10)) {
         tx $$1 = $$0.p("Item");
         $$2 = cuc.a(this.dS(), (uu)$$1).orElse(cuc.l);
      } else {
         $$2 = cuc.l;
      }

      cuc $$4 = this.D();
      if (!$$4.e() && !cuc.a($$2, $$4)) {
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
      this.k($$0.q("Invisible"));
      this.l = $$0.q("Fixed");
   }

   @Override
   public bqg a(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      boolean $$3 = !this.D().e();
      boolean $$4 = !$$2.e();
      if (this.l) {
         return bqg.e;
      } else if (!this.dQ().B) {
         if (!$$3) {
            if ($$4 && !this.dL()) {
               if ($$2.a(cuf.rU)) {
                  epw $$5 = cuk.b($$2, this.dQ());
                  if ($$5 != null && $$5.a(256)) {
                     return bqg.f;
                  }
               }

               this.a($$2);
               this.a(dxg.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.z(), 1.0F, 1.0F);
            this.b(this.H() + 1);
            this.a(dxg.c, $$0);
         }

         return bqg.c;
      } else {
         return !$$3 && !$$4 ? bqg.e : bqg.a;
      }
   }

   public avg z() {
      return avh.nA;
   }

   public int I() {
      return this.D().e() ? 0 : this.H() % 8 + 1;
   }

   @Override
   public zb<abn> dm() {
      return new abo(this, this.d.d(), this.u());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.a(jf.a($$0.p()));
   }

   @Override
   public cuc dD() {
      cuc $$0 = this.D();
      return $$0.e() ? this.A() : $$0.s();
   }

   protected cuc A() {
      return new cuc(cuf.uc);
   }

   @Override
   public float dH() {
      jf $$0 = this.cI();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ayg.b(180 + $$0.e() * 90 + this.H() * 45 + $$1);
   }
}
