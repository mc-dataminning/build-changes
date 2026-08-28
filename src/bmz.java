import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bmz {
   private final LongSupplier a;
   private final IntSupplier b;
   private bnd c = bnc.a;

   public bmz(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bnc.a;
   }

   public void b() {
      this.c = bnc.a;
   }

   public void c() {
      this.c = new bmy(this.a, this.b, true);
   }

   public bnf d() {
      return this.c;
   }

   public bne e() {
      return this.c.d();
   }
}
