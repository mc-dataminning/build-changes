import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bmo {
   private final LongSupplier a;
   private final IntSupplier b;
   private bms c = bmr.a;

   public bmo(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bmr.a;
   }

   public void b() {
      this.c = bmr.a;
   }

   public void c() {
      this.c = new bmn(this.a, this.b, true);
   }

   public bmu d() {
      return this.c;
   }

   public bmt e() {
      return this.c.d();
   }
}
