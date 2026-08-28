import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bna {
   private final LongSupplier a;
   private final IntSupplier b;
   private bne c = bnd.a;

   public bna(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bnd.a;
   }

   public void b() {
      this.c = bnd.a;
   }

   public void c() {
      this.c = new bmz(this.a, this.b, true);
   }

   public bng d() {
      return this.c;
   }

   public bnf e() {
      return this.c.d();
   }
}
