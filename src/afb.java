import java.util.ArrayList;
import java.util.List;

public record afb(int c, List<akc.c<?>> d) implements zl<abw> {
   public static final zc<wp, afb> a = zl.a(afb::b, afb::new);
   public static final int b = 255;

   private afb(wp $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akc.c<?>> $$0, wp $$1) {
      for (akc.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<akc.c<?>> a(wp $$0) {
      List<akc.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akc.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wp $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zn<afb> a() {
      return agj.aD;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akc.c<?>> e() {
      return this.d;
   }
}
