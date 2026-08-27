import java.util.ArrayList;
import java.util.List;

public record adj(int c, List<aih.b<?>> d) implements xx<aag> {
   public static final xo<vb, adj> a = xx.a(adj::b, adj::new);
   public static final int b = 255;

   private adj(vb $$0) {
      this($$0.n(), a($$0));
   }

   private static void a(List<aih.b<?>> $$0, vb $$1) {
      for (aih.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aih.b<?>> a(vb $$0) {
      List<aih.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aih.b.a($$0, $$2));
      }

      return $$1;
   }

   private void b(vb $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public xz<adj> a() {
      return aeq.aB;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<aih.b<?>> e() {
      return this.d;
   }
}
