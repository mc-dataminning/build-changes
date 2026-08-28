import java.util.ArrayList;
import java.util.List;

public record aey(int c, List<ajz.c<?>> d) implements zf<abt> {
   public static final yw<wj, aey> a = zf.a(aey::b, aey::new);
   public static final int b = 255;

   private aey(wj $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ajz.c<?>> $$0, wj $$1) {
      for (ajz.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<ajz.c<?>> a(wj $$0) {
      List<ajz.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ajz.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wj $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zh<aey> a() {
      return agf.aC;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ajz.c<?>> e() {
      return this.d;
   }
}
