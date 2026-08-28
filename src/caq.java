import java.util.EnumSet;

public class caq extends bzz {
   private static final cds b = cds.b().a(6.0);
   public static final int a = 400;
   private final cfd c;
   private clx d;
   private int e;

   public caq(cfd $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bzz.a.a, bzz.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dQ().R()) {
         return false;
      } else if (this.c.dT().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dQ().a(clx.class, b, this.c, this.c.dv(), this.c.dx(), this.c.dB(), this.c.cL().c(6.0, 2.0, 6.0));
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
