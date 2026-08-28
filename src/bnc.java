import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bnc {
   private final LongSupplier a;
   private final IntSupplier b;
   private bng c = bnf.a;

   public bnc(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bnf.a;
   }

   public void b() {
      this.c = bnf.a;
   }

   public void c() {
      this.c = new bnb(this.a, this.b, true);
   }

   public bni d() {
      return this.c;
   }

   public bnh e() {
      return this.c.d();
   }
}
