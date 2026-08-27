import java.util.EnumSet;

public class bss extends bsb {
   private static final bvs b = bvs.b().a(6.0);
   public static final int a = 400;
   private final bxd c;
   private cdh d;
   private int e;

   public bss(bxd $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bsb.a.a, bsb.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dN().O()) {
         return false;
      } else if (this.c.eh().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dN().a(cdh.class, b, this.c, this.c.ds(), this.c.du(), this.c.dy(), this.c.cH().c(6.0, 2.0, 6.0));
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
