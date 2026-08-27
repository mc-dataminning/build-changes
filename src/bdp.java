import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bdp {
   private final LongSupplier a;
   private final IntSupplier b;
   private bdt c = bds.a;

   public bdp(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bds.a;
   }

   public void b() {
      this.c = bds.a;
   }

   public void c() {
      this.c = new bdo(this.a, this.b, true);
   }

   public bdv d() {
      return this.c;
   }

   public bdu e() {
      return this.c.d();
   }
}
