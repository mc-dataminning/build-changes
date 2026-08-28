import java.util.EnumSet;

public class cbx extends cbc {
   private final buh a;
   private double b;
   private double c;
   private int d;

   public cbx(buh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbc.a.a, cbc.a.b));
   }

   @Override
   public boolean b() {
      return this.a.dV().i() < 0.02F;
   }

   @Override
   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public void d() {
      double $$0 = (Math.PI * 2) * this.a.dV().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dV().a(20);
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      this.d--;
      this.a.K().a(this.a.dx() + this.b, this.a.dB(), this.a.dD() + this.c);
   }
}
