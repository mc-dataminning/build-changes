import java.util.EnumSet;

public class cag extends bzl {
   private final bsq a;
   private double b;
   private double c;
   private int d;

   public cag(bsq $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzl.a.a, bzl.a.b));
   }

   @Override
   public boolean a() {
      return this.a.et().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.et().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.et().a(20);
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.F().a(this.a.dz() + this.b, this.a.dD(), this.a.dF() + this.c);
   }
}
