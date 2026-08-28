import java.util.EnumSet;

public class ccw extends ccf {
   private static final cfy b = cfy.b().a(6.0);
   public static final int a = 400;
   private final chk c;
   private coi d;
   private int e;

   public ccw(chk $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccf.a.a, ccf.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dV().V()) {
         return false;
      } else if (this.c.dY().a(8000) != 0) {
         return false;
      } else {
         this.d = a(this.c).a(coi.class, b, this.c, this.c.dA(), this.c.dC(), this.c.dG(), this.c.cR().c(6.0, 2.0, 6.0));
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
      this.c.L().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
