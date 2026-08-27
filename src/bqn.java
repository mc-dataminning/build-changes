import java.util.EnumSet;
import javax.annotation.Nullable;

public class bqn extends bpu {
   public static final int a = 1;
   protected final bjh b;
   protected final double c;
   protected double d;
   protected double e;
   protected double f;
   protected boolean g;

   public bqn(bjh $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bpu.a.a));
   }

   @Override
   public boolean a() {
      if (!this.h()) {
         return false;
      } else {
         if (this.b.bM()) {
            gu $$0 = this.a(this.b.dK(), this.b, 5);
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
      ehe $$0 = btp.a(this.b, 5, 4);
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
   protected gu a(cos $$0, bii $$1, int $$2) {
      gu $$3 = $$1.dk();
      return !$$0.a_($$3).k($$0, $$3).c() ? null : gu.a($$1.dk(), $$2, 1, $$1x -> $$0.b_($$1x).a(apq.a)).orElse(null);
   }
}
