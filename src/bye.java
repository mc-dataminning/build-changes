import java.util.EnumSet;

public class bye extends bxq {
   private final brb a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bye(brb $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bxq.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fV()) {
         return false;
      } else {
         esj $$0 = cbn.a(this.a, 16, 7, esj.c(this.a.fW()), (float) (Math.PI / 2));
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
