import java.util.ArrayList;
import java.util.List;

public record aeo(int c, List<ajo.c<?>> d) implements yz<abk> {
   public static final yq<wd, aeo> a = yz.a(aeo::b, aeo::new);
   public static final int b = 255;

   private aeo(wd $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ajo.c<?>> $$0, wd $$1) {
      for (ajo.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<ajo.c<?>> a(wd $$0) {
      List<ajo.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ajo.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wd $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zb<aeo> a() {
      return afv.aC;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ajo.c<?>> e() {
      return this.d;
   }
}
