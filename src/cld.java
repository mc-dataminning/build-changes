import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cld extends ckr {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private euk e;
   @Nullable
   private fbx f;
   @Nullable
   private bvy g;
   private boolean h;

   public cld(ckp $$0) {
      super($$0);
   }

   @Override
   public void a(ard $$0) {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.t().a(clf.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$1 = this.g.dz();
            double $$2 = this.g.dF();
            double $$3 = $$1 - this.a.dz();
            double $$4 = $$2 - this.a.dF();
            double $$5 = Math.sqrt($$3 * $$3 + $$4 * $$4);
            double $$6 = Math.min(0.4F + $$5 / 80.0 - 1.0, 10.0);
            this.f = new fbx($$1, this.g.dB() + $$6, $$2);
         }

         double $$7 = this.f == null ? 0.0 : this.f.c(this.a.dz(), this.a.dB(), this.a.dF());
         if ($$7 < 100.0 || $$7 > 22500.0) {
            this.i();
         }

         double $$8 = 64.0;
         if (this.g.g(this.a) < 4096.0) {
            if (this.a.E(this.g)) {
               this.d++;
               fbx $$9 = new fbx(this.g.dz() - this.a.dz(), 0.0, this.g.dF() - this.a.dF()).d();
               fbx $$10 = new fbx((double)ayz.a(this.a.dK() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayz.b(this.a.dK() * (float) (Math.PI / 180.0)))).d();
               float $$11 = (float)$$10.b($$9);
               float $$12 = (float)(Math.acos((double)$$11) * 180.0F / (float)Math.PI);
               $$12 += 0.5F;
               if (this.d >= 5 && $$12 >= 0.0F && $$12 < 10.0F) {
                  double $$13 = 1.0;
                  fbx $$14 = this.a.h(1.0F);
                  double $$15 = this.a.c.dz() - $$14.d * 1.0;
                  double $$16 = this.a.c.e(0.5) + 0.5;
                  double $$17 = this.a.c.dF() - $$14.f * 1.0;
                  double $$18 = this.g.dz() - $$15;
                  double $$19 = this.g.e(0.5) - $$16;
                  double $$20 = this.g.dF() - $$17;
                  fbx $$21 = new fbx($$18, $$19, $$20);
                  if (!this.a.bb()) {
                     $$0.a(null, 1017, this.a.du(), 0);
                  }

                  cqb $$22 = new cqb($$0, this.a, $$21.d());
                  $$22.b($$15, $$16, $$17, 0.0F, 0.0F);
                  $$0.b($$22);
                  this.d = 0;
                  if (this.e != null) {
                     while (!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.t().a(clf.a);
               }
            } else if (this.d > 0) {
               this.d--;
            }
         } else if (this.d > 0) {
            this.d--;
         }
      }
   }

   private void i() {
      if (this.e == null || this.e.c()) {
         int $$0 = this.a.n();
         int $$1 = $$0;
         if (this.a.dX().a(8) == 0) {
            this.h = !this.h;
            $$1 = $$0 + 6;
         }

         if (this.h) {
            $$1++;
         } else {
            $$1--;
         }

         if (this.a.x() != null && this.a.x().e() > 0) {
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

      this.j();
   }

   private void j() {
      if (this.e != null && !this.e.c()) {
         km $$0 = this.e.g();
         this.e.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dX().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.f = new fbx($$1, $$3, $$2);
      }
   }

   @Override
   public void c() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(bvy $$0) {
      this.g = $$0;
      int $$1 = this.a.n();
      int $$2 = this.a.q(this.g.dz(), this.g.dB(), this.g.dF());
      int $$3 = this.g.dy();
      int $$4 = this.g.dE();
      double $$5 = (double)$$3 - this.a.dz();
      double $$6 = (double)$$4 - this.a.dF();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = ayz.a(this.g.dB() + $$8);
      eui $$10 = new eui($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.j();
      }
   }

   @Nullable
   @Override
   public fbx f() {
      return this.f;
   }

   @Override
   public clf<cld> h() {
      return clf.b;
   }
}
