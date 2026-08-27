import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bmc {
   private final LongSupplier a;
   private final IntSupplier b;
   private bmg c = bmf.a;

   public bmc(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bmf.a;
   }

   public void b() {
      this.c = bmf.a;
   }

   public void c() {
      this.c = new bmb(this.a, this.b, true);
   }

   public bmi d() {
      return this.c;
   }

   public bmh e() {
      return this.c.d();
   }
}
