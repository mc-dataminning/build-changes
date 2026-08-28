import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bpm {
   private final LongSupplier a;
   private final IntSupplier b;
   private bpq c = bpp.a;

   public bpm(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bpp.a;
   }

   public void b() {
      this.c = bpp.a;
   }

   public void c() {
      this.c = new bpl(this.a, this.b, true);
   }

   public bpt d() {
      return this.c;
   }

   public bpr e() {
      return this.c.d();
   }
}
