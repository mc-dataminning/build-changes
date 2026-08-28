import java.util.ArrayList;
import java.util.List;

public record afd(int c, List<akn.c<?>> d) implements zf<abu> {
   public static final yw<wj, afd> a = zf.a(afd::b, afd::new);
   public static final int b = 255;

   private afd(wj $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akn.c<?>> $$0, wj $$1) {
      for (akn.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akn.c<?>> a(wj $$0) {
      List<akn.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akn.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wj $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zh<afd> a() {
      return agn.aF;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akn.c<?>> e() {
      return this.d;
   }
}
