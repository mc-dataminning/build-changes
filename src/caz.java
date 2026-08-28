import java.util.EnumSet;

public class caz extends cal {
   private final btw a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public caz(btw $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cal.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fX()) {
         return false;
      } else {
         evp $$0 = cei.a(this.a, 16, 7, evp.c(this.a.fY()), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.c;
            this.c = $$0.d;
            this.d = $$0.e;
            return true;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.K().l();
   }

   @Override
   public void c() {
      this.a.K().a(this.b, this.c, this.d, this.e);
   }
}
