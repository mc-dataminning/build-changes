import java.util.EnumSet;

public class cdm extends ccv {
   private static final cgo b = cgo.b().a(6.0);
   public static final int a = 400;
   private final cia c;
   private cpa d;
   private int e;

   public cdm(cia $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccv.a.a, ccv.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.dW().V()) {
         return false;
      } else if (this.c.dZ().a(8000) != 0) {
         return false;
      } else {
         this.d = a(this.c).a(cpa.class, b, this.c, this.c.dB(), this.c.dD(), this.c.dH(), this.c.cR().c(6.0, 2.0, 6.0));
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
      this.c.H().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
