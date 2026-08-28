import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class bpc {
   private final LongSupplier a;
   private final IntSupplier b;
   private final BooleanSupplier c;
   private bpg d = bpf.a;

   public bpc(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a() {
      return this.d != bpf.a;
   }

   public void b() {
      this.d = bpf.a;
   }

   public void c() {
      this.d = new bpb(this.a, this.b, this.c);
   }

   public bpj d() {
      return this.d;
   }

   public bph e() {
      return this.d.d();
   }
}
