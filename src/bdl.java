import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bdl {
   private final LongSupplier a;
   private final IntSupplier b;
   private bdp c = bdo.a;

   public bdl(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bdo.a;
   }

   public void b() {
      this.c = bdo.a;
   }

   public void c() {
      this.c = new bdk(this.a, this.b, true);
   }

   public bdr d() {
      return this.c;
   }

   public bdq e() {
      return this.c.d();
   }
}
