import java.util.EnumSet;

public class btx extends btg {
   private static final bwy b = bwy.b().a(6.0);
   public static final int a = 400;
   private final byj c;
   private ceu d;
   private int e;

   public btx(byj $$0) {
      this.c = $$0;
      this.a(EnumSet.of(btg.a.a, btg.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dM().P()) {
         return false;
      } else if (this.c.eg().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dM().a(ceu.class, b, this.c, this.c.dr(), this.c.dt(), this.c.dx(), this.c.cH().c(6.0, 2.0, 6.0));
         return this.d != null;
      }
   }

   @Override
   public boolean b() {
      return this.e > 0;
   }

   @Override
   public void c() {
      this.e = this.a(400);
      this.c.w(true);
   }

   @Override
   public void d() {
      this.c.w(false);
      this.d = null;
   }

   @Override
   public void e() {
      this.c.I().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
