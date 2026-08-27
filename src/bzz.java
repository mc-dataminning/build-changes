import java.util.EnumSet;

public class bzz extends bzl {
   private final bsw a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bzz(bsw $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bzl.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.gf()) {
         return false;
      } else {
         ewu $$0 = cdi.a(this.a, 16, 7, ewu.c(this.a.gg()), (float) (Math.PI / 2));
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
      return !this.a.J().l();
   }

   @Override
   public void c() {
      this.a.J().a(this.b, this.c, this.d, this.e);
   }
}
