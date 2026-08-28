import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cio extends cic {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private eps e;
   @Nullable
   private exc f;
   @Nullable
   private btn g;
   private boolean h;

   public cio(cia $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.gh().a(ciq.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$0 = this.g.dt();
            double $$1 = this.g.dz();
            double $$2 = $$0 - this.a.dt();
            double $$3 = $$1 - this.a.dz();
            double $$4 = Math.sqrt($$2 * $$2 + $$3 * $$3);
            double $$5 = Math.min(0.4F + $$4 / 80.0 - 1.0, 10.0);
            this.f = new exc($$0, this.g.dv() + $$5, $$1);
         }

         double $$6 = this.f == null ? 0.0 : this.f.c(this.a.dt(), this.a.dv(), this.a.dz());
         if ($$6 < 100.0 || $$6 > 22500.0) {
            this.j();
         }

         double $$7 = 64.0;
         if (this.g.g(this.a) < 4096.0) {
            if (this.a.F(this.g)) {
               this.d++;
               exc $$8 = new exc(this.g.dt() - this.a.dt(), 0.0, this.g.dz() - this.a.dz()).d();
               exc $$9 = new exc((double)ayo.a(this.a.dE() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayo.b(this.a.dE() * (float) (Math.PI / 180.0)))).d();
               float $$10 = (float)$$9.b($$8);
               float $$11 = (float)(Math.acos((double)$$10) * 180.0F / (float)Math.PI);
               $$11 += 0.5F;
               if (this.d >= 5 && $$11 >= 0.0F && $$11 < 10.0F) {
                  double $$12 = 1.0;
                  exc $$13 = this.a.g(1.0F);
                  double $$14 = this.a.e.dt() - $$13.c * 1.0;
                  double $$15 = this.a.e.e(0.5) + 0.5;
                  double $$16 = this.a.e.dz() - $$13.e * 1.0;
                  double $$17 = this.g.dt() - $$14;
                  double $$18 = this.g.e(0.5) - $$15;
                  double $$19 = this.g.dz() - $$16;
                  exc $$20 = new exc($$17, $$18, $$19);
                  if (!this.a.aX()) {
                     this.a.dO().a(null, 1017, this.a.do(), 0);
                  }

                  cng $$21 = new cng(this.a.dO(), this.a, $$20.d());
                  $$21.b($$14, $$15, $$16, 0.0F, 0.0F);
                  this.a.dO().b($$21);
                  this.d = 0;
                  if (this.e != null) {
                     while (!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.gh().a(ciq.a);
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
         int $$0 = this.a.x();
         int $$1 = $$0;
         if (this.a.dR().a(8) == 0) {
            this.h = !this.h;
            $$1 = $$0 + 6;
         }

         if (this.h) {
            $$1++;
         } else {
            $$1--;
         }

         if (this.a.gi() != null && this.a.gi().e() > 0) {
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
         kh $$0 = this.e.g();
         this.e.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dR().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.f = new exc($$1, $$3, $$2);
      }
   }

   @Override
   public void d() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(btn $$0) {
      this.g = $$0;
      int $$1 = this.a.x();
      int $$2 = this.a.q(this.g.dt(), this.g.dv(), this.g.dz());
      int $$3 = this.g.ds();
      int $$4 = this.g.dy();
      double $$5 = (double)$$3 - this.a.dt();
      double $$6 = (double)$$4 - this.a.dz();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = ayo.a(this.g.dv() + $$8);
      epq $$10 = new epq($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.k();
      }
   }

   @Nullable
   @Override
   public exc g() {
      return this.f;
   }

   @Override
   public ciq<cio> i() {
      return ciq.b;
   }
}
