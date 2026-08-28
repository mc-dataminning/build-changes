import java.util.EnumSet;

public class cby extends cbh {
   private static final cfa b = cfa.b().a(6.0);
   public static final int a = 400;
   private final cgm c;
   private cnh d;
   private int e;

   public cby(cgm $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cbh.a.a, cbh.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dS().S()) {
         return false;
      } else if (this.c.dV().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dS().a(cnh.class, b, this.c, this.c.dx(), this.c.dz(), this.c.dD(), this.c.cO().c(6.0, 2.0, 6.0));
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
      this.c.K().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
