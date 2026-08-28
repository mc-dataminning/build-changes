import java.util.EnumSet;

public class ccp extends cby {
   private static final cfr b = cfr.b().a(6.0);
   public static final int a = 400;
   private final chd c;
   private cny d;
   private int e;

   public ccp(chd $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cby.a.a, cby.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dX().S()) {
         return false;
      } else if (this.c.ea().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dX().a(cny.class, b, this.c, this.c.dC(), this.c.dE(), this.c.dI(), this.c.cS().c(6.0, 2.0, 6.0));
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
