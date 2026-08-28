import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bpc {
   private final LongSupplier a;
   private final IntSupplier b;
   private bpg c = bpf.a;

   public bpc(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != bpf.a;
   }

   public void b() {
      this.c = bpf.a;
   }

   public void c() {
      this.c = new bpb(this.a, this.b, true);
   }

   public bpj d() {
      return this.c;
   }

   public bph e() {
      return this.c.d();
   }
}
