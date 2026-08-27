import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bgm {
   private final LongSupplier a;
   private final IntSupplier b;
   private bgq c = bgp.a;

   public bgm(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bgp.a;
   }

   public void b() {
      this.c = bgp.a;
   }

   public void c() {
      this.c = new bgl(this.a, this.b, true);
   }

   public bgs d() {
      return this.c;
   }

   public bgr e() {
      return this.c.d();
   }
}
