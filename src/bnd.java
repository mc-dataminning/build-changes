import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bnd {
   private final LongSupplier a;
   private final IntSupplier b;
   private bnh c = bng.a;

   public bnd(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bng.a;
   }

   public void b() {
      this.c = bng.a;
   }

   public void c() {
      this.c = new bnc(this.a, this.b, true);
   }

   public bnj d() {
      return this.c;
   }

   public bni e() {
      return this.c.d();
   }
}
