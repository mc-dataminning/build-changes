import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bpu {
   private final LongSupplier a;
   private final IntSupplier b;
   private final BooleanSupplier c;
   private bpy d = bpx.a;

   public bpu(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a() {
      return this.d != bpx.a;
   }

   public void b() {
      this.d = bpx.a;
   }

   public void c() {
      this.d = new bpt(this.a, this.b, this.c);
   }

   public bqb d() {
      return this.d;
   }

   public bpz e() {
      return this.d.d();
   }
}
