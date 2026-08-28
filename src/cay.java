import java.util.EnumSet;

public class cay extends cak {
   private final btu a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cay(btu $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cak.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.fS()) {
         return false;
      } else {
         eww $$0 = ceh.a(this.a, 16, 7, eww.c(this.a.fT()), (float) (Math.PI / 2));
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
   public boolean c() {
      return !this.a.J().l();
   }

   @Override
   public void d() {
      this.a.J().a(this.b, this.c, this.d, this.e);
   }
}
