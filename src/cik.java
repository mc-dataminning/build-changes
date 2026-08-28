import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cik extends cij {
   private static final ajp<cua> f = ajt.a(cik.class, ajr.h);
   private static final ajp<Integer> g = ajt.a(cik.class, ajr.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public cik(bsj<? extends cik> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cik(dcd $$0, ja $$1, jf $$2) {
      this(bsj.ai, $$0, $$1, $$2);
   }

   public cik(bsj<? extends cik> $$0, dcd $$1, ja $$2, jf $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(f, cua.l);
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

      this.P = this.dH();
      this.O = this.dF();
      this.p();
   }

   @Override
   protected evu a(ja $$0, jf $$1) {
      float $$2 = 0.46875F;
      evz $$3 = evz.b($$0).a($$1, -0.46875);
      jf.a $$4 = $$1.o();
      double $$5 = $$4 == jf.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jf.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jf.a.c ? 0.0625 : 0.75;
      return evu.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean s() {
      if (this.l) {
         return true;
      } else if (!this.dP().g(this)) {
         return false;
      } else {
         dsh $$0 = this.dP().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dhh.m($$0) ? this.dP().a(this, this.cK(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(btd $$0, evz $$1) {
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
   public void an() {
      this.c(this.D());
      super.an();
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.l) {
         return !$$0.a(avw.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(avw.m) && !this.D().e()) {
         if (!this.dP().B) {
            this.b($$0.d(), false);
            this.a(dxa.c, $$0.d());
            this.a(this.v(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public ave v() {
      return avf.nz;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cD();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable bsd $$0) {
      this.a(this.w(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dxa.c, $$0);
   }

   public ave w() {
      return avf.nx;
   }

   @Override
   public void C() {
      this.a(this.x(), 1.0F, 1.0F);
   }

   public ave x() {
      return avf.ny;
   }

   private void b(@Nullable bsd $$0, boolean $$1) {
      if (!this.l) {
         cua $$2 = this.D();
         this.a(cua.l);
         if (!this.dP().ab().b(dbz.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cmh $$3 && $$3.fL()) {
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

   private void c(cua $$0) {
      epo $$1 = this.E();
      if ($$1 != null) {
         epq $$2 = cui.a($$1, this.dP());
         if ($$2 != null) {
            $$2.a(this.b, this.al());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public cua D() {
      return this.ap().a(f);
   }

   @Nullable
   public epo E() {
      return this.D().a(kn.B);
   }

   public boolean G() {
      return this.D().b(kn.B);
   }

   public void a(cua $$0) {
      this.a($$0, true);
   }

   public void a(cua $$0, boolean $$1) {
      if (!$$0.e()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.ap().a(f, $$0);
      if (!$$0.e()) {
         this.a(this.y(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dP().c(this.b, dfh.a);
      }
   }

   public ave y() {
      return avf.nw;
   }

   @Override
   public btq a_(int $$0) {
      return $$0 == 0 ? btq.a(this::D, this::a) : super.a_($$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      if ($$0.equals(f)) {
         this.d(this.D());
      }
   }

   private void d(cua $$0) {
      if (!$$0.e() && $$0.D() != this) {
         $$0.a(this);
      }

      this.p();
   }

   public int H() {
      return this.ap().a(g);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.ap().a(g, $$0 % 8);
      if ($$1 && this.b != null) {
         this.dP().c(this.b, dfh.a);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (!this.D().e()) {
         $$0.a("Item", this.D().a(this.dR()));
         $$0.a("ItemRotation", (byte)this.H());
         $$0.a("ItemDropChance", this.k);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ch());
      $$0.a("Fixed", this.l);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      cua $$2;
      if ($$0.b("Item", 10)) {
         tx $$1 = $$0.p("Item");
         $$2 = cua.a(this.dR(), (uu)$$1).orElse(cua.l);
      } else {
         $$2 = cua.l;
      }

      cua $$4 = this.D();
      if (!$$4.e() && !cua.a($$2, $$4)) {
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
   public bqd a(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      boolean $$3 = !this.D().e();
      boolean $$4 = !$$2.e();
      if (this.l) {
         return bqd.e;
      } else if (!this.dP().B) {
         if (!$$3) {
            if ($$4 && !this.dK()) {
               if ($$2.a(cud.rU)) {
                  epq $$5 = cui.b($$2, this.dP());
                  if ($$5 != null && $$5.a(256)) {
                     return bqd.f;
                  }
               }

               this.a($$2);
               this.a(dxa.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.z(), 1.0F, 1.0F);
            this.b(this.H() + 1);
            this.a(dxa.c, $$0);
         }

         return bqd.c;
      } else {
         return !$$3 && !$$4 ? bqd.e : bqd.a;
      }
   }

   public ave z() {
      return avf.nA;
   }

   public int I() {
      return this.D().e() ? 0 : this.H() % 8 + 1;
   }

   @Override
   public zb<abn> dl() {
      return new abo(this, this.d.d(), this.u());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.a(jf.a($$0.p()));
   }

   @Override
   public cua dC() {
      cua $$0 = this.D();
      return $$0.e() ? this.A() : $$0.s();
   }

   protected cua A() {
      return new cua(cud.uc);
   }

   @Override
   public float dG() {
      jf $$0 = this.cH();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)aye.b(180 + $$0.e() * 90 + this.H() * 45 + $$1);
   }
}
