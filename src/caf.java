import java.util.EnumSet;

public class caf extends bzo {
   private static final cdh b = cdh.b().a(6.0);
   public static final int a = 400;
   private final ces c;
   private cll d;
   private int e;

   public caf(ces $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bzo.a.a, bzo.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dP().Q()) {
         return false;
      } else if (this.c.el().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dP().a(cll.class, b, this.c, this.c.du(), this.c.dw(), this.c.dA(), this.c.cK().c(6.0, 2.0, 6.0));
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
