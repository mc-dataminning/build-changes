import java.util.ArrayList;
import java.util.List;

public record adq(int c, List<aiq.c<?>> d) implements yb<aam> {
   public static final xs<vf, adq> a = yb.a(adq::b, adq::new);
   public static final int b = 255;

   private adq(vf $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<aiq.c<?>> $$0, vf $$1) {
      for (aiq.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aiq.c<?>> a(vf $$0) {
      List<aiq.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aiq.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(vf $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public yd<adq> a() {
      return aex.aC;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<aiq.c<?>> e() {
      return this.d;
   }
}
