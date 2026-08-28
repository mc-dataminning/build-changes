import java.util.ArrayList;
import java.util.List;

public record afm(int c, List<akn.c<?>> d) implements zv<ach> {
   public static final zm<wz, afm> a = zv.a(afm::b, afm::new);
   public static final int b = 255;

   private afm(wz $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akn.c<?>> $$0, wz $$1) {
      for (akn.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<akn.c<?>> a(wz $$0) {
      List<akn.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akn.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wz $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zx<afm> a() {
      return agt.aC;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akn.c<?>> e() {
      return this.d;
   }
}
