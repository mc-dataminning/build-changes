import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bns {
   private final LongSupplier a;
   private final IntSupplier b;
   private bnw c = bnv.a;

   public bns(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bnv.a;
   }

   public void b() {
      this.c = bnv.a;
   }

   public void c() {
      this.c = new bnr(this.a, this.b, true);
   }

   public bny d() {
      return this.c;
   }

   public bnx e() {
      return this.c.d();
   }
}
