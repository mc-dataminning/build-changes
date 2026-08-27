import java.util.EnumSet;

public class bqn extends bps {
   private final biy a;
   private double b;
   private double c;
   private int d;

   public bqn(biy $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bps.a.a, bps.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ee().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.ee().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.ee().a(20);
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.D().a(this.a.dp() + this.b, this.a.dt(), this.a.dv() + this.c);
   }
}
