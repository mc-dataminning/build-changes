import java.util.EnumSet;

public class ccs extends cce {
   private final bvo a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public ccs(bvo $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(cce.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.ga()) {
         return false;
      } else {
         faz $$0 = cgb.a(this.a, 16, 7, faz.c(this.a.gb()), (float) (Math.PI / 2));
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
      return !this.a.P().k();
   }

   @Override
   public void d() {
      this.a.P().a(this.b, this.c, this.d, this.e);
   }
}
