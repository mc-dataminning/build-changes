import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bjl {
   private final LongSupplier a;
   private final IntSupplier b;
   private bjp c = bjo.a;

   public bjl(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bjo.a;
   }

   public void b() {
      this.c = bjo.a;
   }

   public void c() {
      this.c = new bjk(this.a, this.b, true);
   }

   public bjr d() {
      return this.c;
   }

   public bjq e() {
      return this.c.d();
   }
}
