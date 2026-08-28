import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bph {
   private final LongSupplier a;
   private final IntSupplier b;
   private bpl c = bpk.a;

   public bph(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bpk.a;
   }

   public void b() {
      this.c = bpk.a;
   }

   public void c() {
      this.c = new bpg(this.a, this.b, true);
   }

   public bpo d() {
      return this.c;
   }

   public bpm e() {
      return this.c.d();
   }
}
