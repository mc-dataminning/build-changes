import java.util.EnumSet;

public class cct extends ccc {
   private static final cfv b = cfv.b().a(6.0);
   public static final int a = 400;
   private final chh c;
   private coc d;
   private int e;

   public cct(chh $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccc.a.a, ccc.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dY().S()) {
         return false;
      } else if (this.c.eb().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dY().a(coc.class, b, this.c, this.c.dD(), this.c.dF(), this.c.dJ(), this.c.cT().c(6.0, 2.0, 6.0));
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
