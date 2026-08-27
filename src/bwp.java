import java.util.EnumSet;

public class bwp extends bvu {
   private final boz a;
   private double b;
   private double c;
   private int d;

   public bwp(boz $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvu.a.a, bvu.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ef().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.ef().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.ef().a(20);
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.I().a(this.a.do() + this.b, this.a.ds(), this.a.du() + this.c);
   }
}
