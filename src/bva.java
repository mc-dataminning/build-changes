import com.mojang.logging.LogUtils;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class bva extends buz {
   private static final Logger f = LogUtils.getLogger();
   private static final aby<cfz> g = acb.a(bva.class, aca.h);
   private static final aby<Integer> h = acb.a(bva.class, aca.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public bva(bfn<? extends bva> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bva(cmm $$0, gu $$1, ha $$2) {
      this(bfn.af, $$0, $$1, $$2);
   }

   public bva(bfn<? extends bva> $$0, cmm $$1, gu $$2, ha $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected float a(bgl $$0, bfk $$1) {
      return 0.0F;
   }

   @Override
   protected void a_() {
      this.aj().a(g, cfz.b);
      this.aj().a(h, 0);
   }

   @Override
   protected void a(ha $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.b_(0.0F);
         this.a_((float)(this.d.e() * 90));
      } else {
         this.b_((float)(-90 * $$0.f().a()));
         this.a_(0.0F);
      }

      this.N = this.dA();
      this.M = this.dy();
      this.s();
   }

   @Override
   protected void s() {
      if (this.d != null) {
         double $$0 = 0.46875;
         double $$1 = (double)this.c.u() + 0.5 - (double)this.d.j() * 0.46875;
         double $$2 = (double)this.c.v() + 0.5 - (double)this.d.k() * 0.46875;
         double $$3 = (double)this.c.w() + 0.5 - (double)this.d.l() * 0.46875;
         this.p($$1, $$2, $$3);
         double $$4 = (double)this.v();
         double $$5 = (double)this.w();
         double $$6 = (double)this.v();
         ha.a $$7 = this.d.o();
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
         this.a(new eed($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean t() {
      if (this.j) {
         return true;
      } else if (!this.dI().g(this)) {
         return false;
      } else {
         dcb $$0 = this.dI().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && crl.h($$0) ? this.dI().a(this, this.cE(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bgf $$0, eei $$1) {
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
   public float bC() {
      return 0.0F;
   }

   @Override
   public void ah() {
      this.c(this.z());
      super.ah();
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.j) {
         return !$$0.a(amy.d) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(amy.l) && !this.z().b()) {
         if (!this.dI().B) {
            this.b($$0.d(), false);
            this.a(dgl.c, $$0.d());
            this.a(this.j(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public amg j() {
      return amh.lX;
   }

   @Override
   public int v() {
      return 12;
   }

   @Override
   public int w() {
      return 12;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cx();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(@Nullable bfj $$0) {
      this.a(this.k(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dgl.c, $$0);
   }

   public amg k() {
      return amh.lV;
   }

   @Override
   public void x() {
      this.a(this.o(), 1.0F, 1.0F);
   }

   public amg o() {
      return amh.lW;
   }

   private void b(@Nullable bfj $$0, boolean $$1) {
      if (!this.j) {
         cfz $$2 = this.z();
         this.a(cfz.b);
         if (!this.dI().X().b(cmi.h)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof byo $$3 && $$3.fO().d) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.r());
            }

            if (!$$2.b()) {
               $$2 = $$2.p();
               this.c($$2);
               if (this.af.i() < this.i) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(cfz $$0) {
      this.A().ifPresent($$0x -> {
         dyo $$1 = cgg.a($$0x, this.dI());
         if ($$1 != null) {
            $$1.a(this.c, this.af());
            $$1.a(true);
         }
      });
      $$0.a(null);
   }

   public cfz z() {
      return this.aj().b(g);
   }

   public OptionalInt A() {
      cfz $$0 = this.z();
      if ($$0.a(cgc.rf)) {
         Integer $$1 = cgg.d($$0);
         if ($$1 != null) {
            return OptionalInt.of($$1);
         }
      }

      return OptionalInt.empty();
   }

   public boolean C() {
      return this.A().isPresent();
   }

   public void a(cfz $$0) {
      this.a($$0, true);
   }

   public void a(cfz $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.aj().b(g, $$0);
      if (!$$0.b()) {
         this.a(this.p(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dI().c(this.c, cpo.a);
      }
   }

   public amg p() {
      return amh.lU;
   }

   @Override
   public bgs a_(int $$0) {
      return $$0 == 0 ? new bgs() {
         @Override
         public cfz a() {
            return bva.this.z();
         }

         @Override
         public boolean a(cfz $$0) {
            bva.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(aby<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.z());
      }
   }

   private void d(cfz $$0) {
      if (!$$0.b() && $$0.G() != this) {
         $$0.a(this);
      }

      this.s();
   }

   public int D() {
      return this.aj().b(h);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.aj().b(h, $$0 % 8);
      if ($$1 && this.c != null) {
         this.dI().c(this.c, cpo.a);
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (!this.z().b()) {
         $$0.a("Item", this.z().b(new qr()));
         $$0.a("ItemRotation", (byte)this.D());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cb());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      qr $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         cfz $$2 = cfz.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         cfz $$3 = this.z();
         if (!$$3.b() && !cfz.a($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(ha.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bdx a(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      boolean $$3 = !this.z().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return bdx.d;
      } else if (!this.dI().B) {
         if (!$$3) {
            if ($$4 && !this.dD()) {
               if ($$2.a(cgc.rf)) {
                  dyo $$5 = cgg.a($$2, this.dI());
                  if ($$5 != null && $$5.b(256)) {
                     return bdx.e;
                  }
               }

               this.a($$2);
               this.a(dgl.c, $$0);
               if (!$$0.fO().d) {
                  $$2.h(1);
               }
            }
         } else {
            this.a(this.q(), 1.0F, 1.0F);
            this.b(this.D() + 1);
            this.a(dgl.c, $$0);
         }

         return bdx.b;
      } else {
         return !$$3 && !$$4 ? bdx.d : bdx.a;
      }
   }

   public amg q() {
      return amh.lY;
   }

   public int E() {
      return this.z().b() ? 0 : this.D() % 8 + 1;
   }

   @Override
   public uo<ur> S() {
      return new us(this, this.d.d(), this.y());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(ha.a($$0.n()));
   }

   @Override
   public cfz dv() {
      cfz $$0 = this.z();
      return $$0.b() ? this.r() : $$0.p();
   }

   protected cfz r() {
      return new cfz(cgc.ti);
   }

   @Override
   public float dz() {
      ha $$0 = this.cB();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)apa.b(180 + $$0.e() * 90 + this.D() * 45 + $$1);
   }
}
