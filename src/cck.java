import java.util.EnumSet;

public class cck extends cbt {
   private static final cfm b = cfm.b().a(6.0);
   public static final int a = 400;
   private final cgy c;
   private cnt d;
   private int e;

   public cck(cgy $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cbt.a.a, cbt.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dX().S()) {
         return false;
      } else if (this.c.ea().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dX().a(cnt.class, b, this.c, this.c.dC(), this.c.dE(), this.c.dI(), this.c.cS().c(6.0, 2.0, 6.0));
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
      this.c.K().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
