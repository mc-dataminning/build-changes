import java.util.EnumSet;

public class cbg extends cal {
   private final btp a;
   private double b;
   private double c;
   private int d;

   public cbg(btp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cal.a.a, cal.a.b));
   }

   @Override
   public boolean a() {
      return this.a.el().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.el().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.el().a(20);
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.G().a(this.a.du() + this.b, this.a.dy(), this.a.dA() + this.c);
   }
}
