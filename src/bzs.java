import java.util.EnumSet;

public class bzs extends byx {
   private final bsc a;
   private double b;
   private double c;
   private int d;

   public bzs(bsc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(byx.a.a, byx.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ej().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.ej().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.ej().a(20);
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.G().a(this.a.ds() + this.b, this.a.dw(), this.a.dy() + this.c);
   }
}
