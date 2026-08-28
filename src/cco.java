import java.util.EnumSet;

public class cco extends cbt {
   private final bux a;
   private double b;
   private double c;
   private int d;

   public cco(bux $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbt.a.a, cbt.a.b));
   }

   @Override
   public boolean b() {
      return this.a.ea().i() < 0.02F;
   }

   @Override
   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public void d() {
      double $$0 = (Math.PI * 2) * this.a.ea().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.ea().a(20);
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      this.d--;
      this.a.K().a(this.a.dC() + this.b, this.a.dG(), this.a.dI() + this.c);
   }
}
