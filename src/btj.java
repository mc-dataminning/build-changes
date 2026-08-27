import java.util.List;
import javax.annotation.Nullable;

public class btj extends btk {
   public static final int a = 8;
   public static final int b = 4;
   public static final int c = 3;
   private final byc d;
   @Nullable
   private byc e;
   private final double f;
   private int g;

   public btj(byc $$0, double $$1) {
      this.d = $$0;
      this.f = $$1;
   }

   @Override
   public boolean a() {
      if (this.d.h() >= 0) {
         return false;
      } else {
         List<? extends byc> $$0 = this.d.dL().a((Class<? extends byc>)this.d.getClass(), this.d.cH().c(8.0, 4.0, 8.0));
         byc $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (byc $$3 : $$0) {
            if ($$3.h() >= 0) {
               double $$4 = this.d.f($$3);
               if (!($$4 > $$2)) {
                  $$2 = $$4;
                  $$1 = $$3;
               }
            }
         }

         if ($$1 == null) {
            return false;
         } else if ($$2 < 9.0) {
            return false;
         } else {
            this.e = $$1;
            return true;
         }
      }
   }

   @Override
   public boolean b() {
      if (this.d.h() >= 0) {
         return false;
      } else if (!this.e.bx()) {
         return false;
      } else {
         double $$0 = this.d.f(this.e);
         return !($$0 < 9.0) && !($$0 > 256.0);
      }
   }

   @Override
   public void c() {
      this.g = 0;
   }

   @Override
   public void d() {
      this.e = null;
   }

   @Override
   public void e() {
      if (--this.g <= 0) {
         this.g = this.a(10);
         this.d.N().a(this.e, this.f);
      }
   }
}
