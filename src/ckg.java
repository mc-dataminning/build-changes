import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckg extends cju {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private esc e;
   @Nullable
   private ezr f;
   @Nullable
   private bve g;
   private boolean h;

   public ckg(cjs $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.gs().a(cki.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$0 = this.g.dD();
            double $$1 = this.g.dJ();
            double $$2 = $$0 - this.a.dD();
            double $$3 = $$1 - this.a.dJ();
            double $$4 = Math.sqrt($$2 * $$2 + $$3 * $$3);
            double $$5 = Math.min(0.4F + $$4 / 80.0 - 1.0, 10.0);
            this.f = new ezr($$0, this.g.dF() + $$5, $$1);
         }

         double $$6 = this.f == null ? 0.0 : this.f.c(this.a.dD(), this.a.dF(), this.a.dJ());
         if ($$6 < 100.0 || $$6 > 22500.0) {
            this.j();
         }

         double $$7 = 64.0;
         if (this.g.g(this.a) < 4096.0) {
            if (this.a.G(this.g)) {
               this.d++;
               ezr $$8 = new ezr(this.g.dD() - this.a.dD(), 0.0, this.g.dJ() - this.a.dJ()).d();
               ezr $$9 = new ezr((double)azn.a(this.a.dO() * (float) (Math.PI / 180.0)), 0.0, (double)(-azn.b(this.a.dO() * (float) (Math.PI / 180.0)))).d();
               float $$10 = (float)$$9.b($$8);
               float $$11 = (float)(Math.acos((double)$$10) * 180.0F / (float)Math.PI);
               $$11 += 0.5F;
               if (this.d >= 5 && $$11 >= 0.0F && $$11 < 10.0F) {
                  double $$12 = 1.0;
                  ezr $$13 = this.a.g(1.0F);
                  double $$14 = this.a.d.dD() - $$13.d * 1.0;
                  double $$15 = this.a.d.e(0.5) + 0.5;
                  double $$16 = this.a.d.dJ() - $$13.f * 1.0;
                  double $$17 = this.g.dD() - $$14;
                  double $$18 = this.g.e(0.5) - $$15;
                  double $$19 = this.g.dJ() - $$16;
                  ezr $$20 = new ezr($$17, $$18, $$19);
                  if (!this.a.bd()) {
                     this.a.dY().a(null, 1017, this.a.dy(), 0);
                  }

                  cpb $$21 = new cpb(this.a.dY(), this.a, $$20.d());
                  $$21.b($$14, $$15, $$16, 0.0F, 0.0F);
                  this.a.dY().b($$21);
                  this.d = 0;
                  if (this.e != null) {
                     while (!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.gs().a(cki.a);
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
         if (this.a.eb().a(8) == 0) {
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
         kl $$0 = this.e.g();
         this.e.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eb().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.f = new ezr($$1, $$3, $$2);
      }
   }

   @Override
   public void d() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(bve $$0) {
      this.g = $$0;
      int $$1 = this.a.y();
      int $$2 = this.a.q(this.g.dD(), this.g.dF(), this.g.dJ());
      int $$3 = this.g.dC();
      int $$4 = this.g.dI();
      double $$5 = (double)$$3 - this.a.dD();
      double $$6 = (double)$$4 - this.a.dJ();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = azn.a(this.g.dF() + $$8);
      esa $$10 = new esa($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.k();
      }
   }

   @Nullable
   @Override
   public ezr g() {
      return this.f;
   }

   @Override
   public cki<ckg> i() {
      return cki.b;
   }
}
