import java.util.EnumSet;

public class bqk extends bpw {
   private final bjk a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bqk(bjk $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bpw.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fI()) {
         return false;
      } else {
         ehi $$0 = btr.a(this.a, 16, 7, ehi.c(this.a.fJ()), (float) (Math.PI / 2));
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
      return !this.a.H().l();
   }

   @Override
   public void c() {
      this.a.H().a(this.b, this.c, this.d, this.e);
   }
}
