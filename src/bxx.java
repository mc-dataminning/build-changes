import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxx extends bxl {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private ebd e;
   @Nullable
   private ehp f;
   @Nullable
   private bji g;
   private boolean h;

   public bxx(bxj $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.ga().a(bxz.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$0 = this.g.dq();
            double $$1 = this.g.dw();
            double $$2 = $$0 - this.a.dq();
            double $$3 = $$1 - this.a.dw();
            double $$4 = Math.sqrt($$2 * $$2 + $$3 * $$3);
            double $$5 = Math.min(0.4F + $$4 / 80.0 - 1.0, 10.0);
            this.f = new ehp($$0, this.g.ds() + $$5, $$1);
         }

         double $$6 = this.f == null ? 0.0 : this.f.c(this.a.dq(), this.a.ds(), this.a.dw());
         if ($$6 < 100.0 || $$6 > 22500.0) {
            this.j();
         }

         double $$7 = 64.0;
         if (this.g.f(this.a) < 4096.0) {
            if (this.a.E(this.g)) {
               this.d++;
               ehp $$8 = new ehp(this.g.dq() - this.a.dq(), 0.0, this.g.dw() - this.a.dw()).d();
               ehp $$9 = new ehp((double)ary.a(this.a.dB() * (float) (Math.PI / 180.0)), 0.0, (double)(-ary.b(this.a.dB() * (float) (Math.PI / 180.0)))).d();
               float $$10 = (float)$$9.b($$8);
               float $$11 = (float)(Math.acos((double)$$10) * 180.0F / (float)Math.PI);
               $$11 += 0.5F;
               if (this.d >= 5 && $$11 >= 0.0F && $$11 < 10.0F) {
                  double $$12 = 1.0;
                  ehp $$13 = this.a.f(1.0F);
                  double $$14 = this.a.e.dq() - $$13.c * 1.0;
                  double $$15 = this.a.e.e(0.5) + 0.5;
                  double $$16 = this.a.e.dw() - $$13.e * 1.0;
                  double $$17 = this.g.dq() - $$14;
                  double $$18 = this.g.e(0.5) - $$15;
                  double $$19 = this.g.dw() - $$16;
                  if (!this.a.aS()) {
                     this.a.dL().a(null, 1017, this.a.dl(), 0);
                  }

                  ccf $$20 = new ccf(this.a.dL(), this.a, $$17, $$18, $$19);
                  $$20.b($$14, $$15, $$16, 0.0F, 0.0F);
                  this.a.dL().b($$20);
                  this.d = 0;
                  if (this.e != null) {
                     while (!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.ga().a(bxz.a);
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
         if (this.a.ef().a(8) == 0) {
            this.h = !this.h;
            $$1 = $$0 + 6;
         }

         if (this.h) {
            $$1++;
         } else {
            $$1--;
         }

         if (this.a.gb() != null && this.a.gb().e() > 0) {
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
         ib $$0 = this.e.g();
         this.e.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ef().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.f = new ehp($$1, $$3, $$2);
      }
   }

   @Override
   public void d() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(bji $$0) {
      this.g = $$0;
      int $$1 = this.a.y();
      int $$2 = this.a.r(this.g.dq(), this.g.ds(), this.g.dw());
      int $$3 = this.g.dp();
      int $$4 = this.g.dv();
      double $$5 = (double)$$3 - this.a.dq();
      double $$6 = (double)$$4 - this.a.dw();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = ary.a(this.g.ds() + $$8);
      ebb $$10 = new ebb($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.k();
      }
   }

   @Nullable
   @Override
   public ehp g() {
      return this.f;
   }

   @Override
   public bxz<bxx> i() {
      return bxz.b;
   }
}
