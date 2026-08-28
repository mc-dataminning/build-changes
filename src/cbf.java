import java.util.EnumSet;

public class cbf extends cak {
   private final btn a;
   private double b;
   private double c;
   private int d;

   public cbf(btn $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cak.a.a, cak.a.b));
   }

   @Override
   public boolean b() {
      return this.a.dT().i() < 0.02F;
   }

   @Override
   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public void d() {
      double $$0 = (Math.PI * 2) * this.a.dT().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dT().a(20);
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      this.d--;
      this.a.F().a(this.a.dv() + this.b, this.a.dz(), this.a.dB() + this.c);
   }
}
