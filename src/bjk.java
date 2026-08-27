import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bjk {
   private final LongSupplier a;
   private final IntSupplier b;
   private bjo c = bjn.a;

   public bjk(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bjn.a;
   }

   public void b() {
      this.c = bjn.a;
   }

   public void c() {
      this.c = new bjj(this.a, this.b, true);
   }

   public bjq d() {
      return this.c;
   }

   public bjp e() {
      return this.c.d();
   }
}
