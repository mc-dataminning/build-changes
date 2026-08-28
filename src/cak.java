import java.util.EnumSet;

public class cak extends bzw {
   private final bth a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public cak(bth $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bzw.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fT()) {
         return false;
      } else {
         evz $$0 = cdt.a(this.a, 16, 7, evz.c(this.a.fU()), (float) (Math.PI / 2));
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
