import java.util.EnumSet;

public class ccx extends ccg {
   private static final cfz b = cfz.b().a(6.0);
   public static final int a = 400;
   private final chl c;
   private coj d;
   private int e;

   public ccx(chl $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccg.a.a, ccg.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dV().V()) {
         return false;
      } else if (this.c.dY().a(8000) != 0) {
         return false;
      } else {
         this.d = a(this.c).a(coj.class, b, this.c, this.c.dA(), this.c.dC(), this.c.dG(), this.c.cR().c(6.0, 2.0, 6.0));
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
