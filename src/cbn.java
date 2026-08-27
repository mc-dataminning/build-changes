import com.mojang.logging.LogUtils;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class cbn extends cbm {
   private static final Logger f = LogUtils.getLogger();
   private static final agm<cmy> g = agp.a(cbn.class, ago.h);
   private static final agm<Integer> h = agp.a(cbn.class, ago.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public cbn(blz<? extends cbn> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cbn(ctp $$0, hx $$1, ic $$2) {
      this(blz.ag, $$0, $$1, $$2);
   }

   public cbn(blz<? extends cbn> $$0, ctp $$1, hx $$2, ic $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected float a(bmx $$0, blw $$1) {
      return 0.0F;
   }

   @Override
   protected void c_() {
      this.an().a(g, cmy.f);
      this.an().a(h, 0);
   }

   @Override
   protected void a(ic $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.O = this.dE();
      this.N = this.dC();
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
         ic.a $$7 = this.d.o();
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
         this.a(new elo($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean A() {
      if (this.j) {
         return true;
      } else if (!this.dM().g(this)) {
         return false;
      } else {
         djh $$0 = this.dM().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && cys.h($$0) ? this.dM().a(this, this.cH(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bmr $$0, elt $$1) {
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
   public boolean a(bkt $$0, float $$1) {
      if (this.j) {
         return !$$0.a(asj.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(asj.m) && !this.G().b()) {
         if (!this.dM().B) {
            this.b($$0.d(), false);
            this.a(dnr.c, $$0.d());
            this.a(this.q(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public arr q() {
      return ars.mL;
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
   public void a(@Nullable blv $$0) {
      this.a(this.s(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dnr.c, $$0);
   }

   public arr s() {
      return ars.mJ;
   }

   @Override
   public void D() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public arr u() {
      return ars.mK;
   }

   private void b(@Nullable blv $$0, boolean $$1) {
      if (!this.j) {
         cmy $$2 = this.G();
         this.a(cmy.f);
         if (!this.dM().Z().b(ctl.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cfi $$3 && $$3.fT().d) {
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

   private void c(cmy $$0) {
      this.H().ifPresent($$0x -> {
         egb $$1 = cnf.a($$0x, this.dM());
         if ($$1 != null) {
            $$1.a(this.c, this.aj());
            $$1.a(true);
         }
      });
      $$0.a(null);
   }

   public cmy G() {
      return this.an().b(g);
   }

   public OptionalInt H() {
      cmy $$0 = this.G();
      if ($$0.a(cnb.rR)) {
         Integer $$1 = cnf.d($$0);
         if ($$1 != null) {
            return OptionalInt.of($$1);
         }
      }

      return OptionalInt.empty();
   }

   public boolean I() {
      return this.H().isPresent();
   }

   public void a(cmy $$0) {
      this.a($$0, true);
   }

   public void a(cmy $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().b(g, $$0);
      if (!$$0.b()) {
         this.a(this.w(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dM().c(this.c, cws.a);
      }
   }

   public arr w() {
      return ars.mI;
   }

   @Override
   public bnd a_(int $$0) {
      return $$0 == 0 ? new bnd() {
         @Override
         public cmy a() {
            return cbn.this.G();
         }

         @Override
         public boolean a(cmy $$0) {
            cbn.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(agm<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.G());
      }
   }

   private void d(cmy $$0) {
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
         this.dM().c(this.c, cws.a);
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (!this.G().b()) {
         $$0.a("Item", this.G().b(new sn()));
         $$0.a("ItemRotation", (byte)this.J());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ce());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      sn $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         cmy $$2 = cmy.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         cmy $$3 = this.G();
         if (!$$3.b() && !cmy.a($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(ic.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bkb a(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      boolean $$3 = !this.G().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return bkb.d;
      } else if (!this.dM().B) {
         if (!$$3) {
            if ($$4 && !this.dH()) {
               if ($$2.a(cnb.rR)) {
                  egb $$5 = cnf.b($$2, this.dM());
                  if ($$5 != null && $$5.b(256)) {
                     return bkb.e;
                  }
               }

               this.a($$2);
               this.a(dnr.c, $$0);
               if (!$$0.fT().d) {
                  $$2.h(1);
               }
            }
         } else {
            this.a(this.x(), 1.0F, 1.0F);
            this.b(this.J() + 1);
            this.a(dnr.c, $$0);
         }

         return bkb.b;
      } else {
         return !$$3 && !$$4 ? bkb.d : bkb.a;
      }
   }

   public arr x() {
      return ars.mM;
   }

   public int K() {
      return this.G().b() ? 0 : this.J() % 8 + 1;
   }

   @Override
   public xf<za> dj() {
      return new zb(this, this.d.d(), this.E());
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      this.a(ic.a($$0.o()));
   }

   @Override
   public cmy dz() {
      cmy $$0 = this.G();
      return $$0.b() ? this.y() : $$0.p();
   }

   protected cmy y() {
      return new cmy(cnb.tV);
   }

   @Override
   public float dD() {
      ic $$0 = this.cE();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)auo.b(180 + $$0.e() * 90 + this.J() * 45 + $$1);
   }
}
