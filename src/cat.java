import java.util.EnumSet;
import java.util.List;

public class cat extends cam {
   public final chl a;
   private double b;
   private static final int c = 8;
   private int d;

   public cat(chl $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.N_() && !this.a.gW()) {
         List<bsr> $$0 = this.a.dO().a(this.a, this.a.cK().c(9.0, 4.0, 9.0), $$0x -> {
            bsx<?> $$1x = $$0x.am();
            return $$1x == bsx.an || $$1x == bsx.be;
         });
         chl $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bsr $$3 : $$0) {
            chl $$4 = (chl)$$3;
            if ($$4.gW() && !$$4.gV()) {
               double $$5 = this.a.g($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for (bsr $$6 : $$0) {
               chl $$7 = (chl)$$6;
               if ($$7.N_() && !$$7.gV()) {
                  double $$8 = this.a.g($$7);
                  if (!($$8 > $$2)) {
                     $$2 = $$8;
                     $$1 = $$7;
                  }
               }
            }
         }

         if ($$1 == null) {
            return false;
         } else if ($$2 < 4.0) {
            return false;
         } else if (!$$1.N_() && !this.a($$1, 1)) {
            return false;
         } else {
            this.a.a($$1);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean c() {
      if (this.a.gW() && this.a.gX().bE() && this.a(this.a, 0)) {
         double $$0 = this.a.g(this.a.gX());
         if ($$0 > 676.0) {
            if (this.b <= 3.0) {
               this.b *= 1.2;
               this.d = b(40);
               return true;
            }

            if (this.d == 0) {
               return false;
            }
         }

         if (this.d > 0) {
            this.d--;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void e() {
      this.a.gy();
      this.b = 2.1;
   }

   @Override
   public void a() {
      if (this.a.gW()) {
         if (!(this.a.A() instanceof cjb)) {
            chl $$0 = this.a.gX();
            double $$1 = (double)this.a.f($$0);
            float $$2 = 2.0F;
            exc $$3 = new exc($$0.dt() - this.a.dt(), $$0.dv() - this.a.dv(), $$0.dz() - this.a.dz()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.N().a(this.a.dt() + $$3.c, this.a.dv() + $$3.d, this.a.dz() + $$3.e, this.b);
         }
      }
   }

   private boolean a(chl $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gW()) {
         return $$0.gX().N_() ? true : this.a($$0.gX(), ++$$1);
      } else {
         return false;
      }
   }
}
