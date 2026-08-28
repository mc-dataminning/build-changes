import java.util.EnumSet;

public class cew extends cef {
   private static final chy b = chy.b().a(6.0);
   public static final int a = 400;
   private final cjp c;
   private cqv d;
   private int e;

   public cew(cjp $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cef.a.a, cef.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dU().V()) {
         return false;
      } else if (this.c.dX().a(8000) != 0) {
         return false;
      } else {
         this.d = a(this.c).a(cqv.class, b, this.c, this.c.dz(), this.c.dB(), this.c.dF(), this.c.cQ().c(6.0, 2.0, 6.0));
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
      this.c.w(true);
   }

   @Override
   public void e() {
      this.c.w(false);
      this.d = null;
   }

   @Override
   public void a() {
      this.c.J().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
