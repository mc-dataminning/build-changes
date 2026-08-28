import java.util.EnumSet;

public class ccx extends ccc {
   private final bvg a;
   private double b;
   private double c;
   private int d;

   public ccx(bvg $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccc.a.a, ccc.a.b));
   }

   @Override
   public boolean b() {
      return this.a.eb().i() < 0.02F;
   }

   @Override
   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public void d() {
      double $$0 = (Math.PI * 2) * this.a.eb().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.eb().a(20);
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      this.d--;
      this.a.K().a(this.a.dD() + this.b, this.a.dH(), this.a.dJ() + this.c);
   }
}
