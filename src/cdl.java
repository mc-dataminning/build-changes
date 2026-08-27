import com.mojang.logging.LogUtils;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class cdl extends cdk {
   private static final Logger f = LogUtils.getLogger();
   private static final aie<coz> g = aih.a(cdl.class, aig.h);
   private static final aie<Integer> h = aih.a(cdl.class, aig.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public cdl(bnu<? extends cdl> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cdl(cvn $$0, hz $$1, ie $$2) {
      this(bnu.ah, $$0, $$1, $$2);
   }

   public cdl(bnu<? extends cdl> $$0, cvn $$1, hz $$2, ie $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void c_() {
      this.an().a(g, coz.h);
      this.an().a(h, 0);
   }

   @Override
   protected void a(ie $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.N = this.dE();
      this.M = this.dC();
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
         ie.a $$7 = this.d.o();
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
         this.a(new enn($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean A() {
      if (this.j) {
         return true;
      } else if (!this.dM().g(this)) {
         return false;
      } else {
         dlf $$0 = this.dM().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && daq.m($$0) ? this.dM().a(this, this.cH(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bol $$0, ens $$1) {
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
   public boolean a(bmn $$0, float $$1) {
      if (this.j) {
         return !$$0.a(aub.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(aub.m) && !this.G().b()) {
         if (!this.dM().B) {
            this.b($$0.d(), false);
            this.a(dpp.c, $$0.d());
            this.a(this.q(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public atj q() {
      return atk.na;
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
   public void a(@Nullable bno $$0) {
      this.a(this.s(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dpp.c, $$0);
   }

   public atj s() {
      return atk.mY;
   }

   @Override
   public void D() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public atj u() {
      return atk.mZ;
   }

   private void b(@Nullable bno $$0, boolean $$1) {
      if (!this.j) {
         coz $$2 = this.G();
         this.a(coz.h);
         if (!this.dM().Z().b(cvj.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof chh $$3 && $$3.fU().d) {
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

   private void c(coz $$0) {
      this.H().ifPresent($$0x -> {
         ehz $$1 = cpg.a($$0x, this.dM());
         if ($$1 != null) {
            $$1.a(this.c, this.aj());
            $$1.a(true);
         }
      });
      $$0.a(null);
   }

   public coz G() {
      return this.an().b(g);
   }

   public OptionalInt H() {
      coz $$0 = this.G();
      if ($$0.a(cpc.rT)) {
         Integer $$1 = cpg.d($$0);
         if ($$1 != null) {
            return OptionalInt.of($$1);
         }
      }

      return OptionalInt.empty();
   }

   public boolean I() {
      return this.H().isPresent();
   }

   public void a(coz $$0) {
      this.a($$0, true);
   }

   public void a(coz $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().b(g, $$0);
      if (!$$0.b()) {
         this.a(this.w(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dM().c(this.c, cyq.a);
      }
   }

   public atj w() {
      return atk.mX;
   }

   @Override
   public box a_(int $$0) {
      return $$0 == 0 ? new box() {
         @Override
         public coz a() {
            return cdl.this.G();
         }

         @Override
         public boolean a(coz $$0) {
            cdl.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(aie<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.G());
      }
   }

   private void d(coz $$0) {
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
         this.dM().c(this.c, cyq.a);
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (!this.G().b()) {
         $$0.a("Item", this.G().b(new sw()));
         $$0.a("ItemRotation", (byte)this.J());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ce());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      sw $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         coz $$2 = coz.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         coz $$3 = this.G();
         if (!$$3.b() && !coz.a($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(ie.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public blu a(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      boolean $$3 = !this.G().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return blu.d;
      } else if (!this.dM().B) {
         if (!$$3) {
            if ($$4 && !this.dH()) {
               if ($$2.a(cpc.rT)) {
                  ehz $$5 = cpg.b($$2, this.dM());
                  if ($$5 != null && $$5.b(256)) {
                     return blu.e;
                  }
               }

               this.a($$2);
               this.a(dpp.c, $$0);
               if (!$$0.fU().d) {
                  $$2.h(1);
               }
            }
         } else {
            this.a(this.x(), 1.0F, 1.0F);
            this.b(this.J() + 1);
            this.a(dpp.c, $$0);
         }

         return blu.b;
      } else {
         return !$$3 && !$$4 ? blu.d : blu.a;
      }
   }

   public atj x() {
      return atk.nb;
   }

   public int K() {
      return this.G().b() ? 0 : this.J() % 8 + 1;
   }

   @Override
   public xx<aag> di() {
      return new aah(this, this.d.d(), this.E());
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      this.a(ie.a($$0.p()));
   }

   @Override
   public coz dz() {
      coz $$0 = this.G();
      return $$0.b() ? this.y() : $$0.q();
   }

   protected coz y() {
      return new coz(cpc.tY);
   }

   @Override
   public float dD() {
      ie $$0 = this.cE();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)awh.b(180 + $$0.e() * 90 + this.J() * 45 + $$1);
   }
}
