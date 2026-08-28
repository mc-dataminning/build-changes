import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bne {
   private final LongSupplier a;
   private final IntSupplier b;
   private bni c = bnh.a;

   public bne(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bnh.a;
   }

   public void b() {
      this.c = bnh.a;
   }

   public void c() {
      this.c = new bnd(this.a, this.b, true);
   }

   public bnk d() {
      return this.c;
   }

   public bnj e() {
      return this.c.d();
   }
}
