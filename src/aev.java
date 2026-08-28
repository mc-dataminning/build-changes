import java.util.ArrayList;
import java.util.List;

public record aev(int c, List<akc.c<?>> d) implements yw<abl> {
   public static final yn<wa, aev> a = yw.a(aev::b, aev::new);
   public static final int b = 255;

   private aev(wa $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akc.c<?>> $$0, wa $$1) {
      for (akc.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akc.c<?>> a(wa $$0) {
      List<akc.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akc.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wa $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public yy<aev> a() {
      return age.aF;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akc.c<?>> e() {
      return this.d;
   }
}
