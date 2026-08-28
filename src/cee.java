import java.util.EnumSet;

public class cee extends cdn {
   private static final chg b = chg.b().a(6.0);
   public static final int a = 400;
   private final cis c;
   private cpu d;
   private int e;

   public cee(cis $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cdn.a.a, cdn.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dV().V()) {
         return false;
      } else if (this.c.dY().a(8000) != 0) {
         return false;
      } else {
         this.d = a(this.c).a(cpu.class, b, this.c, this.c.dA(), this.c.dC(), this.c.dG(), this.c.cR().c(6.0, 2.0, 6.0));
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
