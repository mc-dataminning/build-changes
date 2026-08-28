import java.util.EnumSet;

public class car extends bzw {
   private final bta a;
   private double b;
   private double c;
   private int d;

   public car(bta $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzw.a.a, bzw.a.b));
   }

   @Override
   public boolean a() {
      return this.a.dS().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.dS().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dS().a(20);
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
