import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bkn {
   private final LongSupplier a;
   private final IntSupplier b;
   private bkr c = bkq.a;

   public bkn(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bkq.a;
   }

   public void b() {
      this.c = bkq.a;
   }

   public void c() {
      this.c = new bkm(this.a, this.b, true);
   }

   public bkt d() {
      return this.c;
   }

   public bks e() {
      return this.c.d();
   }
}
