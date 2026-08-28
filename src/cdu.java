import java.util.EnumSet;

public class cdu extends cdd {
   private static final cgw b = cgw.b().a(6.0);
   public static final int a = 400;
   private final cii c;
   private cpi d;
   private int e;

   public cdu(cii $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cdd.a.a, cdd.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dV().U()) {
         return false;
      } else if (this.c.dY().a(8000) != 0) {
         return false;
      } else {
         this.d = a(this.c).a(cpi.class, b, this.c, this.c.dA(), this.c.dC(), this.c.dG(), this.c.cR().c(6.0, 2.0, 6.0));
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
