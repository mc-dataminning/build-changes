import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class biw {
   private final LongSupplier a;
   private final IntSupplier b;
   private bja c = biz.a;

   public biw(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != biz.a;
   }

   public void b() {
      this.c = biz.a;
   }

   public void c() {
      this.c = new biv(this.a, this.b, true);
   }

   public bjc d() {
      return this.c;
   }

   public bjb e() {
      return this.c.d();
   }
}
