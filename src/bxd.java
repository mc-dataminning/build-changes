import java.util.EnumSet;

public class bxd extends bwm {
   private static final caf b = caf.b().a(6.0);
   public static final int a = 400;
   private final cbq c;
   private cih d;
   private int e;

   public bxd(cbq $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bwm.a.a, bwm.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dM().P()) {
         return false;
      } else if (this.c.ei().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dM().a(cih.class, b, this.c, this.c.dr(), this.c.dt(), this.c.dx(), this.c.cH().c(6.0, 2.0, 6.0));
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
      this.c.G().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
