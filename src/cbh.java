import java.util.EnumSet;

public class cbh extends cam {
   private final btp a;
   private double b;
   private double c;
   private int d;

   public cbh(btp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cam.a.a, cam.a.b));
   }

   @Override
   public boolean b() {
      return this.a.dR().i() < 0.02F;
   }

   @Override
   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public void d() {
      double $$0 = (Math.PI * 2) * this.a.dR().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dR().a(20);
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      this.d--;
      this.a.I().a(this.a.dt() + this.b, this.a.dx(), this.a.dz() + this.c);
   }
}
