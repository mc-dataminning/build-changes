import java.util.List;
import javax.annotation.Nullable;

public class cce extends ccf {
   public static final int a = 8;
   public static final int b = 4;
   public static final int c = 3;
   private final cgy d;
   @Nullable
   private cgy e;
   private final double f;
   private int g;

   public cce(cgy $$0, double $$1) {
      this.d = $$0;
      this.f = $$1;
   }

   @Override
   public boolean b() {
      if (this.d.Y_() >= 0) {
         return false;
      } else {
         List<? extends cgy> $$0 = this.d.dV().a((Class<? extends cgy>)this.d.getClass(), this.d.cR().c(8.0, 4.0, 8.0));
         cgy $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cgy $$3 : $$0) {
            if ($$3.Y_() >= 0) {
               double $$4 = this.d.g($$3);
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
   public boolean c() {
      if (this.d.Y_() >= 0) {
         return false;
      } else if (!this.e.bL()) {
         return false;
      } else {
         double $$0 = this.d.g(this.e);
         return !($$0 < 9.0) && !($$0 > 256.0);
      }
   }

   @Override
   public void d() {
      this.g = 0;
   }

   @Override
   public void e() {
      this.e = null;
   }

   @Override
   public void a() {
      if (--this.g <= 0) {
         this.g = this.a(10);
         this.d.P().a(this.e, this.f);
      }
   }
}
