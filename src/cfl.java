import java.util.EnumSet;

public class cfl extends ceq {
   private final bxw a;
   private double b;
   private double c;
   private int d;

   public cfl(bxw $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ceq.a.a, ceq.a.b));
   }

   @Override
   public boolean b() {
      return this.a.dY().i() < 0.02F;
   }

   @Override
   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public void d() {
      double $$0 = (Math.PI * 2) * this.a.dY().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dY().a(20);
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      this.d--;
      this.a.J().a(this.a.dA() + this.b, this.a.dE(), this.a.dG() + this.c);
   }
}
