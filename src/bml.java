import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bml {
   private final LongSupplier a;
   private final IntSupplier b;
   private bmp c = bmo.a;

   public bml(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bmo.a;
   }

   public void b() {
      this.c = bmo.a;
   }

   public void c() {
      this.c = new bmk(this.a, this.b, true);
   }

   public bmr d() {
      return this.c;
   }

   public bmq e() {
      return this.c.d();
   }
}
