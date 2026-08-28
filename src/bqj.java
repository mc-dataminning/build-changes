import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bqj {
   private final LongSupplier a;
   private final IntSupplier b;
   private final BooleanSupplier c;
   private bqn d = bqm.a;

   public bqj(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a() {
      return this.d != bqm.a;
   }

   public void b() {
      this.d = bqm.a;
   }

   public void c() {
      this.d = new bqi(this.a, this.b, this.c);
   }

   public bqq d() {
      return this.d;
   }

   public bqo e() {
      return this.d.d();
   }
}
