import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bom {
   private final LongSupplier a;
   private final IntSupplier b;
   private boq c = bop.a;

   public bom(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bop.a;
   }

   public void b() {
      this.c = bop.a;
   }

   public void c() {
      this.c = new bol(this.a, this.b, true);
   }

   public bot d() {
      return this.c;
   }

   public bor e() {
      return this.c.d();
   }
}
