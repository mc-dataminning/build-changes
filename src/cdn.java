import java.util.EnumSet;

public class cdn extends ccz {
   private final bwj a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cdn(bwj $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(ccz.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.ak()) {
         return false;
      } else {
         fbs $$0 = cgw.a(this.a, 16, 7, fbs.c(this.a.fV()), (float) (Math.PI / 2));
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
      return !this.a.L().m();
   }

   @Override
   public void d() {
      this.a.L().a(this.b, this.c, this.d, this.e);
   }
}
