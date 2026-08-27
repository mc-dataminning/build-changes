import java.util.BitSet;
import java.util.stream.Stream;

public class dji {
   private final int a;
   private final BitSet b;
   private dji.a c = ($$0x, $$1x, $$2) -> false;

   public dji(int $$0, int $$1) {
      this.a = $$1;
      this.b = new BitSet(256 * $$0);
   }

   public void a(dji.a $$0) {
      this.c = $$0;
   }

   public dji(long[] $$0, int $$1) {
      this.a = $$1;
      this.b = BitSet.valueOf($$0);
   }

   private int c(int $$0, int $$1, int $$2) {
      return $$0 & 15 | ($$2 & 15) << 4 | $$1 - this.a << 8;
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b.set(this.c($$0, $$1, $$2));
   }

   public boolean b(int $$0, int $$1, int $$2) {
      return this.c.test($$0, $$1, $$2) || this.b.get(this.c($$0, $$1, $$2));
   }

   public Stream<hx> a(crm $$0) {
      return this.b.stream().mapToObj($$1 -> {
         int $$2 = $$1 & 15;
         int $$3 = $$1 >> 4 & 15;
         int $$4 = $$1 >> 8;
         return $$0.a($$2, $$4 + this.a, $$3);
      });
   }

   public long[] a() {
      return this.b.toLongArray();
   }

   public interface a {
      boolean test(int var1, int var2, int var3);
   }
}
