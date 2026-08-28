import java.util.EnumSet;

public class ccz extends cce {
   private final bvi a;
   private double b;
   private double c;
   private int d;

   public ccz(bvi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cce.a.a, cce.a.b));
   }

   @Override
   public boolean b() {
      return this.a.dZ().i() < 0.02F;
   }

   @Override
   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public void d() {
      double $$0 = (Math.PI * 2) * this.a.dZ().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dZ().a(20);
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      this.d--;
      this.a.H().a(this.a.dB() + this.b, this.a.dF(), this.a.dH() + this.c);
   }
}
