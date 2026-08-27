import java.util.EnumSet;

public class bzo extends byx {
   private static final ccq b = ccq.b().a(6.0);
   public static final int a = 400;
   private final ceb c;
   private cku d;
   private int e;

   public bzo(ceb $$0) {
      this.c = $$0;
      this.a(EnumSet.of(byx.a.a, byx.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dN().Q()) {
         return false;
      } else if (this.c.ej().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dN().a(cku.class, b, this.c, this.c.ds(), this.c.du(), this.c.dy(), this.c.cI().c(6.0, 2.0, 6.0));
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
