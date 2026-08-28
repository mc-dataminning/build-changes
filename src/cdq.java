import java.util.EnumSet;

public class cdq extends ccz {
   private static final cgs b = cgs.b().a(6.0);
   public static final int a = 400;
   private final cie c;
   private cpe d;
   private int e;

   public cdq(cie $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccz.a.a, ccz.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dV().U()) {
         return false;
      } else if (this.c.dY().a(8000) != 0) {
         return false;
      } else {
         this.d = a(this.c).a(cpe.class, b, this.c, this.c.dA(), this.c.dC(), this.c.dG(), this.c.cR().c(6.0, 2.0, 6.0));
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
