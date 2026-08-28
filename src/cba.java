import java.util.EnumSet;

public class cba extends cam {
   private final btw a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cba(btw $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.fV()) {
         return false;
      } else {
         exa $$0 = cej.a(this.a, 16, 7, exa.c(this.a.fW()), (float) (Math.PI / 2));
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
      return !this.a.N().l();
   }

   @Override
   public void d() {
      this.a.N().a(this.b, this.c, this.d, this.e);
   }
}
