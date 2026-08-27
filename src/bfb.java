import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bfb {
   private final LongSupplier a;
   private final IntSupplier b;
   private bff c = bfe.a;

   public bfb(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bfe.a;
   }

   public void b() {
      this.c = bfe.a;
   }

   public void c() {
      this.c = new bfa(this.a, this.b, true);
   }

   public bfh d() {
      return this.c;
   }

   public bfg e() {
      return this.c.d();
   }
}
