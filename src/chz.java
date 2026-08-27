import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class chz extends chy {
   private static final Logger f = LogUtils.getLogger();
   private static final ajy<cuh> g = akc.a(chz.class, aka.h);
   private static final ajy<Integer> h = akc.a(chz.class, aka.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public chz(bsb<? extends chz> $$0, dca $$1) {
      super($$0, $$1);
   }

   public chz(dca $$0, ir $$1, iw $$2) {
      this(bsb.ak, $$0, $$1, $$2);
   }

   public chz(bsb<? extends chz> $$0, dca $$1, ir $$2, iw $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(g, cuh.i);
      $$0.a(h, 0);
   }

   @Override
   protected void a(iw $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.Q = this.dM();
      this.P = this.dK();
      this.y();
   }

   @Override
   protected void y() {
      if (this.d != null) {
         double $$0 = 0.46875;
         double $$1 = (double)this.c.u() + 0.5 - (double)this.d.j() * 0.46875;
         double $$2 = (double)this.c.v() + 0.5 - (double)this.d.k() * 0.46875;
         double $$3 = (double)this.c.w() + 0.5 - (double)this.d.l() * 0.46875;
         this.p($$1, $$2, $$3);
         double $$4 = (double)this.A();
         double $$5 = (double)this.B();
         double $$6 = (double)this.A();
         iw.a $$7 = this.d.o();
         switch ($$7) {
            case a:
               $$4 = 1.0;
               break;
            case b:
               $$5 = 1.0;
               break;
            case c:
               $$6 = 1.0;
         }

         $$4 /= 32.0;
         $$5 /= 32.0;
         $$6 /= 32.0;
         this.a(new ewp($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean z() {
      if (this.j) {
         return true;
      } else if (!this.dU().g(this)) {
         return false;
      } else {
         dtc $$0 = this.dU().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dhf.m($$0) ? this.dU().a(this, this.cP(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bst $$0, ewu $$1) {
      if (!this.j) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.j) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void an() {
      this.c(this.E());
      super.an();
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.j) {
         return !$$0.a(awg.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(awg.m) && !this.E().d()) {
         if (!this.dU().C) {
            this.b($$0.d(), false);
            this.a(dxv.c, $$0.d());
            this.a(this.p(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public avn p() {
      return avo.nP;
   }

   @Override
   public int A() {
      return 12;
   }

   @Override
   public int B() {
      return 12;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cI();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable brv $$0) {
      this.a(this.r(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dxv.c, $$0);
   }

   public avn r() {
      return avo.nN;
   }

   @Override
   public void C() {
      this.a(this.t(), 1.0F, 1.0F);
   }

   public avn t() {
      return avo.nO;
   }

   private void b(@Nullable brv $$0, boolean $$1) {
      if (!this.j) {
         cuh $$2 = this.E();
         this.a(cuh.i);
         if (!this.dU().ab().b(dbw.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cly $$3 && $$3.fY()) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.x());
            }

            if (!$$2.d()) {
               $$2 = $$2.r();
               this.c($$2);
               if (this.al.i() < this.i) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(cuh $$0) {
      eqr $$1 = this.F();
      if ($$1 != null) {
         eqt $$2 = cuq.a($$1, this.dU());
         if ($$2 != null) {
            $$2.a(this.c, this.al());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public cuh E() {
      return this.ap().a(g);
   }

   @Nullable
   public eqr F() {
      return this.E().a(ke.z);
   }

   public boolean G() {
      return this.E().b(ke.z);
   }

   public void a(cuh $$0) {
      this.a($$0, true);
   }

   public void a(cuh $$0, boolean $$1) {
      if (!$$0.d()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.ap().a(g, $$0);
      if (!$$0.d()) {
         this.a(this.u(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dU().c(this.c, dfe.a);
      }
   }

   public avn u() {
      return avo.nM;
   }

   @Override
   public btf a_(int $$0) {
      return $$0 == 0 ? new btf() {
         @Override
         public cuh a() {
            return chz.this.E();
         }

         @Override
         public boolean a(cuh $$0) {
            chz.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.E());
      }
   }

   private void d(cuh $$0) {
      if (!$$0.d() && $$0.C() != this) {
         $$0.a(this);
      }

      this.y();
   }

   public int I() {
      return this.ap().a(h);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.ap().a(h, $$0 % 8);
      if ($$1 && this.c != null) {
         this.dU().c(this.c, dfe.a);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (!this.E().d()) {
         $$0.a("Item", this.E().a(this.dY()));
         $$0.a("ItemRotation", (byte)this.I());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cm());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      cuh $$2;
      if ($$0.b("Item", 10)) {
         uk $$1 = $$0.p("Item");
         $$2 = cuh.a(this.dY(), (vh)$$1).orElse(cuh.i);
      } else {
         $$2 = cuh.i;
      }

      cuh $$4 = this.E();
      if (!$$4.d() && !cuh.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.d()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(iw.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      boolean $$3 = !this.E().d();
      boolean $$4 = !$$2.d();
      if (this.j) {
         return bqa.d;
      } else if (!this.dU().C) {
         if (!$$3) {
            if ($$4 && !this.dP()) {
               if ($$2.a(cuk.tr)) {
                  eqt $$5 = cuq.b($$2, this.dU());
                  if ($$5 != null && $$5.a(256)) {
                     return bqa.e;
                  }
               }

               this.a($$2);
               this.a(dxv.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.I() + 1);
            this.a(dxv.c, $$0);
         }

         return bqa.b;
      } else {
         return !$$3 && !$$4 ? bqa.d : bqa.a;
      }
   }

   public avn w() {
      return avo.nQ;
   }

   public int J() {
      return this.E().d() ? 0 : this.I() % 8 + 1;
   }

   @Override
   public zl<abw> dq() {
      return new abx(this, this.d.d(), this.D());
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      this.a(iw.a($$0.p()));
   }

   @Override
   public cuh dH() {
      cuh $$0 = this.E();
      return $$0.d() ? this.x() : $$0.r();
   }

   protected cuh x() {
      return new cuh(cuk.vE);
   }

   @Override
   public float dL() {
      iw $$0 = this.cM();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)aym.b(180 + $$0.e() * 90 + this.I() * 45 + $$1);
   }
}
