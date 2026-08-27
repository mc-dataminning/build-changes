import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bcy {
   private final LongSupplier a;
   private final IntSupplier b;
   private bdc c = bdb.a;

   public bcy(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bdb.a;
   }

   public void b() {
      this.c = bdb.a;
   }

   public void c() {
      this.c = new bcx(this.a, this.b, true);
   }

   public bde d() {
      return this.c;
   }

   public bdd e() {
      return this.c.d();
   }
}
