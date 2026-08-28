import java.util.EnumSet;

public class cbb extends cak {
   private static final ced b = ced.b().a(6.0);
   public static final int a = 400;
   private final cfo c;
   private cmi d;
   private int e;

   public cbb(cfo $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cak.a.a, cak.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dQ().R()) {
         return false;
      } else if (this.c.dT().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dQ().a(cmi.class, b, this.c, this.c.dv(), this.c.dx(), this.c.dB(), this.c.cL().c(6.0, 2.0, 6.0));
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
      this.c.w(true);
   }

   @Override
   public void e() {
      this.c.w(false);
      this.d = null;
   }

   @Override
   public void a() {
      this.c.F().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
