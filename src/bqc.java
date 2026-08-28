import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bqc {
   private final LongSupplier a;
   private final IntSupplier b;
   private final BooleanSupplier c;
   private bqg d = bqf.a;

   public bqc(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a() {
      return this.d != bqf.a;
   }

   public void b() {
      this.d = bqf.a;
   }

   public void c() {
      this.d = new bqb(this.a, this.b, this.c);
   }

   public bqj d() {
      return this.d;
   }

   public bqh e() {
      return this.d.d();
   }
}
