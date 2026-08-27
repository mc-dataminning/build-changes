import java.util.EnumSet;
import javax.annotation.Nullable;

public class bqu extends bqb {
   public static final int a = 1;
   protected final bjp b;
   protected final double c;
   protected double d;
   protected double e;
   protected double f;
   protected boolean g;

   public bqu(bjp $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bqb.a.a));
   }

   @Override
   public boolean a() {
      if (!this.h()) {
         return false;
      } else {
         if (this.b.bN()) {
            gw $$0 = this.a(this.b.dL(), this.b, 5);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            }
         }

         return this.i();
      }
   }

   protected boolean h() {
      return this.b.eg() != null || this.b.dA() || this.b.bN();
   }

   protected boolean i() {
      ehn $$0 = btw.a(this.b, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.d = $$0.c;
         this.e = $$0.d;
         this.f = $$0.e;
         return true;
      }
   }

   public boolean k() {
      return this.g;
   }

   @Override
   public void c() {
      this.b.L().a(this.d, this.e, this.f, this.c);
      this.g = true;
   }

   @Override
   public void d() {
      this.g = false;
   }

   @Override
   public boolean b() {
      return !this.b.L().l();
   }

   @Nullable
   protected gw a(cpb $$0, biq $$1, int $$2) {
      gw $$3 = $$1.dl();
      return !$$0.a_($$3).k($$0, $$3).c() ? null : gw.a($$1.dl(), $$2, 1, $$1x -> $$0.b_($$1x).a(apy.a)).orElse(null);
   }
}
