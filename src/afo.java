import java.util.ArrayList;
import java.util.List;

public record afo(int c, List<aky.c<?>> d) implements zo<acf> {
   public static final ze<wp, afo> a = zo.a(afo::b, afo::new);
   public static final int b = 255;

   private afo(wp $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<aky.c<?>> $$0, wp $$1) {
      for (aky.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<aky.c<?>> a(wp $$0) {
      List<aky.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(aky.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wp $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zq<afo> a() {
      return agy.aF;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<aky.c<?>> e() {
      return this.d;
   }
}
