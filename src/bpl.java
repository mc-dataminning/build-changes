import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bpl {
   private final LongSupplier a;
   private final IntSupplier b;
   private bpp c = bpo.a;

   public bpl(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bpo.a;
   }

   public void b() {
      this.c = bpo.a;
   }

   public void c() {
      this.c = new bpk(this.a, this.b, true);
   }

   public bps d() {
      return this.c;
   }

   public bpq e() {
      return this.c.d();
   }
}
