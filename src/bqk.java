import java.util.EnumSet;

public class bqk extends bpt {
   private static final btk b = btk.b().a(6.0);
   public static final int a = 400;
   private final buv c;
   private caz d;
   private int e;

   public bqk(buv $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bpt.a.a, bpt.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dK().N()) {
         return false;
      } else if (this.c.ee().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dK().a(caz.class, b, this.c, this.c.dp(), this.c.dr(), this.c.dv(), this.c.cG().c(6.0, 2.0, 6.0));
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
      this.c.D().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
