import java.util.EnumSet;

public class cac extends bzo {
   private final bsz a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cac(bsz $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bzo.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fW()) {
         return false;
      } else {
         eum $$0 = cdl.a(this.a, 16, 7, eum.c(this.a.fX()), (float) (Math.PI / 2));
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
