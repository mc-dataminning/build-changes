import java.util.ArrayList;
import java.util.List;

public record afj(int c, List<akk.c<?>> d) implements zs<ace> {
   public static final zj<ww, afj> a = zs.a(afj::b, afj::new);
   public static final int b = 255;

   private afj(ww $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akk.c<?>> $$0, ww $$1) {
      for (akk.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<akk.c<?>> a(ww $$0) {
      List<akk.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akk.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(ww $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zu<afj> a() {
      return agq.aC;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akk.c<?>> e() {
      return this.d;
   }
}
