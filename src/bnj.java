import java.util.EnumSet;

public class bnj extends bmv {
   private final bgi a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bnj(bgi $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bmv.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fI()) {
         return false;
      } else {
         eei $$0 = bqq.a(this.a, 16, 7, eei.c(this.a.fJ()), (float) (Math.PI / 2));
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
