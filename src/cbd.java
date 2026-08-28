import java.util.EnumSet;

public class cbd extends cam {
   private static final cef b = cef.b().a(6.0);
   public static final int a = 400;
   private final cfq c;
   private cmk d;
   private int e;

   public cbd(cfq $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cam.a.a, cam.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dO().R()) {
         return false;
      } else if (this.c.dR().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dO().a(cmk.class, b, this.c, this.c.dt(), this.c.dv(), this.c.dz(), this.c.cK().c(6.0, 2.0, 6.0));
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
      this.c.I().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
