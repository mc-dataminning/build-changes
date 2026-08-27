import com.mojang.logging.LogUtils;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class cal extends cak {
   private static final Logger f = LogUtils.getLogger();
   private static final afs<clo> g = afv.a(cal.class, afu.h);
   private static final afs<Integer> h = afv.a(cal.class, afu.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public cal(bkz<? extends cal> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cal(csf $$0, hx $$1, ib $$2) {
      this(bkz.af, $$0, $$1, $$2);
   }

   public cal(bkz<? extends cal> $$0, csf $$1, hx $$2, ib $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected float a(blx $$0, bkw $$1) {
      return 0.0F;
   }

   @Override
   protected void c_() {
      this.an().a(g, clo.b);
      this.an().a(h, 0);
   }

   @Override
   protected void a(ib $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.O = this.dF();
      this.N = this.dD();
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
         ib.a $$7 = this.d.o();
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
         this.a(new eju($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean A() {
      if (this.j) {
         return true;
      } else if (!this.dN().g(this)) {
         return false;
      } else {
         dhn $$0 = this.dN().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && cxh.h($$0) ? this.dN().a(this, this.cH(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(blr $$0, ejz $$1) {
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
   public boolean a(bjt $$0, float $$1) {
      if (this.j) {
         return !$$0.a(arm.d) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(arm.l) && !this.G().b()) {
         if (!this.dN().B) {
            this.b($$0.d(), false);
            this.a(dlx.c, $$0.d());
            this.a(this.q(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public aqu q() {
      return aqv.mr;
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
      $$1 *= 64.0 * cA();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(@Nullable bkv $$0) {
      this.a(this.s(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dlx.c, $$0);
   }

   public aqu s() {
      return aqv.mp;
   }

   @Override
   public void D() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public aqu u() {
      return aqv.mq;
   }

   private void b(@Nullable bkv $$0, boolean $$1) {
      if (!this.j) {
         clo $$2 = this.G();
         this.a(clo.b);
         if (!this.dN().Y().b(csb.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cdz $$3 && $$3.fU().d) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.y());
            }

            if (!$$2.b()) {
               $$2 = $$2.p();
               this.c($$2);
               if (this.ag.i() < this.i) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(clo $$0) {
      this.H().ifPresent($$0x -> {
         eeh $$1 = clv.a($$0x, this.dN());
         if ($$1 != null) {
            $$1.a(this.c, this.aj());
            $$1.a(true);
         }
      });
      $$0.a(null);
   }

   public clo G() {
      return this.an().b(g);
   }

   public OptionalInt H() {
      clo $$0 = this.G();
      if ($$0.a(clr.rR)) {
         Integer $$1 = clv.d($$0);
         if ($$1 != null) {
            return OptionalInt.of($$1);
         }
      }

      return OptionalInt.empty();
   }

   public boolean I() {
      return this.H().isPresent();
   }

   public void a(clo $$0) {
      this.a($$0, true);
   }

   public void a(clo $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().b(g, $$0);
      if (!$$0.b()) {
         this.a(this.w(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dN().c(this.c, cvh.a);
      }
   }

   public aqu w() {
      return aqv.mo;
   }

   @Override
   public bmd a_(int $$0) {
      return $$0 == 0 ? new bmd() {
         @Override
         public clo a() {
            return cal.this.G();
         }

         @Override
         public boolean a(clo $$0) {
            cal.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(afs<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.G());
      }
   }

   private void d(clo $$0) {
      if (!$$0.b() && $$0.G() != this) {
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
         this.dN().c(this.c, cvh.a);
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      if (!this.G().b()) {
         $$0.a("Item", this.G().b(new sd()));
         $$0.a("ItemRotation", (byte)this.J());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ce());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      sd $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         clo $$2 = clo.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         clo $$3 = this.G();
         if (!$$3.b() && !clo.a($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(ib.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bjb a(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      boolean $$3 = !this.G().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return bjb.d;
      } else if (!this.dN().B) {
         if (!$$3) {
            if ($$4 && !this.dI()) {
               if ($$2.a(clr.rR)) {
                  eeh $$5 = clv.b($$2, this.dN());
                  if ($$5 != null && $$5.b(256)) {
                     return bjb.e;
                  }
               }

               this.a($$2);
               this.a(dlx.c, $$0);
               if (!$$0.fU().d) {
                  $$2.h(1);
               }
            }
         } else {
            this.a(this.x(), 1.0F, 1.0F);
            this.b(this.J() + 1);
            this.a(dlx.c, $$0);
         }

         return bjb.b;
      } else {
         return !$$3 && !$$4 ? bjb.d : bjb.a;
      }
   }

   public aqu x() {
      return aqv.ms;
   }

   public int K() {
      return this.G().b() ? 0 : this.J() % 8 + 1;
   }

   @Override
   public wo<yh> dk() {
      return new yi(this, this.d.d(), this.E());
   }

   @Override
   public void a(yi $$0) {
      super.a($$0);
      this.a(ib.a($$0.o()));
   }

   @Override
   public clo dA() {
      clo $$0 = this.G();
      return $$0.b() ? this.y() : $$0.p();
   }

   protected clo y() {
      return new clo(clr.tU);
   }

   @Override
   public float dE() {
      ib $$0 = this.cE();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)atq.b(180 + $$0.e() * 90 + this.J() * 45 + $$1);
   }
}
