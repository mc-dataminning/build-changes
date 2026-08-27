import java.util.ArrayList;
import java.util.List;

public record adm(int c, List<ail.b<?>> d) implements xz<aai> {
   public static final xq<vd, adm> a = xz.a(adm::b, adm::new);
   public static final int b = 255;

   private adm(vd $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<ail.b<?>> $$0, vd $$1) {
      for (ail.b<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<ail.b<?>> a(vd $$0) {
      List<ail.b<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(ail.b.a($$0, $$2));
      }

      return $$1;
   }

   private void b(vd $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public yb<adm> a() {
      return aet.aC;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<ail.b<?>> e() {
      return this.d;
   }
}
