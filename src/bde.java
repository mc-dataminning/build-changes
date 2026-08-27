import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bde {
   private final LongSupplier a;
   private final IntSupplier b;
   private bdi c = bdh.a;

   public bde(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bdh.a;
   }

   public void b() {
      this.c = bdh.a;
   }

   public void c() {
      this.c = new bdd(this.a, this.b, true);
   }

   public bdk d() {
      return this.c;
   }

   public bdj e() {
      return this.c.d();
   }
}
