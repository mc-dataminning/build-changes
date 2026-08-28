import java.util.ArrayList;
import java.util.List;

public record aff(int c, List<akk.c<?>> d) implements zk<abz> {
   public static final zb<wo, aff> a = zk.a(aff::b, aff::new);
   public static final int b = 255;

   private aff(wo $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akk.c<?>> $$0, wo $$1) {
      for (akk.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akk.c<?>> a(wo $$0) {
      List<akk.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akk.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wo $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public zm<aff> a() {
      return ago.aC;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akk.c<?>> e() {
      return this.d;
   }
}
