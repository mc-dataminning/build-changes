import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bem {
   private final LongSupplier a;
   private final IntSupplier b;
   private beq c = bep.a;

   public bem(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bep.a;
   }

   public void b() {
      this.c = bep.a;
   }

   public void c() {
      this.c = new bel(this.a, this.b, true);
   }

   public bes d() {
      return this.c;
   }

   public ber e() {
      return this.c.d();
   }
}
