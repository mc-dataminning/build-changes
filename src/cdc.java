import java.util.List;
import javax.annotation.Nullable;

public class cdc extends cdd {
   public static final int a = 8;
   public static final int b = 4;
   public static final int c = 3;
   private final chw d;
   @Nullable
   private chw e;
   private final double f;
   private int g;

   public cdc(chw $$0, double $$1) {
      this.d = $$0;
      this.f = $$1;
   }

   @Override
   public boolean b() {
      if (this.d.Z_() >= 0) {
         return false;
      } else {
         List<? extends chw> $$0 = this.d.dV().a((Class<? extends chw>)this.d.getClass(), this.d.cR().c(8.0, 4.0, 8.0));
         chw $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (chw $$3 : $$0) {
            if ($$3.Z_() >= 0) {
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
      if (this.d.Z_() >= 0) {
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
         this.d.L().a(this.e, this.f);
      }
   }
}
