import com.mojang.logging.LogUtils;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class bxy extends bxx {
   private static final Logger f = LogUtils.getLogger();
   private static final adz<cix> g = aec.a(bxy.class, aeb.h);
   private static final adz<Integer> h = aec.a(bxy.class, aeb.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public bxy(bim<? extends bxy> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public bxy(cpl $$0, gu $$1, ha $$2) {
      this(bim.af, $$0, $$1, $$2);
   }

   public bxy(bim<? extends bxy> $$0, cpl $$1, gu $$2, ha $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected float a(bjk $$0, bij $$1) {
      return 0.0F;
   }

   @Override
   protected void a_() {
      this.al().a(g, cix.b);
      this.al().a(h, 0);
   }

   @Override
   protected void a(ha $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.O = this.dC();
      this.N = this.dA();
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
         this.a(new egy($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean t() {
      if (this.j) {
         return true;
      } else if (!this.dK().g(this)) {
         return false;
      } else {
         dez $$0 = this.dK().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && cuj.h($$0) ? this.dK().a(this, this.cG(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bje $$0, ehd $$1) {
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
   public float bD() {
      return 0.0F;
   }

   @Override
   public void aj() {
      this.c(this.z());
      super.aj();
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.j) {
         return !$$0.a(apn.d) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(apn.l) && !this.z().b()) {
         if (!this.dK().B) {
            this.b($$0.d(), false);
            this.a(djj.c, $$0.d());
            this.a(this.j(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public aov j() {
      return aow.lX;
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
      $$1 *= 64.0 * cz();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(@Nullable bii $$0) {
      this.a(this.m(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(djj.c, $$0);
   }

   public aov m() {
      return aow.lV;
   }

   @Override
   public void x() {
      this.a(this.o(), 1.0F, 1.0F);
   }

   public aov o() {
      return aow.lW;
   }

   private void b(@Nullable bii $$0, boolean $$1) {
      if (!this.j) {
         cix $$2 = this.z();
         this.a(cix.b);
         if (!this.dK().X().b(cph.h)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cbm $$3 && $$3.fR().d) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.r());
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

   private void c(cix $$0) {
      this.A().ifPresent($$0x -> {
         ebm $$1 = cje.a($$0x, this.dK());
         if ($$1 != null) {
            $$1.a(this.c, this.ah());
            $$1.a(true);
         }
      });
      $$0.a(null);
   }

   public cix z() {
      return this.al().b(g);
   }

   public OptionalInt A() {
      cix $$0 = this.z();
      if ($$0.a(cja.rf)) {
         Integer $$1 = cje.d($$0);
         if ($$1 != null) {
            return OptionalInt.of($$1);
         }
      }

      return OptionalInt.empty();
   }

   public boolean B() {
      return this.A().isPresent();
   }

   public void a(cix $$0) {
      this.a($$0, true);
   }

   public void a(cix $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.al().b(g, $$0);
      if (!$$0.b()) {
         this.a(this.p(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dK().c(this.c, csm.a);
      }
   }

   public aov p() {
      return aow.lU;
   }

   @Override
   public bjq a_(int $$0) {
      return $$0 == 0 ? new bjq() {
         @Override
         public cix a() {
            return bxy.this.z();
         }

         @Override
         public boolean a(cix $$0) {
            bxy.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(adz<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.z());
      }
   }

   private void d(cix $$0) {
      if (!$$0.b() && $$0.G() != this) {
         $$0.a(this);
      }

      this.s();
   }

   public int D() {
      return this.al().b(h);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.al().b(h, $$0 % 8);
      if ($$1 && this.c != null) {
         this.dK().c(this.c, csm.a);
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
      $$0.a("Invisible", this.cd());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      qr $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         cix $$2 = cix.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         cix $$3 = this.z();
         if (!$$3.b() && !cix.a($$2, $$3)) {
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
   public bgq a(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      boolean $$3 = !this.z().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return bgq.d;
      } else if (!this.dK().B) {
         if (!$$3) {
            if ($$4 && !this.dF()) {
               if ($$2.a(cja.rf)) {
                  ebm $$5 = cje.a($$2, this.dK());
                  if ($$5 != null && $$5.b(256)) {
                     return bgq.e;
                  }
               }

               this.a($$2);
               this.a(djj.c, $$0);
               if (!$$0.fR().d) {
                  $$2.h(1);
               }
            }
         } else {
            this.a(this.q(), 1.0F, 1.0F);
            this.b(this.D() + 1);
            this.a(djj.c, $$0);
         }

         return bgq.b;
      } else {
         return !$$3 && !$$4 ? bgq.d : bgq.a;
      }
   }

   public aov q() {
      return aow.lY;
   }

   public int E() {
      return this.z().b() ? 0 : this.D() % 8 + 1;
   }

   @Override
   public ux<wp> U() {
      return new wq(this, this.d.d(), this.y());
   }

   @Override
   public void a(wq $$0) {
      super.a($$0);
      this.a(ha.a($$0.o()));
   }

   @Override
   public cix dx() {
      cix $$0 = this.z();
      return $$0.b() ? this.r() : $$0.p();
   }

   protected cix r() {
      return new cix(cja.ti);
   }

   @Override
   public float dB() {
      ha $$0 = this.cD();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)arp.b(180 + $$0.e() * 90 + this.D() * 45 + $$1);
   }
}
