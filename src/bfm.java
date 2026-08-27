import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bfm {
   private final LongSupplier a;
   private final IntSupplier b;
   private bfq c = bfp.a;

   public bfm(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bfp.a;
   }

   public void b() {
      this.c = bfp.a;
   }

   public void c() {
      this.c = new bfl(this.a, this.b, true);
   }

   public bfs d() {
      return this.c;
   }

   public bfr e() {
      return this.c.d();
   }
}
