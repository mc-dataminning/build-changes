import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cib extends chp {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private eov e;
   @Nullable
   private ewf f;
   @Nullable
   private btb g;
   private boolean h;

   public cib(chn $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.gl().a(cid.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$0 = this.g.dv();
            double $$1 = this.g.dB();
            double $$2 = $$0 - this.a.dv();
            double $$3 = $$1 - this.a.dB();
            double $$4 = Math.sqrt($$2 * $$2 + $$3 * $$3);
            double $$5 = Math.min(0.4F + $$4 / 80.0 - 1.0, 10.0);
            this.f = new ewf($$0, this.g.dx() + $$5, $$1);
         }

         double $$6 = this.f == null ? 0.0 : this.f.c(this.a.dv(), this.a.dx(), this.a.dB());
         if ($$6 < 100.0 || $$6 > 22500.0) {
            this.j();
         }

         double $$7 = 64.0;
         if (this.g.g(this.a) < 4096.0) {
            if (this.a.F(this.g)) {
               this.d++;
               ewf $$8 = new ewf(this.g.dv() - this.a.dv(), 0.0, this.g.dB() - this.a.dB()).d();
               ewf $$9 = new ewf((double)ayg.a(this.a.dG() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayg.b(this.a.dG() * (float) (Math.PI / 180.0)))).d();
               float $$10 = (float)$$9.b($$8);
               float $$11 = (float)(Math.acos((double)$$10) * 180.0F / (float)Math.PI);
               $$11 += 0.5F;
               if (this.d >= 5 && $$11 >= 0.0F && $$11 < 10.0F) {
                  double $$12 = 1.0;
                  ewf $$13 = this.a.g(1.0F);
                  double $$14 = this.a.e.dv() - $$13.c * 1.0;
                  double $$15 = this.a.e.e(0.5) + 0.5;
                  double $$16 = this.a.e.dB() - $$13.e * 1.0;
                  double $$17 = this.g.dv() - $$14;
                  double $$18 = this.g.e(0.5) - $$15;
                  double $$19 = this.g.dB() - $$16;
                  ewf $$20 = new ewf($$17, $$18, $$19);
                  if (!this.a.aX()) {
                     this.a.dQ().a(null, 1017, this.a.dq(), 0);
                  }

                  cmt $$21 = new cmt(this.a.dQ(), this.a, $$20.d());
                  $$21.b($$14, $$15, $$16, 0.0F, 0.0F);
                  this.a.dQ().b($$21);
                  this.d = 0;
                  if (this.e != null) {
                     while (!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.gl().a(cid.a);
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
         if (this.a.dT().a(8) == 0) {
            this.h = !this.h;
            $$1 = $$0 + 6;
         }

         if (this.h) {
            $$1++;
         } else {
            $$1--;
         }

         if (this.a.gm() != null && this.a.gm().e() > 0) {
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
         ke $$0 = this.e.g();
         this.e.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dT().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.f = new ewf($$1, $$3, $$2);
      }
   }

   @Override
   public void d() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(btb $$0) {
      this.g = $$0;
      int $$1 = this.a.y();
      int $$2 = this.a.r(this.g.dv(), this.g.dx(), this.g.dB());
      int $$3 = this.g.du();
      int $$4 = this.g.dA();
      double $$5 = (double)$$3 - this.a.dv();
      double $$6 = (double)$$4 - this.a.dB();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = ayg.a(this.g.dx() + $$8);
      eot $$10 = new eot($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.k();
      }
   }

   @Nullable
   @Override
   public ewf g() {
      return this.f;
   }

   @Override
   public cid<cib> i() {
      return cid.b;
   }
}
