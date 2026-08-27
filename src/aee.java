import java.util.ArrayList;
import java.util.List;

public record aee(int c, List<aje.c<?>> d) implements yp<aba> {
   public static final yg<vt, aee> a = yp.a(aee::b, aee::new);
   public static final int b = 255;

   private aee(vt $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<aje.c<?>> $$0, vt $$1) {
      for (aje.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.k(255);
   }

   private static List<aje.c<?>> a(vt $$0) {
      List<aje.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aje.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(vt $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public yr<aee> a() {
      return afl.aC;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<aje.c<?>> e() {
      return this.d;
   }
}
