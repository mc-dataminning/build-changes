import java.util.ArrayList;
import java.util.List;

public record afn(int c, List<aks.c<?>> d) implements zs<ach> {
   public static final zj<ww, afn> a = zs.a(afn::b, afn::new);
   public static final int b = 255;

   private afn(ww $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<aks.c<?>> $$0, ww $$1) {
      for (aks.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<aks.c<?>> a(ww $$0) {
      List<aks.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aks.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(ww $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zu<afn> a() {
      return agw.aC;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<aks.c<?>> e() {
      return this.d;
   }
}
