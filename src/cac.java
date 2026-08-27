import java.util.EnumSet;

public class cac extends bzl {
   private static final cde b = cde.b().a(6.0);
   public static final int a = 400;
   private final ceq c;
   private cll d;
   private int e;

   public cac(ceq $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bzl.a.a, bzl.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dU().R()) {
         return false;
      } else if (this.c.et().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dU().a(cll.class, b, this.c, this.c.dz(), this.c.dB(), this.c.dF(), this.c.cP().c(6.0, 2.0, 6.0));
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
      this.c.F().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
