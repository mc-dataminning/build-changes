import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bmi {
   private final LongSupplier a;
   private final IntSupplier b;
   private bmm c = bml.a;

   public bmi(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bml.a;
   }

   public void b() {
      this.c = bml.a;
   }

   public void c() {
      this.c = new bmh(this.a, this.b, true);
   }

   public bmo d() {
      return this.c;
   }

   public bmn e() {
      return this.c.d();
   }
}
