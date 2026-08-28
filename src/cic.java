import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cic extends chq {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private eox e;
   @Nullable
   private ewh f;
   @Nullable
   private btc g;
   private boolean h;

   public cic(cho $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.gk().a(cie.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$0 = this.g.dw();
            double $$1 = this.g.dC();
            double $$2 = $$0 - this.a.dw();
            double $$3 = $$1 - this.a.dC();
            double $$4 = Math.sqrt($$2 * $$2 + $$3 * $$3);
            double $$5 = Math.min(0.4F + $$4 / 80.0 - 1.0, 10.0);
            this.f = new ewh($$0, this.g.dy() + $$5, $$1);
         }

         double $$6 = this.f == null ? 0.0 : this.f.c(this.a.dw(), this.a.dy(), this.a.dC());
         if ($$6 < 100.0 || $$6 > 22500.0) {
            this.j();
         }

         double $$7 = 64.0;
         if (this.g.g(this.a) < 4096.0) {
            if (this.a.F(this.g)) {
               this.d++;
               ewh $$8 = new ewh(this.g.dw() - this.a.dw(), 0.0, this.g.dC() - this.a.dC()).d();
               ewh $$9 = new ewh((double)ayg.a(this.a.dH() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayg.b(this.a.dH() * (float) (Math.PI / 180.0)))).d();
               float $$10 = (float)$$9.b($$8);
               float $$11 = (float)(Math.acos((double)$$10) * 180.0F / (float)Math.PI);
               $$11 += 0.5F;
               if (this.d >= 5 && $$11 >= 0.0F && $$11 < 10.0F) {
                  double $$12 = 1.0;
                  ewh $$13 = this.a.g(1.0F);
                  double $$14 = this.a.e.dw() - $$13.c * 1.0;
                  double $$15 = this.a.e.e(0.5) + 0.5;
                  double $$16 = this.a.e.dC() - $$13.e * 1.0;
                  double $$17 = this.g.dw() - $$14;
                  double $$18 = this.g.e(0.5) - $$15;
                  double $$19 = this.g.dC() - $$16;
                  ewh $$20 = new ewh($$17, $$18, $$19);
                  if (!this.a.aY()) {
                     this.a.dR().a(null, 1017, this.a.dr(), 0);
                  }

                  cmu $$21 = new cmu(this.a.dR(), this.a, $$20.d());
                  $$21.b($$14, $$15, $$16, 0.0F, 0.0F);
                  this.a.dR().b($$21);
                  this.d = 0;
                  if (this.e != null) {
                     while (!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.gk().a(cie.a);
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
         if (this.a.dU().a(8) == 0) {
            this.h = !this.h;
            $$1 = $$0 + 6;
         }

         if (this.h) {
            $$1++;
         } else {
            $$1--;
         }

         if (this.a.gl() != null && this.a.gl().e() > 0) {
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
            $$3 = (double)((float)$$0.v() + this.a.dU().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.f = new ewh($$1, $$3, $$2);
      }
   }

   @Override
   public void d() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(btc $$0) {
      this.g = $$0;
      int $$1 = this.a.x();
      int $$2 = this.a.r(this.g.dw(), this.g.dy(), this.g.dC());
      int $$3 = this.g.dv();
      int $$4 = this.g.dB();
      double $$5 = (double)$$3 - this.a.dw();
      double $$6 = (double)$$4 - this.a.dC();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = ayg.a(this.g.dy() + $$8);
      eov $$10 = new eov($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.k();
      }
   }

   @Nullable
   @Override
   public ewh g() {
      return this.f;
   }

   @Override
   public cie<cic> i() {
      return cie.b;
   }
}
