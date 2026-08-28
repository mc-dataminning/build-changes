import java.util.EnumSet;

public class ccq extends ccc {
   private final bvm a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public ccq(bvm $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(ccc.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.gd()) {
         return false;
      } else {
         ezr $$0 = cfz.a(this.a, 16, 7, ezr.c(this.a.ge()), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.d;
            this.c = $$0.e;
            this.d = $$0.f;
            return true;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.P().m();
   }

   @Override
   public void d() {
      this.a.P().a(this.b, this.c, this.d, this.e);
   }
}
