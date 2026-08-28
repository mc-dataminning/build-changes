import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class brf {
   private final LongSupplier a;
   private final IntSupplier b;
   private final BooleanSupplier c;
   private brj d = bri.a;

   public brf(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a() {
      return this.d != bri.a;
   }

   public void b() {
      this.d = bri.a;
   }

   public void c() {
      this.d = new bre(this.a, this.b, this.c);
   }

   public brm d() {
      return this.d;
   }

   public brk e() {
      return this.d.d();
   }
}
