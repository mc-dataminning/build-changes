import java.util.EnumSet;

public class bxc extends bwl {
   private static final cae b = cae.b().a(6.0);
   public static final int a = 400;
   private final cbp c;
   private cif d;
   private int e;

   public bxc(cbp $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bwl.a.a, bwl.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dM().P()) {
         return false;
      } else if (this.c.ei().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dM().a(cif.class, b, this.c, this.c.dr(), this.c.dt(), this.c.dx(), this.c.cH().c(6.0, 2.0, 6.0));
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
