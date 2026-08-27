import java.util.EnumSet;

public class bxg extends bwl {
   private final bpq a;
   private double b;
   private double c;
   private int d;

   public bxg(bpq $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bwl.a.a, bwl.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ei().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.ei().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.ei().a(20);
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.G().a(this.a.dr() + this.b, this.a.dv(), this.a.dx() + this.c);
   }
}
