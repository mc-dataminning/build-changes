import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjx extends cjl {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private ers e;
   @Nullable
   private ezh f;
   @Nullable
   private buv g;
   private boolean h;

   public cjx(cjj $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.gs().a(cjz.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$0 = this.g.dC();
            double $$1 = this.g.dI();
            double $$2 = $$0 - this.a.dC();
            double $$3 = $$1 - this.a.dI();
            double $$4 = Math.sqrt($$2 * $$2 + $$3 * $$3);
            double $$5 = Math.min(0.4F + $$4 / 80.0 - 1.0, 10.0);
            this.f = new ezh($$0, this.g.dE() + $$5, $$1);
         }

         double $$6 = this.f == null ? 0.0 : this.f.c(this.a.dC(), this.a.dE(), this.a.dI());
         if ($$6 < 100.0 || $$6 > 22500.0) {
            this.j();
         }

         double $$7 = 64.0;
         if (this.g.g(this.a) < 4096.0) {
            if (this.a.G(this.g)) {
               this.d++;
               ezh $$8 = new ezh(this.g.dC() - this.a.dC(), 0.0, this.g.dI() - this.a.dI()).d();
               ezh $$9 = new ezh((double)azj.a(this.a.dN() * (float) (Math.PI / 180.0)), 0.0, (double)(-azj.b(this.a.dN() * (float) (Math.PI / 180.0)))).d();
               float $$10 = (float)$$9.b($$8);
               float $$11 = (float)(Math.acos((double)$$10) * 180.0F / (float)Math.PI);
               $$11 += 0.5F;
               if (this.d >= 5 && $$11 >= 0.0F && $$11 < 10.0F) {
                  double $$12 = 1.0;
                  ezh $$13 = this.a.g(1.0F);
                  double $$14 = this.a.d.dC() - $$13.d * 1.0;
                  double $$15 = this.a.d.e(0.5) + 0.5;
                  double $$16 = this.a.d.dI() - $$13.f * 1.0;
                  double $$17 = this.g.dC() - $$14;
                  double $$18 = this.g.e(0.5) - $$15;
                  double $$19 = this.g.dI() - $$16;
                  ezh $$20 = new ezh($$17, $$18, $$19);
                  if (!this.a.bc()) {
                     this.a.dX().a(null, 1017, this.a.dx(), 0);
                  }

                  cos $$21 = new cos(this.a.dX(), this.a, $$20.d());
                  $$21.b($$14, $$15, $$16, 0.0F, 0.0F);
                  this.a.dX().b($$21);
                  this.d = 0;
                  if (this.e != null) {
                     while (!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.gs().a(cjz.a);
               }
            } else if (this.d > 0) {
               this.d--;
            }
         } else if (this.d > 0) {
            this.d--;
         }
      }
   }

   private void j() {
      if (this.e == null || this.e.c()) {
         int $$0 = this.a.y();
         int $$1 = $$0;
         if (this.a.ea().a(8) == 0) {
            this.h = !this.h;
            $$1 = $$0 + 6;
         }

         if (this.h) {
            $$1++;
         } else {
            $$1--;
         }

         if (this.a.gt() != null && this.a.gt().e() > 0) {
            $$1 %= 12;
            if ($$1 < 0) {
               $$1 += 12;
            }
         } else {
            $$1 -= 12;
            $$1 &= 7;
            $$1 += 12;
         }

         this.e = this.a.a($$0, $$1, null);
         if (this.e != null) {
            this.e.a();
         }
      }

      this.k();
   }

   private void k() {
      if (this.e != null && !this.e.c()) {
         kk $$0 = this.e.g();
         this.e.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ea().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.f = new ezh($$1, $$3, $$2);
      }
   }

   @Override
   public void d() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(buv $$0) {
      this.g = $$0;
      int $$1 = this.a.y();
      int $$2 = this.a.q(this.g.dC(), this.g.dE(), this.g.dI());
      int $$3 = this.g.dB();
      int $$4 = this.g.dH();
      double $$5 = (double)$$3 - this.a.dC();
      double $$6 = (double)$$4 - this.a.dI();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = azj.a(this.g.dE() + $$8);
      erq $$10 = new erq($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.k();
      }
   }

   @Nullable
   @Override
   public ezh g() {
      return this.f;
   }

   @Override
   public cjz<cjx> i() {
      return cjz.b;
   }
}
