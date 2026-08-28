import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjl extends ciz {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private erd e;
   @Nullable
   private eys f;
   @Nullable
   private buk g;
   private boolean h;

   public cjl(cix $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.gm().a(cjn.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$0 = this.g.dx();
            double $$1 = this.g.dD();
            double $$2 = $$0 - this.a.dx();
            double $$3 = $$1 - this.a.dD();
            double $$4 = Math.sqrt($$2 * $$2 + $$3 * $$3);
            double $$5 = Math.min(0.4F + $$4 / 80.0 - 1.0, 10.0);
            this.f = new eys($$0, this.g.dz() + $$5, $$1);
         }

         double $$6 = this.f == null ? 0.0 : this.f.c(this.a.dx(), this.a.dz(), this.a.dD());
         if ($$6 < 100.0 || $$6 > 22500.0) {
            this.j();
         }

         double $$7 = 64.0;
         if (this.g.g(this.a) < 4096.0) {
            if (this.a.G(this.g)) {
               this.d++;
               eys $$8 = new eys(this.g.dx() - this.a.dx(), 0.0, this.g.dD() - this.a.dD()).d();
               eys $$9 = new eys((double)azd.a(this.a.dI() * (float) (Math.PI / 180.0)), 0.0, (double)(-azd.b(this.a.dI() * (float) (Math.PI / 180.0)))).d();
               float $$10 = (float)$$9.b($$8);
               float $$11 = (float)(Math.acos((double)$$10) * 180.0F / (float)Math.PI);
               $$11 += 0.5F;
               if (this.d >= 5 && $$11 >= 0.0F && $$11 < 10.0F) {
                  double $$12 = 1.0;
                  eys $$13 = this.a.g(1.0F);
                  double $$14 = this.a.d.dx() - $$13.d * 1.0;
                  double $$15 = this.a.d.e(0.5) + 0.5;
                  double $$16 = this.a.d.dD() - $$13.f * 1.0;
                  double $$17 = this.g.dx() - $$14;
                  double $$18 = this.g.e(0.5) - $$15;
                  double $$19 = this.g.dD() - $$16;
                  eys $$20 = new eys($$17, $$18, $$19);
                  if (!this.a.ba()) {
                     this.a.dS().a(null, 1017, this.a.ds(), 0);
                  }

                  coe $$21 = new coe(this.a.dS(), this.a, $$20.d());
                  $$21.b($$14, $$15, $$16, 0.0F, 0.0F);
                  this.a.dS().b($$21);
                  this.d = 0;
                  if (this.e != null) {
                     while (!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.gm().a(cjn.a);
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
         if (this.a.dV().a(8) == 0) {
            this.h = !this.h;
            $$1 = $$0 + 6;
         }

         if (this.h) {
            $$1++;
         } else {
            $$1--;
         }

         if (this.a.gn() != null && this.a.gn().e() > 0) {
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
         ki $$0 = this.e.g();
         this.e.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dV().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.f = new eys($$1, $$3, $$2);
      }
   }

   @Override
   public void d() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(buk $$0) {
      this.g = $$0;
      int $$1 = this.a.y();
      int $$2 = this.a.q(this.g.dx(), this.g.dz(), this.g.dD());
      int $$3 = this.g.dw();
      int $$4 = this.g.dC();
      double $$5 = (double)$$3 - this.a.dx();
      double $$6 = (double)$$4 - this.a.dD();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = azd.a(this.g.dz() + $$8);
      erb $$10 = new erb($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.k();
      }
   }

   @Nullable
   @Override
   public eys g() {
      return this.f;
   }

   @Override
   public cjn<cjl> i() {
      return cjn.b;
   }
}
