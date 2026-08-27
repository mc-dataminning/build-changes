import java.util.EnumSet;
import javax.annotation.Nullable;

public class bno extends bmv {
   public static final int a = 1;
   protected final bgi b;
   protected final double c;
   protected double d;
   protected double e;
   protected double f;
   protected boolean g;

   public bno(bgi $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bmv.a.a));
   }

   @Override
   public boolean a() {
      if (!this.h()) {
         return false;
      } else {
         if (this.b.bL()) {
            gu $$0 = this.a(this.b.dI(), this.b, 5);
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
      return this.b.ed() != null || this.b.dx() || this.b.bL();
   }

   protected boolean i() {
      eei $$0 = bqq.a(this.b, 5, 4);
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
      this.b.J().a(this.d, this.e, this.f, this.c);
      this.g = true;
   }

   @Override
   public void d() {
      this.g = false;
   }

   @Override
   public boolean b() {
      return !this.b.J().l();
   }

   @Nullable
   protected gu a(cls $$0, bfj $$1, int $$2) {
      gu $$3 = $$1.di();
      return !$$0.a_($$3).k($$0, $$3).b() ? null : gu.a($$1.di(), $$2, 1, $$1x -> $$0.b_($$1x).a(anb.a)).orElse(null);
   }
}
