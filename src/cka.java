import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cka extends cjz {
   private static final akh<cvs> f = akl.a(cka.class, akj.h);
   private static final akh<Integer> g = akl.a(cka.class, akj.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public cka(bty<? extends cka> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cka(dej $$0, jf $$1, jk $$2) {
      this(bty.ai, $$0, $$1, $$2);
   }

   public cka(bty<? extends cka> $$0, dej $$1, jf $$2, jk $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(f, cvs.k);
      $$0.a(g, 0);
   }

   @Override
   protected void a(jk $$0) {
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
   protected eyr a(jf $$0, jk $$1) {
      float $$2 = 0.46875F;
      eyw $$3 = eyw.b($$0).a($$1, -0.46875);
      jk.a $$4 = $$1.o();
      double $$5 = $$4 == jk.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jk.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jk.a.c ? 0.0625 : 0.75;
      return eyr.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean o() {
      if (this.l) {
         return true;
      } else if (!this.dS().g(this)) {
         return false;
      } else {
         dus $$0 = this.dS().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && djo.n($$0) ? this.dS().a(this, this.cO(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(bur $$0, eyw $$1) {
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
   public boolean a(bsj $$0, float $$1) {
      if (this.l) {
         return !$$0.a(awx.d) && !$$0.h() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(awx.l) && !this.C().f()) {
         if (!this.dS().B) {
            this.b($$0.d(), false);
            this.a(dzp.c, $$0.d());
            this.a(this.t(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public awf t() {
      return awg.nA;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cH();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable btr $$0) {
      this.a(this.v(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dzp.c, $$0);
   }

   public awf v() {
      return awg.ny;
   }

   @Override
   public void B() {
      this.a(this.w(), 1.0F, 1.0F);
   }

   public awf w() {
      return awg.nz;
   }

   private void b(@Nullable btr $$0, boolean $$1) {
      if (!this.l) {
         cvs $$2 = this.C();
         this.c(cvs.k);
         if (!this.dS().ac().b(def.i)) {
            if ($$0 == null) {
               this.d($$2);
            }
         } else {
            if ($$0 instanceof cnx $$3 && $$3.fR()) {
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

   private void d(cvs $$0) {
      esl $$1 = this.a($$0);
      if ($$1 != null) {
         esn $$2 = cwf.a($$1, this.dS());
         if ($$2 != null) {
            $$2.a(this.b, this.ap());
         }
      }

      $$0.a(null);
   }

   public cvs C() {
      return this.at().a(f);
   }

   @Nullable
   public esl a(cvs $$0) {
      return $$0.a(ks.G);
   }

   public boolean D() {
      return this.C().b(ks.G);
   }

   public void c(cvs $$0) {
      this.a($$0, true);
   }

   public void a(cvs $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.at().a(f, $$0);
      if (!$$0.f()) {
         this.a(this.x(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dS().c(this.b, dho.a);
      }
   }

   public awf x() {
      return awg.nx;
   }

   @Override
   public bve a_(int $$0) {
      return $$0 == 0 ? bve.a(this::C, this::c) : super.a_($$0);
   }

   @Override
   public void a(akh<?> $$0) {
      if ($$0.equals(f)) {
         this.e(this.C());
      }
   }

   private void e(cvs $$0) {
      if (!$$0.f() && $$0.G() != this) {
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
         this.dS().c(this.b, dho.a);
      }
   }

   @Override
   public void b(ug $$0) {
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
   public void a(ug $$0) {
      super.a($$0);
      cvs $$2;
      if ($$0.b("Item", 10)) {
         ug $$1 = $$0.p("Item");
         $$2 = cvs.a(this.dU(), (vd)$$1).orElse(cvs.k);
      } else {
         $$2 = cvs.k;
      }

      cvs $$4 = this.C();
      if (!$$4.f() && !cvs.a($$2, $$4)) {
         this.d($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.k = $$0.j("ItemDropChance");
         }
      }

      this.a(jk.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.l = $$0.q("Fixed");
   }

   @Override
   public brs a(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      boolean $$3 = !this.C().f();
      boolean $$4 = !$$2.f();
      if (this.l) {
         return brs.e;
      } else if (!$$0.dS().B) {
         if (!$$3) {
            if ($$4 && !this.dN()) {
               if ($$2.a(cvw.rV)) {
                  esn $$5 = cwf.b($$2, this.dS());
                  if ($$5 != null && $$5.a(256)) {
                     return brs.d;
                  }
               }

               this.c($$2);
               this.a(dzp.c, $$0);
               $$2.a(1, $$0);
               return brs.a;
            } else {
               return brs.e;
            }
         } else {
            this.a(this.y(), 1.0F, 1.0F);
            this.b(this.E() + 1);
            this.a(dzp.c, $$0);
            return brs.a;
         }
      } else {
         return (brs)(!$$3 && !$$4 ? brs.e : brs.a);
      }
   }

   public awf y() {
      return awg.nB;
   }

   public int F() {
      return this.C().f() ? 0 : this.E() % 8 + 1;
   }

   @Override
   public zl<aca> a(ari $$0) {
      return new acb(this, this.d.d(), this.q());
   }

   @Override
   public void a(acb $$0) {
      super.a($$0);
      this.a(jk.a($$0.p()));
   }

   @Override
   public cvs dF() {
      cvs $$0 = this.C();
      return $$0.f() ? this.z() : $$0.u();
   }

   protected cvs z() {
      return new cvs(cvw.ue);
   }

   @Override
   public float dJ() {
      jk $$0 = this.cL();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azf.b(180 + $$0.e() * 90 + this.E() * 45 + $$1);
   }
}
