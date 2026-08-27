import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bki {
   private final LongSupplier a;
   private final IntSupplier b;
   private bkm c = bkl.a;

   public bki(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bkl.a;
   }

   public void b() {
      this.c = bkl.a;
   }

   public void c() {
      this.c = new bkh(this.a, this.b, true);
   }

   public bko d() {
      return this.c;
   }

   public bkn e() {
      return this.c.d();
   }
}
