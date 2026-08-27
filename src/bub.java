import java.util.EnumSet;

public class bub extends btk {
   private static final bxd b = bxd.b().a(6.0);
   public static final int a = 400;
   private final byo c;
   private cfd d;
   private int e;

   public bub(byo $$0) {
      this.c = $$0;
      this.a(EnumSet.of(btk.a.a, btk.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dL().P()) {
         return false;
      } else if (this.c.eg().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dL().a(cfd.class, b, this.c, this.c.dq(), this.c.ds(), this.c.dw(), this.c.cH().c(6.0, 2.0, 6.0));
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
      this.c.I().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
