import java.util.EnumSet;

public class cau extends bzz {
   private final btd a;
   private double b;
   private double c;
   private int d;

   public cau(btd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzz.a.a, bzz.a.b));
   }

   @Override
   public boolean a() {
      return this.a.dT().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.dT().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.dT().a(20);
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.d--;
      this.a.G().a(this.a.dv() + this.b, this.a.dz(), this.a.dB() + this.c);
   }
}
