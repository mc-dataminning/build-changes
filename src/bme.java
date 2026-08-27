import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bme {
   private final LongSupplier a;
   private final IntSupplier b;
   private bmi c = bmh.a;

   public bme(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bmh.a;
   }

   public void b() {
      this.c = bmh.a;
   }

   public void c() {
      this.c = new bmd(this.a, this.b, true);
   }

   public bmk d() {
      return this.c;
   }

   public bmj e() {
      return this.c.d();
   }
}
