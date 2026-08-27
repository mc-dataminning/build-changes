import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bfi {
   private final LongSupplier a;
   private final IntSupplier b;
   private bfm c = bfl.a;

   public bfi(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bfl.a;
   }

   public void b() {
      this.c = bfl.a;
   }

   public void c() {
      this.c = new bfh(this.a, this.b, true);
   }

   public bfo d() {
      return this.c;
   }

   public bfn e() {
      return this.c.d();
   }
}
