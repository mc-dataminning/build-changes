import java.util.EnumSet;

public class ccc extends cbh {
   private final bum a;
   private double b;
   private double c;
   private int d;

   public ccc(bum $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbh.a.a, cbh.a.b));
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
