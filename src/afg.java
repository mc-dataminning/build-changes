import java.util.ArrayList;
import java.util.List;

public record afg(int c, List<akl.c<?>> d) implements zl<aca> {
   public static final zc<wp, afg> a = zl.a(afg::b, afg::new);
   public static final int b = 255;

   private afg(wp $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akl.c<?>> $$0, wp $$1) {
      for (akl.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akl.c<?>> a(wp $$0) {
      List<akl.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akl.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wp $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zn<afg> a() {
      return agp.aC;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akl.c<?>> e() {
      return this.d;
   }
}
