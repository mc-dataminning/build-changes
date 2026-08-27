import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bdb {
   private final LongSupplier a;
   private final IntSupplier b;
   private bdf c = bde.a;

   public bdb(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bde.a;
   }

   public void b() {
      this.c = bde.a;
   }

   public void c() {
      this.c = new bda(this.a, this.b, true);
   }

   public bdh d() {
      return this.c;
   }

   public bdg e() {
      return this.c.d();
   }
}
