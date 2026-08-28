import java.util.EnumSet;

public class cbe extends can {
   private static final ceg b = ceg.b().a(6.0);
   public static final int a = 400;
   private final cfr c;
   private cmk d;
   private int e;

   public cbe(cfr $$0) {
      this.c = $$0;
      this.a(EnumSet.of(can.a.a, can.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dP().R()) {
         return false;
      } else if (this.c.el().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dP().a(cmk.class, b, this.c, this.c.du(), this.c.dw(), this.c.dA(), this.c.cK().c(6.0, 2.0, 6.0));
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
