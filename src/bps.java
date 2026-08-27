import java.util.List;
import javax.annotation.Nullable;

public class bps extends bpt {
   public static final int a = 8;
   public static final int b = 4;
   public static final int c = 3;
   private final buj d;
   @Nullable
   private buj e;
   private final double f;
   private int g;

   public bps(buj $$0, double $$1) {
      this.d = $$0;
      this.f = $$1;
   }

   @Override
   public boolean a() {
      if (this.d.h() >= 0) {
         return false;
      } else {
         List<? extends buj> $$0 = this.d.dK().a((Class<? extends buj>)this.d.getClass(), this.d.cG().c(8.0, 4.0, 8.0));
         buj $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (buj $$3 : $$0) {
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
      } else if (!this.e.bv()) {
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
         this.d.H().a(this.e, this.f);
      }
   }
}
