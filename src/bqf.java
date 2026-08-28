import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bqf {
   private final LongSupplier a;
   private final IntSupplier b;
   private final BooleanSupplier c;
   private bqj d = bqi.a;

   public bqf(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a() {
      return this.d != bqi.a;
   }

   public void b() {
      this.d = bqi.a;
   }

   public void c() {
      this.d = new bqe(this.a, this.b, this.c);
   }

   public bqm d() {
      return this.d;
   }

   public bqk e() {
      return this.d.d();
   }
}
