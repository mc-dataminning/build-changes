import java.util.EnumSet;

public class brv extends bre {
   private static final buv b = buv.b().a(6.0);
   public static final int a = 400;
   private final bwg c;
   private cck d;
   private int e;

   public brv(bwg $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bre.a.a, bre.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dL().N()) {
         return false;
      } else if (this.c.ef().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dL().a(cck.class, b, this.c, this.c.dq(), this.c.ds(), this.c.dw(), this.c.cG().c(6.0, 2.0, 6.0));
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
