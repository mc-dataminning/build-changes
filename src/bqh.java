import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bqh {
   private final LongSupplier a;
   private final IntSupplier b;
   private final BooleanSupplier c;
   private bql d = bqk.a;

   public bqh(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a() {
      return this.d != bqk.a;
   }

   public void b() {
      this.d = bqk.a;
   }

   public void c() {
      this.d = new bqg(this.a, this.b, this.c);
   }

   public bqo d() {
      return this.d;
   }

   public bqm e() {
      return this.d.d();
   }
}
