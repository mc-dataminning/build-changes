import java.util.ArrayList;
import java.util.List;

public record aev(int c, List<ajw.c<?>> d) implements ze<abq> {
   public static final yv<wi, aev> a = ze.a(aev::b, aev::new);
   public static final int b = 255;

   private aev(wi $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ajw.c<?>> $$0, wi $$1) {
      for (ajw.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<ajw.c<?>> a(wi $$0) {
      List<ajw.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ajw.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wi $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zg<aev> a() {
      return agc.aC;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ajw.c<?>> e() {
      return this.d;
   }
}
