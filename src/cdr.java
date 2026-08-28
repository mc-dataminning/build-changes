import java.util.EnumSet;

public class cdr extends ccw {
   private final bwa a;
   private double b;
   private double c;
   private int d;

   public cdr(bwa $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccw.a.a, ccw.a.b));
   }

   @Override
   public boolean b() {
      return this.a.dX().i() < 0.02F;
   }

   @Override
   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public void d() {
      double $$0 = (Math.PI * 2) * this.a.dX().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dX().a(20);
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      this.d--;
      this.a.J().a(this.a.dz() + this.b, this.a.dD(), this.a.dF() + this.c);
   }
}
