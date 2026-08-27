import java.util.EnumSet;

public class bnq extends bmv {
   private final bgb a;
   private double b;
   private double c;
   private int d;

   public bnq(bgb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bmv.a.a, bmv.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ec().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.ec().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.ec().a(20);
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.E().a(this.a.dn() + this.b, this.a.dr(), this.a.dt() + this.c);
   }
}
