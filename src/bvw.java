import java.util.EnumSet;

public class bvw extends bvb {
   private final boi a;
   private double b;
   private double c;
   private int d;

   public bvw(boi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvb.a.a, bvb.a.b));
   }

   @Override
   public boolean a() {
      return this.a.eh().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.eh().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.eh().a(20);
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.I().a(this.a.dr() + this.b, this.a.dv(), this.a.dx() + this.c);
   }
}
