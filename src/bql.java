import java.util.EnumSet;
import javax.annotation.Nullable;

public class bql extends bps {
   public static final int a = 1;
   protected final bjf b;
   protected final double c;
   protected double d;
   protected double e;
   protected double f;
   protected boolean g;

   public bql(bjf $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bps.a.a));
   }

   @Override
   public boolean a() {
      if (!this.h()) {
         return false;
      } else {
         if (this.b.bM()) {
            gv $$0 = this.a(this.b.dK(), this.b, 5);
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
      return this.b.ef() != null || this.b.dz() || this.b.bM();
   }

   protected boolean i() {
      ehf $$0 = btn.a(this.b, 5, 4);
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
      this.b.H().a(this.d, this.e, this.f, this.c);
      this.g = true;
   }

   @Override
   public void d() {
      this.g = false;
   }

   @Override
   public boolean b() {
      return !this.b.H().l();
   }

   @Nullable
   protected gv a(coq $$0, big $$1, int $$2) {
      gv $$3 = $$1.dk();
      return !$$0.a_($$3).k($$0, $$3).c() ? null : gv.a($$1.dk(), $$2, 1, $$1x -> $$0.b_($$1x).a(apo.a)).orElse(null);
   }
}
