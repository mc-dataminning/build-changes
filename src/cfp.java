import java.util.EnumSet;

public class cfp extends cfb {
   private final byn a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cfp(byn $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cfb.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.ge()) {
         return false;
      } else {
         fgc $$0 = ciy.a(this.a, 16, 7, fgc.c(this.a.gf()), (float) (Math.PI / 2));
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
      return !this.a.N().k();
   }

   @Override
   public void d() {
      this.a.N().a(this.b, this.c, this.d, this.e);
   }
}
