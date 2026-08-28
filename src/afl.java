import java.util.ArrayList;
import java.util.List;

public record afl(int c, List<akq.c<?>> d) implements zq<acf> {
   public static final zh<wu, afl> a = zq.a(afl::b, afl::new);
   public static final int b = 255;

   private afl(wu $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akq.c<?>> $$0, wu $$1) {
      for (akq.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akq.c<?>> a(wu $$0) {
      List<akq.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akq.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wu $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zs<afl> a() {
      return agu.aC;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akq.c<?>> e() {
      return this.d;
   }
}
