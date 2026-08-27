import java.util.EnumSet;

public class brz extends bre {
   private final bkl a;
   private double b;
   private double c;
   private int d;

   public brz(bkl $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bre.a.a, bre.a.b));
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
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.G().a(this.a.dq() + this.b, this.a.du(), this.a.dw() + this.c);
   }
}
