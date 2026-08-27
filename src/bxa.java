import java.util.EnumSet;

public class bxa extends bwm {
   private final bpx a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bxa(bpx $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bwm.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fV()) {
         return false;
      } else {
         ept $$0 = caj.a(this.a, 16, 7, ept.c(this.a.fW()), (float) (Math.PI / 2));
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
