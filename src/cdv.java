import java.util.EnumSet;

public class cdv extends cde {
   private static final cgx b = cgx.b().a(6.0);
   public static final int a = 400;
   private final cij c;
   private cpj d;
   private int e;

   public cdv(cij $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cde.a.a, cde.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dW().U()) {
         return false;
      } else if (this.c.dZ().a(8000) != 0) {
         return false;
      } else {
         this.d = a(this.c).a(cpj.class, b, this.c, this.c.dB(), this.c.dD(), this.c.dH(), this.c.cR().c(6.0, 2.0, 6.0));
         return this.d != null;
      }
   }

   @Override
   public boolean c() {
      return this.e > 0;
   }

   @Override
   public void d() {
      this.e = this.a(400);
      this.c.x(true);
   }

   @Override
   public void e() {
      this.c.x(false);
      this.d = null;
   }

   @Override
   public void a() {
      this.c.H().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
