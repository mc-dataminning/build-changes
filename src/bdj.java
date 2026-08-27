import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bdj {
   private final LongSupplier a;
   private final IntSupplier b;
   private bdn c = bdm.a;

   public bdj(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bdm.a;
   }

   public void b() {
      this.c = bdm.a;
   }

   public void c() {
      this.c = new bdi(this.a, this.b, true);
   }

   public bdp d() {
      return this.c;
   }

   public bdo e() {
      return this.c.d();
   }
}
