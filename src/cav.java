import java.util.EnumSet;

public class cav extends caa {
   private final bte a;
   private double b;
   private double c;
   private int d;

   public cav(bte $$0) {
      this.a = $$0;
      this.a(EnumSet.of(caa.a.a, caa.a.b));
   }

   @Override
   public boolean a() {
      return this.a.dU().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.dU().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dU().a(20);
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.F().a(this.a.dw() + this.b, this.a.dA(), this.a.dC() + this.c);
   }
}
