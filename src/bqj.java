import java.util.EnumSet;

public class bqj extends bps {
   private static final btj b = btj.b().a(6.0);
   public static final int a = 400;
   private final buu c;
   private cay d;
   private int e;

   public bqj(buu $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bps.a.a, bps.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dK().N()) {
         return false;
      } else if (this.c.ee().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dK().a(cay.class, b, this.c, this.c.dp(), this.c.dr(), this.c.dv(), this.c.cG().c(6.0, 2.0, 6.0));
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
