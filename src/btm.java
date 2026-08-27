import java.util.EnumSet;

public class btm extends bsr {
   private final blx a;
   private double b;
   private double c;
   private int d;

   public btm(blx $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsr.a.a, bsr.a.b));
   }

   @Override
   public boolean a() {
      return this.a.eg().i() < 0.02F;
   }

   @Override
   public boolean b() {
      return this.d >= 0;
   }

   @Override
   public void c() {
      double $$0 = (Math.PI * 2) * this.a.eg().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.eg().a(20);
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
