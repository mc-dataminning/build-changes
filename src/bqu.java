import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bqu {
   private final LongSupplier a;
   private final IntSupplier b;
   private final BooleanSupplier c;
   private bqy d = bqx.a;

   public bqu(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a() {
      return this.d != bqx.a;
   }

   public void b() {
      this.d = bqx.a;
   }

   public void c() {
      this.d = new bqt(this.a, this.b, this.c);
   }

   public brb d() {
      return this.d;
   }

   public bqz e() {
      return this.d.d();
   }
}
