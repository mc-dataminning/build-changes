import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bky {
   private final LongSupplier a;
   private final IntSupplier b;
   private blc c = blb.a;

   public bky(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != blb.a;
   }

   public void b() {
      this.c = blb.a;
   }

   public void c() {
      this.c = new bkx(this.a, this.b, true);
   }

   public ble d() {
      return this.c;
   }

   public bld e() {
      return this.c.d();
   }
}
