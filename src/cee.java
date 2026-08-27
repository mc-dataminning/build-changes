import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class cee extends ced {
   private static final Logger f = LogUtils.getLogger();
   private static final aii<cpq> g = ail.a(cee.class, aik.h);
   private static final aii<Integer> h = ail.a(cee.class, aik.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public cee(bol<? extends cee> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cee(cwe $$0, ib $$1, ih $$2) {
      this(bol.ah, $$0, $$1, $$2);
   }

   public cee(bol<? extends cee> $$0, cwe $$1, ib $$2, ih $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void c_() {
      this.an().a(g, cpq.h);
      this.an().a(h, 0);
   }

   @Override
   protected void a(ih $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.N = this.dB();
      this.M = this.dz();
      this.z();
   }

   @Override
   protected void z() {
      if (this.d != null) {
         double $$0 = 0.46875;
         double $$1 = (double)this.c.u() + 0.5 - (double)this.d.j() * 0.46875;
         double $$2 = (double)this.c.v() + 0.5 - (double)this.d.k() * 0.46875;
         double $$3 = (double)this.c.w() + 0.5 - (double)this.d.l() * 0.46875;
         this.p($$1, $$2, $$3);
         double $$4 = (double)this.B();
         double $$5 = (double)this.C();
         double $$6 = (double)this.B();
         ih.a $$7 = this.d.o();
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
         this.a(new eoq($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean A() {
      if (this.j) {
         return true;
      } else if (!this.dJ().g(this)) {
         return false;
      } else {
         dme $$0 = this.dJ().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dbh.m($$0) ? this.dJ().a(this, this.cE(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bpc $$0, eov $$1) {
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
   public void al() {
      this.c(this.G());
      super.al();
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.j) {
         return !$$0.a(aug.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(aug.m) && !this.G().b()) {
         if (!this.dJ().B) {
            this.b($$0.d(), false);
            this.a(dqr.c, $$0.d());
            this.a(this.q(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public ato q() {
      return atp.nb;
   }

   @Override
   public int B() {
      return 12;
   }

   @Override
   public int C() {
      return 12;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cx();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(@Nullable bof $$0) {
      this.a(this.s(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dqr.c, $$0);
   }

   public ato s() {
      return atp.mZ;
   }

   @Override
   public void D() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public ato u() {
      return atp.na;
   }

   private void b(@Nullable bof $$0, boolean $$1) {
      if (!this.j) {
         cpq $$2 = this.G();
         this.a(cpq.h);
         if (!this.dJ().Z().b(cwa.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cia $$3 && $$3.fW().d) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.y());
            }

            if (!$$2.b()) {
               $$2 = $$2.q();
               this.c($$2);
               if (this.af.i() < this.i) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(cpq $$0) {
      eja $$1 = this.H();
      if ($$1 != null) {
         ejc $$2 = cpx.a($$1, this.dJ());
         if ($$2 != null) {
            $$2.a(this.c, this.aj());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public cpq G() {
      return this.an().b(g);
   }

   @Nullable
   public eja H() {
      return cpx.d(this.G());
   }

   public boolean I() {
      return this.H() != null;
   }

   public void a(cpq $$0) {
      this.a($$0, true);
   }

   public void a(cpq $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().b(g, $$0);
      if (!$$0.b()) {
         this.a(this.w(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dJ().c(this.c, czh.a);
      }
   }

   public ato w() {
      return atp.mY;
   }

   @Override
   public bpo a_(int $$0) {
      return $$0 == 0 ? new bpo() {
         @Override
         public cpq a() {
            return cee.this.G();
         }

         @Override
         public boolean a(cpq $$0) {
            cee.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(aii<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.G());
      }
   }

   private void d(cpq $$0) {
      if (!$$0.b() && $$0.H() != this) {
         $$0.a(this);
      }

      this.z();
   }

   public int J() {
      return this.an().b(h);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.an().b(h, $$0 % 8);
      if ($$1 && this.c != null) {
         this.dJ().c(this.c, czh.a);
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (!this.G().b()) {
         $$0.a("Item", this.G().b(new sy()));
         $$0.a("ItemRotation", (byte)this.J());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cb());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      sy $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         cpq $$2 = cpq.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         cpq $$3 = this.G();
         if (!$$3.b() && !cpq.a($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(ih.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bml a(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      boolean $$3 = !this.G().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return bml.d;
      } else if (!this.dJ().B) {
         if (!$$3) {
            if ($$4 && !this.dE()) {
               if ($$2.a(cpt.rT)) {
                  ejc $$5 = cpx.b($$2, this.dJ());
                  if ($$5 != null && $$5.b(256)) {
                     return bml.e;
                  }
               }

               this.a($$2);
               this.a(dqr.c, $$0);
               if (!$$0.fW().d) {
                  $$2.h(1);
               }
            }
         } else {
            this.a(this.x(), 1.0F, 1.0F);
            this.b(this.J() + 1);
            this.a(dqr.c, $$0);
         }

         return bml.b;
      } else {
         return !$$3 && !$$4 ? bml.d : bml.a;
      }
   }

   public ato x() {
      return atp.nc;
   }

   public int K() {
      return this.G().b() ? 0 : this.J() % 8 + 1;
   }

   @Override
   public xz<aai> df() {
      return new aaj(this, this.d.d(), this.E());
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      this.a(ih.a($$0.p()));
   }

   @Override
   public cpq dw() {
      cpq $$0 = this.G();
      return $$0.b() ? this.y() : $$0.q();
   }

   protected cpq y() {
      return new cpq(cpt.tY);
   }

   @Override
   public float dA() {
      ih $$0 = this.cB();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)awm.b(180 + $$0.e() * 90 + this.J() * 45 + $$1);
   }
}
